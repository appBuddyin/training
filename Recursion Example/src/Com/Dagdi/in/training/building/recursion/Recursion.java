package Com.Dagdi.in.training.building.recursion;

public class Recursion {
    public static void main(String[] args){
        Building b1=new Building(10);
        int i;
        for (i=0;i<10;i++)
            b1.b[i]=i;
        b1.Build(10);


    }
}
