package vn.ltk.websiteBookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookID;
    @Column(name = "book_name", length = 256)
    private String bookName;
    @Column(name = "author", length = 512)
    private String Author;
    @Column(name = "isbn", length = 256)
    private String ISBN;
    @Column(name = "description", columnDefinition = "text")
    private String Description;
    @Column(name = "listed_price")
    private double listedPrice;
    @Column(name = "selling_price")
    private double sellingPrice;
    @Column(name = "quantity")
    private int Quantity;
    @Column(name = "avg_rate")
    private double avgRate;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinTable(name = "book_catalog",
    joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "catalog_id")
    )
    private List<CatalogBook> catalogBookList;
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Image> imageList;
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Evaluation> evaluationList;
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    private List<OrderDetail> orderDetailsList;
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Wish> wishList;
}
