package udb.net.mod1.examen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	BookRepo repositorio;

//@Transactional
	public List<Book> buscarTodos() {
		return repositorio.buscarTodos();
	}

//@Transactional
	public void borrar(Book book) {
		repositorio.borrar(book);
	}

//@Transactional(propagation = Propagation.NEVER)
	public void insertar(Book book) {
		repositorio.insertar(book);
	}

//@Transactional
	public void actualizar(Book book) {
		repositorio.actualizar(book);
	}

//@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insertarVarios(Book book1, Book book2) {
		insertar(book1);
		insertar(book2);
	}
}