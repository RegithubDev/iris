package com.resustainability.reisp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.resustainability.reisp.common.DayBeforeDate;
import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.BMW;
import com.resustainability.reisp.model.BrainBox;
import com.resustainability.reisp.model.DashBoardWeighBridge;
import com.resustainability.reisp.model.DataManagement;
import com.resustainability.reisp.model.DataManagementObject;
import com.resustainability.reisp.model.DateModel;
import com.resustainability.reisp.model.Role;
import com.resustainability.reisp.model.SBU;
import com.resustainability.reisp.model.DataManagement;
import com.resustainability.reisp.model.User;
import com.resustainability.reisp.model.IWMDate;
import com.resustainability.reisp.service.IrisDataManagementService;

@RestController
public class IrisDataManagementController {
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	Logger logger = Logger.getLogger(IrisRoleController.class);
	
	@Autowired
	IrisDataManagementService service;
	
	
	@RequestMapping(value = "/iris-datamanagement", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView irisrole(@ModelAttribute User user, HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.irisdatamanagement);
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value = "/ajax/getSBUFilterListForDM", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<DataManagement> getSBUFilterListForDM(@ModelAttribute DataManagement obj,HttpSession session) {
		List<DataManagement> companiesList = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			companiesList = service.getSBUFilterListForDM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getSBUFilterListForDM : " + e.getMessage());
		}
		return companiesList;
	}
	
	@RequestMapping(value = "/update-collect-iris", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateCollect(@ModelAttribute DataManagement obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String siteName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/iris-datamanagement");
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			if(StringUtils.isEmpty(obj.getModified_by())) {
				obj.setModified_by(userId);
			}
			flag = service.updateCollect(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Updated Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Updating Record is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	@RequestMapping(value="/update-bmwdistribute-iris",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateBmwdistributive(@ModelAttribute DataManagement obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String siteName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/iris-datamanagement");
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			if(StringUtils.isEmpty(obj.getModified_by())) {
				obj.setModified_by(userId);
			}
			flag = service.updateBmwdistributive(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Updated Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Updating Record is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value="/update-bmwprocessing-iris",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateBmwprocessing(@ModelAttribute DataManagement obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String siteName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/iris-datamanagement");
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			if(StringUtils.isEmpty(obj.getModified_by())) {
				obj.setModified_by(userId);
			}
			flag = service.updateBmwprocessing(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Updated Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Updating Record is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value="/update-iwmdisposal-iris",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateIwmdisposal(@ModelAttribute DataManagement obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String siteName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/iris-datamanagement");
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			if(StringUtils.isEmpty(obj.getModified_by())) {
				obj.setModified_by(userId);
			}
			flag = service.updateIwmdisposal(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Updated Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Updating Record is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value="/update-iwmleftoverstock-iris",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateIwmleftoverstock(@ModelAttribute DataManagement obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String siteName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/iris-datamanagement");
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			if(StringUtils.isEmpty(obj.getModified_by())) {
				obj.setModified_by(userId);
			}
			flag = service.updateIwmleftoverstock(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Updated Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Updating Record is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value="/update-mswprocessing-iris",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateMswprocessing(@ModelAttribute DataManagement obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String siteName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/iris-datamanagement");
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			if(StringUtils.isEmpty(obj.getModified_by())) {
				obj.setModified_by(userId);
			}
			flag = service.updateMswprocessing(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Updated Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Updating Record is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	@RequestMapping(value="/update-mswdistributive-iris",method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView updateMswdistributive(@ModelAttribute DataManagement obj,RedirectAttributes attributes,HttpSession session) {
		boolean flag = false;
		String userId = null;
		String siteName = null;
		ModelAndView model = new ModelAndView();
		try {
			model.setViewName("redirect:/iris-datamanagement");
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			if(StringUtils.isEmpty(obj.getModified_by())) {
				obj.setModified_by(userId);
			}
			flag = service.updateMswdistributive(obj);
			if(flag == true) {
				attributes.addFlashAttribute("success", "Updated Succesfully.");
			}
			else {
				attributes.addFlashAttribute("error","Updating Record is failed. Try again.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	
	
	
	@RequestMapping(value = "/ajax/getDeptFilterListForDM", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<DataManagement> getDeptFilterListForDM(@ModelAttribute DataManagement obj,HttpSession session) {
		List<DataManagement> companiesList = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			companiesList = service.getDeptFilterListForDM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getDeptFilterListForDM : " + e.getMessage());
		}
		return companiesList;
	}
	
	@RequestMapping(value = "/ajax/getSiteFilterListForDM", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<DataManagement> getDataManagementFilterListForDM(@ModelAttribute DataManagement obj,HttpSession session) {
		List<DataManagement> companiesList = null;
		String userId = null;
		String userName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			companiesList = service.getSiteFilterListForDM(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getDataManagementFilterListForDM : " + e.getMessage());
		}
		return companiesList;
	}
	
	
	@RequestMapping(value = "/ajax/get-data-management-iris", method = { RequestMethod.POST, RequestMethod.GET })
	public void getDataManagementList(@ModelAttribute DataManagement obj, HttpServletRequest request,
			HttpServletResponse response, HttpSession session) throws IOException {
		PrintWriter pw = null;
		//JSONObject json = new JSONObject();
		String json2 = null;
		String userId = null;
		String userName = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			userName = (String) session.getAttribute("USER_NAME");

			pw = response.getWriter();
			//Fetch the page number from client
			Integer pageNumber = 0;
			Integer pageDisplayLength = 0;
			if (null != request.getParameter("iDisplayStart")) {
				pageDisplayLength = Integer.valueOf(request.getParameter("iDisplayLength"));
				pageNumber = (Integer.valueOf(request.getParameter("iDisplayStart")) / pageDisplayLength) + 1;
			}
			//Fetch search parameter
			String searchParameter = request.getParameter("sSearch");

			//Fetch Page display length
			pageDisplayLength = Integer.valueOf(request.getParameter("iDisplayLength"));

			List<DataManagement> budgetList = new ArrayList<DataManagement>();

			//Here is server side pagination logic. Based on the page number you could make call 
			//to the data base create new list and send back to the client. For com.resustainability.brainbox I am shuffling 
			//the same list to show data randomly
			int startIndex = 0;
			int offset = pageDisplayLength;

			if (pageNumber == 1) {
				startIndex = 0;
				offset = pageDisplayLength;
				budgetList = createPaginationData(startIndex, offset, obj, searchParameter);
			} else {
				startIndex = (pageNumber * offset) - offset;
				offset = pageDisplayLength;
				budgetList = createPaginationData(startIndex, offset, obj, searchParameter);
			}

			//Search functionality: Returns filtered list based on search parameter
			//budgetList = getListBasedOnSearchParameter(searchParameter,budgetList);

			int totalRecords = getTotalRecords(obj, searchParameter);

			DataManagementObject personJsonObject = new DataManagementObject();
			//Set Total display record
			personJsonObject.setiTotalDisplayRecords(totalRecords);
			//Set Total record
			personJsonObject.setiTotalRecords(totalRecords);
			personJsonObject.setAaData(budgetList);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			json2 = gson.toJson(personJsonObject);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(
					"getDataManagementsList : User Id - " + userId + " - User Name - " + userName + " - " + e.getMessage());
		}

		pw.println(json2);
	}

	/**
	 * @param searchParameter 
	 * @param activity 
	 * @return
	 */
	public int getTotalRecords(DataManagement obj, String searchParameter) {
		int totalRecords = 0;
		try {
			totalRecords = service.getTotalRecords(obj, searchParameter);
		} catch (Exception e) {
			logger.error("getTotalRecords : " + e.getMessage());
		}
		return totalRecords;
	}

	/**
	 * @param pageDisplayLength
	 * @param offset 
	 * @param activity 
	 * @param clientId 
	 * @return
	 */
	public List<DataManagement> createPaginationData(int startIndex, int offset, DataManagement obj, String searchParameter) {
		List<DataManagement> objList = null;
		try {
			String [] dates = obj.getDate().split("to");
			obj.setFrom_date(dates[0]);
			obj.setTo_date(dates[1]);
			objList = service.getDataManagementList(obj, startIndex, offset, searchParameter);
		} catch (Exception e) {
			logger.error("createPaginationData : " + e.getMessage());
		}
		return objList;
	}
	
	@RequestMapping(value = "/reone/get-data-management-list", method = { RequestMethod.POST, RequestMethod.GET })
	public List<DataManagement> dataManagement( @RequestBody DataManagement obj) {
		List<DataManagement> objList = null;
		try {
			int startIndex = obj.getStartIndex();
			int offset = obj.getOffset();
			String searchParameter = null;
			objList = service.getDataManagementList(obj, startIndex, offset, searchParameter);
		} catch (Exception e) {
			logger.error("getDataManagementList : " + e.getMessage());
		}
		return objList;
	}
	
	@RequestMapping(value = "/reone/get-history-by-dates", method = { RequestMethod.POST, RequestMethod.GET })
	public List<DateModel> history( @RequestBody DataManagement obj) {
		List<DateModel> objList = null;
		try {
			int startIndex = obj.getStartIndex();
			int offset = obj.getOffset();
			String searchParameter = null;
			objList = service.getDataHistoryList(obj);
		} catch (Exception e) {
			logger.error("getDataManagementList : " + e.getMessage());
		}
		return objList;
	}
	
	
	@RequestMapping(value = "/reone/ajax/getDataFromDates", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<DataManagement> getDataFromDates(@RequestBody DataManagement obj,HttpSession session) {
		List<DataManagement> companiesList = null;
		String userId = null;
		String siteName = null;
		String role = null;
		try {
			userId = (String) session.getAttribute("USER_ID");
			siteName = (String) session.getAttribute("USER_NAME");
			role = (String) session.getAttribute("BASE_ROLE");
			
			companiesList = service.getDataFromDates(obj);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("getDataFromDates : " + e.getMessage());
		}
		return companiesList;
	}
	
	@RequestMapping(value = "/reone/ajax/findDataExistOrNot", method = {RequestMethod.GET,RequestMethod.POST},produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@JsonProperty
	public String findDataExistOrNot(  @RequestBody DataManagement obj1,HttpSession session,HttpServletResponse response , Errors filterErrors) throws JsonProcessingException {
		List<IWMDate> companiesList = null;
		 String json = null;
		 HashMap<String, String> data = new HashMap<String, String>();
		 ObjectMapper objectMapper = new ObjectMapper(); 
		 try {
			    if (true) {
			        String ids = "";
			        LocalDate currentDate = LocalDate.now();
			        String date = currentDate.toString();
			        date = date.replaceAll("-", "");
			        String unique = date;
			        String id = null;
			        boolean handsUp = true;
			        // int count = service.getCountOfBMWSummeryRecords(bmw);
			        if (handsUp) {
			            List<DataManagement> objsList = service.findDataExistOrNot(obj1);
			            if (objsList != null && !objsList.isEmpty()) {
			                if (objsList.get(0).getStatus().contains("Data missing")) {
			                    data = new HashMap<String, String>();
			                    data.put("OK", objsList.get(0).getStatus() + " for the Date :" + obj1.getDate());
			                    json = objectMapper.writeValueAsString(data);
			                } else {
			                	 DataManagement obj = objsList.get(0); // Get the first element from the list

			                     // Create a map to hold the JSON response
			                     // Create a LinkedHashMap to hold the main JSON response
			                     Map<String, Object> mainData = new LinkedHashMap<>();

			                     // Create another LinkedHashMap for the nested data
			                     Map<String, Object> nestedData = new LinkedHashMap<>();
			                     nestedData.put("Sbu Code", obj.getSbu_code());
			                     nestedData.put("Opening_stock Total Waste", obj.getOpening_stock_total_waste());
			                     nestedData.put("Opening_stock DLF", obj.getOpening_stock_dlf());
			                     nestedData.put("Opening_stock LAT", obj.getOpening_stock_lat());
			                     nestedData.put("Opening_stock Incineration", obj.getOpening_stock_incineration());
			                     nestedData.put("Opening_stock AFRF", obj.getOpening_stock_afrf());
			                     nestedData.put("Site", obj.getSite());
			                 	 String dateY = DayBeforeDate.converDateY(obj.getDate());
			                 	 String dateOS = obj.getDate();
			                     nestedData.put("OS Date", dateOS);
			                     nestedData.put("CS Date", dateY);
			                  
			                     // Put the nested data into the main data map under the key "Data"
			                     mainData.put("Opening Stock", nestedData);
			                    json = objectMapper.writeValueAsString(mainData);
			                }
			            } else {
			                data = new HashMap<String, String>();
			                data.put("Opps", "No Opening Stock Data Found! ");
			                json = objectMapper.writeValueAsString(data);
			            }
			        } else {
			            companiesList = new ArrayList<IWMDate>(1);
			        }
			    } else {
			        data = new HashMap<String, String>();
			        companiesList = new ArrayList<IWMDate>(1);
			    }
			} catch (Exception e) {
			    e.printStackTrace();
			    System.out.println(e.getMessage());
			    if ("Index 0 out of bounds for length 0".contentEquals(e.getMessage())) {
			        data = new HashMap<String, String>();
			        data.put("500", "Please enter User Name and Password!");
			        json = objectMapper.writeValueAsString(data);
			    } else if ("Conversion failed when converting the".contentEquals(e.getMessage())) {
			        data = new HashMap<String, String>();
			        data.put("500", "" + e.getMessage() + "");
			        json = objectMapper.writeValueAsString(data);
			    } else {
			        data = new HashMap<String, String>();
			        data.put("500", getStackTraceAsString(e));
			        json = objectMapper.writeValueAsString(data);
			    }
			    logger.error("getBMWList : " + e.getMessage());
			}
			return json;

	}
	
	public static String getStackTraceAsString(Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);
        return sw.toString();
    }
}
