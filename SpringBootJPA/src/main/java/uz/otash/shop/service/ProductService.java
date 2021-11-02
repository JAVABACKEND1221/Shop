package uz.otash.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uz.otash.shop.entity.Product;
import uz.otash.shop.payload.ApiResponse;
import uz.otash.shop.repository.ProductRepository;
import uz.otash.shop.utills.CommonUtills;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public List<Product> searchByName(String search) {
        return productRepository.findAllByNameStartsWithIgnoringCase(search);
    }

    public ApiResponse allByPageable(Integer page, Integer size) {
        Page<Product> productPage = productRepository.findAll(CommonUtills.simplePageable(page, size));
        return new ApiResponse("Ok",true,productPage.getContent().stream().map(product->DtoService.getProductDto(product)).collect(Collectors.toList()),productPage.getTotalElements());
    }
}
