package academic.model;

/**
 * @author 12S20031 Daniel Andres Simangunsong
 * @author 12S20043 Sevia Rajagukguk
 */
public class Lecturer {
    private String id ;
    private String name;
    private String initial;
    private String email;
    private String studyprogram;
    
    public Lecturer() {
        this.id = "";
        this.name = "";
        this.initial = "";
        this.email="";
        this.studyprogram = "";
    }

    public Lecturer (String id, String name , String initial,String email, String studyprogam) {
        this.id = id;
        this.name = name;
        this.initial = initial;
        this.email=email;
        this.studyprogram = studyprogam;
    }
    
    public String getId() {
        return id;
    }
    // public void setId(String id) {
    //     this.id = id;
    // }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public String getinitial() {
        return initial;
    }
    // public void setinitial(String initial) {
    //     this.initial = initial;
    // }

    public String getemail() {
        return email;
    }

    public String getStudyProgram() {
        return studyprogram;
    }

    // public void setStudyProgram(String studyprogram) {
    //     this.studyprogram = studyprogram;   
    // }

    public String toString(){
        return this.id + "|" + 
                this.name + "|" + 
                this.initial + "|" + 
                this.email + "|" + 
                this.studyprogram;
    }
}
