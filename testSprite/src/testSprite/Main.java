package testSprite;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		JFrame fenetre = new JFrame();
		
		fenetre.setTitle("Ma premi�re fen�tre Java");
	    //D�finit sa taille : 400 pixels de large et 100 pixels de haut
	    fenetre.setSize(400, 400);
	    //Nous demandons maintenant � notre objet de se positionner au centre
	    fenetre.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setContentPane(new ImagePanel());
	    fenetre.setVisible(true);
	    
	    		   
	    while (true) {
		   
	    	
			fenetre.setContentPane(new ImagePanel());
			Thread.sleep(500);
			fenetre.revalidate();
		    fenetre.validate();
			fenetre.repaint();
		    fenetre.setContentPane(new ImagePanel2());
		    Thread.sleep(500);
		    fenetre.revalidate();
		    fenetre.validate();
			fenetre.repaint();
			fenetre.setContentPane(new ImagePanel3());
		    Thread.sleep(500);
		    fenetre.revalidate();
		    fenetre.validate();
			fenetre.repaint();
		    
		    
	    }
	}

}
