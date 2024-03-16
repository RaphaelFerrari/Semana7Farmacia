package br.com.alura.senac.modelo;

import javax.persistence.*;

@Entity
@Table (name = "produtos")

    public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String nome;
    private String descricao;
    private String preco;
    @ManyToOne
    private String fabricante;

    public Produto() {}

    public Produto(String nome, String descricao, String preco, String fabricante) {
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
            this.fabricante = fabricante;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getPreco() {
            return preco;
        }

        public void setPreco(String preco) {
            this.preco = preco;
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(Fabricante fabricante) {
            this.fabricante = String.valueOf(fabricante);
        }

        @Override
        public String toString() {
            return "Produto{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", descricao='" + descricao + '\'' +
                    '}';
        }
    }
