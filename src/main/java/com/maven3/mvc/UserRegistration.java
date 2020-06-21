/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.mvc;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;  
import com.maven3.DbModels.UserInfo;
import com.maven3.Models.UserInfoBModel;
import com.maven3.Business.BUserInfo;
import org.springframework.validation.BindingResult;
import javax.validation.Valid;  
import org.apache.log4j.Logger;

/**
 *
 * @author prasa
 */
@Controller
@RequestMapping(value="UserRegistration")
public class UserRegistration {
    private BUserInfo _bUserInfo;
    
    @Autowired
    public UserRegistration(BUserInfo bUserInfo)
    {
        _bUserInfo = bUserInfo;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String getUserProfile(ModelMap model)
    {
       // model.addAttribute("message", storeShopping.storeUserProfile());
        return "test";
    }
    
    @RequestMapping(value="Register")
    public String getUserRegistration(ModelMap model)
    {
        model.addAttribute("userInfo",new UserInfoBModel());
        return "UserRegistration";
    }
    
    @RequestMapping(value="/saveUserInfo",method = RequestMethod.POST)  
    public String SaveUser(@Valid @ModelAttribute("userInfo") UserInfoBModel userInfo, BindingResult result, ModelMap model)
    {
        
        if (result.hasErrors()) {
			return "UserRegistration";
	}
       //_bUserInfo.InsertUserInfo(userInfo);
       model.addAttribute("Name", userInfo.getName());
       return "success";
    }
}
