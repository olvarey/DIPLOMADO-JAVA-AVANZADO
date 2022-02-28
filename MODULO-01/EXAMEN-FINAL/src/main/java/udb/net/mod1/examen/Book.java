package udb.net.mod1.examen;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@Column(name = "id_book")
	private Integer idBook;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "gender")
	private String gender;

	@Column(name = "stock")
	private Integer stock;

	public Book() {
		super();
	}

	public Book(Integer idBook, String title, String author, String gender, Integer stock) {
		super();
		this.idBook = idBook;
		this.title = title;
		this.author = author;
		this.gender = gender;
		this.stock = stock;
	}

	public Integer getIdBook() {
		return idBook;
	}

	public void setIdBook(Integer idBook) {
		this.idBook = idBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", title=" + title + ", author=" + author + ", gender=" + gender + ", stock="
				+ stock + "]";
	}
}
