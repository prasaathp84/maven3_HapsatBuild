/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven3.Database;

/**
 *
 * @author prasa
 */
public interface IDBConnector {
    public void CreateSession(IHandleSession hdSession);
    public void ClearSession();
}
