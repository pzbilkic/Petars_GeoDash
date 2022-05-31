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
        this.y2 = y + height;
    }


    public Hitbox(int height, int length, int x, int y, boolean tri){
        this.height = height;
        this.length = length;
        this.x = x;
        this.y = y;
        this.tri = true;
      

        //other x and y bounds
        this.x2 = x + length;
        this.y2 = y + height;
        this.x3 = x + (length/2);
        
        //System.out.println("X " + x2);
    }


     public boolean checkCollision(Hitbox other){
        //System.out.print(" X: " + other.x);
        if(other.tri = true){
            //System.out.println(" Other X: " + other.x + " |this x:" + this.x2 + " |other x3: " + other.x3);
            if(other.x3 > this.x2 && other.x < this.x2){
                //System.out.println("Checked");
                /*
                 System.out.println("Checked");
                 int z = (-2*this.x2) + other.y2;
                 System.out.println("Function Y:" + z);
                 System.out.println(this.y2);
                */
                int magic2 = other.y2 + (2*other.x);
                if(this.y2 > (-2*this.x2) + magic2){
                    System.out.println("hit");
                    return true;
                }
            }
            if(other.x3 < this.x && other.x2 > this.x){
                //System.out.println("Checked");

                int magic = other.y - (2*other.x3);
                //System.out.println("Triangles y: " + (2*this.x + magic));
                //System.out.println("Player y: " + this.y2);
                if(this.y2 > (2*this.x) + magic){
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
        //other x and y boundschekedchekedcheked
        this.x2 = x + length;
        this.y2 = y + height;
        //System.out.print(" " + y + " ");
        
    }

    public void setX(int n){
        
        this.x = n;
        this.tri = true;
        //System.out.print(x + n);

        //other x and y bounds
        this.x2 = x + length;
        this.y2 = y + height;
        this.x3 = x + (length/2);
        //System.out.print(x3);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    
}
