package com.resustainability.reisp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.resustainability.reisp.common.CommonMethods;
import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.Category;
import com.resustainability.reisp.model.City;
import com.resustainability.reisp.model.Role;
import com.resustainability.reisp.model.SBU;
import com.resustainability.reisp.model.Site;
import com.resustainability.reisp.model.User;
import com.resustainability.reisp.service.CategoryService;
import com.resustainability.reisp.service.IrisCityService;
import com.resustainability.reisp.service.IrisRoleService;
import com.resustainability.reisp.service.IrisSBUService;
import com.resustainability.reisp.service.IrisSiteService;
import com.resustainability.reisp.service.IrisStateService;
import com.resustainability.reisp.service.UserService;
import com.resustainability.reisp.controller.LoginController;
import com.resustainability.reisp.dao.UserDao;
@RestController
public class LoginController {
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    } 
	Logger logger = Logger.getLogger(LoginController.class);
	@Autowired
	UserService service;
	@Autowired
	IrisRoleService roleService;

	@Autowired
	IrisSBUService sbuService;
	
	@Autowired
	IrisStateService stateService;
	
	@Autowired
	CategoryService catService;

	@Autowired
	IrisCityService cityService;
	
	@Autowired
	IrisSiteService siteService;
	
	@Value("${Logout.Message}")
	private String logOutMessage;
	
	@Value("${Login.Form.Invalid}")
	public String invalidUserName;
	
	
	@Value("${common.error.message}")
	public String commonError;
	
	@RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView basePage(@ModelAttribute User user, HttpSession session,HttpServletRequest request) {
		ModelAndView model = new ModelAndView(PageConstants.login);
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView login(@ModelAttribute User user, HttpSession session,HttpServletRequest request,RedirectAttributes attributes) {
		ModelAndView model = new ModelAndView(PageConstants.login);
		User userDetails = null;
		try {
			if(!StringUtils.isEmpty(user) && !StringUtils.isEmpty(user.getEmail_id())){
				user.setUser_session_id(user.getUser_session_id());
				userDetails = service.validateUser(user);
				if(!StringUtils.isEmpty(userDetails)) {
						model.setViewName("redirect:/home");
						session.setAttribute("user", userDetails);
						session.setAttribute("USER_ID", userDetails.getId());
						session.setAttribute("USER_NAME", userDetails.getUser_name());
						session.setAttribute("EMAIL_ID", userDetails.getEmail_id());
						session.setAttribute("BASE_ROLE", userDetails.getRole());
						session.setAttribute("BASE_SBU", userDetails.getSbu());
						session.setAttribute("USER_IMAGE", user.getUser_image());
						session.setAttribute("SITE", userDetails.getSite_name());
						session.setAttribute("DEPARTMENT", userDetails.getDepartment());
						List<User> menuList = service.getMenuList();
						session.setAttribute("menuList", menuList);
						attributes.addFlashAttribute("welcome", "welcome "+userDetails.getUser_name());
				}else{
					userDetails = service.EmailVerification(user);
					if(!StringUtils.isEmpty(userDetails)) {
						model.setViewName(PageConstants.inactiveuserpage);
						model.addObject("email", user.getEmail_id());
						model.addObject("name", user.getUser_name());
					}
					else {
						
					
					model.addObject("invalidEmail",invalidUserName);
					SBU obj = new SBU();
					obj.setStatus("Active");
					List<SBU> sbuList = sbuService.getSBUFilterListForSBU(obj);
					model.addObject("sbuList", sbuList);
				
					Category cat = new Category();
					cat.setStatus("Active");
					List<Category> catList = catService.getCategoryFilterListForCategory(cat);
					model.addObject("catList", catList);
					
					Role role = new Role();
					role.setStatus("Active");
					List<Role> roleList = roleService.getRoleFilterListForRole(role);
					model.addObject("roleList", roleList);
					
					City city = new City();
					city.setStatus("Active");
					List<City> cityList = cityService.getCityFilterListForCity(city);
					model.addObject("cityList", cityList);
					
					Site site = new Site();
					site.setStatus("Active");
					List<Site> siteList = siteService.getSiteList(site, 0, 1000, null);
					model.addObject("siteList", siteList);
					model.setViewName(PageConstants.newUserLogin);
					model.addObject("email", user.getEmail_id());
					model.addObject("name", user.getUser_name());
				}}
			}else {
				model.addObject("message", "");
				model.setViewName(PageConstants.login);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model; 
	}
	@RequestMapping(value = "/logout", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView logout(HttpSession session,HttpServletRequest request,HttpServletResponse response,RedirectAttributes attributes){
		ModelAndView model = new ModelAndView();
		User user = new User();
		try {
			user.setUser_id((String) session.getAttribute("USER_ID"));
			user.setId((String) session.getAttribute("ID"));
			session.invalidate();
			model.setViewName("redirect:/login");
		} catch (Exception e) {
			logger.fatal("logut() : "+e.getMessage());
		}
		return model;
	}
	
		
}
