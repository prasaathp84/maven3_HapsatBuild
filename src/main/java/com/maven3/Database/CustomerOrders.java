/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Database;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
/**
 *
 * @author prasa
 */
@Entity
@Table(name = "[dbo].[CustomerOrders]")
public class CustomerOrders {
    
    @Id
    @Column(name = "OrderNo")
    private Integer OrderNo;
    @Column(name = "InvoiceDate")
    private Date InvoiceDate;
    @Column(name = "InvoiceNumber")
    private String InvoiceNumber;
    @Column(name = "DocTotal")
    private Integer DocTotal;
    @Column(name = "CustomerName")
    private String CustomerName;
    @Column(name = "CustomerEmail")
    private String CustomerEmail;
    @Column(name = "CustomerPhoneNumber")
    private String CustomerPhoneNumber;
    @Column(name = "ItemCode")
    private String ItemCode;
    @Column(name = "ItemDescription")
    private String ItemDescription;

    public Integer getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(Integer OrderNo) {
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

    public Integer getDocTotal() {
        return DocTotal;
    }

    public void setDocTotal(Integer DocTotal) {
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
