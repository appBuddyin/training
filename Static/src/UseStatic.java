public class UseStatic {
    static int a=3;
    static int b;
    final int C=10;
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    void Final(){
        System.out.println("Final C= "+C);
    }

    static {
        System.out.println("Static block initialized.");
            b=a*4;
    }
public static void main(String args[]){
        meth(42);
        System.out.println(UseStatic.b);

        UseStatic obj1=new UseStatic();
        obj1.Final();
}

}
