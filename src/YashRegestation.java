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

public class YashRegestation  implements ActionListener {
    
    //decleration od compoment
    Label lblName,lblFather,lblAge,lblGender,lblAddress,lblHobbies,lblCource;
    TextField txtName,txtFather,txtAge;
    Checkbox checkMale,checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
    Choice Cource;
    TextArea Address; 
    Button btnSubmit,btnClear;
    CheckboxGroup cbg;
    
    //constructor
    public YashRegestation(){
        //super("user registation form");
        
        //set size,vissibility,layout and colour
        Frame f=new Frame();
       f. setSize(1000,600);
        f.setVisible(true);
        f.setLayout(null);
        f.setBackground(Color.GRAY);
        
        //set font 
        Font LabelFont=new Font("arial",Font.BOLD,18);
        Font TextField =new Font("arial",Font.PLAIN,15);
        Font TextArea=new Font("arial",Font.PLAIN,15);
        
        //made label name
        lblName=new Label("Name");
        lblName.setFont(LabelFont);
        lblName.setBounds(250,100,150,30);
        lblName.setForeground(Color.red);
        f.add(lblName);
        
        //made textname
        txtName=new TextField();
        txtName.setBounds(400,100,400,30);
        txtName.setFont(TextField);
        f.add(txtName);
        
        //label father
        lblFather =new Label("Father name");
        lblFather.setBounds(250,150,150,30);
        lblFather.setFont(LabelFont);
        lblFather.setForeground(Color.WHITE);
        f.add(lblFather);
        
        //set TextField
        txtFather=new TextField();
        txtFather.setBounds(400,150,400,30);
        txtFather.setFont(TextField);
       f. add(txtFather);
        
        //label age
        lblAge=new Label("Age");
        lblAge.setBounds(250,200,150,30);
        lblAge.setFont(LabelFont);
        lblAge.setForeground(Color.WHITE);
        f.add(lblAge);
                
        //set text field
        txtAge=new TextField();
        txtAge.setBounds(400,200,400,30);
        txtAge.setFont(TextField);
        f.add(txtAge);
        
        //label gender
        lblGender=new Label("Gender");
        lblGender.setBounds(250,250,150,30);
        lblGender.setFont(LabelFont);
        lblGender.setForeground(Color.WHITE);
        f.add(lblGender);
        
        cbg=new CheckboxGroup();
        
        //chioce male
        checkMale=new Checkbox("Male",cbg,false);
        checkMale.setBounds(400,250,100,30);
        checkMale.setFont(LabelFont);
        checkMale.setForeground(Color.WHITE);
        f.add(checkMale);
        
        //choice female
        checkFemale=new Checkbox("Female",cbg,false);
        checkFemale.setBounds(500,250,100,30);
        checkFemale.setFont(LabelFont);
        checkFemale.setForeground(Color.WHITE);
       f. add(checkFemale);
        
        // label hobbies
        lblHobbies=new Label("Hobbies");
        lblHobbies.setBounds(250,350,150,30);
        lblHobbies.setFont(LabelFont);
        lblHobbies.setForeground(Color.WHITE);
        f.add(lblHobbies);
        
        //choice of Hobbies
        Hobbies1=new Checkbox("Drawing");
        Hobbies1.setBounds(400,350,100,50);
        Hobbies1.setFont(LabelFont);
        Hobbies1.setForeground(Color.WHITE);
        f.add(Hobbies1);
        
        Hobbies2=new Checkbox("Cricket");
        Hobbies2.setBounds(500,350,100,50);
        Hobbies2.setFont(LabelFont);
        Hobbies2.setForeground(Color.white);
        f.add(Hobbies2);
        
        Hobbies3=new Checkbox("Swing");
        Hobbies3.setBounds(600,350,100,50);
        Hobbies3.setFont(LabelFont);
        Hobbies3.setForeground(Color.WHITE);
        f.add(Hobbies3);
        
        Hobbies4=new Checkbox("Other");
        Hobbies4.setBounds(700,350,100,50);
        Hobbies4.setFont(LabelFont);
        Hobbies4.setForeground(Color.WHITE);
        f.add(Hobbies4);
        
        //label cource
        lblCource=new Label("Cource");
        lblCource.setBounds(250,300,100,30);
        lblCource.setFont(LabelFont);
        lblCource.setForeground(Color.WHITE);
        f.add(lblCource);
        
        Cource=new Choice();
        Cource.setBounds(400,300,400,50);
        Cource.setFont(LabelFont);
        Cource.setForeground(Color.BLACK);
        Cource.add("");
        Cource.add("java");
        Cource.add("c");
        Cource.add("c#");
        Cource.add("PHYTHON");
        f.add(Cource);
        
        //label address
        lblAddress=new Label("Address");
        lblAddress.setFont(LabelFont);
        lblAddress.setBounds(250,400,150,30);
        lblAddress.setForeground(Color.WHITE);
        f.add(lblAddress);
        
        //set Textarea
        Address=new TextArea();
        Address.setBounds(400,400,400,100);
        Address.setFont(TextArea);
        f.add(Address);
        
        //Button submit
        btnSubmit=new Button("Submit");
        btnSubmit.setBounds(400,530,150,30);
        btnSubmit.setFont(LabelFont);
        btnSubmit.setForeground(Color.BLUE);
        f.add(btnSubmit);
  
        //add task Perfom to submit
        btnSubmit.addActionListener(this);

        //set Button Clear
        btnClear=new Button("Clear");
        btnClear.setBounds(560,530,150,30);
        btnClear.setFont(LabelFont);
        btnClear.setForeground(Color.RED);
        f.add(btnClear);
        
        //set task perform to Clear
        btnClear.addActionListener(this);
        
        //window  lintener
        /*
         f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
           
      }); 
*/
       
        
    }
    
    //main Object
    public static void main(String[] args){
        YashRegestation ya=new YashRegestation();   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        //set method of Button Working
        if(e.getSource()==btnSubmit){
            new YashRegestationSubmit();
        }
        else if(e.getSource()==btnClear){
            txtName.setText("");
            txtFather.setText("");
            Address.setText("");
            txtAge.setText("");
        }
        
    }

}

class YashRegestationSubmit extends Frame implements ActionListener{
    
    //Define Compoment
    Label lblTitle,lblResult;
    Button btnBack;
    
    //constructor
    public YashRegestationSubmit(){
        
        //set Frame size,vissible ,boundsand color
        setSize(800,500);
        setVisible(true);
        setBackground(Color.GRAY);
        setLayout(null);
        
        // font
        Font Title=new Font("arial",Font.BOLD,25);
        Font Label=new Font("arial",Font.PLAIN,18);
        
        
        //set Label of submit
        lblTitle=new Label("Submit");
        lblTitle.setBounds(250,40,300,50);
        lblTitle.setFont(Title);
        lblTitle.setForeground(Color.WHITE);
        add(lblTitle);
        
        btnBack=new Button("Go Back");
        btnBack.setBounds(250,150,150,30);
        btnBack.setFont(Label);
        btnBack.setForeground(Color.red);
        add(btnBack); 
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==btnBack){
          new YashRegestation();
          dispose();
      }
    }
      
} 
