/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author MediaStudio
 */
public class Artiste {
    private int id;
    private String firstname;
    private String lastname;
    private String birthplace;
    private Date birthdate;
    private String description;
    private String image;
    private String address;
    private String phonenumber;
    private String email;
    private String username;
    private String password;

    public Artiste() {
    }

    public Artiste(String firstname, String lastname, String birthplace, Date birthdate, String description, String image, String address, String phonenumber, String email, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthplace = birthplace;
        this.birthdate = birthdate;
        this.description = description;
        this.image = image;
        this.address = address;
        this.phonenumber = phonenumber; 
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Artiste(int id, String firstname, String lastname, String birthplace, Date birthdate, String description, String image, String address, String phonenumber, String email, String username, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthplace = birthplace;
        this.birthdate = birthdate;
        this.description = description;
        this.image = image;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Artiste{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", birthplace=" + birthplace + ", birthdate=" + birthdate + ", description=" + description + ", image=" + image + ", address=" + address + ", phonenumber=" + phonenumber + ", username=" + username + ", password=" + password + ", email=" + email + '}';
    }
    
    
    
    
    
    
}