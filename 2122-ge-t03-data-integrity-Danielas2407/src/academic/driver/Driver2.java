package academic.driver;

import java.util.Arrays;
import java.util.Scanner;

import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;

/**
* @author 12S20031 Daniel Andres Simangunsong
* @author 12S20043 Sevia Rajagukguk
*/

public class Driver2 {

    static final String DATA_SEPARATOR = "#";
    static Course[] courses = new Course[0];
    static Student[] students = new Student[0];
    static Enrollment[] enrollments = new Enrollment[0];

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        String line = null;

        while(true) {
            line = scanner.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] data = line.split(DATA_SEPARATOR);
            String command = data[0];
            data = Arrays.copyOfRange(data, 1, data.length);
            switch (command) {
                case "course-add":
                    Course course = checkDuplicateCorCourse(data[0]);
                    if(course != null){
                        break;
                    }
                    else{
                        Course newCourse = arrayToCourse(data);
                        addCourse(newCourse);
                        break;
                    }
                case "student-add":
                    Student student = checkDuplicateStudent(data[0]);
                    if(student != null){
                        break;
                    }
                    else{
                    Student newStudent = arrayToStudent(data);
                    addStudent(newStudent);
                    break;
                    }
                case "enrollment-add":
                    Enrollment enrollment = checkDuplicateEnrollment(data[0]);
                    if(enrollment != null){
                        break;
                    }
                    else{
                    Enrollment newEnrollment = arrayToEnrollment(data);
                    addEnrollment(newEnrollment);
                    break;
                    }
            }
        }
        printAll();

        scanner.close();
    }
    
    public static Course checkDuplicateCorCourse(String CODECourse){
        for (Course course : courses){
            if (course.getCode().equals(CODECourse)){
                return course;
            }
        }
        return null;
    }

    private static void printAll() {
        printAllCourses();
        printAllStudents();
        printAllEnrollments();
    }

    // Courses
    private static void printAllCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    private static void addCourse(Course course) {
        courses = Arrays.copyOf(courses, courses.length + 1);
        courses[courses.length - 1] = course;
    }

    private static Course arrayToCourse(String[] data) {
        Course course = new Course(
                data[0],
                data[1],
                Integer.parseInt(data[2]),
                data[3]);

        return course;
    }

    // Students

    public static Student checkDuplicateStudent(String CODEStudent){
        for (Student student : students){
            if (student.getId().equals(CODEStudent)){
                return student;
            }
        }
        return null;
    }
    
    private static void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void addStudent(Student student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    private static Student arrayToStudent(String[] data) {
        Student student = new Student(
                data[0],
                data[1],
                data[2],
                data[3]);

        return student;
    }


    //Enrollment
    public static Enrollment checkDuplicateEnrollment(String CODEEnrollment){
        for (Enrollment enrollment : enrollments){
            if (enrollment.getcode().equals(CODEEnrollment)){
                return enrollment;
            }
        }
        return null;
    }

    private static void printAllEnrollments() {
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }

    private static void addEnrollment(Enrollment enrollment) {
        enrollments = Arrays.copyOf(enrollments, enrollments.length + 1);
        enrollments[enrollments.length - 1] = enrollment;
    }

    private static Enrollment arrayToEnrollment(String[] data) {
        Enrollment enrollment = new Enrollment(
                data[0],
                data[1],
                data[2],
                data[3]);

        return enrollment;
    }
}

// public Enrollment add(String codeCourse, String NIMStudent, ..){
//         Student student = checkDuplicateStudent(this.NIMStudent);

//         if(student == null){
//             throw new Exception("invalid student|" + NIMStudent);
//         }

//         NIMEnroll = NIMStudent;
//     }