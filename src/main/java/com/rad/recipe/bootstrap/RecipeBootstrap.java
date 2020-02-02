package com.rad.recipe.bootstrap;

import com.rad.recipe.model.Recipe;
import com.rad.recipe.model.UnitOfMeasure;
import com.rad.recipe.repositories.CategoryRepository;
import com.rad.recipe.repositories.RecipeRepository;
import com.rad.recipe.repositories.UnitOfMeasureRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RecipeBootstrap {

    private final RecipeRepository recipeRepository;
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public RecipeBootstrap(RecipeRepository recipeRepository, CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    private List<Recipe> getRecipes(){

        List<Recipe> recipes = new ArrayList<>(2);

        // Get unit of measures
        Optional<UnitOfMeasure> echoUnitOfMeaseurOpional = unitOfMeasureRepository.findByDescription("each");

        if (!echoUnitOfMeaseurOpional.isPresent()){
            throw new RuntimeException("Expected UOM not found");
        }
        return recipes;
    }
}
