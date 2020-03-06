package edu.utn.frsr.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import edu.utn.frsr.models.Employee;

/**
 * DataImport
 */
public class DataImport {

    public static List<Employee> getMatrixData(String url) throws IOException, URISyntaxException {
        Path path = Paths.get(ClassLoader.getSystemResource(url).toURI());

        List<String> filesLines = Files.readAllLines(path);

        ArrayList<Employee> employees = new ArrayList<>();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/dd/yyyy");

        for (int i = 1; i < filesLines.size(); i++) {

            String string = filesLines.get(i);
            String[] fields = string.split(";", -1);

            String id = fields[0];
            String namePrefix = fields[1];
            String firstName = fields[2];
            String midleInitial = fields[3];
            String lastName = fields[4];
            String gender = fields[5];
            String email = fields[6];
            String date = fields[7];
            LocalDate dateOfBirth = LocalDate.parse(date, dateTimeFormatter);
            String ssn = fields[8];
            String phoneNumber = fields[9];
            String place = fields[10];
            String county = fields[11];
            String city = fields[12];
            String state = fields[13];
            String zipcode = fields[14];
            String region = fields[15];


            Employee employee = new Employee(id, namePrefix, firstName, midleInitial, lastName,
                    gender, email, dateOfBirth, ssn, phoneNumber, place, county, city, state, zipcode, region);

            employees.add(employee);
        }
        return employees;
    }
}
