import java.awt.Color;
import java.awt.*;
public class platform extends GameObject{

    public platform(int x, int y, int w, int h, Color c, double platform) {
        super(x, y, w, h, c, platform);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);

        
        g2.fillRect(x, y, w, h);
    }
    @Override
    public void moveX(){
        x+=dx;
        hit.setX((int)(x + dx)); 
        //System.out.print("triangle x: " + x);
    }
    @Override
    public void moveY(){

    }
    
}
