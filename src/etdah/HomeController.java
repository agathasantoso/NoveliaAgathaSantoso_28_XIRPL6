/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etdah;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author NAT
 */
public class HomeController implements Initializable {

    @FXML
    private JFXButton save;
    @FXML
    private TextField j1;
    @FXML
    private Label h1;
    @FXML
    private TextField j5;
    @FXML
    private Label h2;
    @FXML
    private Label h3;
    @FXML
    private Label h4;
    @FXML
    private Label h5;
    @FXML
    private Label h6;
    @FXML
    private TextField j2;
    @FXML
    private TextField j3;
    @FXML
    private TextField j6;
    @FXML
    private TextField j4;
    @FXML
    private Label h7;
    @FXML
    private Label h8;
    @FXML
    private TextField j7;
    @FXML
    private TextField j8;
    @FXML
    private TextField total;
    @FXML
    private TextField nama;
    @FXML
    private JFXButton print;
    private JFXTextArea hasil;
    @FXML
    private JFXCheckBox fc;
    @FXML
    private JFXCheckBox fg;
    @FXML
    private JFXCheckBox fd;
    @FXML
    private JFXCheckBox bc;
    @FXML
    private JFXCheckBox bg;
    @FXML
    private JFXCheckBox bd;
    @FXML
    private JFXCheckBox tea;
    @FXML
    private JFXCheckBox orange;
    int jumlahmakan, jumlahminum;
    int hagatotal1,hagatotal2,hagatotal3,hagatotal4,hagatotal5,hagatotal6,hagatotal7,hagatotal8;
    TextField menu1;
    String menu2, menu3, menu4,menu5,menu6,menu7,menu8;
    String menu="";
    String atasnama,tampilTotalBayar;
    int totalbayar;
    @FXML
    private JFXButton exit;
    @FXML
    private JFXButton sio;
    @FXML
    private JFXButton del;
    @FXML
    private TextField total1;

    @FXML
    private TextField nama1;

    @FXML
    private JFXTextArea menu11;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void save(ActionEvent event) {
        
        if(fc.isSelected()){     
            int harga = 12000;
            menu += fc.getText()+"\n";
            jumlahmakan=Integer.parseInt(j1.getText());
            hagatotal1=harga*jumlahmakan;
            System.out.println(hagatotal1);
        }
        if(fg.isSelected()){     
            int harga = 15000;
            menu += fg.getText()+"\n";
            jumlahmakan=Integer.parseInt(j2.getText());
            hagatotal2=harga*jumlahmakan;
            System.out.println(hagatotal2);
        }
        if(fd.isSelected()){     
            int harga = 13000;
            menu += fd.getText()+"\n";
            jumlahmakan=Integer.parseInt(j3.getText());
            hagatotal3=harga*jumlahmakan;
            System.out.println(hagatotal3);
        }
        if(bc.isSelected()){     
            int harga = 15000;
            menu += bc.getText()+"\n";
            jumlahmakan=Integer.parseInt(j4.getText());
            hagatotal4=harga*jumlahmakan;
            System.out.println(hagatotal4);
        }
        if(bg.isSelected()){     
            int harga = 17000;
            menu += bg.getText()+"\n";
            jumlahmakan=Integer.parseInt(j5.getText());
            hagatotal5=harga*jumlahmakan;
            System.out.println(hagatotal5);
        }
        if(bd.isSelected()){     
            int harga = 16000;
            menu += bd.getText()+"\n";
            jumlahmakan=Integer.parseInt(j6.getText());
            hagatotal6=harga*jumlahmakan;
            System.out.println("");
        }
        if(tea.isSelected()){     
            int harga = 4000;
            menu += tea.getText()+"\n";
            jumlahmakan=Integer.parseInt(j7.getText());
            hagatotal7=harga*jumlahmakan;
            System.out.println(hagatotal7);
        }
        if(orange.isSelected()){     
            int harga = 6000;
            menu += orange.getText()+"\n";
            jumlahmakan=Integer.parseInt(j8.getText());
            hagatotal8=harga*jumlahmakan;
            System.out.println(hagatotal8);
        }
        totalbayar = hagatotal1+hagatotal2+hagatotal3+hagatotal4+hagatotal5+hagatotal6+hagatotal7+hagatotal8;
        tampilTotalBayar=String.valueOf(totalbayar);
        total.setText(tampilTotalBayar);
    }
    
    @FXML
    private void hapus(ActionEvent event) {
        nama.setText("");
        total.setText("");
        total.requestFocus();
        fc.setSelected(false);
        fc.requestFocus();
        fg.setSelected(false);
        fg.requestFocus();
        fd.setSelected(false);
        fd.requestFocus();
        bc.setSelected(false);
        bc.requestFocus();
        bg.setSelected(false);
        bg.requestFocus();
        bd.setSelected(false);
        bd.requestFocus();
        tea.setSelected(false);
        tea.requestFocus();
        orange.setSelected(false);
        orange.requestFocus();
        j1.setText("");
        j2.setText("");
        j3.setText("");
        j4.setText("");
        j5.setText("");
        j6.setText("");
        j7.setText("");
        j8.setText("");
        nama1.setText("");
        total1.setText("");
        menu11.setText("");
    }

    @FXML
    private void print(ActionEvent event) {
        String atasnama = nama.getText();
        int totalbayar = Integer.parseInt(total.getText());
   
        
        nama1.setText(atasnama);
        total1.setText("Rp. "+totalbayar);
        menu11.setText(menu);
       
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void keluar(ActionEvent event) {
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
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
