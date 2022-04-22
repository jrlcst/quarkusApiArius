package io.github.jrlcst.quarkusjrlcst.domain.model;


import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cupom")
public class Cupom extends PanacheEntityBase {

    @Column(name = "nroloja")
    private Integer numLoja;


    @Column(name =  "NroCupom")
    private Integer numCupom;

    @Column(name = "Pdv")
    private Integer numPdv;

    @Id
    @Column(name = "HoraMinSeg")
    private Date datahora;

    @Column(name = "NroItens")
    private Integer numItens;

    @Column(name = "total")
    private Double total;

    @Column(name = "Troco")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cupom cupom = (Cupom) o;
        return Objects.equals(numLoja, cupom.numLoja) && Objects.equals(numCupom, cupom.numCupom) && Objects.equals(numPdv, cupom.numPdv) && Objects.equals(datahora, cupom.datahora) && Objects.equals(numItens, cupom.numItens) && Objects.equals(total, cupom.total) && Objects.equals(troco, cupom.troco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numLoja, numCupom, numPdv, datahora, numItens, total, troco);
    }

}
