public class Recursion {
    public static void main(String[] args){
        Factorial f=new Factorial();
        int a=f.fact(3);
        System.out.println("Factorial of 3 is = "+a);
        System.out.println("factorial of 5 is = "+f.fact(5));
    }
}
