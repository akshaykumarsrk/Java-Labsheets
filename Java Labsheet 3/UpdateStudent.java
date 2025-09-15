class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " has marks: " + marks);
    }
}

class MarksUpdater {
    Student updateMarks(Student s, int extra) {
        s.marks += extra;
        return s;  
    }
}

public class UpdateStudent {
    public static void main(String[] args) {
        Student st = new Student("Priyanshu", 75);
        st.display();

        MarksUpdater mu = new MarksUpdater();
        Student updated = mu.updateMarks(st, 10);

        updated.display();
    }
}
