import java.util.ArrayList;
import java.awt.Color;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.Thread;
import java.awt.Graphics;
import java.awt.Graphics2D;



public class Game {


    

    private Square player = new Square(60, 200, 30, 30, new Color(200,25,50));
    //private Triangle hazard = new Triangle(200,200,30,30,new Color(25,25,150),true);
    
    private ArrayList<GameObject> objects = new ArrayList<>();
    

    public Game(){
        
    }
    


    /**
     * This is called every time the Timer goes off.  Right now, it moves all 
     * the Objects and checks for collisions.  This is common in games with flying
     * Objects.  You can do more, though.  Like add items or move to new screens
     * or check to see if the turn is over or...
     */
    int count = 0;
    int updates = 0;
    int playerv = 0;
    boolean up = false;
    public void updateGame() {
        //System.out.println("Moving Objects!!");
        /*
        if(!end){
            endGame();
        }*/
        
        moveObjects();
        checkCollisions();
        //System.out.println(player.hit.getX());
        if(updates%100 == 0){
            updateObjects();
            
        }
        if(up == true){
            if(player.y < 110){
                player.setDy(10);
                up = false;
                
        }
        
        }
      
        count++;
        updates+=1;
        

    }

    public void addElements(){
        //objects.add
    }

    public void updateObjects(){
        int tmp = (int) ( Math.random() * 2 + 1); // will return either 1 or 2
        if(!end){
            createTri(tmp);
        }
  
        
    }
    public void createTri(int n){
        int count = 0;
        for(int i = 0;i<n;i++){
            objects.add(new Triangle(500 + count, 200, 30, 30, new Color(25,25,150), true));
            count+=30;
        }
        
    }


    /**
     * Right now I am checking for collisions between GameObjects
     */
    public boolean end = false;
    public boolean checkCollisions() {
        for(GameObject o : objects){
            if(player.hit.checkCollision(o.hit)){
                System.out.println("HIT");
                return true;
            }
        }
        return false;
        
          
    }
        
 
    /**
     * get it...
     */

    public void endGame(){
        if(checkCollisions()){
            endgame END = new endgame(0, 0, 0, 0, new Color(225,0,0));
            
            int counter = count;
            String pappy = "Score:" + counter + "!";
    
            END.setScore(count);
            END.setPappy(pappy);

            objects.add(END);
            //end = true;
        }


      

}


    public void moveObjects() {

        player.move();
        
        for(GameObject go:this.objects) {
            go.move();
        }
    }


    /**
     * Draws all the stuff in the game without changing them
     * No reason to change this unless you wanted a background
     * or something.
     * @param g
     */
    public void drawTheGame(Graphics g) {
        String answer = count + "!";
        player.draw(g);
        
        g.setColor(new ColorUIResource(100, 200, 10));
        g.fillRect(0, 230, 500, 200);
        for(GameObject go:this.objects) {
            go.draw(g);
        }
        if(!end){
            g.drawString(answer, 10, 280);
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
        System.out.println("Up!!");
        //player.setY(100);
        player.setDy(-10);
        up = true;
        //System.out.println(player.getDy());
        
    }
    /** called when the up arrow is released.  You don't have to do anything
     * here, but you can if your game uses this event*/
    public void upReleased(ActionEvent e) {
        System.out.println("Released ^^^^  Up!!");
        //player.setDy(10);
        
    }



    

}