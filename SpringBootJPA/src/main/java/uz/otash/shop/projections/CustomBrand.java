package uz.otash.shop.projections;

import org.springframework.data.rest.core.config.Projection;
import uz.otash.shop.entity.Brand;

@Projection(types = Brand.class)
public interface CustomBrand {
    Integer getId();
    String getName();
}
