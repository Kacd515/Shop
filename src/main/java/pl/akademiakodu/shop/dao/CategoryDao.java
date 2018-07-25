package pl.akademiakodu.shop.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.shop.model.Category;

public interface CategoryDao extends CrudRepository<Category, Integer> {
}
