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
import javax.swing.*;

public class YashSwing {
    
    //declration of element
    JFrame mainFrame;
    JLabel headerLabel;
    JLabel statusLabel;
    JPanel ControlPanel;
    
    //constructor
    public YashSwing(){
       prepareGui();
    }
    
    //main method 
    public static void main(String[] args){
        YashSwing ya=new YashSwing();
        ya.showevent();
        
    }
    
    //prepareGui calling
    void prepareGui(){
        
        //set Frame,sizre and layout
        mainFrame=new JFrame("java swing example");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        
        //set layout
        headerLabel=new JLabel("",JLabel.CENTER);
        statusLabel=new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        /*mainFrame.addWindowListener(new adapter(
        
        ));*/
        
        //set control panel
        ControlPanel=new JPanel();
        ControlPanel.setLayout(new FlowLayout());
        
        //add to frame
        mainFrame.add(headerLabel);
        mainFrame.add(ControlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
         
    }
    
    public void showevent(){
        JButton okBtn=new JButton("ok");
        JButton clearBtn=new JButton("Clear");
        JButton submitBtn=new JButton("Submit");
        
        //action perform
        okBtn.setActionCommand("ok");
        clearBtn.setActionCommand("clear");
        submitBtn.setActionCommand("submit");
        
       // okBtn.setActionListener(new ButtonClickListener());
        //clearBtn.setActionListener(new ButtonClickListener());
        //submitBtn.setActionListener(new ButtonClickListener());
        
        
        ControlPanel.add(okBtn);
        ControlPanel.add(submitBtn);
        ControlPanel.add(clearBtn);
        
        
    }

    private static class ButtonClickListener implements ActionListerner {

       
    private static interface ActionListerner {
    }

   
    }

    private static interface ActionListerner {
    }
    
}
