import java.awt.*;


public class endgame extends GameObject{
    int score = 0;
    String pappy;

    public boolean set = false;
    public endgame(int x,int y, int w,int h, Color c){
        super(0,0,1000,1000,c);
    }
    public void setScore(int n){
        if(!set){
            score = n;
            set = true;
        }
    }
    public void setPappy(String s){
        pappy = s;
    }
    
    @Override
    public void draw(Graphics g) {
        //System.out.println(score);
        g.setColor(color);
        g.fillRect(0, 0, 500, 500);
        g.setColor(new Color(225,225,225));
        g.drawString("Game Over",100, 100);
        g.drawString(pappy, 100, 120);
	}
}
    

