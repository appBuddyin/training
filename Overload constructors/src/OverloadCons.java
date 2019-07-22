public class OverloadCons
{
 public static void main(String[] args){
     Box obj1=new Box(12,13,14);
     Box obj2=new Box();
     Box cube=new Box(7);
     obj2.volume();
     double vol;
     vol=obj1.volume();
     System.out.println("volume of Box 1 is "+vol);
     vol=obj2.volume();
     System.out.println("volume of box 3 "+vol);
     vol=cube.volume();
     System.out.println("volume of Box 3 "+vol);

 }
}
