package vn.ltk.websiteBookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;
@Entity
@Data
@Table(name = "order_")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderID;
    @Column(name = "date_create")
    private Date dateCreate;
    @Column(name = "billing_address")
    private String billingAddress;
    @Column(name = "receiving_address")
    private String receivingAddress;
    @Column(name = "total_product")
    private double totalProduct;
    @Column(name = "shipping_fee")
    private double shippingFee;
    @Column(name = "payment_fee")
    private double paymentFee;
    @Column(name = "total")
    private double Total;
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetailsList;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "delivery_method_id")
    private DeliveryMethod deliveryMethod;
}
