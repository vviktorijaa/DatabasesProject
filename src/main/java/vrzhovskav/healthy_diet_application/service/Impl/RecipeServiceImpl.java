package vrzhovskav.healthy_diet_application.service.Impl;

import org.springframework.stereotype.Service;
import vrzhovskav.healthy_diet_application.model.Category;
import vrzhovskav.healthy_diet_application.model.Recipe;
import vrzhovskav.healthy_diet_application.model.exceptions.CategoryNotFoundException;
import vrzhovskav.healthy_diet_application.model.exceptions.RecipeNotFound;
import vrzhovskav.healthy_diet_application.repository.jpa.CategoryRepository;
import vrzhovskav.healthy_diet_application.repository.jpa.RecipeRepository;
import vrzhovskav.healthy_diet_application.service.RecipeService;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final CategoryRepository categoryRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Recipe> findAll() {
        return this.recipeRepository.findAll();
    }

//    @Override
//    public List<Recipe> findAllByNameOrCategory(String text, Integer c) {
//        Category cat = this.categoryRepository.findById(c).orElseThrow(CategoryNotFoundException::new);
//        String catName = cat.getCategory_name();
//        if(text!=null && catName != null){
//            return this.recipeRepository.findAllByNameAndRecipeIsInCategory(text, catName);
//        }
//        else if(text!=null){
//            return this.recipeRepository.findAllByNameLike("%"+text+"%");
//        }
//        else if(catName!=null){
//            return this.recipeRepository.findAllByRecipeIsInCategory(catName);
//        }
//        else{
//            return recipeRepository.findAll();
//        }
//    }
//
//    @Override
//    public List<Recipe> findAllByCategory(Integer c) {
//        Category cat = this.categoryRepository.findById(c).orElseThrow(CategoryNotFoundException::new);
//        String catName = cat.getCategory_name();
//
//        if(catName != null){
//            return this.recipeRepository.findAllByRecipeIsInCategory(catName);
//        }
//        else{
//            return this.recipeRepository.findAll();
//        }
//    }


    @Override
    public Recipe findById(Integer id) {
        return this.recipeRepository.findById(id).orElseThrow(RecipeNotFound::new);
    }
}
