public class Clazz {

    String className;
    Student[] students;
    String teacher;

    public Clazz(String className){
        this.className = className;
    }

     public void start(){

            System.out.println("I am starting class "+ className +" and my name is "+teacher);
            students[0].question(9);
            students[3].question(2,1);
            System.out.println( "Result of the proble is " + students[2].question(2, 5, "*"));

            System.out.println("Class is over, go home");
     }


}
