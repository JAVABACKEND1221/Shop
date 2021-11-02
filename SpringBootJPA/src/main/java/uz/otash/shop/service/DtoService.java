package uz.otash.shop.service;

import uz.otash.shop.entity.Product;
import uz.otash.shop.payload.ProductDto;

public class DtoService {

    public static ProductDto getProductDto(Product product){
        return new ProductDto(product.getId(), product.getName());
    }
}
