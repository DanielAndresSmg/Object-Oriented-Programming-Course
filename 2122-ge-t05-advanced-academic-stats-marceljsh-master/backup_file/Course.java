package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Course {

    private String code;
    private String courseName;
    private int    credit;
    private String passingGrade;
    private String initDraft;

    public Course ( )
    {
        credit = 0;
        code         = "";
        courseName   = "";
        passingGrade = "";
        initDraft    = "";
    }

    public Course ( String CODE, String COURSE_NAME, int CREDIT, String PASSING_GRADE, String INIT_DRAFT )
    {
        code         = CODE;
        courseName   = COURSE_NAME;
        credit       = CREDIT;
        passingGrade = PASSING_GRADE;
        initDraft    = INIT_DRAFT;
    }

    public String getInitDraft ( ) { return initDraft; }
    
    // accessor dan mutator untuk code
    public String getCode ( ) { return code; }
    public void   setCode ( String CODE ) { code = CODE; }

    // accessor dan mutator untuk courseName
    public String getCourseName ( ) { return courseName; }
    public void   setCourseName ( String COURSE_NAME ) { courseName = COURSE_NAME; }

    // accessor dan mutator untuk credit
    public int    getCredit ( ) { return credit; }
    public void   setCredit ( int CREDIT ) { credit = CREDIT; }

    // accessor dan mutator untuk passingGrade
    public String getPassingGrade ( ) { return passingGrade; }
    public void   setPassingGrade ( String PASSING_GRADE ) { passingGrade = PASSING_GRADE; }
    
    public String toString ( )
    { return String.format( "%s|%s|%d|%s|%s", code, courseName, credit, passingGrade, initDraft ); }

}