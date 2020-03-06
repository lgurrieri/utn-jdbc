package edu.utn.frsr.utils;

import edu.utn.frsr.models.Employee;

import java.sql.*;

public class Employees {
    public static Employee createEmployee(Employee e, Connection connection) throws SQLException {

        String sql = "INSERT INTO employees (id, nameprefix,  firstname,"+
                "midleinitial, lastname, gender,"+
                "email, datebirth, ssn,"+
                "phonenumber, place, county,"+
                "city, state, zipcode, region)"+
                "VALUES"+
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        PreparedStatement p = createPreparedStatement(connection, sql);

        p.setString(1, e.getId());
        p.setString(2, e.getNamePrefix());
        p.setString(3, e.getFirstName());
        p.setString(4, e.getMidleInitial());
        p.setString(5, e.getLastName());
        p.setString(6, e.getGender());
        p.setString(7, e.getEmail());
        p.setDate(8, Date.valueOf(e.getDateOfBirth()));
        p.setString(9, e.getSsn());
        p.setString(10, e.getPhoneNumber());
        p.setString(11, e.getPlace());
        p.setString(12, e.getCounty());
        p.setString(13, e.getCity());
        p.setString(14, e.getState());
        p.setString(15, e.getZipcode());
        p.setString(16, e.getRegion());

        p.executeUpdate();

        return e;
    }

    /**
     *
     * @param employeeId es el campo id del empleado
     * @param connection es la referencia a la conexión a la base de datos
     * @throws SQLException
     */
    public static ResultSet findEmployee(String employeeId, Connection connection) throws SQLException{

        String sql = "SELECT id, firstname, lastname, email, phonenumber from employees where gender=?";

        PreparedStatement p = createPreparedStatement(connection, sql);

        p.setString(1, employeeId);

        return p.executeQuery();
    }

    private static PreparedStatement createPreparedStatement(Connection connection, String sql) throws SQLException{
        return connection.prepareStatement(sql);
    }
}
