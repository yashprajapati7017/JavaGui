/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.awt.*;
import java.awt.event.*;
public class YashGui extends Frame implements ActionListener{
    
    //component
    Label labelName,labelResult;
    TextField textName;
    Button btnSubmit,btnClear;
   
    public YashGui(){
        
        //set title
     setTitle("welcome to awi");
     
     //Set layout
     setLayout(new FlowLayout());
     
     //create component
     labelName=new Label("enter you name");
     textName=new TextField(20);//20word store
     btnSubmit=new Button("Submit");
     btnClear=new Button("Clear");
     labelResult=new Label("");
     
     //add to frame
     add(labelName);
     add(textName);
     add(btnSubmit);
     add(btnClear);
     add(labelResult);
     
     //add action lisrtener
     btnSubmit.addActionListener(this);
     btnClear.addActionListener(this);
     
     //set size or visibility
     setSize(400,400);
     setVisible(true);
     
    }    
    public void actionPerformed(ActionEvent e){        
     if(e.getSource()==btnSubmit){
         String name=textName.getText();
         labelResult.setText("hello"+name+"!");
     }
     else if(e.getSource()==btnClear){
         textName.setText("");
         labelResult.setText("");
     }
     //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args){
     YashGui ya=new YashGui();   
    }
}