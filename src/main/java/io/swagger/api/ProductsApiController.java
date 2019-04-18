package io.swagger.api;

import io.swagger.model.Products;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-18T21:49:50.671Z[GMT]")
@Controller
public class ProductsApiController implements ProductsApi {

    private static final Logger log = LoggerFactory.getLogger(ProductsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addProduct(@ApiParam(value = "Product object that needs to be added" ,required=true )  @Valid @RequestBody Products body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteProduct(@ApiParam(value = "Product id to delete",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Products>> searchProduct(@ApiParam(value = "Title values that need to be considered for filter") @Valid @RequestParam(value = "id", required = false) Long id,@ApiParam(value = "Title values that need to be considered for filter") @Valid @RequestParam(value = "title", required = false) String title,@ApiParam(value = "Title values that need to be considered for filter") @Valid @RequestParam(value = "description", required = false) String description,@ApiParam(value = "Title values that need to be considered for filter") @Valid @RequestParam(value = "price", required = false) Long price) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<List<Products>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateProduct(@ApiParam(value = "Product object that needs to be added" ,required=true )  @Valid @RequestBody Products body,@ApiParam(value = "ID of product to return",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
