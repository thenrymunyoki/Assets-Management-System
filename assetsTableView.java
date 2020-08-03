/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ITBIZ;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.util.Arrays;

public class assetsTableView extends Application
      
    
{
	// Define the Text Fields
	private final TextField IdField = new TextField();
	private final TextField NameField = new TextField();
	private final TextField CategoryField = new TextField();
	private final TextField LocationField = new TextField();
	private final TextField StateField = new TextField();
     
	


	// Create the TableView
	TableView<asset> table = new TableView<>(assetviewhelper.getassetList());

	public static void main(String[] args)
	{
		Application.launch(args);
	}
        

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage)
	{
		// Turn on multi-row selection for the TableView
		TableViewSelectionModel<asset> tsm = table.getSelectionModel();
		tsm.setSelectionMode(SelectionMode.MULTIPLE);
                table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		// Set the Placeholder for an empty table
		table.setPlaceholder(new Label("No visible columns and/or data exist."));
		// Make the TableView editable
		table.setEditable(true);
		// Add columns to the TableView
		table.getColumns().addAll(assetviewhelper.getIdColumn(), assetviewhelper.getNameColumn(),
				assetviewhelper.getcategoryColumn(),assetviewhelper.getLocationColumn(),
				assetviewhelper.getStateColumn());

		// Set the column resize policy to constrained resize policy
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		// Set the Placeholder for an empty table
		table.setPlaceholder(new Label("No visible columns and/or data exist."));
                // Add columns with appropriate editing features
                // Make the TableView editable
		table.setEditable(true);
		


		// Create the GridPane
		GridPane newDataPane = this.getNewassetDataPane();

		// Create the Delete Button and add Event-Handler
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(new EventHandler<ActionEvent>()
		{
            @Override public void handle(ActionEvent e)
            {
                deleteasset();
            }
        });
                Button editButton = new Button("Edit");
		editButton.setOnAction(new EventHandler<ActionEvent>()
		{
            @Override public void handle(ActionEvent e)
            {
                editasset();
            }
        });
 
		// Create the VBox
		VBox root = new VBox();
		// Add the GridPane and the Delete Button to the VBox
		root.getChildren().addAll(newDataPane, deleteButton, table);

		// Set the Padding and Border for the VBox
		root.setSpacing(5);
		// Set the Spacing and Border for the VBox
		root.setStyle("-fx-padding: 10;" +
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 2;" +
				"-fx-border-insets: 5;" +
				"-fx-border-radius: 5;" +
				"-fx-border-color: blue;");

		// Create the Scene
		Scene scene = new Scene(root);
		// Add the Scene to the Stage
		stage.setScene(scene);
		// Set the Title of the Stage
		stage.setTitle("Assets Management System");
		// Display the Stage
		stage.show();
	}
 
	public GridPane getNewassetDataPane()
	{
		// Create the GridPane
		GridPane pane = new GridPane();

		// Set the hgap and vgap properties
		pane.setHgap(10);
		pane.setVgap(5);

		// Add the TextFields to the Pane
		pane.addRow(0, new Label("Name:"), NameField);
		pane.addRow(1, new Label("Category:"), CategoryField);
		pane.addRow(2, new Label("Location:"), LocationField);
		pane.addRow(3, new Label("State:"), StateField);
		

		// Create the Add Button and add Event-Handler
		Button addButton = new Button("Add");
		addButton.setOnAction(new EventHandler<ActionEvent>()
		{
            @Override public void handle(ActionEvent e)
            {
                addasset();
            }
        });

		// Add the Add Button to the GridPane
		pane.add(addButton, 2, 0);

		return pane;
	}

	public void addasset()
	{
		Integer currentId = 0;

		// Get the next ID
		for(asset s : table.getItems())
		{
			if(s.getId()>currentId)
			{
				currentId = s.getId();
			}
		}

		// Create a new asset Object
		asset asset = new asset(currentId+1,NameField.getText(),CategoryField.getText(),LocationField.getText(),
			StateField.getText());

		// Add the new asset to the table
		table.getItems().add(asset);

		// Clear the Input Fields
		NameField.setText(null);
		CategoryField.setText(null);
		LocationField.setText(null);
		StateField.setText(null);
		
	}
        
        public void editasset()
	{
		Integer currentId = 0;

		// Get the next ID
		for(asset s : table.getItems())
		{
			if(s.getId()>currentId)
			{
				currentId = s.getId();
			}
		}

		// Create a new asset Object
		asset asset = new asset(currentId+1,NameField.getText(),CategoryField.getText(),LocationField.getText(),
			StateField.getText());

		// Add the new asset to the table
		table.getItems().add(asset);

		// Clear the Input Fields
		NameField.setText(null);
		CategoryField.setText(null);
		LocationField.setText(null);
		StateField.setText(null);
		
	}
;


	public void deleteasset()
	{
		TableViewSelectionModel<asset> tsm = table.getSelectionModel();

		// Check, if any rows are selected
		if (tsm.isEmpty())
		{
			System.out.println("servers and laptop need security and softare upgrates.");
                        System.out.println("Please select a row to delete.");
                        System.out.println("Please select a row to delete.");
			return;
		}

		// Get all selected row indices in an array
		ObservableList<Integer> list = tsm.getSelectedIndices();

		Integer[] selectedIndices = new Integer[list.size()];
		selectedIndices = list.toArray(selectedIndices);

		// Sort the array
		Arrays.sort(selectedIndices);

		// Delete rows (last to first)
		for(int i = selectedIndices.length - 1; i >= 0; i--)
		{
			tsm.clearSelection(selectedIndices[i].intValue());
			table.getItems().remove(selectedIndices[i].intValue());
		}
	}
      

}

