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

    
    public Enrollment() {
    this.code = "";
    this.id = "";
    this.year = "";
    this.semester = "";
 
}


    public Enrollment(String code, String id, String year, String semester) {
        this.code = code;
        this.id = id;
        this.year = year;
        this.semester = semester;
    }
    // ACCESSOR => MENDAPAT / GET
    public String getcode() {
        return code;
    }

    
    public String getid() {
        return id;
    }
    
    public String getyear() {
        return year;
    }
    
    public String getsemester() {
        return semester;
    }

    // public void setcode(String code) {
    //     this.code = code;
    // }
    
    // public void setid(String id) {
    //     this.id = id;
    // }
    
    // public void setyear(String year) {
    //     this.year = year;
    // }

    // public void setsemester(String semester) {
    //     this.semester = semester;
    // }
    
    
    public String toString(){
        return this.code + "|" + 
                this.id + "|" + 
                this.year + "|" + 
                this.semester+"|"+
                "None";
    }

}