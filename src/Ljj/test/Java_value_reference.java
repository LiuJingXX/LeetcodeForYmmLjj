package Ljj.test;

/**
 * @ClassName Java_value_reference
 * @Description TODO
 * @Author LiuJJ
 * @Date 2019/3/31 14:49
 * @Version 1.0
 **/
public class Java_value_reference {
    static class Student{
        int id;
        String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    static class StudentWapper{
        Student s;
        StudentWapper(Student student){
            s = student;
        }
    }
    static class Teacher{
        int tid;
        String name;
        public int getId() {
            return tid;
        }

        public void setId(int id) {
            this.tid = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Teacher(int tid, String name) {
            this.tid = tid;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "tid=" + tid +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    static class Cons{
        Student stu;
        Teacher tea;

        public Cons(Student stu, Teacher tea) {
            this.stu = stu;
            this.tea = tea;
        }

        public Student getStu() {
            return stu;
        }

        public void setStu(Student stu) {
            this.stu = stu;
        }

        public Teacher getTea() {
            return tea;
        }

        public void setTea(Teacher tea) {
            this.tea = tea;
        }
    }

    private static void changeW(StudentWapper s){
        s.s = new Student(12345,"12345");
    }
    private static void change(Student s){
        s = new Student(2,"Jack");
        System.out.println("changed  :" + s);
    }
    private static Student change1(Student s){
        s = new Student(2,"Jack");
        System.out.println(s);
        return s;
    }
    private static void change2(Student s){
        s.setId(2);
        s.setName("Jack3");
        System.out.println(s);
    }
    private static void change(Student s,Teacher t){
        s = new Student(2,"TTOM");
        t = new Teacher(22,"ttom");
    }
    private static Cons change2(Student s,Teacher t){
        s = new Student(2,"TTOM");
        t = new Teacher(22,"ttom");
        return new Cons(s,t);
    }
    private static void change4(int n){
        n = 123;
    }
    public static void main(String[] args) {
        Student student = new Student(123,"yyym");
        change(student);
        System.out.println("after change   :" + student);
        changeW(new StudentWapper(student));
        System.out.println("after wrapper    :" + student);

//        Student student = new Student(1,"Tom");
//        Teacher teacher = new Teacher(11,"Tomson");
//        change(student,teacher);
//        System.out.println(student);
//        System.out.println(teacher);
//        Cons c = change2(student,teacher);
//        System.out.println(c.stu);
//        System.out.println(c.tea);
//        int a = 11;
//        change4(a);
//        System.out.println(a);

        //student = change1(student);
//        change(student);
//        System.out.println(student);
//        student = change1(student);
//        System.out.println(student);
//        change2(student);
//        System.out.println(student);
//        System.out.println(student.toString());

    }
}
