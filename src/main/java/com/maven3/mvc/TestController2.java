/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author prasa
 */
@Controller
@RequestMapping("shoppings")
public class TestController2 {
    @RequestMapping( method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework test2!");
      return "test";
   }
   
   @RequestMapping(value="shop", method = RequestMethod.GET)
   public String printHello33(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework test34422!");
      return "test";
   }
}
