package udb.net.mod1.examen;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookRepo {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public List<Book> buscarTodos() {
		TypedQuery<Book> queryJpa = em.createQuery("select b from Book b", Book.class);
		return queryJpa.getResultList();
	}

	@Transactional
	public void borrar(Book book) {
		em.remove(em.merge(book));
	}

	@Transactional
	public void insertar(Book book) {
		em.persist(book);
	}

	@Transactional
	public void actualizar(Book book) {
		em.merge(book);
	}
}
