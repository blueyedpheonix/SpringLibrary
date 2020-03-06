package spring_entitis2.library.entitis;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AUTHER")
public class Auther {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false, unique = true)
    private String Fname;

    @Column(name = "last_name", nullable = false)
    private String Lname;

    @OneToMany(mappedBy = "auther", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    public Auther (){}

    public Auther(Long id,String fname, String lname) {
        Fname = fname;
        Lname = lname;
        this.id = id;
    }

    public Auther(String fname, String lname) {
        Fname = fname;
        Lname = lname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Auther{" +
                "id=" + id +
                ", Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", books=" + books +
                '}';
    }
}
