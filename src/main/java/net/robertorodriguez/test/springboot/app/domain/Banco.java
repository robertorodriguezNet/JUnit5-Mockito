package net.robertorodriguez.test.springboot.app.domain;

public class Banco {

    private Long   id;
    private String banco;
    private int    totalTransferencia;

    public Banco() {
    }

    public Banco(Long id, String banco, Integer totalTransferencia) {
        this.id = id;
        this.banco = banco;
        this.totalTransferencia = totalTransferencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getTotalTransferencia() {
        return totalTransferencia;
    }

    public void setTotalTransferencia(int totalTransferencia) {
        this.totalTransferencia = totalTransferencia;
    }


}
