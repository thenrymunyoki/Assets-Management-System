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
public class asset 
{
	// Properties of the asset (name, category, location)
	private Integer id;
	private String Name;
	private String Category;
	private String Location;
	private String State;
	
	public asset(Integer id, String Name, String Category, String Location,  String State) 
	{
		super();
		this.id = id;
		this.Name = Name;
		this.Category = Category;
		this.Location = Location;
		this.State = State;
	}
       

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String Category) {
		this.Category = Category;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}

	public String getState() {
		return State;
	}

	public void setState(String State) {
		this.State = State;
	}

}

