package GreatestOf3Numbers;
import org.w3c.dom.Text;


import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener{
    TextField text1,text2,text3,text4;
    Label label1,label2,label3,label4;
    Button button;
    Main(){

        setVisible(true);
        setSize(300,500);
        setLayout(null);
        setTitle("Sample Button");

        label1=new Label("Number 1 :");
        label1.setBounds(20,40,150,20);
        add(label1);


        text1=new TextField();
        text1.setBounds(20,70,150,30);
        add(text1);

        label2=new Label("Number 2 :");
        label2.setBounds(20,110,150,20);
        add(label2);

        text2=new TextField();
        text2.setBounds(20,140,150,30);
        add(text2);

        label3=new Label("Number 3 :");
        label3.setBounds(20,190,150,20);
        add(label3);

        text3=new TextField();
        text3.setBounds(20,210,150,30);
        add(text3);

        label4=new Label("Greatest number :");
        label4.setBounds(20,310,150,30);
        add(label4);

//        text4=new TextField();
//        text4.setBounds(20,230,150,30);
//        add(text4);

        button =new Button("Button");
        button.setBounds(30,260,100,30);
        add(button);
        button.addActionListener(this);

    }
    public static void main(String args[]) {
        Main main=new Main();
    }

    public void actionPerformed(ActionEvent e) {

        int num1= Integer.parseInt(text1.getText());
        int num2= Integer.parseInt(text2.getText());
        int num3= Integer.parseInt(text3.getText());

        int max=Math.max(num1,Math.max(num2,num3));

        label4.setText(String.valueOf(max));
    }
}
