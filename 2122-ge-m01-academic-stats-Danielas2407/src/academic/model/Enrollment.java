package academic.model;

/**
 * @author 12S20031 Daniel Andres Simangunsong
 * @author 12S20043 Sevia Rajagukguk
 */
public class Enrollment {
  
    private String code;
    private String id;
    private String year;
    private String semester;
    private String grade; 

    
    public Enrollment() {
    this.code = "";
    this.id = "";
    this.year = "";
    this.semester = "";
    this.grade="";
 
}


    public Enrollment(String code, String id, String year, String semester) {
        this.code = code;
        this.id = id;
        this.year = year;
        this.semester = semester;
        this.grade="None";
    }
    // ACCESSOR => MENDAPAT / GET
    public String getcode() {
        return code;
    }
    // MUTATOR => SET
    // public void setcode(String code) {
    //     this.code = code;
    // }
    public String getid() {
        return id;
    }
    // public void setid(String id) {
    //     this.id = id;
    // }
    public String getyear() {
        return year;
    }
    // public void setyear(String year) {
    //     this.year = year;
    // }

    public String getsemester() {
        return semester;
    }

    // public void setsemester(String semester) {
    //     this.semester = semester;
    // }
    
    public String getGrade() {
        return grade;
    }


    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String toString(){
        return this.code + "|" + 
                this.id + "|" + 
                this.year + "|" + 
                this.semester+"|"+
                this.grade;
    }


    

}