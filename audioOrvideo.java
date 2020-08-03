

package com.ITBIZ;
public class audioOrvideo extends asset {
    
    public audioOrvideo(Integer id,String Name, String category, String location, String state) {
        super(id,Name, category, location,  state);  
    }
    
    /**
     * Returns the assets type as a String.
     * @return Type
     */
    public String getType() {
        return "audioOrvideo";
    }
}
