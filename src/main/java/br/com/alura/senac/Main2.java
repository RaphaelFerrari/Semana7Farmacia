package br.com.alura.senac;

import br.com.alura.senac.dao.ProdutoDao;
import br.com.alura.senac.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Semana-7-Farmacia");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        ProdutoDao produtoDao = new ProdutoDao(em);
        List<Produto> lista = List(produtoDao.listar());
        System.out.println(lista);

        em.getTransaction().commit();
        em.close();
    }
}
