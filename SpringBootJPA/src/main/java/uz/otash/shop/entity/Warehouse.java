package uz.otash.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.otash.shop.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Warehouse extends AbsEntity {
    @Column(nullable = false,unique = true)
    private String name;

    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    private Shop shop;

    @ManyToOne(fetch = FetchType.LAZY)
    private User keeper;

    public Warehouse(String name, String address, User keeper) {
        this.name = name;
        this.address = address;
        this.keeper = keeper;
    }

    public Warehouse(String name, String address, Shop shop) {
        this.name = name;
        this.address = address;
        this.shop = shop;
    }
}
