package Com.Dagdi.in.training.building.recursion;

public class Building {
    int b[];
    Building(int i){
            b=new int[i];
    }
    void Build(int i) {

        if (i ==0)
            return;
        else
           Build(i-1);
        System.out.println("I have Created floor "+b[i-1]);




    }
}
