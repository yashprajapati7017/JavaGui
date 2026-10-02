/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author DELL
 */


import java.awt.*;
import java.awt.event.*;

public class calculater2 implements ActionListener {
    Label labelans;
    Frame mainFrame;
    Button onebtn,twobtn,threebtn,fourbtn,fivebtn,sixbtn,sevenbtn,eightbtn,ninebtn,zerobtn,
            mulbtn,subbtn,divbtn,addbtn,modbtn,calcbtn,ptsbtn,negbtn,backbtn,clrbtn;
    int num1,num2,check,xd;
    
    
    //constructor
    
    calculater2(){
    
        // frame
        mainFrame=new Frame();
        mainFrame.setSize(360,500);
        mainFrame.setBackground(Color.GRAY);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        
        // labrl
        labelans=new Label();
        labelans.setBounds(50,50,260,60);
        labelans.setBackground(Color.PINK);
        mainFrame.add(labelans);
        
        // 1 button
        onebtn=new Button("1");
        onebtn.setBounds(50,340,50,50);
        onebtn.setBackground(Color.GREEN);
        mainFrame.add(onebtn);
        onebtn.addActionListener(this);
        
        //2button
        twobtn=new Button("2");
        twobtn.setBounds(120,340,50,50);
        twobtn.setBackground(Color.GREEN);
        mainFrame.add(twobtn);
        twobtn.addActionListener(this);
        
        //3 button
        threebtn=new Button("3");
        threebtn.setBounds(190,340,50,50);
        threebtn.setBackground(Color.GREEN);
        mainFrame.add(threebtn);
        threebtn.addActionListener(this);
        
        //4button
        fourbtn=new Button("4");
        fourbtn.setBounds(50,270,50,50);
        fourbtn.setBackground(Color.GREEN);
        mainFrame.add(fourbtn);
        fourbtn.addActionListener(this);
        
        //5button
        fivebtn=new Button("5");
        fivebtn.setBounds(120,270,50,50);
        fivebtn.setBackground(Color.GREEN);
        mainFrame.add(fivebtn);
        fivebtn.addActionListener(this);
        
        //6 button
        sixbtn=new Button("6");
        sixbtn.setBounds(190,270,50,50);
        sixbtn.setBackground(Color.GREEN);
        mainFrame.add(sixbtn);
        sixbtn.addActionListener(this);
        
        //7 button
        sevenbtn=new Button("7");
        sevenbtn.setBounds(50,200,50,50);
        sevenbtn.setBackground(Color.GREEN);
        mainFrame.add(sevenbtn);
        sevenbtn.addActionListener(this);
        
        //8 button
        eightbtn=new Button("8");
        eightbtn.setBounds(120,200,50,50);
        eightbtn.setBackground(Color.GREEN);
        mainFrame.add(eightbtn);
        eightbtn.addActionListener(this);
        
        //9 button
        ninebtn=new Button("9");
        ninebtn.setBounds(190,200,50,50);
        ninebtn.setBackground(Color.GREEN);
        mainFrame.add(ninebtn);
        ninebtn.addActionListener(this);
        
        //0 button
        zerobtn=new Button("0");
        zerobtn.setBounds(120,410,50,50);
        zerobtn.setBackground(Color.GREEN);
        mainFrame.add(zerobtn);
        zerobtn.addActionListener(this);
        
        
        //operation button
        
        addbtn=new Button("+");
        addbtn.setBounds(260,340,50,50);
        addbtn.setBackground(Color.WHITE);
        mainFrame.add(addbtn);
        addbtn.addActionListener(this);
        
        ptsbtn=new Button(".");
        ptsbtn.setBounds(190,410,50,50);
        ptsbtn.setBackground(Color.WHITE);
        mainFrame.add(ptsbtn);
        ptsbtn.addActionListener(this);
        
        backbtn=new Button("Back");
        backbtn.setBounds(120,130,50,50);
        backbtn.setBackground(Color.WHITE);
        mainFrame.add(backbtn);
        backbtn.addActionListener(this);
        
        subbtn=new Button("-");
        subbtn.setBounds(260,270,50,50);
        subbtn.setBackground(Color.WHITE);
        mainFrame.add(subbtn);
        subbtn.addActionListener(this);
        
        mulbtn=new Button("*");
        mulbtn.setBounds(260,200,50,50);
        mulbtn.setBackground(Color.WHITE);
        mainFrame.add(mulbtn);
        mulbtn.addActionListener(this);
        
        divbtn=new Button("/");
        divbtn.setBounds(260,130,50,50);
        divbtn.setBackground(Color.WHITE);
        mainFrame.add(divbtn);
        divbtn.addActionListener(this);
        
        modbtn=new Button("%");
        modbtn.setBounds(190,130,50,50);
        modbtn.setBackground(Color.WHITE);
        mainFrame.add(modbtn);
        modbtn.addActionListener(this);
        
        calcbtn=new Button("=");
        calcbtn.setBounds(245,410,65,50);
        calcbtn.setBackground(Color.WHITE);
        mainFrame.add(calcbtn);
        calcbtn.addActionListener(this);
        
        clrbtn=new Button("cl");
        clrbtn.setBounds(50,130,65,50);
        clrbtn.setBackground(Color.RED);
        mainFrame.add(clrbtn);
        clrbtn.addActionListener(this);
        
    }
    public static void main(String[] args){
        calculater2 ca=new calculater2();
        
   
    }

    @Override
    //action on button
    public void actionPerformed(ActionEvent e) {
       String z,zt;
        
       //working on number
       
        if(e.getSource()==onebtn){
             zt=labelans.getText();
             z=zt+"1";
             labelans.setText(z);

        }
        
        if(e.getSource()==twobtn){
            zt=labelans.getText();
            z=zt+"2";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==threebtn){
            zt=labelans.getText();
            z=zt+"3";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==fourbtn){
            zt=labelans.getText();
            z=zt+"4";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==fivebtn){
            zt=labelans.getText();
            z=zt+"5";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==sixbtn){
            zt=labelans.getText();
            z=zt+"6";
            labelans.setText(z);
           
        }
        
        if(e.getSource()==sevenbtn){
            zt=labelans.getText();
            z=zt+"7";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==eightbtn){
            zt=labelans.getText();
            z=zt+"8";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==ninebtn){
            zt=labelans.getText();
            z=zt+"9";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==zerobtn){
            zt=labelans.getText();
            z=zt+"0";
            labelans.setText(z);
            
        }
        
        if(e.getSource()==ptsbtn){
            zt=labelans.getText();
            z=zt+".";
            labelans.setText(z);
            
        }
       
        //working on operation
        
        if(e.getSource()==backbtn){
            zt=labelans.getText();
            try{
                z=zt.substring(0,zt.length()-1);
            }
            catch(StringIndexOutOfBoundsException f){
                return;
            }
            labelans.setText(z);
            
        }
        
        if(e.getSource()==addbtn){
            try{
                num1=Integer.parseInt(labelans.getText());
            }
            catch(NumberFormatException f){
                labelans.setText("invalid");
            }
            z="";
            labelans.setText(z);
            check=1;
        }
        
        if(e.getSource()==subbtn){
            try{
                num1=Integer.parseInt(labelans.getText());
            }
            catch(NumberFormatException f){
                labelans.setText("invalid");
            }
            z="";
            labelans.setText(z);
            check=2;
        }
        
        if(e.getSource()==mulbtn){
            try{
                num1=Integer.parseInt(labelans.getText());
            }
            catch(NumberFormatException f){
                labelans.setText("invalid");
            }
            z="";
            labelans.setText(z);
            check=3;
        }
        
        if(e.getSource()==divbtn){
            try{
                num1=Integer.parseInt(labelans.getText());
            }
            catch(NumberFormatException f){
                labelans.setText("invalid");
            }
            z="";
            labelans.setText(z);
            check=4;
        }
        
        if(e.getSource()==modbtn){
            try{
                num1=Integer.parseInt(labelans.getText());
            }
            catch(NumberFormatException f){
                labelans.setText("invalid");
            }
            z="";
            labelans.setText(z);
            check=5;
        }
        
        if(e.getSource()==calcbtn){
           try{
               num2=Integer.parseInt(labelans.getText());
           }
           catch(Exception f){
               labelans.setText("eneter the number");
               return;
           }
           if(check==1){
               xd=num1+num2;
           }
           if(check==2){
               xd=num1-num2;
           }
           if(check==3){
              xd=num1*num2; 
           }
           if(check==4){
               xd=num1/num2;
           }
           if(check==5){
               xd=num1%num2;
           }
           labelans.setText(String.valueOf(xd));
        }
        
        if(e.getSource()==clrbtn){
           num1=0;
           num2=0;
           xd=0;
           check=0;
           z="";
           labelans.setText(z);
        }
    }
}







