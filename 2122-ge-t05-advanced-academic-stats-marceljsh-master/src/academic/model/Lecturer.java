package academic.model;

public class Lecturer extends Entity {
    
    protected String email;
    protected String initial;
    protected String studyProgram;

    public Lecturer ( )
    {
        code         = "";
        name         = "";
        email        = "";
        initial      = "";
        studyProgram = "";
    }

    public Lecturer ( String CODE, String NAME, String INITIAL, String EMAIL, String STUDY_PROGRAM )
    {
        code         = CODE;
        name         = NAME;
        email        = EMAIL;
        initial      = INITIAL;
        studyProgram = STUDY_PROGRAM;
    }

    public String getInitial ( ) { return initial; }
    public void   setInitial ( String INITIAL ) { initial = INITIAL; }

    public String getEmail ( ) { return email; }
    public void   setEmail ( String EMAIL) { email = EMAIL; }

    public String getStudyProgram ( ) { return studyProgram; }
    public void   setStudyProgram ( String STUDY_PROGRAM ) { studyProgram = STUDY_PROGRAM; }

    @Override
    public String toString ( )
    {
        return String.format( "%s|%s|%s|%s", super.toString(), initial, email, studyProgram );
    }

}
