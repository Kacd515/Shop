package pl.akademiakodu.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.shop.model.Category;
import pl.akademiakodu.shop.dao.CategoryDao;

@Controller
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @GetMapping("/category/form")
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("category", new Category());
        return "category/add";
    }

    @PostMapping("/category/add")
    public String create(@ModelAttribute Category category) {
        categoryDao.save(category);
        return "redirect:/category/all";
    }

    @GetMapping("/category/all")
    public String findAll(ModelMap modelMap) {
        modelMap.addAttribute("categories", categoryDao.findAll());
        return "category/all";
    }

    @GetMapping("/category/{id}")
    public  String show(@PathVariable Integer id, ModelMap modelMap) {
        modelMap.put("category", categoryDao.findById(id).get());
        return "category/show";
    }

}
