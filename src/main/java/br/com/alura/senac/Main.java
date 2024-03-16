package br.com.alura.senac;

import br.com.alura.senac.dao.FabricanteDao;
import br.com.alura.senac.dao.ProdutoDao;
import br.com.alura.senac.modelo.Fabricante;
import br.com.alura.senac.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Semana-7-Farmacia");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();

        FabricanteDao fabricanteDao = new FabricanteDao(em);
        ProdutoDao produtoDao = new ProdutoDao(em);

        Fabricante fabricante = new Fabricante("Neo quimica");
        fabricanteDao.cadrastrar(fabricante);

        Produto produto = new Produto("Doril", "Para dor de cabeça","10","");
        produtoDao.cadrastar(produto);

        em.getTransaction().commit();
        em.close();

        }
    }