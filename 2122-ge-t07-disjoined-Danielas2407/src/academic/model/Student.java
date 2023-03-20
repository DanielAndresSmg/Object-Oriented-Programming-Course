package academic.model;

/**
 * @author 12S20031 Daniel Andres Simangunsong
 * @author 12S20043 Sevia Rajagukguk
 */
public class Student extends Unit {
    
    private String year;
    private String studyprogram;
    
    // public Student() {
    //     this.year = "";
    //     this.studyprogram = "";
    // }

    public Student (String nim, String code , String year, String studyprogam) {
        super(nim,code);
        this.year = year;
        this.studyprogram = studyprogam;
    }
    
    // public String getId() {
    //     return nim;
    // }

    // public void setId(String nim) {
    //     this.nim = nim;
    // }

    // public String getName() {
    //     return code;
    // }

    // public void setName(String code) {
    //     this.code = code;
    // }

    public String getYear() {
        return year;
    }
    
    // public void setYear(String year) {
    //     this.year = year;
    // }

    public String getStudyProgram() {
        return studyprogram;
    }

    public void setStudyProgram(String studyprogram) {
        this.studyprogram = studyprogram;   
    }

    public String toString(){
        return super.toString() + "|" + 
                this.year + "|" + 
                this.studyprogram;
    }
}
