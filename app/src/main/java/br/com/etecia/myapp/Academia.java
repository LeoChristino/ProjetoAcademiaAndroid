package br.com.etecia.myapp;

public class Academia {
    private String titulo;
    private String descricao;
    private String nota;
    private int imgAcademia;

    //método construtor

    public Academia() {
    }

    //método get e set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getImgAcademia() {
        return imgAcademia;
    }

    public void setImgAcademia(int imgAcademia) {
        this.imgAcademia = imgAcademia;
    }
}
