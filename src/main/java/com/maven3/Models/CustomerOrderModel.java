/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Models;

import java.util.Date;

/**
 *
 * @author prasa
 */
public class CustomerOrderModel {
     private int OrderNo;
    private Date InvoiceDate;
    private String InvoiceNumber;
    private int DocTotal;
    private String CustomerName;
    private String CustomerEmail;
    private String CustomerPhoneNumber;
    private String ItemCode;
    private String ItemDescription;

    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public String getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(String InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public int getDocTotal() {
        return DocTotal;
    }

    public void setDocTotal(int DocTotal) {
        this.DocTotal = DocTotal;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String CustomerEmail) {
        this.CustomerEmail = CustomerEmail;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String CustomerPhoneNumber) {
        this.CustomerPhoneNumber = CustomerPhoneNumber;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String ItemDescription) {
        this.ItemDescription = ItemDescription;
    }
}
