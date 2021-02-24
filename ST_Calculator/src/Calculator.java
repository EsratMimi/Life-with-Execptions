/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Esrat
 */
public class Calculator extends Applet implements ActionListener {

   // TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    
    private Double totalWorkingHour=0.0;
    public int n=1;
    
    public Calculator(){
        Label l1=new Label("Give the input per day");
        Label l= new Label("don't need to give date all the time");
        setBackground(Color.cyan);
        setLayout(new GridLayout(4,2));
        Label l2=new Label("Input the start time ");
        Label l3=new Label("Input the endtime ");
        Label l4= new Label("Your working hour ");
        
        add(l1);
        add(l);
        add(t2);
        add(l2);
        add(t3);
        add(l3);
        add(t4);
        add(l4);
        t3.addActionListener(this);
        
    
    }
    public String calculateTheTime(double s, double e){
        
        totalWorkingHour += (e-s);
        
        int h = (int) (totalWorkingHour/60);
        int m = (int) (totalWorkingHour%60);
        String workingHour= ""+ h+" "+m;
        n++;
        return (workingHour);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // Double date = Double.parseDouble(t1.getText());
        String startTime= t2.getText();
        String endTime= t3.getText();
        //Double time1=Double.parseDouble(s1);
        //Double time2=Double.parseDouble(t3.getText());
        String [] start= startTime.split(":");
        String [] end= endTime.split(":");
        double s= Integer.parseInt(start[0])*60+ (Double.parseDouble(start[1]));
        double en= Integer.parseInt(end[0])*60+ (Double.parseDouble(end[1]));
        
        String res = calculateTheTime(s,en);
        t4.setText(res);
     
    }
    
 
}