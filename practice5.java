import java.util.ArrayList;

class Course {
    private String name;
    private int credits;
    private double grade;

    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
        this.grade = 0.0;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public int getCredits() {
        return credits;
    }

    public String getName() {
        return name;
    }

    public String getlettergrade() {
        if (grade >= 4.5) {
            return "A";
        } else if (grade >= 3.5) {
            return "B";
        } else if (grade >= 2.5) {
            return "C";
        } else if (grade >= 2.0) {
            return "D";
        } else {
            return "F";
        }
    }
}

class student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public double getgpa() {
        if (courses.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (Course course : courses) {
            total += course.getGrade();
        }
        return total / courses.size();

    }
}

public class practice5 {

    public static void main(String[] args) {

        // Alice

        Course cs = new Course("Computer Science", 4);

        cs.setGrade(3.7);

        student alice = new student("Alice", 1234);

        alice.addCourse(cs);

        System.out.println("Alice's Initial GPA: " + alice.getgpa());

        Course math = new Course("Math", 3);

        alice.addCourse(math);

        math.setGrade(4.0);

        System.out.println("Alice's Updated GPA: " + alice.getgpa());

        // Bob

        Course csBob = new Course("Computer Science", 4);

        csBob.setGrade(3.0);

        Course mathBob = new Course("Math", 3);

        mathBob.setGrade(3.5);

        student bob = new student("Bob", 5678);

        bob.addCourse(csBob);

        bob.addCourse(mathBob);

        System.out.println("\nBob's GPA: " + bob.getgpa());

    }

}