package uz.otash.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.otash.shop.payload.ApiResponse;
import uz.otash.shop.service.ProductService;
import uz.otash.shop.utills.AppConstatnce;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/searchByName/{search}")
    public HttpEntity<?> searchByName(@PathVariable String search){
        return ResponseEntity.status(200).body(productService.searchByName(search));
    }

    @GetMapping("/allByPageable")
    public HttpEntity<?> allByPageable(@RequestParam(defaultValue = AppConstatnce.DEFAULT_PAGE_NUMBER) Integer page,
                                       @RequestParam(defaultValue = AppConstatnce.DEFAULT_PAGE_SIZE) Integer size){
        ApiResponse apiResponse = productService.allByPageable(page, size);
        return ResponseEntity.status(apiResponse.isSuccess()?200:409).body(apiResponse);
    }
}
