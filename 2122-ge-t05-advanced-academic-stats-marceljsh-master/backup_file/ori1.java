// ori

package academic.driver;

import java.util.Arrays;
import java.util.Scanner;

import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;
import academic.model.Lecturer;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Driver1 {
    
    static final String  delim   = "#";
    static final String  delim2  = ",";
    static Course[]      matkulz = new     Course[0];
    static Student[]     siswaz  = new    Student[0];
    static Enrollment[]  enrolz  = new Enrollment[0];
    static Lecturer[]    dosenz  = new   Lecturer[0];

    public static void main ( String[] _args )
    {
        Scanner inp = new Scanner( System.in );
        String input = null;
        String foo   =   "";
        String[] buf;               // penampung hasil split
        String order;               // perintah untuk case
        String[]   init    = null;  // untuk inisial
        Lecturer   tempLec = null;  // temporary lecturer
        Lecturer   newLec  = null;  // for new lecturer
        Course     tempCou = null;  // temporary course
        Course     newCou  = null;  // for new course
        Student    tempStu = null;  // temporary student
        Student    newStu  = null;  // for new student
        Enrollment tempEnr = null;  // temporary enrollment
        Enrollment newEnr  = null;  // for new enrollment


        while ( 2 > 1 )
        {
            input = inp.nextLine( );
            if ( input.equals("---") ) break;
            buf = input.split(delim);
            order = buf[0];
            buf = Arrays.copyOfRange( buf, 1, buf.length );

            switch ( order )
            {
                case "lecturer-add":
                    tempLec = isDuplicateLec( buf[0], buf[2], buf[3] );
                    if ( tempLec != null ) break;
                    else {
                        newLec = arrayToLecturer( buf );
                        addLecturer( newLec );
                        break;
                    }
                
                case "student-add":
                    tempStu = isDuplicateStu( buf[0] );
                    if ( tempStu != null ) break;
                    else {
                        newStu = arrayToStudent( buf );
                        addStudent( newStu );
                        break;
                    }

                case "course-add":
                    tempCou = isDuplicateCou( buf[0] );
                    if ( tempCou != null ) break;
                    else {
                        init = buf[4].split( delim2 );
                        for ( int i=0; i<init.length; i++ ) {
                            if ( i != init.length-1 ) {
                                for ( Lecturer temp: dosenz ) {
                                    if ( temp.getInitial( ).equals( init[i] ) ) {
                                        foo = foo.concat( init[i] + " (" + temp.getEmail( ) + ");" );
                                    }
                                }
                                
                            }
                            else {
                                for ( Lecturer temp: dosenz ) {
                                    if ( temp.getInitial( ).equals( init[i] ) ) {
                                        foo = foo.concat( init[i] + " (" + temp.getEmail( ) + ")" );
                                    }
                                }
                            }
                        }
                        
                        buf[4] = foo;
                        newCou = arrayToCourse( buf );
                        addCourse( newCou );
                        foo = "";
                        break;
                    }
                
                case "enrollment-add":
                    tempEnr = isDuplicateEnr(buf[0], buf[1], buf[2]);
                    if ( tempEnr != null ) break;
                    else {
                        newEnr = arrayToEnrollment( buf );
                        addEnrollment( newEnr );
                        break;
                    }
                
                case "enrollment-grade":
                    for (int i=0; i<enrolz.length; i++) {
                        if ( enrolz[i].getCode().equals(buf[0]) &&
                             enrolz[i].getId().equals(buf[1]) &&
                             enrolz[i].getYear().equals(buf[2]) &&
                             enrolz[i].getSemester().equals(buf[3]) ) {
                            
                            enrolz[i].setGrade(buf[4]);
                            break;
                        }
                    }
                    break;
                
                case "student-details":
                    int total_credit = 0;
                    float temp_gpa = 0;
                    float num = 0;
                    for (Enrollment x: enrolz) {
                        if (x.getId().equals(buf[0])) {
                            tempCou = isDuplicateCou(x.getCode());
                            /*
                            jika sudah pernah memiliki nilai, maka credit tidak akan ditambah
                            karena yang berubah cuma nilai
                            */
                            if ( !x.getGrade().equals("None") ) { total_credit += tempCou.getCredit(); }
                            switch ( x.getGrade() ) {
                                case "A" : num += (4   * tempCou.getCredit()); break;
                                case "AB": num += (3.5 * tempCou.getCredit()); break;
                                case "B" : num += (3   * tempCou.getCredit()); break;
                                case "BC": num += (2.5 * tempCou.getCredit()); break;
                                case "C" : num += (2   * tempCou.getCredit()); break;
                                case "D" : num += (1   * tempCou.getCredit()); break;
                                case "E" : num += (0   * tempCou.getCredit()); break;
                            }
                        }
                    }
                    // untuk menghindari 0/0
                    temp_gpa = (num==0 && total_credit==0) ? (float) 0.00 : num/total_credit;
                    tempStu = isDuplicateStu(buf[0]);
                    if (temp_gpa == 0) { total_credit = 0; }
                    System.out.printf("%s|%s|%s|%s|%.2f|%d\n", buf[0],
                                                               tempStu.getStuName(),
                                                               tempStu.getEduYear(),
                                                               tempStu.getStuProg(),
                                                               temp_gpa,
                                                               total_credit);
                    break;
            }
        }

        printAll( );
        inp.close( );

    }

    private static void printAll ( )
    {
        printAllLecturers( );
        printAllCourses( );
        printAllStudents( );
        printAllEnrollments( );
        
    }

    // Lecturers
    public static Lecturer isDuplicateLec ( String CODE,String INITIAL, String EMAIL )
    {
        for ( Lecturer temp : dosenz ) {
            if ( temp.getId( ).equals( CODE ) &&
                 temp.getInitial( ).equals( INITIAL ) &&
                 temp.getEmail( ).equals( EMAIL )) { return temp; }
        }
        return null;
    }
    
    private static void printAllLecturers() { for (Lecturer temp : dosenz) { System.out.println( temp ); } }

    private static void addLecturer ( Lecturer temp )
    {
        dosenz = Arrays.copyOf(dosenz, dosenz.length + 1);
        dosenz[dosenz.length - 1] = temp;
    }

    private static Lecturer arrayToLecturer ( String[] temp)
    {
        return new Lecturer( temp[0], temp[1], temp[2], temp[3], temp[4] );
    }

    // Courses
    public static Course isDuplicateCou ( String CODE )
    {
        for ( Course temp : matkulz ) {
            if ( temp.getCode( ).equals( CODE ) ) { return temp; }
        }
        return null;
    }

    private static void printAllCourses ( ) { for (Course temp : matkulz) { System.out.println( temp ); } }

    private static void addCourse ( Course temp )
    {
        matkulz = Arrays.copyOf(matkulz, matkulz.length + 1);
        matkulz[matkulz.length - 1] = temp;
    }

    private static Course arrayToCourse ( String[] temp ) {
        return new Course( temp[0], temp[1], Integer.parseInt( temp[2] ), temp[3], temp[4] );
    }

    // Students
    public static Student isDuplicateStu ( String CODE )
    {
        for ( Student temp : siswaz ) {
            if ( temp.getId( ).equals( CODE ) ) { return temp; }
        }
        return null;
    }
    
    private static void printAllStudents ( )
    {
        for ( Student temp : siswaz) { System.out.println( temp ); }
    }

    private static void addStudent ( Student temp )
    {
        siswaz = Arrays.copyOf( siswaz, siswaz.length + 1 );
        siswaz[siswaz.length - 1] = temp;
    }

    private static Student arrayToStudent ( String[] temp )
    {
        return new Student( temp[0], temp[1], temp[2], temp[3] );
    }

    // Enrollments
    public static Enrollment isDuplicateEnr ( String CODE, String ID, String YEAR ) 
    {
        for (Enrollment temp : enrolz)
            { if ( temp.getCode( ).equals( CODE ) &&
                   temp.getId( ).equals( ID ) &&
                   temp.getYear( ).equals( YEAR ) ) { return temp; } }
        return null;
    }

    private static void printAllEnrollments ( )
    {
        for ( Enrollment temp : enrolz ) { System.out.println( temp ); }
    }

    private static void addEnrollment ( Enrollment temp )
    {
        enrolz = Arrays.copyOf( enrolz, enrolz.length + 1 );
        enrolz[enrolz.length - 1] = temp;
    }

    private static Enrollment arrayToEnrollment ( String[] temp )
    {
        return new Enrollment( temp[0], temp[1], temp[2], temp[3] );
    }

}