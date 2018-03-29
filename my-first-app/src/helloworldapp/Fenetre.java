package helloworldapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


import javax.swing.JFrame;

import banque.Personne;

public class Fenetre extends JFrame implements WindowListener,ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Button b1,b2,b3,b4,b5;
	private Label bonjour,debiter,crediter; 
	private int compteur = 0;
	private Color bleuClair = new Color(22, 174, 154,1);
	public Fenetre(Personne personne) {
		setLayout(new FlowLayout());
		bonjour = new Label("Bonjour "+personne.getPrenom()); 
		debiter = new Label("Crediter");
		debiter.setBounds(130, 20, 10, 10);
		add(bonjour);add(debiter);
		
		TextArea area=new TextArea("Somme à debiter");  
	    area.setBounds(10,30, 10,10);  
	    add(area);  
		setSize(400,500); setVisible(true);
	}

	public static void main(String args[]) {
		Personne personne = new Personne("Silvan","ELIAS",30);
		Fenetre appli = new Fenetre(personne);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	
}
