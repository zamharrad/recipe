package com.rad.recipe.controller;

import com.rad.recipe.model.Category;
import com.rad.recipe.model.UnitOfMeasure;
import com.rad.recipe.repositories.CategoryRepository;
import com.rad.recipe.repositories.RecipeRepository;
import com.rad.recipe.repositories.UnitOfMeasureRepository;
import com.rad.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.Fidelity;
import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("getting index page");
        model.addAttribute("recipes",recipeService.getRecipe());
        return "index";
    }



}
