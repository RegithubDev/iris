package com.resustainability.reisp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.resustainability.reisp.constants.PageConstants;
import com.resustainability.reisp.model.SBU;
import com.resustainability.reisp.model.User;

@Controller
public class IrisSbuController {
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	Logger logger = Logger.getLogger(IrisSbuController.class);
	
	@RequestMapping(value = "/iris-sbu", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView irissbu(@ModelAttribute User user, HttpSession session) {
		ModelAndView model = new ModelAndView(PageConstants.irissbu);
		SBU obj = null;
		try {
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	
	
	

}