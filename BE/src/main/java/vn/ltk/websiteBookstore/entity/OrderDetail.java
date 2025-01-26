package vn.ltk.websiteBookstore.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_details_id")
    private long orderDetailsID;
    @Column(name = "quantity")
    private int Quantity;
    @Column(name = "selling_price")
    private double sellingPrice;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
