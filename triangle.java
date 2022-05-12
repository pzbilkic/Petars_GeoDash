import java.awt.*;
import java.awt.Color;
public class Triangle extends GameObject{
    private int[] numsX;
    private int[] numsY;
    public Triangle(int x, int y, int w, int h, Color c, boolean tri) {
        super(x, y, w, h, c,true);
        //TODO Auto-generated constructor stub
        numsX = new int[3];
        numsY = new int[3];
        makeArray();
    }


    //X and Y represent the X and Y coords of a box circumscribes the triangle
    private void makeArray(){//last point is the top of the triangle
        numsX[0]= x;
        numsX[1]=this.x + this.w;
        numsX[2]=this.x + this.w/2;

        numsY[0]=this.y + h;
        numsY[1]=this.y + h;
        numsY[2]= y;

        //printpoints();
    }
    public void printPoints(){
        System.out.print(" " + x);
        System.out.print(" " + y);
        System.out.print(" " + w);
        System.out.print(" " + h);
        System.out.println(h);

        System.out.println(numsX[0]);
        System.out.println(numsX[1]);
        System.out.println(numsX[2]);

        System.out.println(numsY[0]);
        System.out.println(numsY[1]);
        System.out.println(numsY[2]);
        System.out.println(" Break ");
    }
    
    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);

        //g2.drawPolygon(numsX,numsY,3);
        
        Polygon p = new Polygon(numsX,numsY,3);
        g2.fillPolygon(p);
        
        
    }

}