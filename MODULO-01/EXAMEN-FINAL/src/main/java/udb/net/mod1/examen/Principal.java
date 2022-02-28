package udb.net.mod1.examen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ConfiguradorSpring.class);

		BookService bookService = contexto.getBean(BookService.class);

		Book book1 = new Book(1, "Aprenda Java como en primero.", "Carlos Lemus", "MASCULINO", 10);
		Book book2 = new Book(2, "La biblia del Linux.", "Linus Torvald", "MASCULINO", 15);
		Book book3 = new Book(3, "Ingenieria Social", "Kevin Mitnick", "MASCULINO", 100);

		bookService.insertar(book1);
		bookService.insertar(book2);
		bookService.insertar(book3);

		for (Book book : bookService.buscarTodos()) {
			System.out.println("Id: " + book.getIdBook());
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("Gender: " + book.getGender());
			System.out.println("Stock: " + book.getStock());
			System.out.println("********************************************************************************");
		}
		contexto.close();
	}
}
