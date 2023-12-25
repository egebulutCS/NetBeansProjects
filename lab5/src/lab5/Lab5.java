/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Separator;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.shape.*;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author eb431
 */
public class Lab5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("Your Contacts");
        
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
        
        root.setTop(menuBar);
        
        TableView table = new TableView();
        TableColumn firstNameCol = new TableColumn("Name");
        TableColumn secondNameCol = new TableColumn("Number");
        TableColumn thirdNameCol = new TableColumn("Address");
        TableColumn fourthNameCol = new TableColumn("Country");
        table.getColumns().addAll(firstNameCol, secondNameCol, thirdNameCol, fourthNameCol);
        
        TabPane tabPane = new TabPane();
        Tab list = new Tab();
        list.setText("List");
        list.setContent(table);
        tabPane.getTabs().add(list);
        root.setCenter(tabPane);
        
        TilePane entryTile = new TilePane();
        entryTile.getChildren().add(new Label("Name: "));
        entryTile.getChildren().add(new TextField());
        entryTile.getChildren().add(new Label("Number: "));
        entryTile.getChildren().add(new TextField());
        entryTile.getChildren().add(new Label("Address: "));
        entryTile.getChildren().add(new TextField());
        entryTile.getChildren().add(new Label("Country"));
        ComboBox<MyEnum> cbxEnum = new ComboBox<>();
        cbxEnum.getItems().setAll(MyEnum.values());
        entryTile.getChildren().add(cbxEnum);
        entryTile.getChildren().add(new Button("clear"));
        entryTile.getChildren().add(new Button("add"));
        entryTile.getChildren().add(new Button("update"));
        entryTile.getChildren().add(new Button("remove"));
        
        Tab entry = new Tab();
        entry.setText("Entry");
        entry.setContent(entryTile);
        tabPane.getTabs().add(entry);
        root.setCenter(tabPane);
        
        TilePane searchTile = new TilePane();
        searchTile.getChildren().add(new Label("Name: "));
        searchTile.getChildren().add(new TextField());
        searchTile.getChildren().add(new Label("Number: "));
        searchTile.getChildren().add(new TextField());
        searchTile.getChildren().add(new Button("clear"));
        searchTile.getChildren().add(new Button("search"));
        
        Tab search = new Tab();
        search.setText("Search");
        search.setContent(searchTile);
        tabPane.getTabs().add(search);
        root.setCenter(tabPane);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
