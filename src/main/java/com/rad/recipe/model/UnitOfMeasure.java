package com.rad.recipe.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

//    @OneToMany
//    private Ingredient ingredient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Ingredient getIngredient() {
//        return ingredient;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public void setIngredient(Ingredient ingredient) {
//        this.ingredient = ingredient;
//    }
}
