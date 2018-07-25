package pl.akademiakodu.shop.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.shop.model.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}
