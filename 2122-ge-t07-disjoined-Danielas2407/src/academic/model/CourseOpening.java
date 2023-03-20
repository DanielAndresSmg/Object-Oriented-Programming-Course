package academic.model;

/**
 * @author 12S20031 Daniel Andres Simangunsong
 * @author 12S20043 Sevia Rajagukguk
 */
public class CourseOpening {

    private Course course;
    private String year;
    private String semester; 
    private String inslist;


    public CourseOpening(Course course, String year, String semester, String inslist) {
        this.course = course;
        this.year = year;
        this.semester = semester;
        this.inslist = inslist;
    }   

    public String getCode() {
        return course.getCode();
    }
    
    public String getName() {
        return course.getName();
    }
    
    public String getYear() {
        return year;
    }

    /////////////////////////////////////////////////////////////////////////////////////

    public int getCredit() {
        return course.getCredit();  
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getInslist() {
        return inslist;
    }

    public void setInslist(String inslist) {
        this.inslist = inslist;
    }

    public String getPassinggrade() {
        return course.getPassinggrade();
    }

    /////////////////////////////////////////////////////////////////////////////////////
    public void setYear(String year) {
        this.year = year;
    }

    public String getGrade() {
        return semester;
    }

    public void setGrade(String grade) {
        this.semester = grade;
    }

    public String getinslist() {
        return inslist;
    }

    public void setinslist(String inslist) {
        this.inslist = inslist;
    }
    

    public String toString(){
        return this.course + "|" + 
                this.year + "|" + 
                this.semester+"|"+
                this.inslist;
    }
    

}