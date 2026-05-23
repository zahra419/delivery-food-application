
package com.example.demo.dto;

public class LoginResponse {
    private String token;
    private String firstname;
    private String lastname;    
    private String email;
    private Long id;

    public LoginResponse() {
    }
    
    public LoginResponse(String email, String firstname, String lastname,Long id) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;       
    }
    public String getLastname() {
        return lastname;
    }
    public String getFirstname() {
        return firstname;
    }
    public Long getId() {
        return id ;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public LoginResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

  



