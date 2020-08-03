

package com.ITBIZ;
public class computers extends asset {
    
    public computers(Integer id,String Name, String category, String location, String state) {
        super(id,Name, category, location,  state);  
    }
    
    /**
     * Returns the assets type as a String.
     * @return Type
     */
    public String getType() {
        return "computers";
    }
}