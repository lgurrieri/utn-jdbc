package edu.utn.frsr.models;

import java.time.LocalDate;

/**
 * @@author Luis gurrieri
 * Employee  - A class that representes an employee record.
 *
 */
public class Employee implements Comparable<Employee> {

    private String id;
    private String namePrefix;
    private String firstName;
    private String midleInitial;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate dateOfBirth;
    private String ssn;
    private String phoneNumber;
    private String place;
    private String county;
    private String city;
    private String state;
    private String zipcode;
    private String region;


    /**
     * @param id
     * @param namePrefix
     * @param midleInitial
     * @param lastName
     * @param gender
     * @param email
     * @param dateOfBirth
     * @param ssn          is the Securrity social number of the employee
     * @param phoneNumber
     * @param place
     * @param county
     * @param city
     * @param state
     * @param zipcode
     * @param region
     */
    public Employee(String id, String namePrefix, String firstName, String midleInitial, String lastName, String gender, String email,
                    LocalDate dateOfBirth, String ssn, String phoneNumber, String place, String county, String city,
                    String state, String zipcode, String region) {
        this.id = id;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.midleInitial = midleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.place = place;
        this.county = county;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.region = region;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the namePrefix
     */
    public String getNamePrefix() {
        return namePrefix;
    }

    /**
     * @param namePrefix the namePrefix to set
     */
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the midleInitial
     */
    public String getMidleInitial() {
        return midleInitial;
    }

    /**
     * @param midleInitial the midleInitial to set
     */
    public void setMidleInitial(String midleInitial) {
        this.midleInitial = midleInitial;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dateOfBirth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Employee [city=" + city + ", county=" + county + ", dateOfBirth=" + dateOfBirth + ", email=" + email
                + ", firstName=" + firstName + ", gender=" + gender + ", id=" + id + ", lastName=" + lastName
                + ", midleInitial=" + midleInitial + ", namePrefix=" + namePrefix + ", phoneNumber=" + phoneNumber
                + ", place=" + place + ", region=" + region + ", ssn=" + ssn + ", state=" + state + ", zipcode="
                + zipcode + "]";
    }

    @Override
    public int compareTo(Employee employee) {
        // TODO Auto-generated method stub
        return lastName.compareTo(employee.lastName);
    }
}
