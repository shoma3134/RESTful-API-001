package io.swagger.api;

import io.swagger.model.Products;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsApiControllerIntegrationTest {

    @Autowired
    private ProductsApi api;

    @Test
    public void addProductTest() throws Exception {
        Products body = new Products();
        ResponseEntity<Void> responseEntity = api.addProduct(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void deleteProductTest() throws Exception {
        Long id = 789L;
        ResponseEntity<Void> responseEntity = api.deleteProduct(id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void searchProductTest() throws Exception {
        Long id = 789L;
        String title = "title_example";
        String description = "description_example";
        Long price = 789L;
        ResponseEntity<List<Products>> responseEntity = api.searchProduct(id, title, description, price);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateProductTest() throws Exception {
        Products body = new Products();
        Long id = 789L;
        ResponseEntity<Void> responseEntity = api.updateProduct(body, id);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
