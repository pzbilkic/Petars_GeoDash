import java.util.ArrayList;

import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {


    private Square player = new Square(10, 200, 30, 30, new Color(25,25,150));
	private ArrayList<GameObject> objects = new ArrayList<>();

    public Game(){
        
    }
    


	/**
	 * This is called every time the Timer goes off.  Right now, it moves all 
	 * the Objects and checks for collisions.  This is common in games with flying
	 * Objects.  You can do more, though.  Like add items or move to new screens
	 * or check to see if the turn is over or...
	 */
	public void updateGame() {
		//System.out.println("Moving Objects!!");
		moveObjects();
		checkCollisions();

	}
    /**
	 * Right now I am checking for collisions between GameObjects
	 */
	public void checkCollisions() {
		
	}

	/**
	 * get it...
	 */
	public void moveObjects() {
		player.move();
	}


	/**
	 * Draws all the stuff in the game without changing them
	 * No reason to change this unless you wanted a background
	 * or something.
	 * @param g
	 */
    public void drawTheGame(Graphics g) {
		player.draw(g);
		g.setColor(new ColorUIResource(100, 200, 10));
		g.fillRect(0, 230, 500, 200);
		for(GameObject go:this.objects) {
			go.draw(g);
		}

	}
		
	
	/** called when the left arrow is pressed.  Probably move something
	 *  to the left, or turn left or... */
	public void ltHit(ActionEvent e) {
		System.out.println("Left!!");
	}
	/** called when the left arrow is released.  You don't have to do anything
	 * here, but you can if your game uses this event*/
    public void leftReleased(ActionEvent e) {
        System.out.println("Released Left!!");
    }
	/** called when the right arrow is pressed.  Probably move something
	 *  to the right, or turn right or... */
	public void rtHit(ActionEvent e) {
        
		System.out.println("Right!");
	}
	/** called when the right arrow is released.  You don't have to do anything
	 * here, but you can if your game uses this event*/
    public void rightReleased(ActionEvent e) {
		System.out.println("Released &&&&  Right!!");
    }
	/** called when the up arrow is pressed.  You don't have to do anything
	 * here, but you can if your game uses this event*/
    public  void upHit(ActionEvent e) {
		player.setDy(-10);
		System.out.println("Up!!");
		/*
		try {
			wait(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		player.setDy(10);
		try {
			wait(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		//player.setDy(0);
		


	}
	/** called when the up arrow is released.  You don't have to do anything
	 * here, but you can if your game uses this event*/
	public void upReleased(ActionEvent e) {
		System.out.println("Released ^^^^  Up!!");
		
    }

	

    

}
