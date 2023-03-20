package academic.model;


/**
 * @author 12S20031 Daniel Andres Simangunsong
 * @author 12S20043 Sevia Rajagukguk
 */
public class Course extends Unit {

    // mendeclare atribut yang private karena agar yang bisa yang edit itu hanya class course
    
    public int credit;
    public String passinggrade;
    // protected String inslist;
    
    //Constructor tanpa paramater :instantiation (membuat jadi objek) dan nilainya dibuat kosong atau nol
    // note : Constructor harus sama dengan nama class
//     public Course() {
//     super.name ="";
//     super.code ="";
//     this.credit = 0;
//     this.passinggrade = "";
//     this.inslist= "";
// }

    //Constructor dengan paramater 
    // pengunaan this sebaiknya digunkan saat nama parameter sama dengan nama class 
    public Course(String code, String name, int credit, String passinggrade) {
        super(code, name);
        this.credit = credit;
        this.passinggrade = passinggrade;
        // this.inslist= inslist;
    }

        /**
         * note : this hanya digunakan saat jika nama parameter sama dengan nama atribut atau jika ingin variabel ingin menunjuk atribut class
         */

    
    // accessor : mengakses atau get
    // mengembalikan nilai dari sebuah private field
    // public String getCode() {
    //     return code;
    // }

    // Mutator : mengmutasi/ merubah / setting atau set
    // menetapkan nilai dari sebuah private field/ argunment pada driver

    // public void setCode(String code) {
    //     this.code = code;
    // }
     
    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }
    
    public int getCredit() {
        return credit;
    }

    // public void setCredit(int credit) {
    //     this.credit = credit;
    // }

    public String getPassinggrade() {
        return passinggrade;
    }

    // public void setPassinggrade(String passinggrade) {
    //     this.passinggrade = passinggrade;
    // }
    
    // public String getinslist() {
    //     return inslist;
    // }

    // mengubah method to sting dengan type data sting
    public String toString(){
        return super.toString() + "|" + 
                this.credit + "|" + 
                this.passinggrade
                //  + "|" + this.inslist
                ;
    }

}
