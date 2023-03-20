package academic.model;

public class DaftarNilai {
    private String code;
    private String id;
    private String grade;
    private int credit;

    public DaftarNilai ( ) {
        code   = "";
        id     = "";
        grade  = "";
        credit =  0;
    }

    public DaftarNilai ( String code, String id, int credit ) {
        this.id     = id;
        this.code   = code;
        this.grade  = "";
        this.credit = credit;
    }

    public void setGrade ( String grade ) {
        this.grade = grade;
    }

    public String getId (){
        return this.id; }

    public String getCode (){
        return this.code; }

    public int getCredit (){ 
        return this.credit; }
        
    public String getGrade (){ 
        return this.grade; }

}