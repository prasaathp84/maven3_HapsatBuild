/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Models;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author prasa
 */
public class UserInfoBModel {
    private int UserId;
    
    @NotNull(message = "{error.Name}")
    @Size(min = 1, message = "{error.Name}")
    private String Name;
    @NotNull(message = "{error.Address}")
    @Size(min = 1, message = "{error.Address}")
    private String Address;
    @NotNull(message = "{error.Mobile}")
    @Size(min = 1, message = "{error.Mobile}")
    private String Mobile;

    
    public int getUserId() {
        return UserId;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    
    
}
