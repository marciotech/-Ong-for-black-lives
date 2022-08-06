package org.ong.ongforblacklives.exceptions;

import java.util.List;

public class ErrorResponse {

    private String titulo;
    private int status;
    private List<Campos> campos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Campos> getCampos() {
        return campos;
    }

    public void setCampos(List<Campos> campos) {
        this.campos = campos;
    }

    public ErrorResponse() {
    }

    public static class Campos {

        private String nome;
        private String mensagem;

        public Campos(String nome, String mensagem) {
            this.nome = nome;
            this.mensagem = mensagem;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMensagem() {
            return mensagem;
        }

        public void setMensagem(String mensagem) {
            this.mensagem = mensagem;
        }
    }
}
