package code.vn.reponsitory;

import code.vn.model.Product;

import java.util.List;

public interface ProductReponsitory {
    List<Product> findAll();
    void add(Product product);
    Product findById(int id);
    void update(Product product);
    void delete(Product product);

}
