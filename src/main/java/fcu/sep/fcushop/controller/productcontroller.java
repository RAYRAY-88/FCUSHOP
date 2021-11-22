package fcu.sep.fcushop.controller;


import fcu.sep.fcushop.model.Product;
import fcu.sep.fcushop.service.productservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class productcontroller {

  @Autowired
  productservice productmanager;

  @GetMapping("/products")
  public List<Product> getproducts() {

    return productmanager.getProducts();
  }


}
