package com.example.demo.dto;
public class RegisterRequest {
    private String firstname;
    private String lastname;    
    private String email;
    private String password;
    public RegisterRequest() {
    }

    public RegisterRequest(String email, String password, String firstname, String lastname) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        
    }
    public String getLastname() {
        return lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getPassword() {
        return password;
    }
  
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}

  



