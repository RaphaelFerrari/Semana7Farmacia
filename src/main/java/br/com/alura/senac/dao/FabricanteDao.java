package br.com.alura.senac.dao;

import br.com.alura.senac.modelo.Fabricante;

import javax.persistence.EntityManager;

public class FabricanteDao {
    private EntityManager em;
    public FabricanteDao (EntityManager em){
        this.em = em;
    }

    public void cadrastrar (Fabricante fabricante){
        this.em.persist(fabricante);

    }
}
