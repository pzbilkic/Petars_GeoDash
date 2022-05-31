import java.awt.Color;
import java.util.ArrayList;

public class part {
    public part(){

    }
    public ArrayList<GameObject> createObjects(int n){
        ArrayList<GameObject> master = new ArrayList<GameObject>();
        if(n==1){
            ArrayList<GameObject> zero = new ArrayList<GameObject>();
            zero.add(new Triangle(700, 200, 30, 30, new Color(25,25,150), true));
            return zero;
        }
        if(n==2){
            ArrayList<GameObject> one = new ArrayList<GameObject>();
            one.add(new Triangle(700, 200, 30, 30, new Color(25,25,150), true));
            one.add(new Triangle(730, 200, 30, 30, new Color(25,25,150), true));
            return one;
        }
        if(n==3){
            ArrayList<GameObject> two = new ArrayList<GameObject>();
            two.add(new Triangle(700, 200, 30, 30, new Color(25,25,150), true));
            two.add(new platform(730, 200, 30, 30, new Color(25,25,150),0));
            return two;
        }
        if(n==4){
            ArrayList<GameObject> three = new ArrayList<GameObject>();
            three.add(new platform(700, 200, 30, 30, new Color(25,25,150),0));
            three.add(new platform(730, 200, 30, 30, new Color(25,25,150),0));
            three.add(new platform(730, 170, 30, 30, new Color(25,25,150),0));
            three.add(new Triangle(760, 200, 30, 30, new Color(25,25,150), true));
            three.add(new Triangle(790, 200, 30, 30, new Color(25,25,150), true));
            return three;
        }
        if(n==5){
            ArrayList<GameObject> four = new ArrayList<GameObject>();
            four.add(new platform(700, 200, 30, 30, new Color(25,25,150),0));
            four.add(new Triangle(730, 200, 30, 30, new Color(25,25,150), true));
            four.add(new platform(760, 200, 30, 30, new Color(25,25,150),0));
            four.add(new platform(790, 200, 30, 30, new Color(25,25,150),0));
            four.add(new platform(820, 200, 30, 30, new Color(25,25,150),0));
            four.add(new platform(820, 170, 30, 30, new Color(25,25,150),0));
            four.add(new platform(850, 200, 30, 30, new Color(25,25,150),0));
            four.add(new Triangle(850, 170, 30, 30, new Color(25,25,150), true));
            four.add(new platform(880, 200, 30, 30, new Color(25,25,150),0));
            four.add(new platform(880, 170, 30, 30, new Color(25,25,150),0));
            four.add(new Triangle(910, 200, 30, 30, new Color(25,25,150), true));
            four.add(new Triangle(940, 200, 30, 30, new Color(25,25,150), true));

            return four;
        }
        if(n>=6){
            ArrayList<GameObject> five = new ArrayList<GameObject>();
            five.add(new platform(700, 200, 30, 30, new Color(25,25,150),0));
            five.add(new platform(730, 200, 30, 30, new Color(25,25,150),0));
            five.add(new Triangle(730, 170, 30, 30, new Color(25,25,150), true));
            five.add(new platform(760, 200, 30, 30, new Color(25,25,150),0));
            five.add(new Triangle(790, 200, 30, 30, new Color(25,25,150), true));
            five.add(new Triangle(820, 200, 30, 30, new Color(25,25,150), true));
            return five;
        }
        return master;
    }

}
