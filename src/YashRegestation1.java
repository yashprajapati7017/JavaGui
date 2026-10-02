// Program is Working 


import java.awt.*;
import java.awt.event.*;

public class YashRegestation1 extends Frame {
    
    // decleration Compoment
    Label lblName,lblFatherName,lblTitle,lblAge,lblHobbies,lblCource,lblAddress,lblGender;
    TextField txtName,txtFatherName,txtAge;
    Checkbox CheckMale,CheckFemal,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
    TextArea Address;
    CheckboxGroup cbg;
    Choice Cource;
    Button btnSubmit,btnClear;
    
    //constructor
    public YashRegestation1(){
        
        //setSize,vissible,Layoutand colour
        setSize(1000,600);
        setLayout(null);
        setBackground(Color.GRAY);
        setVisible(true);
        
        // set Font
        Font Title=new Font("arial",Font.BOLD,25);
        Font Label=new Font("Ariel",Font.PLAIN,18);
        Font TextField=new Font("arial",Font.PLAIN,15);
        
        // Made title
        lblTitle=new Label("regestation Form");
        lblTitle.setBounds(250,40,300,50);
        lblTitle.setFont(Title);
        lblTitle.setForeground(Color.YELLOW);
        add(lblTitle);
        
        // made label name
        lblName=new Label("Name");
        lblName.setBounds(250,100,150,30);
        lblName.setFont(Label);
        lblName.setForeground(Color.WHITE);
        add(lblName);
        
        // text Name
        txtName=new TextField();
        txtName.setBounds(400,100,400,30);
        txtName.setFont(TextField);
        add(txtName);
        
        //Label Fathet Name
        lblFatherName=new Label("Father Name");
        lblFatherName.setBounds(250,150,150,30);
        lblFatherName.setFont(Label);
        lblFatherName.setForeground(Color.WHITE);
        add(lblFatherName);
        
        //text FatherName
        txtFatherName=new TextField();
        txtFatherName.setBounds(400,150,400,30);
        txtFatherName.setFont(TextField);
        add(txtFatherName);
        
        //Label age        
        lblAge=new Label("Age");
        lblAge.setBounds(250,200,150,30);
        lblAge.setFont(Label);
        lblAge.setForeground(Color.WHITE);
        add(lblAge);
        
        // set text age
        txtAge=new TextField();
        txtAge.setBounds(400,200,400,30);
        txtAge.setFont(TextField);
        add(txtAge);
        
        // label gender
        lblGender=new Label("Gender");
        lblGender.setBounds(250,250,150,30);
        lblGender.setFont(Label);
        lblGender.setForeground(Color.WHITE);
        add(lblGender);
        
        // made cbg object
        cbg=new CheckboxGroup();
        
        // made choice Male
        CheckMale= new Checkbox("Male",cbg,true);
        CheckMale.setBounds(400,250,100,30);
        CheckMale.setFont(Label);
        CheckMale.setForeground(Color.WHITE);
        add(CheckMale);
        
        //made Choice Female
        CheckFemal=new Checkbox("Femal",cbg,false);
        CheckFemal.setBounds(500,250,100,30);
        CheckFemal.setFont(Label);
        CheckFemal.setForeground(Color.WHITE);
        add(CheckFemal);
        
        // set courde Label
        lblCource=new Label("Course");
        lblCource.setBounds(250,300,150,30);
        lblCource.setFont(Label);
        lblCource.setForeground(Color.WHITE);
        add(lblCource);
        
        //set choice cource
        Cource=new Choice();
        Cource.setBounds(400,300,400,50);
        Cource.setFont(Label);
        Cource.add("JAVE");
        Cource.add("C");
        Cource.add("C++");
        Cource.add("C#");
        Cource.add("PITHON");
        add(Cource);

        //set Label Hobbies
        lblHobbies=new Label("Hobbies");
        lblHobbies.setBounds(250,350,150,30);
        lblHobbies.setFont(Label);
        lblHobbies.setForeground(Color.WHITE);
        add(lblHobbies);

        // set check box of Hobbies
        Hobbies1=new Checkbox("Drowing");
        Hobbies1.setBounds(400,350,100,50);
        Hobbies1.setFont(Label);
        Hobbies1.setForeground(Color.WHITE);
        add(Hobbies1);
        
        Hobbies2=new Checkbox("Cricket");
        Hobbies2.setBounds(500,350,100,50);
        Hobbies2.setFont(Label);
        Hobbies2.setForeground(Color.WHITE);
        add(Hobbies2);
        
        Hobbies3=new Checkbox("Swining");
        Hobbies3.setBounds(600,350,100,50);
        Hobbies3.setFont(Label);
        Hobbies3.setForeground(Color.WHITE);
        add(Hobbies3);
        
        Hobbies4=new Checkbox("Other");
        Hobbies4.setBounds(700,350,100,50);
        Hobbies4.setFont(Label);
        Hobbies4.setForeground(Color.WHITE);
        add(Hobbies4);
        
        //set address Label
        lblAddress=new Label("Address");
        lblAddress.setBounds(250,400,150,30);
        lblAddress.setFont(Label);
        lblAddress.setForeground(Color.WHITE);
        add(lblAddress);
        
        Address=new TextArea();
        Address.setBounds(400,400,400,100);
        Address.setFont(Label);
        add(Address);
        
        //set Button save
        btnSubmit=new Button("Submit");
        btnSubmit.setBounds(400,530,150,30);
        btnSubmit.setFont(Label);
        btnSubmit.setForeground(Color.BLUE);
        add(btnSubmit);
        
        //set button clear
        btnClear=new Button("Clear");
        btnClear.setBounds(560,530,150,30);
        btnClear.setFont(Label);
        btnClear.setForeground(Color.RED);
        add(btnClear);

        
    }
    
    //Create main method
    public static void main(String[] args){
        YashRegestation1 ya=new YashRegestation1();
    }
    

}
