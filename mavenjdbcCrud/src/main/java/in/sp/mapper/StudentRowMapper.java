package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {
    
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student std = new Student();
        std.setId(rs.getInt("id")); // Assuming the column name is 'id'
        std.setName(rs.getString("name")); // Assuming the column name is 'name'
        std.setAge(rs.getInt("age")); // Assuming the column name is 'age'
        return std;
    }
}
