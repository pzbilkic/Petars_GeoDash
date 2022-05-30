import java.awt.Color;
import java.util.ArrayList;

public class part {
    public part(){

    }
    public ArrayList<GameObject> createObjects(int n){
        ArrayList<GameObject> master = new ArrayList<GameObject>();
        if(n<=0){
            ArrayList<GameObject> zero = new ArrayList<GameObject>();
            zero.add(new triangle(700, 200, 30, 30, new Color(25,25,150), true));
            return zero;
        }
        if(n==1){
            ArrayList<GameObject> one = new ArrayList<GameObject>();
            one.add(new triangle(700, 200, 30, 30, new Color(25,25,150), true));
            one.add(new triangle(730, 200, 30, 30, new Color(25,25,150), true));
            return one;
        }
        if(n==2){
            ArrayList<GameObject> two = new ArrayList<GameObject>();
            two.add(new triangle(700, 200, 30, 30, new Color(25,25,150), true));
            two.add(new platform(730, 200, 30, 30, new Color(25,25,150)));
            return two;
        }
        if(n==3){
            ArrayList<GameObject> three = new ArrayList<GameObject>();
            three.add(new platform(700, 200, 30, 30, new Color(25,25,150)));
            three.add(new platform(730, 200, 30, 30, new Color(25,25,150)));
            three.add(new platform(730, 230, 30, 30, new Color(25,25,150)));
            three.add(new triangle(760, 200, 30, 30, new Color(25,25,150), true));
            three.add(new triangle(790, 200, 30, 30, new Color(25,25,150), true));
            return three;
        }
        if(n==4){
            ArrayList<GameObject> four = new ArrayList<GameObject>();
            four.add(new platform(700, 200, 30, 30, new Color(25,25,150)));
            four.add(new triangle(730, 200, 30, 30, new Color(25,25,150), true));
            four.add(new platform(760, 200, 30, 30, new Color(25,25,150)));
            four.add(new platform(790, 200, 30, 30, new Color(25,25,150)));
            four.add(new platform(820, 200, 30, 30, new Color(25,25,150)));
            four.add(new platform(820, 230, 30, 30, new Color(25,25,150)));
            four.add(new platform(850, 200, 30, 30, new Color(25,25,150)));
            four.add(new triangle(850, 230, 30, 30, new Color(25,25,150), true));
            four.add(new platform(880, 200, 30, 30, new Color(25,25,150)));
            four.add(new platform(880, 230, 30, 30, new Color(25,25,150)));
            four.add(new triangle(910, 230, 30, 30, new Color(25,25,150), true));
            four.add(new triangle(940, 230, 30, 30, new Color(25,25,150), true));

            return four;
        }
        if(n>=5){
            ArrayList<GameObject> five = new ArrayList<GameObject>();
            five.add(new platform(700, 200, 30, 30, new Color(25,25,150)));
            five.add(new platform(730, 200, 30, 30, new Color(25,25,150)));
            five.add(new triangle(730, 230, 30, 30, new Color(25,25,150), true));
            five.add(new platform(760, 200, 30, 30, new Color(25,25,150)));
            five.add(new triangle(790, 230, 30, 30, new Color(25,25,150), true));
            five.add(new triangle(820, 230, 30, 30, new Color(25,25,150), true));
            return five;
        }
        return master;
    }

}
