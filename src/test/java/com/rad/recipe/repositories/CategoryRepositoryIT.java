package com.rad.recipe.repositories;

import com.rad.recipe.model.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class CategoryRepositoryIT {

    @Autowired
    CategoryRepository categoryRepository;

    @BeforeEach
    void setUp () throws Exception {
    }

    @Test
    @DirtiesContext
    public void findByDescription()  throws Exception{
        Optional<Category> optionalCategory= categoryRepository.findByDescription("American");

        assertEquals("American",optionalCategory.get().getDescription());
    }

    @Test
    public void findByDescriptionTeaspoon()  throws Exception{
        Optional<Category> optionalCategory= categoryRepository.findByDescription("Mexican");

        assertEquals("Mexican",optionalCategory.get().getDescription());
    }
}