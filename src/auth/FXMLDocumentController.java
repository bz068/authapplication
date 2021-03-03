/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import com.sun.scenario.effect.impl.Renderer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private Label label;
   @FXML
    private TextField firstName;
   @FXML
    private TextField lastName;
    @FXML
    private TextField email;
     @FXML
    private TextField username;
      @FXML
    private PasswordField password;
       @FXML
    private PasswordField cPassword;

    
    @FXML
    private Button login;
    
    @FXML
     void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
          try{
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("register.fxml"));       
        Parent root = (Parent) fxml.load();       
        Stage stage = new Stage();
        
        Image applicationIcon = new Image(getClass().getResourceAsStream("login.png"));
        stage.getIcons().add(applicationIcon);
        
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Register");
        stage.setScene(new Scene(root));
        stage.sizeToScene();
        stage.show();
        stage.setResizable(false);
        ((Node)(event.getSource())).getScene().getWindow().hide();
        
       }catch(Exception e){
              System.out.println("Cant Open");
       }
    }
    
     @FXML
     void showLogin(ActionEvent event) {
          try{
        FXMLLoader fxml = new FXMLLoader(getClass().getResource("login.fxml"));       
        Parent root = (Parent) fxml.load();       
        Stage stage = new Stage();
        
        Image applicationIcon = new Image(getClass().getResourceAsStream("login.png"));
        stage.getIcons().add(applicationIcon);
        
        stage.setTitle("Login");
        stage.setScene(new Scene(root));
        stage.sizeToScene();
        stage.show();
        stage.setResizable(false);
        ((Node)(event.getSource())).getScene().getWindow().hide();
       }catch(Exception e){
              System.out.println("Cant Open");
           
       }
    }
     @FXML
     void register(ActionEvent event){
     if(firstName.getText().isEmpty() || lastName.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty() || cPassword.getText().isEmpty()){
         label.setText("Please Enter All Fields");
     }
     else if(!password.getText().equals(cPassword.getText())){
        label.setText("Password Doesnt Match, Please Try Again...");

     }else{
        label.setText("");
  
     }
     }
     
     @FXML
     void login(ActionEvent event){
         if(username.getText().isEmpty() || password.getText().isEmpty()){
             label.setText("Please Enter All Fields");
         }
     }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
