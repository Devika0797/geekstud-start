package com.geekbrains.geekstudents.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long cat_id;

    @Column(name = "title")
    private String title;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
   List<Product> products;


    public Category(){
    }

    public Category(Long cat_id, String title) {
        this.cat_id = cat_id;
        this.title = title;
    }

    // get set

    public Long getCat_id() {
        return cat_id;
    }

    public void setCat_id(Long cat_id) {
        this.cat_id = cat_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
