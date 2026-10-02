/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */

import java.awt.*;
import java.awt.event.*;

public class YashGui1 extends Frame implements ActionListener{

    //component
    Label labelName,labelResult;
    TextField textName;
    Button btnSubmit,btnClear;
    
    public YashGui1(){
        
        //set title 
        setTitle("welcome to GUI");
        
        //setlayout
        setLayout(new FlowLayout());
        
        //create component
        labelName=new Label("enter your name");
        textName=new TextField(20);//20world store
        btnSubmit=new Button("Submit");
        btnClear=new Button("Clear");
        labelResult=new Label("");
        
        //add to frame
        add(labelName);
        add(textName);
        add(btnSubmit);
        add(btnClear);
        add(labelResult);
        
        //set size and vissibility
        setSize(200,300);
        setVisible(true);
        
        //set action listener
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this); 
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSubmit){
            
        }
        else if(e.getSource()==btnClear){
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args){
        YashGui1 ya=new YashGui1();
    }
    
}
