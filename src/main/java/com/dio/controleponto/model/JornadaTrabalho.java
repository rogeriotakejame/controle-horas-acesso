package com.dio.controleponto.model;

import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

//Implementação sem lombok
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

    public JornadaTrabalho(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public JornadaTrabalho() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JornadaTrabalho that = (JornadaTrabalho) o;
        return id == that.id && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }

}
