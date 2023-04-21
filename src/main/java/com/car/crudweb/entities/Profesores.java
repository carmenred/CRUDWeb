package com.car.crudweb.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "profesores", schema = "notaslinkia2")
public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 25)
    @NotNull
    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Size(max = 25)
    @NotNull
    @Column(name = "nom_user", nullable = false, length = 25)
    private String nomUser;

    @Size(max = 25)
    @NotNull
    @Column(name = "password", nullable = false, length = 25)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}