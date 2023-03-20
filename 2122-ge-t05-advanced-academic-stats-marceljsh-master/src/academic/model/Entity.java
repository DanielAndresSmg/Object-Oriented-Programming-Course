package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public abstract class Entity {
    
    protected String code;
    protected String name;
    
    public void   setCode ( String CODE ) { code = CODE; }
    public String getCode ( ) { return code; }
    
    public void   setName ( String NAME ) { name = NAME; }
    public String getName ( ) { return name; }
    
    public String toString ( ) { return String.format("%s|%s",code,name); }

}
