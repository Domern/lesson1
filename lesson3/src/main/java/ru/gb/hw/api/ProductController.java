package ru.gb.hw.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.hw.model.Product;
import ru.gb.hw.model.ProductsRepositori;

import java.util.ArrayList;
import java.util.List;

@Controller
@Component
@RequestMapping("/products")
public class ProductController {
    private final ProductsRepositori productsRepositori;
    private List<Product> products=new ArrayList<>();

    public ProductController(ProductsRepositori productsRepositori) {
        products.addAll(productsRepositori.getProducts());
        this.productsRepositori = productsRepositori;
    }

    @GetMapping
    public String getProducts(Model model) {
        model.addAttribute("productsList",products);
        return "products";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getProduct(@PathVariable int id){
        Product product=productsRepositori.getProductById(id);
        return product.getId()+": "+product.getTitle()+": "+ product.getCoast();
    }

    @GetMapping("/add")
    @ResponseBody
    public String addProduct(@RequestParam Integer id, String title, Integer coast){
        Product product=new Product(id,title,coast);
        products.add(product);
        productsRepositori.setProducts(products);
        return "Add product: "+id+" "+title+" "+coast;
    }
}
