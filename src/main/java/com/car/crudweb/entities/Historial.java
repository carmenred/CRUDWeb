package com.car.crudweb.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "historial", schema = "notaslinkia2")
public class Historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 25)
    @NotNull
    @Column(name = "tipo", nullable = false, length = 25)
    private String tipo;

    @NotNull
    @Column(name = "user", nullable = false)
    private Integer user;

    @Size(max = 50)
    @NotNull
    @Column(name = "detalle", nullable = false, length = 50)
    private String detalle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

}