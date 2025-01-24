package vn.ltk.websiteBookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "delivery_method")
public class DeliveryMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_method_id")
    private int deliveryMethodID;
    @Column(name = "delivery_method_name")
    private String deliveryMethodName;
    @Column(name = "description")
    private String Description;
    @Column(name = "shipping_fee")
    private double shippingFee;
    @OneToMany(mappedBy = "deliveryMethod",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Order> orderList;
}
