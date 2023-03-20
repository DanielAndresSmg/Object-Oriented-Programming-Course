package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Lecturer {
    
    public String id;
    public String email;
    public String initial;
    public String lecName; // lecName -> lecturer name
    public String stuProg; // stuProg -> study program

    public Lecturer ( )
    {
        id      = "";
        lecName = "";
        initial = "";
        email   = "";
        stuProg = "";
    }

    public Lecturer ( String ID, String LEC_NAME, String INITIAL, String EMAIL, String STU_PROG )
    {
        id      = ID;
        email   = EMAIL;
        initial = INITIAL;
        lecName = LEC_NAME;
        stuProg = STU_PROG;
    }

    // accessor dan mutator untuk id
    public String getId ( ) { return id; }
    public void   setId ( String ID ) { id = ID; }

    // accessor dan mutator untuk lecName
    public String getLecName ( ) { return lecName; }
    public void   setLecName ( String LEC_NAME ) { lecName = LEC_NAME; }

    // accessor dan mutator untuk initial
    public String getInitial ( ) { return initial; }
    public void   setInitial ( String INITIAL ) { initial = INITIAL; }

    // accessor dan mutator untuk email
    public String getEmail ( ) { return email; }
    public void   setEmail ( String EMAIL) { email = EMAIL; }

    // accessor dan mutator untuk stuProg
    public String getStuProg ( ) { return stuProg; }
    public void   setStuProg ( String STU_PROG) { stuProg = STU_PROG; }

    public String toString ( )
    { return String.format( "%s|%s|%s|%s|%s", id, lecName, initial, email, stuProg ); }

}
