package in.ddnnsti.mavenjdbcCrud;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.sp.beans.Student;
import in.sp.mapper.StudentRowMapper;
import in.sp.resources.springConfigFile;



//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import in.sp.beans.Student;
//import in.sp.resources.springConfigFile;

public class App {
    public static void main(String[] args) {
    	  ApplicationContext context = new AnnotationConfigApplicationContext(springConfigFile.class);
    	  JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        

//    	---------------------------insert table Data ---------------------------
//      
//        int id = 1011;
//        String name = "Ramakanakak";
//        int age = 21;
//
//        String insert_sql_query = "INSERT INTO students values(?,?,?)";
//        int count = jdbcTemplate.update(insert_sql_query, id, name, age);
//
//        if (count > 0) {
//            System.out.println("Inserted");
//        } else {
//            System.out.println("Insertion failed");
//        }
    	
    	
//    	------------------------------update data ---------------------------------------
    	
//    	
//    	String name = "RamakantPrajapati";
//    	int id = 1;
//    	 String update_sql_query = "UPDATE students SET name = ? WHERE id = ?";
//         int count = jdbcTemplate.update(update_sql_query, name, id);
//
//         if (count > 0) {
//             System.out.println("Updated");
//         } else {
//             System.out.println("Update failed");
//         }
//         
         
//        ------------------------------- Delete operation --------------------------------
//         int id = 1;
//         
//         String delete_sql_query = "DELETE FROM students WHERE id=?";
//         
//         int count = jdbcTemplate.update(delete_sql_query, id);
//         
//               if (count > 0) {
//                  System.out.println("Deleteddddd");
//                  } 
//               else 
//               {
//                     System.out.println(" failed");
//                 }
//    	
    	
    	  
//    	  ----------Select operation-----------------
    	  
    	  String query_sql = "SELECT * FROM students";
          List<Student> students = jdbcTemplate.query(query_sql, new StudentRowMapper());

          for (Student student : students) {
              System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
          }
          }
    }

