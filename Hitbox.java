public class Hitbox {
    private int height;
    private int length;
    private int x,y;
    private int x2,y2;
    private int x3;
    private boolean tri;
    
    public Hitbox(int height, int length, int x, int y){
        this.height = height;
        this.length = length;
        this.x = x;
        this.y = y;
        this.tri = false;

        //other x and y bounds
        this.x2 = x + length;
        this.y2 = y - height;
    }
    public Hitbox(int height, int length, int x, int y, boolean tri){
        this.height = height;
        this.length = length;
        this.x = x;
        this.y = y;
        this.tri = true;
      

        //other x and y bounds
        this.x2 = x + length;
        this.y2 = y - height;
        this.x3 = (x+length)/2;
        
        System.out.println("X " + x2);
    }


     public boolean checkCollision(Hitbox other){

        if(other.tri = true){
            System.out.print(" Other X: " + other.x + " this x:" + this.x2);
            if(other.x3 > this.x2 && other.x < this.x2){
                System.out.println("cheked");
                if(y2 == -2*this.x2 + other.y2){
                    System.out.println("hit");
                    return true;
                }
            }
        }
        return false;
    
    }
    

    public void setY(int n){
        y+=n;
        this.y = n;
        //other x and y bounds
        this.x2 = x + length;
        this.y2 = y - height;
    }

    public void setX(int n){
        
        x += n;
        this.x = n;
        this.tri = true;
        System.out.print(x);

        //other x and y bounds
        this.x2 = x + length;
        this.y2 = y - height;
        this.x3 = (x+length)/2;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    
}
