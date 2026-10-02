/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlappyBird;

/**
 *
 * @author DELL
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class Flappy_Bird_01 extends JPanel implements ActionListener,KeyListener {

    int BirdX=100;
    int BirdY=200;
    int BirdHeight=30;
    int BirdWeight=30;
    
    boolean gameOver=false;
    
    int score=0;
    
    Timer time;
    
    int velocity=0;
    int gravity=1;
    
    
    
    Flappy_Bird_01(){
        
        JFrame frame=new JFrame("Flappy Bird");
        frame.setSize(400,600);
        frame.setVisible(true);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        
        time=new Timer(20,this);
        time.start();
        
        addpipe();
    }
    
    class Pipe{
        int x,y,Height, Weight=60;
         Pipe(int x,int y,int Height){
             this .x=x;
             this.y=y;
             this.Height=Height;
         } 
        
    }
    
    ArrayList<Pipe> pipes=new ArrayList<>();
    Random rand=new Random();
    
    void addpipe(){
        int tophight=rand.nextInt(200)+50;
        int gap=150;
        pipes.add(new Pipe(400,0,tophight));
        pipes.add(new Pipe(400,tophight+gap,600-tophight-gap));
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        g.setColor(Color.PINK);
        g.fillRect(0,0,400,600);
        
        g.setColor(Color.RED);
        g.fillRect(BirdX,BirdY,BirdHeight,BirdWeight);
        
        g.setColor(Color.GREEN);
        for(Pipe p:pipes){
            g.fillRect(p.x, p.y,p.Weight, p.Height);
        }
       /*if(gameOver){
            g.setColor(Color.BLACK);
            g.setFont(new Font("arial",Font.BOLD,30));
            g.drawString("game over",100,300);
        }*/
      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(gameOver){
            return;
        }
        
        velocity+=gravity;
        BirdY+=velocity;
        
        for(Pipe p:pipes){
            p.x-=5;
        }
        if(pipes.get(0).x<-60){
        pipes.remove(0);
        pipes.remove(0);
        addpipe();
        
        }
        
        Rectangle bird=new Rectangle(BirdX,BirdY,BirdWeight,BirdHeight);
        for(Pipe p:pipes){
            Rectangle Pipe=new Rectangle(p.x,p.y,p.Weight,p.Height);
            if(bird.intersects(Pipe)){
                gameOver=true;
                
                resetgame();
            }
        }
        if(BirdY<0 ||BirdY>570){
            gameOver=true;
            resetgame();
        }
    repaint();
    }
    
    void resetgame(){
        BirdY=200;
        velocity=0;
        pipes.clear();
        gameOver=false;
        addpipe();
        time.start();
     
        JOptionPane.showMessageDialog(this ,"GAME OVER");
        
       /* velocity=0;
        pipes.clear();
        gameOver=false;*/
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
    
        if(e.getKeyCode()==KeyEvent.VK_SPACE &&!gameOver){
            velocity=-10;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    
    public static void main(String[] args){
        new Flappy_Bird_01();
              
    }
    
}