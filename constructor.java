class Student {
    String name;

    // Parameterized constructor
    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Anuj");   // passes argument
        Student s2 = new Student("Keshavi");

        s1.display();
        s2.display();
    }
}