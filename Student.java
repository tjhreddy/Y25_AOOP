class Student {
    int studentId;
    String name;
    int age;

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = 101;
        s1.name = "Teja";
        s1.age = 20;

        Student s2 = new Student();
        s2.studentId = 102;
        s2.name = "Ravi";
        s2.age = 21;

        Student s3 = new Student();
        s3.studentId = 103;
        s3.name = "Priya";
        s3.age = 19;

        s1.display();
        s2.display();
        s3.display();
    }
}