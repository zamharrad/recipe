package com.rad.recipe.controller;

import com.rad.recipe.model.Category;
import com.rad.recipe.model.UnitOfMeasure;
import com.rad.recipe.repositories.CategoryRepository;
import com.rad.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> optionalCategory = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Cat id is: "+ optionalCategory.get().getId());
        System.out.println("Unit id is: "+ optionalUnitOfMeasure.get().getId());
        return "index";
    }



}
