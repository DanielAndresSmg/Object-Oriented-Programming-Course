package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Enrollment {

    private String id;
    private String code;
    private String year;
    private String grade;
    private String semester;

    public Enrollment ( )
    {
        code     = "";
        id       = "";
        year     = "";
        semester = "";
        grade    = "None";
    }

    public Enrollment ( String CODE, String ID, String YEAR, String SEMESTER)
    {
        id       = ID;
        code     = CODE;
        year     = YEAR;
        grade    = "None";
        semester = SEMESTER;
    }

    // accessor untuk semua attribute selain grade
    public String getCode     ( ) { return     code; }
    public String getId       ( ) { return       id; }
    public String getYear     ( ) { return     year; }
    public String getSemester ( ) { return semester; }

    // mutator untuk grade
    public void setGrade ( String GRADE ) { grade = GRADE; }
    // accessor untuk grade
    public String getGrade ( ) { return grade; }

    public String toString ( ) { return String.format( "%s|%s|%s|%s|%s", code, id, year, semester, grade ); }

}