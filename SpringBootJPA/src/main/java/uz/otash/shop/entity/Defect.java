package uz.otash.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.otash.shop.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Defect extends AbsEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    private Warehouse warehouse;

    private boolean approved;

    @ManyToOne(fetch = FetchType.LAZY)
    private User approvedBy;

}
