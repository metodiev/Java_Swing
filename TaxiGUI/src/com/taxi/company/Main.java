package com.taxi.company;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame {
	
	JButton b = new JButton("Test");
	  ButtonModel model = b.getModel();
	
  public Main() throws HeadlessException {
	  //textfiedl
	  
	  JTextField tf = new JTextField("mm");
	    tf.setPreferredSize(tf.getPreferredSize());
	    tf.setText("");

	    JPanel pHacked = new JPanel();
	    pHacked.add(tf);

	    JPanel pStock = new JPanel();
	    pStock.add(new JTextField(2));

	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new java.awt.GridLayout(0, 1));
	    frame.add(pHacked);
	    frame.add(pStock);
	    frame.setSize(150, 150);
	    frame.setVisible(true);
	    tf.requestFocus();
	  //end textfield
	    
    setSize(150, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());

    JLabel label1 = new JLabel("Number of passangers :", JLabel.RIGHT);
    JLabel label2 = new JLabel("Yout location :", JLabel.RIGHT);
    JLabel label3 = new JLabel("Where you want to go :", JLabel.RIGHT);

    getContentPane().add(label1);
    getContentPane().add(label2);
    getContentPane().add(label3);
    
	  //add button
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    model.addChangeListener(new ChangeListener() {
	      public void stateChanged(ChangeEvent e) {
	        System.out.println("Btn is pressed" 
	            + model.isEnabled() + " Pressed: " + model.isPressed());
	      }
	    });

	    getContentPane().add(b, BorderLayout.CENTER);

	    pack();
	    setVisible(true);
	  //end button logic 

  }

  public static void main(String[] args) {
    new Main().setVisible(true);
  }
}