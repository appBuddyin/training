public class Outer {
    int outer_X=10;
    void test(){
        Inner inr=new Inner();
        inr.display();
    }

    class Inner{
        void display(){
            System.out.println("I am In Inner Class");
            System.out.println("Outer X="+outer_X);
        }
    }
}
