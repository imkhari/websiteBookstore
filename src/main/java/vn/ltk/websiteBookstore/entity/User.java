package vn.ltk.websiteBookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userID;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password", length = 512)
    private String Password;
    @Column(name = "email", length = 512)
    private String Email;
    @Column(name = "sex")
    private char Sex;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "billing_address")
    private String billingAddress;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Evaluation> evaluationList;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Wish> wishList;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinTable(
            name = "user_authority",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Authority> authorityList;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<Order> orderList;
}
