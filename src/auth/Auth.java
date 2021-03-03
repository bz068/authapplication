/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;


import javafx.scene.image.Image ;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Auth extends Application {
    
    @Override
    public  void start(Stage stage) throws Exception {
      
         try{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));       
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
        
        Image applicationIcon = new Image(getClass().getResourceAsStream("login.png"));
        stage.getIcons().add(applicationIcon);
        
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setResizable(false);
       }catch(Exception e){
           e.printStackTrace();
           
       }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
