package com.example.demo.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class Categories{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name="image")
    private String image;
    @OneToMany(mappedBy="category")
    private List<Product> products;
    
    public Categories(){}
    public Categories(long id,String name,String image){
        this.id=id;
        this.name=name;
        this.image=image;
    }
    public Categories(long id,String name,String image,List<Product> products){
        this.id=id;
        this.name=name;
        this.image=image;
        this.products=products;
    }
    public Categories(String name,String image){
        this.name=name;
        this.image=image;
    }
    public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getImage() {
    return image;
}

public void setImage(String image) {
    this.image = image;
}
}