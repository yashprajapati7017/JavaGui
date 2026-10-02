/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tic_tac;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tictac implements ActionListener {
    
    JFrame frame ;
    JLabel status;
    JPanel panel;
    JButton[] button =new JButton[9];
    Boolean playerx=true; 
    
    tictac(){
        
        
        frame=new JFrame();
        frame.setSize(450,400);
        frame.setLayout(new BorderLayout());
        frame.setBackground(Color.YELLOW);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setTitle("TIC TAC TOE");
                     
        status=new JLabel("TIC TAC TOE",JLabel.CENTER);
        status.setFont(new Font("arial",Font.BOLD,30));
        status.setBackground(Color.BLUE);
        status.setBackground(Color.DARK_GRAY);
        frame.add(status,BorderLayout.NORTH);
        
        
        panel =new JPanel();
        panel.setLayout(new GridLayout(3,3));
        for(int i=0;i<9;i++){
            button[i]=new JButton("");
            button[i].setBackground(Color.DARK_GRAY);
            button[i].addActionListener(this);
            
            panel.add(button[i]);
        }
        frame.add(panel);
        frame.setVisible(true);
        
        
    }
    public static void main(String[] args){
        tictac ti=new tictac();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton btn=(JButton) e.getSource();
        if(!btn.getText().equals(""))
        return;
        
        if(playerx){
            btn.setText("x");
            btn.setFont(new Font("arial",Font.BOLD,40));
            btn.setForeground(Color.WHITE);
            status.setText("PLAYER O TURN");
        } else {
            btn.setText("o");
            btn.setFont(new Font("arial",Font.BOLD,40));
            btn.setForeground(Color.WHITE);
            status.setText("PLAYER X TURM");
        }
        playerx=!playerx;
               checkwinner();
               
    }
    
    void checkwinner(){
        int[][] win={
            {0,1,2},{3,4,5},{6,7,8},    // coloum
            {0,3,6},{1,4,7},{2,5,8},    //row
            {0,4,8},{2,4,6}
        };
        
        for(int[] w : win){
            String s1=button[w[0]].getText();
            String s2=button[w[1]].getText();
            String s3=button[w[2]].getText();
            
            if(!s1.equals("") && s1.equals(s2) && s2.equals(s3)){
                JOptionPane.showMessageDialog(frame, s1 + " Wins!");
                reset();
                return;
            } 
        }
        
        boolean drow=true;
        for(JButton b:button){
            if (b.getText().equals("")){
                drow=false;
                break;
            }
        }
        if(drow){
            JOptionPane.showMessageDialog(frame,"DROW");
            reset();
        }
    }

   
     void reset(){
         for(JButton b:button){
             b.setText("");
         }
         boolean xplayer=true;
         status.setText("PLAYER X TURN");
     }
    
}