/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITBIZ;

/**
 *
 * @author SUNNY2
 */
public interface maintenanceplan {
    void securityupdates(String Sofwareupdates);
    void softwareupgrades(String Sofwareupgrades);
    void softwaredriver(String softwaredriver);
      void cleaning(String cleaning);
      void cartrigesreplacements(String cartrigesreplacements);
       void cleaningprojectionwindow(String cleaningprojectionwindow);
        void projectlampreplacement(String projectlampreplacement);
        maintenanceplan getmaintenanceplan();
}


     

