package academic.driver;

import java.util.Arrays;
import java.util.Scanner;
import academic.model.Student;


/**
* @author 12S20031 Daniel Andres Simangunsong
* @author 12S20043 Sevia Rajagukguk
*/

public class Driver1 {

    static final String pemisah = "#";
    static Student[] students = new Student[0];
    
    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);
        String line = null;

        while(true) {
            line = scanner.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] data = line.split(pemisah);
            String command = data[0];
            data = Arrays.copyOfRange(data, 1, data.length);
            switch (command) {
            
                case "student-add":
                    Student newStudent = arrayToStudent(data);
                    addStudent(newStudent);
                    break;
                
                case "student-show-all":
                    printAll();
                    
            }
        }
        

        scanner.close();
    }
    
    
    private static void printAll() {
        printAllStudents();
        
        
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
                Float.parseFloat(data[2]),
                data[3]);

        return student;
    }


}
