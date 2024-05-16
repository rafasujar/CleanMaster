package com.example.cleanmaster.ServicioClientes.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes", schema = "cleanmaster", catalog = "")
public class ClientesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "direccion")
    private String direccion;
    @Basic
    @Column(name = "Email")
    private String email;
    @Basic
    @Column(name = "Movil")
    private String movil;
    @Basic
    @Column(name = "password")
    private String password;

}
