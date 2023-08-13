package code.vn.serivce;

import code.vn.model.Product;
import code.vn.reponsitory.ProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductReponsitory productReponsitory;
    @Override
    public List<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public void add(Product product) {
        productReponsitory.add(product);
    }

    @Override
    public Product findById(int id) {
        return productReponsitory.findById(id);
    }

    @Override
    public void update(Product product) {
        productReponsitory.update(product);
    }

    @Override
    public void delete(Product product) {
        productReponsitory.delete(product);
    }
}
