package academic.model;

public class Unit {
    protected String code;
    protected String name;
    
    // public Unit{
    //     this.code="";
    //     this.name= "";
    // }
    
    public Unit(String code, String name){
        this.code=code;
        this.name= name;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.code+"|"+ this.name;
    }
    
    
}
