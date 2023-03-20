package pbo.f01;

/**
 * 12S20031 - Daniel Andres Simangunsong
 * 12S20043 - Sevia Rajagukguk
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import pbo.f01.model.Student;
import pbo.f01.model.Dorm;

public class App 
{
    
    private static EntityManagerFactory factory;
    private static EntityManager entityManager;
    static final String pemisah = "#";
    public static void main( String[] args )
    {
        factory = Persistence.createEntityManagerFactory("dormy_pu");
        entityManager = factory.createEntityManager();

        Scanner scanner = new Scanner(System.in);
        String line = null;
        cleanTables();
        while (true) {
            line = scanner.nextLine();

            if (line.equals("---")) {
                break;
            }

            String[] data = line.split(pemisah);
            String command = data[0];
            data = Arrays.copyOfRange(data, 1, data.length);
            switch (command) {
                case "dorm-add":
                System.out.println("seedTables--");  

                entityManager.getTransaction().begin();
                
                Dorm tempt = new Dorm(data[0],data[1],data[2]);
                
                entityManager.persist(tempt);
                
                entityManager.flush();
                entityManager.getTransaction().commit();

                case "student-add":
                System.out.println("seedTables---");  

                entityManager.getTransaction().begin();
                
                Student tempt1 = new Student(data[0],data[1],data[2],data[3]);
                
                entityManager.persist(tempt1);
                
                entityManager.flush();
                entityManager.getTransaction().commit();

                case "assign":

                case "display-all":
                displayAllStudents();
                displayAllDorms();  
            }  
        }
        entityManager.close();
    }


    private static void displayAllStudents(){
        String jpql = "SELECT c FROM Student c ORDER BY c.name";
        List<Student> students = entityManager.createQuery(jpql, Student.class)
                .getResultList();

        System.out.println("displayAllStudents--");
        for (Student c : students) {
            System.out.println(c);
        }
    }

    private static void displayAllDorms(){
        String jpql = "SELECT g FROM Dorm g ORDER BY g.name";
        List<Dorm> dorms = entityManager.createQuery(jpql, Dorm.class)
                .getResultList();

        System.out.println("displayAllDorms--");
        for (Dorm g : dorms) {
            System.out.println(g);
           
            Set<Student> students =  g.getStudents();
            for(Student c: students){
                System.out.println(c);
            }
        }
    }

    
    private static void cleanTables(){
        String deleteStudentJpql = "DELETE FROM Student c";
        String deleteDormJpql = "DELETE FROM Dorm g";

        entityManager.getTransaction().begin();

        int deletedStudents = entityManager.createQuery(deleteStudentJpql).executeUpdate();
        int deletedDorms = entityManager.createQuery(deleteDormJpql).executeUpdate();

        entityManager.flush();
        entityManager.getTransaction().commit();

        System.out.println("cleanTables: " + deletedStudents + " students");
        System.out.println("cleanTables: " + deletedDorms + " dorms");
    }

    
}