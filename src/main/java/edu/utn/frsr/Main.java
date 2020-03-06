package edu.utn.frsr;

import edu.utn.frsr.models.Employee;
import edu.utn.frsr.utils.DataImport;
import edu.utn.frsr.utils.Employees;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.List;

public class Main {

    public static void createEmployee(Employee e, Connection connection) throws SQLException {

        String sql = "INSERT INTO employees (id, nameprefix,  firstname,"+
                "midleinitial, lastname, gender,"+
                "email, datebirth, ssn,"+
                "phonenumber, place, county,"+
                "city, state, zipcode, region)"+
                "VALUES"+
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        PreparedStatement p = connection.prepareStatement(sql);

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

    }

    public static Connection connectToAndQueryDatabase(String username, String password) throws SQLException {

        Connection con =
                DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/utn_java2",
                username,
                password);

        return con;
    }

    /**
     *
     * @param args la aplicación puede recibir alguno de estos dos argumentos create ó find. Estos deben ser indicados al momento de ejecutar la aplicación.
     * @throws IOException
     * @throws URISyntaxException
     * @throws SQLException
     */

    public static void main(String[] args) throws IOException, URISyntaxException, SQLException {

        Connection connection = connectToAndQueryDatabase("root", "1234");

        if(args[0].equals("create")) {

            System.out.println(args[0]);
            List<Employee> employees = DataImport.getMatrixData("employees3.csv");


        employees.stream().forEach(e -> {
            try {
                Employees.createEmployee(e, connection);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        } else {
            ResultSet resultSet = Employees.findEmployee("M", connection);


            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String nombre = resultSet.getString("firstname");
                String apellido = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                String telefono = resultSet.getString("phonenumber");

                System.out.println(id+", "+nombre+", "+apellido+", "+email+", "+telefono);
            }

        }


    }
}
