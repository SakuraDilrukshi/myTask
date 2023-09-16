/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author DMC
 */
public class Quiz extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton [5];
    JButton btnNext,btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int [12];
    
    Quiz (String s){
     super (s);
     label = new JLabel();
     add(label);
     bg = new ButtonGroup();
     for(int i=0; i<5; i++){
         radioButtons[i] = new JRadioButton();
         add(radioButtons [i]);
         bg.add(radioButtons [i]);
     }
     btnNext = new JButton("Next");
     btnResult= new JButton("View Result");
     btnResult.setVisible(false);
     btnResult.addActionListener(this);
     btnNext.addActionListener(this);
     add(btnNext);
     add(btnResult);
     setData();
     label.setBounds(30,40,450,20);
     radioButtons[0].setBounds(50,80,450,20);
     radioButtons[1].setBounds(50,110,200,20);
     radioButtons[2].setBounds(50,140,200,20);
     radioButtons[3].setBounds(50,170,200,20);
     btnNext.setBounds(100,240,100,30);
     btnResult.setBounds(270,240,100,30);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(null);
     setLocation(250,100);
     setVisible(true);
     setSize(600,350);
}

    void setData(){
        radioButtons[4].setSelected(true);
        if(current==0){
            label.setText("01.The term ‘Computer’ is derived from ? ");
            radioButtons[0].setText("A. French");
            radioButtons[1].setText("B. German");
            radioButtons[2].setText("C. Latin");
            radioButtons[3].setText("D. Arabic");
        }
        if(current==1){
            label.setText("02. The fathers of the Internet is? ");
            radioButtons[0].setText("A. Charles Babbage");
            radioButtons[1].setText("B. John McCarth");
            radioButtons[2].setText("C. Vint Cerf");
            radioButtons[3].setText("D. Barin Lee");
        }
        if(current==2){
            label.setText("03. The standard protocol of the Internet is?");
            radioButtons[0].setText("A. TCP/IP");
            radioButtons[1].setText("B. Https");
            radioButtons[2].setText("C. WWW");
            radioButtons[3].setText("D. Ftp");
        }
        if(current==3){
            label.setText("04.The inventor of the World Wide Web is? ");
            radioButtons[0].setText("A. Charles Babbage");
            radioButtons[1].setText("B. John McCarthy");
            radioButtons[2].setText("C. Tim Berners-Lee");
            radioButtons[3].setText("D. Barin Lee");
        }
        if(current==4){
            label.setText("05. Where is RAM located? ");
            radioButtons[0].setText("A. Expansion Board");
            radioButtons[1].setText("B. External Drive");
            radioButtons[2].setText("C. Mother Board");
            radioButtons[3].setText("D. All of above");
        }
        if(current==5){
            label.setText("06. ___ are specific to users’ needs. ");
            radioButtons[0].setText("A. System software");
            radioButtons[1].setText("B. Assemblers");
            radioButtons[2].setText("C. Application software");
            radioButtons[3].setText("D. Compilers");
        }
        if(current==6){
            label.setText("07. Which web browser was the first web browser from the following?");
            radioButtons[0].setText("A. Safari");
            radioButtons[1].setText("B. Opera");
            radioButtons[2].setText("C. Mosaic");
            radioButtons[3].setText("D. MSIE");
        }
        if(current==7){
            label.setText("08. Which of the following is the most powerful type of computer? ");
            radioButtons[0].setText("A. Megaframe");
            radioButtons[1].setText("B. Super Computer");
            radioButtons[2].setText("C. Super Conductor");
            radioButtons[3].setText("D. Super-Micro");
        }
        if(current==8){
            label.setText("09. If a computer has more than one processor then it is known as ? ");
            radioButtons[0].setText("A. Multi-Programming");
            radioButtons[1].setText("B. Multiprocessor");
            radioButtons[2].setText("C. Multi-Threaded");
            radioButtons[3].setText("D. Uni-Process");
        }
        if(current==9){
            label.setText("10. Malicious software is known as?");
            radioButtons[0].setText("A. Badware");
            radioButtons[1].setText("B. Malware");
            radioButtons[2].setText("C. Illegalware");
            radioButtons[3].setText("D. Maliciousware");
        }
        if(current==10){
            label.setText("11. Which of the following is not an input device?");
            radioButtons[0].setText("A. Keyboard");
            radioButtons[1].setText("B. VDU");
            radioButtons[2].setText("C. Mouse");
            radioButtons[3].setText("D. Light Pen");
        }
        if(current==11){
            label.setText("12. Which of the following is the processing unit of the computer? ");
            radioButtons[0].setText("A. Mother Board");
            radioButtons[1].setText("B. Graphic Card");
            radioButtons[2].setText("C. CPU");
            radioButtons[3].setText("D. Memory");
        }
        label.setBounds(30,40,450,20);
        for(int i=0, j=0; i<=90; i+=30, j++){
            radioButtons[j].setBounds(50,80+i,200,20);
        }
    }
    boolean checkAns(){
        if(current==0){
            return (radioButtons[2].isSelected());
        }
        if(current==1){
            return (radioButtons[2].isSelected());
        }
        if(current==2){
            return (radioButtons[0].isSelected());
        }
        if(current==3){
            return (radioButtons[2].isSelected());
        }
        if(current==4){
            return (radioButtons[2].isSelected());
        }
        if(current==5){
            return (radioButtons[2].isSelected());
        }
        if(current==6){
            return (radioButtons[2].isSelected());
        }
        if(current==7){
            return (radioButtons[1].isSelected());
        }
        if(current==8){
            return (radioButtons[1].isSelected());
        }
        if(current==9){
            return (radioButtons[1].isSelected());
        }
        if(current==10){
            return (radioButtons[1].isSelected());
        }
        if(current==11){
            return (radioButtons[2].isSelected());
        }
        return false;
    }
 
    public static void main(String[] args) {
        new Quiz("Simple Quiz");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnNext){
            if(checkAns())
                count = count +1;
            current++;
            setData();
            if(current==11){
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
        }
    if(e.getActionCommand().equals("Result")){
        if(checkAns())
            count = count +1;
    current++;
    JOptionPane.showMessageDialog(this,"Your Correct Answers Count is " +count+ " over 12 questions!");
    System.exit(0);
    }
    }
}