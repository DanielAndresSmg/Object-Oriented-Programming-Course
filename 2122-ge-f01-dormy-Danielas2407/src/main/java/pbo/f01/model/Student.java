package pbo.f01.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity	
@Table(name = "students")
public class Student {
    @Id 
    @Column(name = "nim", nullable=false, length =255)
    private String nim;
    @Column(name = "name", nullable=false, length =255)
    private String name;
    @Column(name = "year", nullable=false, length =255)
    private String year;
    @Column(name = "gender", nullable=false, length =255)
    private String gender;

    @ManyToMany(targetEntity = Dorm.class, cascade = CascadeType.ALL)
    @JoinTable(name = "student_dorm", joinColumns = @JoinColumn(name = "dorm_nim", referencedColumnName = "nim"), 
    inverseJoinColumns = @JoinColumn(name = "dorm_name", referencedColumnName = "name"))
    
    private Set<Dorm> dorms;

    public Student(){
        //empty
    }

    public Student(String nim, String name, String year, String gender) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.gender = gender;
    }

    public Student(String nim, String name, String year, String gender , Set<Dorm> dorms) {
        this.nim = nim;
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.dorms = dorms;
    }

    
    public String getnim() {
        return nim;
    }
    
    public void setnim(String nim) {
        this.nim = nim;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getyear() {
        return year;
    }

    public void setyear(String year) {
        this.year = year;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Set<Dorm> getDroms() {
        return dorms;
    }
    
    public void setDorms(Set<Dorm> dorms) {
        this.dorms = dorms;
    }

    @Override
    public String toString() {
        return  nim + "|" + name + "|" + year + "|" + gender ;

    }
}
