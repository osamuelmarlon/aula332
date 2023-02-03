package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //cria um EntityManager
		EntityManager em = emf.createEntityManager(); //responsável por fazer a inserção, alteração, consulta, exclusão e representa a conexão
		
		Usuario novoUsuario = new Usuario("Djalma", "djalma@lanche.com.br");
		novoUsuario.setId(1L);
		em.persist(novoUsuario);//comando para persistir no banco
		
		em.close();
		emf.close();
	}
}
