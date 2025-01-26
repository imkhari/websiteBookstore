package vn.ltk.websiteBookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_method_id")
    private int paymentMethodID;
    @Column(name = "payment_method_name")
    private String paymentMethodName;
    @Column(name = "description")
    private String Description;
    @Column(name = "payment_fee")
    private double paymentFee;
    @OneToMany(mappedBy = "paymentMethod",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Order> orderList;
}
