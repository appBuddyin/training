public class School {
    Clazz[] clazzes;
    Student[] students;
    String[] teachers;

    School(Clazz[] clazzes, String[] teachers){
        this.clazzes=clazzes;
        this.teachers = teachers;
    }

    public void start(){
        int c = 0;
        while(c<5){
            int studentLength = students.length;

            int i =0;
            Student[] students1 = new Student[5];
            while (i<5){
                students1[i] = students[(int)(Math.random()*studentLength)];
                i = i+1;
            }

            clazzes[0].students = students1;
            int teacherLength = teachers.length;
            clazzes[0].teacher = teachers[(int)(Math.random()*teacherLength)];
            clazzes[0].start();
            c = c+1;
        }

    }
}
