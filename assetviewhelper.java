/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITBIZ;
import com.sun.corba.se.spi.activation.Server;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
public class assetviewhelper {
    // Returns an observable list of assets
	public static ObservableList<asset> getassetList()
	{
                asset a1 = new asset(1,"laptop","computers","accountant","in use");
                asset a2 = new asset(2,"server","computers","ITpersonnel","in use");
                asset a3 = new asset(3,"Hp printer","printers","Hr","in use");
                asset a4 = new asset(4,"desktop","computers","director","in use");
                asset a5 = new asset(5,"projector","audioOrvideo","Hr","in repair");
                asset a6 = new asset(6,"speakers","audioOrvideo","ITpersonnel","in use");
                
		return FXCollections.<asset>observableArrayList(a1,a2,a3,a4,a5,a6 );
	}
    
	// Returns asset Id TableColumn
	public static TableColumn<asset, Integer> getIdColumn()
	{
		TableColumn<asset, Integer> idCol = new TableColumn<>("Id");
		PropertyValueFactory<asset, Integer> idCellValueFactory = new PropertyValueFactory<>("id");
		idCol.setCellValueFactory(idCellValueFactory);
		return idCol;
	}
// Returns Name TableColumn
	public static TableColumn<asset, String> getNameColumn()
	{
		TableColumn<asset, String> NameCol = new TableColumn<>("Name");
		PropertyValueFactory<asset, String> NameCellValueFactory = new PropertyValueFactory<>("Name");
		NameCol.setCellValueFactory(NameCellValueFactory);
		NameCol.setMinWidth(200);
		NameCol.setEditable(true);
		return NameCol;
	}

	
	// Returns Category TableColumn
	public static TableColumn<asset, String> getcategoryColumn()
	{
		TableColumn<asset, String> CategoryCol = new TableColumn<>("Category");
		PropertyValueFactory<asset, String> CategoryCellValueFactory = new PropertyValueFactory<>("Category");
		CategoryCol.setCellValueFactory(CategoryCellValueFactory);
		CategoryCol.setMinWidth(200);
		CategoryCol.setEditable(true);
		return CategoryCol;
	}

	// Returns location TableColumn
	public static TableColumn<asset, String> getLocationColumn()
	{
		TableColumn<asset, String> LocationCol = new TableColumn<>("Location");
		PropertyValueFactory<asset, String> LocationCellValueFactory = new PropertyValueFactory<>("Location");
		LocationCol.setCellValueFactory(LocationCellValueFactory);
		LocationCol.setMinWidth(200);
		LocationCol.setEditable(true);
		return LocationCol;
	}

	// Returns state TableColumn
	public static TableColumn<asset, String> getStateColumn()
	{
		TableColumn<asset, String> StateCol = new TableColumn<>("State");
		PropertyValueFactory<asset, String> StateCellValueFactory = new PropertyValueFactory<>("State");
		StateCol.setCellValueFactory(StateCellValueFactory);
		StateCol.setMinWidth(200);
		StateCol.setEditable(true);
		return StateCol;
	}

}
