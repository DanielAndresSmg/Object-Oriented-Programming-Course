package academic.driver;

import java.util.Arrays;
import java.util.Scanner;

import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;
import academic.model.Lecturer;

/**
* @author 12S20031 Daniel Andres Simangunsong
* @author 12S20043 Sevia Rajagukguk
*/

public class Driver1 {

    static final String pemisah = "#";
    static final String koma = ",";
    static Course[] courses = new Course[0];
    static Student[] students = new Student[0];
    static Enrollment[] enrollments = new Enrollment[0];
    static Lecturer[] lecturers = new Lecturer[0];
    

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        String line = null;
        String[] insial;
        String kata = "";
        int i ;

        while(true) {
            line = scanner.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] data = line.split(pemisah);
            String command = data[0];
            data = Arrays.copyOfRange(data, 1, data.length);
            switch (command) {
                case "lecturer-add":
                Lecturer lecturer= checkDuplicateCorLecturer(data[0],data[2],data[3]);
                    if(lecturer != null){
                        break;
                    }
                    else{
                        Lecturer newLecturer = arrayToLecturer(data);
                        addLecturer(newLecturer);
                        break;
                    }
                    
                case "course-add":
                    Course course = checkDuplicateCorCourse(data[0]);
                    if(course != null){
                        break;
                    }
                    else{
                        insial = data[4].split(koma);
                        
                       
                        for( i =0 ; i < insial.length;i++){
                            if(i == insial.length -1){
                                for (Lecturer x : lecturers){
                                    if (x.getinitial().equals(insial[i])){
                                        kata = kata.concat(String.format("%s (%s)", insial[i], x.getemail() ));                                
                                    }
                                    // k = k+1
                                }
                            }
                            else{
                                for (Lecturer x : lecturers){
                                    if (x.getinitial().equals(insial[i])){
                                        kata = kata.concat(String.format("%s (%s);", insial[i], x.getemail() ));    
                                    }
                                }
                            }
                        }
                        
                        data[4] = kata ;
                        Course newCourse = arrayToCourse(data);
                        addCourse(newCourse);
                        kata="";
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
                    // Enrollment enrollment = checkDuplicateEnrollment(data[0]);
                    Enrollment newEnrollment = arrayToEnrollment(data);
                    addEnrollment(newEnrollment);
                    break;
                case "enrollment-grade":
                    update(data[0], data[1], data[2], data[3],data[4]);
                    break;
                }
        }
        printAll();

        scanner.close();
    }
    private static void printAll() {
        printAllLecturers();
        printAllCourses();
        printAllStudents();
        printAllEnrollments();
        
    }

    public static void update(String data0, String data1, String data2,String data3, String data4){
        for (int z=0; z<enrollments.length;z++) {
            //dicek dulu
            if (enrollments[z].getcode().equals(data0) && enrollments[z].getid().equals(data1) &&
                enrollments[z].getyear().equals(data2) && enrollments[z].getsemester().equals(data3) ) 
                {
                //lalu diupdate gradenya
                enrollments[z].setGrade(data4);
                break;
            }
            
        }
    }


    


    // Lecturers

    public static Lecturer checkDuplicateCorLecturer(String CODELecturer,String INISIALLecturer,String EMAILLecturer){
        for (Lecturer lecturer : lecturers){
            if (lecturer.getId().equals(CODELecturer) && lecturer.getinitial().equals(INISIALLecturer) && lecturer.getemail().equals(EMAILLecturer)){
                return lecturer;
            }
        }
        return null;
    }
    
    private static void printAllLecturers() {
        for (Lecturer Lecturer : lecturers) {
            System.out.println(Lecturer);
        }
    }

    private static void addLecturer(Lecturer lecturer) {
        lecturers = Arrays.copyOf(lecturers, lecturers.length + 1);
        lecturers[lecturers.length - 1] = lecturer;
    }

    private static Lecturer arrayToLecturer(String[] data) {
        Lecturer Lecturer = new Lecturer(
                data[0],
                data[1],
                data[2],
                data[3],
                data[4]);

        return Lecturer;
    }

    // Courses

    public static Course checkDuplicateCorCourse(String CODECourse){
        for (Course course : courses){
            if (course.getCode().equals(CODECourse)){
                return course;
            }
        }
        return null;
    }

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
                data[3],
                data[4]);

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
    public static Enrollment checkDuplicateEnrollment(String CODEEnrollment,String IDEnrollment,String YEAREnrollment,String SEMESTEREnrollment){
        for (Enrollment enrollment : enrollments){
            if (enrollment.getcode().equals(CODEEnrollment) && enrollment.getid().equals(IDEnrollment) && enrollment.getyear().equals(YEAREnrollment)&&enrollment.getsemester().equals(SEMESTEREnrollment)){
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