/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Business;
import com.maven3.Models.*;

import com.maven3.Interfaces.iProcessOrder;
import org.springframework.stereotype.Component;
/**
 *
 * @author prasa
 */
@Component
public class CustomerOrder implements iProcessOrder {
      @Override
    public void Process() {
    }

    @Override
    public void Store() {
       CustomerOrderModel order = new CustomerOrderModel();
       order.setCustomerEmail("hari@gmail.com");
       order.setCustomerName("hari");
       order.setCustomerPhoneNumber("78979989899");
     
    }

    @Override
    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void check()
    {}
    
    public void act()
    {}
    
    public void order()
    {}
}
