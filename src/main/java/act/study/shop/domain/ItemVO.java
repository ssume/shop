package act.study.shop.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "item")
public class ItemVO {

    @Id
    @Column(name="item_id")
    private Long itemId;

    @Column(name="category_id")
    private Long categoryId;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_price")
    private Long itemPrice;

    @Column(name="item_info")
    private String itemInfo;

    @Column(name="item_stock")
    private Long itemStock;

    @Column(name="item_enroll")
    private Date itemEnroll;

    @Column(name="item_sell")
    private Long itemSell;

    @Column(name="sell_period")
    private Date itemPeriod;

    @Column(name="item_size")
    private Long itemSize;

}
