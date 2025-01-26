package vn.ltk.websiteBookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageID;
    @Column(name = "image_name", length = 256)
    private String imageName;
    @Column(name = "icon")
    private boolean Icon;
    @Column(name = "link")
    private String Link;
    @Column(name = "data")
    private String Data;
    @ManyToOne(cascade = {
            CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH
    })
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}
