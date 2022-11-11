/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happyclover.utility.nov11java;

/**
 *
 * @author anisa
 */
public class Bank {
    private int eid;
    private String ename;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Bank() {
    }

    public Bank(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Bank{" + "eid=" + eid + ", ename=" + ename + '}';
    }
    
    
    
    
}
