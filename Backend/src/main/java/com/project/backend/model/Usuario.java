package com.project.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    @Column
    private int id_u;

    @Column
    private String nombre_u;

    @Column
    private String apellido_u;

    @Column
    private String correo_u;

    @Column
    private String telefono_u;
}