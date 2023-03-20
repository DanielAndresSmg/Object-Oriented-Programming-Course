package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Student {

    public String id;
    public String stuName; // stuName -> student name
    public String eduYear; // eduYear -> education year
    public String stuProg; // stuProg -> study program

    public Student ( )
    {
        id      = "";
        stuName = "";
        eduYear = "";
        stuProg = "";
    }

    public Student ( String ID, String STU_NAME, String EDU_YEAR, String STU_PROG )
    {
        id      = ID;
        stuName = STU_NAME;
        eduYear = EDU_YEAR;
        stuProg = STU_PROG;
    }

    // accessor dan mutator untuk id
    public String getId ( ) { return id; }
    public void   setId ( String ID ) { id = ID; }

    // accessor dan mutator untuk stuName
    public String getStuName ( ) { return stuName; }
    public void   setStuName ( String STU_NAME ) { stuName = STU_NAME; }

    // accessor dan mutator untuk eduYear
    public String getEduYear ( ) { return eduYear; }
    public void   setEduYear ( String EDU_YEAR ) { eduYear = EDU_YEAR; }

    // accessor dan mutator untuk stuProg
    public String getStuProg ( ) { return stuProg; }
    public void   setStuProg ( String STU_PROG) { stuProg = STU_PROG; }

    public String toString ( )
    { return String.format( "%s|%s|%s|%s", id, stuName, eduYear, stuProg ); }

}