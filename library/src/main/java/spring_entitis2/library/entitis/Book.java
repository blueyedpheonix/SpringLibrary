package spring_entitis2.library.entitis;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PUBLISHER_DATE", nullable = false)
    private LocalDate publisherDate;

    @ManyToOne
    @JoinColumn(name = "auther_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Auther auther;

    @ManyToMany(mappedBy = "books")
    private List<Customer> b
}
