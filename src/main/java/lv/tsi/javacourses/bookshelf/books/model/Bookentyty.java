package lv.tsi.javacourses.bookshelf.books.model;

public class Bookentyty {


import javax.persistence.*;
import java.io.Serializable;

    @Entity(name = "Book")
// nazvanije tablici
    @Table(name = "books")
    public class bookEntity implements Serializable {
        @Id
        @GeneratedValue
        private Long id;
//    primary key = null,

        @Column(name = "title", length = 200, unique = true, nulleble = false)

        private String title;

        @Column(name = "isbn",length = 50, nulleble = false)
        private String isbn;

        @Column(name = "author", length = 250, nulleble = false)
        private String author;

        @Column(name = "year", nulleble = false)
        private Integer year;

        @Column(name = "description", length = 1000, nulleble = true)
        private String description;





        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public Role getRoleName() {
            return roleName;
        }

        public void setRoleName(Role roleName) {
            this.roleName = roleName;
        }

        @Enumerated(EnumType.STRING)
        private Role roleName;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
