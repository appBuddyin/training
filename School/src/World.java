public class World {

    public static void main(String[] args){
        String[] teachers = new String[]{"ram", "shyam","manoj","rohan","puja","Neha"};
        Clazz clazz = new Clazz( "mathClass");
        clazz.className = "mathClass";

        School school = new School(new Clazz[]{clazz}, teachers);

        int i=0;
        Student[] students = new Student[10];
        while(i<10){
            Student student = new Student();
            student.studentName= "name"+i;
            students[i]= student;
            i++;
        }

        school.students = students;

        school.start();
    }
}
