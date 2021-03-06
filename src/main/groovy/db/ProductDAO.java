package db;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllProducts();

    Product findProductById(int id);

    void insertProduct(Product p);

    void deleteProduct(int id);
}
