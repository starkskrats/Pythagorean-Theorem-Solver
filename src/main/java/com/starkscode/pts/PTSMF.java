package com.starkscode.pts;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class PTSMF extends JFrame {

	private PTSMP Panel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTSMF frame = new PTSMF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PTSMF() {
		setTitle("Pythagorean Theorem Solver");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 121);
		setLocationRelativeTo(null);
		Panel = new PTSMP();
		setContentPane(Panel);
	}
}