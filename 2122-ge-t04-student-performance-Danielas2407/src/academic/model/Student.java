package academic.model;

/**
 * @author 12S20031 Daniel Andres Simangunsong
 * @author 12S20043 Sevia Rajagukguk
 */
public class Student {
    private String nim ;
    private String code;
    private float gpa;
    private String credit;
    
    public Student() {
        this.nim = "";
        this.code = "";
        this.gpa = 0;
        this.credit = "";
    }

    public Student (String nim, String code , float gpa, String credit) {
        this.nim = nim;
        this.code = code;
        this.gpa = gpa;
        this.credit = credit;
    }
    
    public String getId() {
        return nim;
    }
    // public void setId(String nim) {
    //     this.nim = nim;
    // }
    public String getName() {
        return code;
    }
    // public void setName(String code) {
    //     this.code = code;
    // }
    public float getgpa() {
        return gpa;
    }
    // public void setgpa(String gpa) {
    //     this.gpa = gpa;
    // }

    public String getcredit() {
        return credit;
    }

    public void setcredit(String credit) {
        this.credit = credit;   
    }

    public String toString(){
        return this.nim + "|" + 
                this.code + "|" + 
                String.valueOf(this.gpa) + "|" + 
                this.credit;
    }
}
