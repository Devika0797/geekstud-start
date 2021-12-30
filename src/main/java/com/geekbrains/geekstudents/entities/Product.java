package com.geekbrains.geekstudents.entities;


import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", insertable = false, updatable = false)
    private Long id;

    @Column(name = "item")
    private String item;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Product(){
    }

    public Product(Long cat_id, String item) {
        this.id = cat_id;
        this.item = item;
    }

    // get set

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
