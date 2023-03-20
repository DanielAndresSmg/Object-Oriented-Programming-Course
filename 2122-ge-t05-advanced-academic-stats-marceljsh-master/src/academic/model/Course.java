package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Course extends Entity {
    
    protected int credit;
    protected String passingGrade;
    protected String initDraft;

    public Course ( )
    {
        code = "";
        name = "";
        credit = 0;
        passingGrade = "";
        initDraft = "";
    }

    public Course ( String CODE, String NAME, int CREDIT, String PASSING_GRADE, String INIT_DRAFT )
    {
        code = CODE;
        name = NAME;
        credit = CREDIT;
        passingGrade = PASSING_GRADE;
        initDraft = INIT_DRAFT;
    }

    public String getInitDraft ( ) { return initDraft; }
    public int    getCredit ( ) { return credit; }
    public void   setCredit ( int CREDIT ) { credit = CREDIT; }
    public String getPassingGrade ( ) { return passingGrade; }
    public void   setPassingGrade ( String PASSING_GRADE ) { passingGrade = PASSING_GRADE; }

    @Override
    public String toString ( )
    {
        return String.format( "%s|%d|%s|%s", super.toString(), credit, passingGrade, initDraft );
    }
}
