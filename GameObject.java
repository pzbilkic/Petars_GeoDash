import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.concurrent.TimeUnit;

/**
 * Generic GameObject.  This has all the BASIC attributes and behaviors that 
 * ALL game objects should have.  Many of these can be overridden in subclasses.
 * Those behaviors and attributes include:
 * 
 * Location and size (using a Rectangle for that)
 * Color (used for testing but not used in the final version)
 * speed in the x and speed in the y direction
 * The GameObject has the ability to move, detect collisions with 
 * another GameObject and the ability to draw itself on a Graphics
 * 
 * @author RHanson
 *
 */
public class GameObject {
	
	/** rect has info about location and dimension of this game object*/
	private Rectangle rect;
	/** Color of this object */
	protected Color color;
	/** dx is how far this object moves this Rectangle each time I move
	 *  dy is how far this object moves the Rectangle each time I move
	 *  If dy or dx change between moves, it will look like this object is 
	 *  accelerating or decelerating in that direction.
	 */
	protected double dx, dy;

	protected int x, y , w, h;
	public int ground = 230;
	protected Hitbox hit;
	
	//Method for PLayer intialization
	public GameObject(int x, int y, int w, int h, Color c) {
		this(x,y,w,h,c,0,0);
		//System.out.println("X: " + x);
		this.rect = new Rectangle(x,y,w,h);
		this.dy = 10;
		this.hit = new Hitbox(h, w, x, y);
		
	}

	//TRIANGLE CONSTRUTOR
	public GameObject(int x, int y, int w, int h, Color c, boolean tri){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = c;
		this.dx = -10;
		this.hit = new Hitbox(h, w, x, y, true);

	}
	public GameObject(int x2, int y2, int w2, int h2, Color c, int i, int j) {
	}
	public GameObject(int x, int y, int w, int h, Color c, double platform){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = c;
		this.dx = -10;
		this.hit = new Hitbox(h, w, x, y);
	}

	/*
	public GameObject(int x, int y, int w, int h, Color c, double platform, int i) {
		rect = new Rectangle(x,y,w,h);
		color = c;
		this.dx = dx = -10;

	}
	*/
	public double getDx() {
		return dx;
	}
	public void setDx(double dx) {
		this.dx = dx;
	}
	
	public double getDy() {
		return dy;
	}
	public void setDy(double dy) {
		this.dy = dy;
	}
	public void move() {
		moveX();
		moveY();
		if(y+30 == ground){
			dy = 0;
		}
	}
	
	

	public void moveY() {
	if(!(y == ground)){
			hit.setY((int)(y + dy));
			
			y+=dy;
			rect.y = y;
			rect.setLocation(rect.x+0, (int) (rect.y+dy));
			
		}

	}
	public void moveX() {
		this.x += dx;
		hit.setX((int)(x + dx));
		
		rect.setLocation((int) (rect.x+dx), rect.y+0);
	}

	public Rectangle getRect() {
		return rect;
	}
  
	/** Pretty basic right now, but can make this way better!*/
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(color);
		g2.fill(rect);
	}
	
	public boolean collidedWith(GameObject go) {
		return this.rect.intersects(go.rect);
	}

	public double getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
}
