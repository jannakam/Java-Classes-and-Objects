package university;

public class Course {
    //properties
    String name;
    int students;
    String instructor;

    //constructor to set all properties
    public Course(String courseName, String courseInstructor, int numberOfStudents) {
        name = courseName;
        instructor = courseInstructor;
        students = numberOfStudents;
    }

    //getters
    public String getCourseName() {
        return name;
    }

    public String getInstructorName() {
        return instructor;
    }

    public int getStudents() {
        return students;
    }

    //setters
    public void setCourseName(String courseName) {
        name = courseName;
    }

    public void setInstructorName(String courseInstructor) {
        instructor = courseInstructor;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        students = numberOfStudents;
    }

    @Override
    public String toString() {
        return name + " taught by " + instructor + " has " + students + " students";
    }

}
