package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Student extends Entity {
    
    protected String educationYear;
    protected String studyProgram;
    
    public Student ( )
    {
        code = "";
        name = "";
        educationYear = "";
        studyProgram = "";
    }
    
    public Student ( String CODE, String NAME, String EDUCATION_YEAR, String STUDY_PROGRAM )
    {
        code = CODE;
        name = NAME;
        educationYear = EDUCATION_YEAR;
        studyProgram = STUDY_PROGRAM;
    }
    
    public String getEducationYear ( ) { return educationYear; }
    
    public String getStudyProgram ( ) { return studyProgram; }
    
    public void setEducationYear ( String EDUCATION_YEAR ) { educationYear = EDUCATION_YEAR; }
    
    public void setStudyProgram ( String STUDY_PROGRAM ) { studyProgram = STUDY_PROGRAM; }

    @Override
    public String toString ( )
    {
        return String.format( "%s|%s|%s", super.toString(), educationYear, studyProgram );
    }

}
