/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.ITBIZ;

public class printers extends asset {
    
    public printers(Integer id,String Name, String category, String location, String state) {
        super(id,Name, category, location,  state);  
    }
    
    
    /**
     * Returns the assets type as a String.
     * @return Type
     */
    public String getType() {
        return "printers";
    }
    
}

     
