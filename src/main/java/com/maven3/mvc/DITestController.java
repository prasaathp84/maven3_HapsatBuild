    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.mvc;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.maven3.Business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 *
 * @author prasa
 */
@Controller
@RequestMapping(value="DITest")
public class DITestController {
    private StoreShopping storeShopping;
    public DITestController()
    {}
    @Autowired
    public DITestController( StoreShopping store )
    {
        this.storeShopping = store;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String getUserProfile(ModelMap model)
    {
        model.addAttribute("message", storeShopping.storeUserProfile());
        return "test";
    }
}
