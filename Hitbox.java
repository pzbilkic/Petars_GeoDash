public class Hitbox {
    int height;
    int length;
    int x,y;
    boolean tri;
    
    public Hitbox(int height, int length, int x, int y, boolean tri){
        this.height = height;
        this.length = length;
        this.x = x;
        this.y = y;
    }

     public boolean checkCollision(Hitbox other){
        if(x==other.x || y==other.y){
            return true;
        }
        return false;
    }
    
}
