package com.example.cleanmaster.ServicioEmpleados.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados", schema = "cleanmaster", catalog = "")
public class EmpleadosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "Movil")
    private String movil;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "NumSS")
    private String numSs;
    @Basic
    @Column(name = "Rol")
    private String rol;

}
