package com.core.awt;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaAwtExample implements ActionListener {

	/**
	 * 
	 */
	JFrame f = new JFrame();
	JLabel label1 = new JLabel("Input-1");
	JLabel label2 = new JLabel("Input-2");
	JLabel label3 = new JLabel("Answer");

	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();

	JButton add = new JButton("Add");
	JButton exit = new JButton("Exit");
	JButton clear = new JButton("Clear");

	JavaAwtExample() {
		label1.setBounds(50, 100, 100, 25);
		label2.setBounds(50, 150, 100, 25);
		label3.setBounds(50, 200, 100, 25);

		t1.setBounds(200, 100, 100, 25);
		t2.setBounds(200, 150, 100, 25);
		t3.setBounds(200, 200, 100, 25);
		t3.disable();
		t3.setDisabledTextColor(Color.BLUE);

		add.setBounds(200, 300, 100, 50);
		exit.setBounds(300, 300, 100, 50);
		clear.setBounds(400, 300, 100, 50);

		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(add);
		f.add(exit);
		f.add(clear);

		add.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500, 600);

	}

	public static void main(String[] args) {

		new JavaAwtExample();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == add) {
			int val1 = Integer.valueOf(t1.getText());
			int val2 = Integer.valueOf(t2.getText());
			t3.setText(String.valueOf(val1 + val2));
		}

		if (e.getSource() == clear) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}

		if (e.getSource() == exit) {
			System.exit(0);
		}

	}

}
