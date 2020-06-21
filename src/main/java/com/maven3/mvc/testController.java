/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import com.maven3.Models.*;
/**
 *
 * @author prasa
 */
@Controller
@RequestMapping("profile")
public class testController {
   @RequestMapping( method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "test";
   }
   
   @RequestMapping(value="test",method = RequestMethod.GET)
   public String printHello11(ModelMap model) {
      model.addAttribute("userForm", new UserProfile());
      return "UserRegistration";
   }
   
   @RequestMapping(value="userRegistration",method = RequestMethod.POST)
   public String submitProfile(@ModelAttribute("userForm")UserProfile userProfile, 
  BindingResult result,  ModelMap model) {
       if (result.hasErrors()) {
            return "error";
        }
      model.addAttribute("userName", userProfile.getUsername());
      return "success"; 
   }
}
