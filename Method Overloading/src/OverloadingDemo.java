public class OverloadingDemo {
    void test(){
        System.out.println("No parameters..");
    }
    void test(int a){
        System.out.println("value of A="+a);
    }
    void test(int a,int b){
        System.out.println("A and B="+a+" "+b);
    }
}
