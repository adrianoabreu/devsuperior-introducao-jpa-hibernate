package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(1,"Adriano Abreu","adrianogemeo@gmail.com");
		//Pessoa p2 = new Pessoa(2,"Andre Abreu","andregemeo@gmail.com");
		//Pessoa p3 = new Pessoa(3,"Vera Lourenco","vera.elisa87@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager        em  = emf.createEntityManager(); 

// INSERINDO DADOS BANCO DE DADOS NO MYSQL	
//		Pessoa p1 = new Pessoa(null,"Adriano Abreu","adrianogemeo@gmail.com");
//		Pessoa p2 = new Pessoa(null,"Andre Abreu","andregemeo@gmail.com");/
//		Pessoa p3 = new Pessoa(null,"Vera Lourenco","vera.elisa87@gmail.com");
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();		
//		System.out.println("Feito!");
		
// BUSCANDO UMA PESSOA DO BANCO DE DADOS MYSQL
//		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);
		
// DELETANDO UMA PESSOA DO BANCO DE DADOS MYSQL
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Feito!");
		
		em.close();
		emf.close();
		
		//System.out.println(p1);
		//System.out.println(p2);
		//System.out.println(p3);
	}

}
