package com.cotemig.championsOfStreet.championsOfStreet.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String descricao;
    private String local;
    private Integer maxJogadoresOuTimes;
    private String dataHora;
    private String tipoCampeonato;
    private Integer idEsporte;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getMaxJogadoresOuTimes() {
        return maxJogadoresOuTimes;
    }

    public void setMaxJogadoresOuTimes(Integer maxJogadoresOuTimes) {
        this.maxJogadoresOuTimes = maxJogadoresOuTimes;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipoCampeonato() {
        return tipoCampeonato;
    }

    public void setTipoCampeonato(String tipoCampeonato) {
        this.tipoCampeonato = tipoCampeonato;
    }

    public Integer getIdEsporte() {
        return idEsporte;
    }

    public void setIdEsporte(Integer idEsporte) {
        this.idEsporte = idEsporte;
    }
}
