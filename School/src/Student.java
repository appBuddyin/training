public class Student {


    String studentName;
    int question(int a ){
        System.out.println("I only got one variable" + a);
        printName();
        return a;
    }

    private void printName(){
        System.out.println("My name is "+ studentName);
    }
    int question(int a , int b){
        System.out.println("The result of the question is "+ a+b);
        printName();
        return a+b;
    }

    int question(int a, int b, String operation){
        printName();
        if("+".equals(operation)){
            return a+b;
        }else
        if("-".equals(operation)){
            return a-b;
        }else if("*".equals(operation)){
            return a*b;
        }

        System.out.println("Not a valid operation");
        return 0;
    }
}
