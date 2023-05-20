import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class CourseRegistration_Form extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l0;
    JTextField t1,t2,t3;

    JCheckBox ch1,ch2,ch3,ch4,ch5;
    JButton b1;

    CourseRegistration_Form(){




        l0 = new JLabel("Course Registration");


        l1 = new JLabel("Name");
        t1 = new JTextField();

        l2 = new JLabel("REG.No.");
        t2 = new JTextField();

        l3 = new JLabel("Email Id");
        t3 = new JTextField();

        l4 = new JLabel("Course");
        ch1 = new JCheckBox("Java");
        ch2 = new JCheckBox("Python");
        ch3 = new JCheckBox("DBMS");
        ch4 = new JCheckBox("C++");
        ch5 = new JCheckBox("IOT");

        b1 = new JButton(" Submit");
        b1.addActionListener(this);

        add(l0);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);
        add(ch5);
        add(b1);

        //l0.setBounds(200,20,80,20);

        l0.setBounds(150,50,150,50);

        l1.setBounds(50,150,100,30);
        t1.setBounds(180,150,200,30);

        l2.setBounds(50,260,100,30);
        t2.setBounds(180,260,200,30);

        l3.setBounds(50,370,100,30);
        t3.setBounds(180,370,200,30);

        l4.setBounds(50,480,100,30);
        ch1.setBounds(180,480,60,30);
        ch2.setBounds(250,480,70,30);
        ch3.setBounds(330,480,70,30);
        ch4.setBounds(410,480,50,30);
        ch5.setBounds(470,480,50,30);

        b1.setBounds(180,550,100,30);

        setLayout(null);
        setVisible(true);
        setSize(600,600);

    }
    public void actionPerformed(ActionEvent e){
        float credits=0;
        String msg="";
        if(ch1.isSelected()){
            credits+=4;
            msg="Java: 4\n";
        }
        if(ch2.isSelected()){
            credits+=4;
            msg+="Python: 4\n";
        }
        if(ch3.isSelected()){
            credits+=4;
            msg+="DBMS: 4\n";
        }
        if(ch4.isSelected()){
            credits+=4;
            msg+="C++: 4\n";
        }
        if(ch5.isSelected()){
            credits+=4;
            msg+="IOT: 4\n";
        }
        msg+="-----------------\n";
        JOptionPane.showMessageDialog(this,msg+"Total: "+credits);
    }
    public static void main(String[] args) {
        new CourseRegistration_Form();
    }
}