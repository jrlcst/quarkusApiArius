package io.github.jrlcst.quarkusjrlcst.dto;

import java.util.Date;

public class CupomRequest {

    private Long id;
    private Integer numLoja;
    private Integer numCupom;
    private Integer numPdv;
    private Date datahora;
    private Integer numItens;
    private Double total;
    private Double troco;


    public Integer getNumLoja() {
        return numLoja;
    }

    public void setNumLoja(Integer numLoja) {
        this.numLoja = numLoja;
    }

    public Integer getNumCupom() {
        return numCupom;
    }

    public void setNumCupom(Integer numCupom) {
        this.numCupom = numCupom;
    }

    public Integer getNumPdv() {
        return numPdv;
    }

    public void setNumPdv(Integer numPdv) {
        this.numPdv = numPdv;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    public Integer getNumItens() {
        return numItens;
    }

    public void setNumItens(Integer numItens) {
        this.numItens = numItens;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTroco() {
        return troco;
    }

    public void setTroco(Double troco) {
        this.troco = troco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
