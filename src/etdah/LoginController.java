/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etdah;


import javafx.scene.control.TextField;
import  javafx.scene.control.Button;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author NAT
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton sin;
    public String User="pelanggan";
    public String Pass="1234";
    
    @FXML
    private TextField user;
    @FXML
    private TextField pass;
    String username, password;
    @FXML
    private JFXButton exit;
    

     @FXML
    void masuk(ActionEvent event) {
         if(user.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap inputkan username & password dengan benar");
        }else if (pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Harap isikan username & password dengan benar");
         }
       username=user.getText();
       password=pass.getText();
        
         if(username.equalsIgnoreCase(User) && password.equalsIgnoreCase(Pass)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("ETDAH CAFE");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

    
}
