import university.Course;

public class Main {
    public static void main(String[] args) {
        //as specified in the task, create an instance of course and call the toString method
        Course newCourse = new Course("Linear Algebra", "Ali Kanto", 23);
        System.out.println(newCourse);

        //get properties one by one using the getters
        String courseName = newCourse.getCourseName();
        System.out.printf("The course is called %s \n", courseName);

        //change a course property using setters
        newCourse.setNumberOfStudents(20);
        System.out.printf("Some students dropped out, we now have %d students! \n", newCourse.getStudents());

    }
}