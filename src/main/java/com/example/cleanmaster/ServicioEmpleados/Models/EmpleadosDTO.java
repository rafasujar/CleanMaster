package com.example.cleanmaster.ServicioEmpleados.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class EmpleadosDTO {

    private int id;

    private String nombre;

    private String email;

    private String movil;

    private String password;

    private String numSs;

    private String rol;

    public static  EmpleadosDTO ConvertToDTO(EmpleadosEntity entity){
        EmpleadosDTO dto = new EmpleadosDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setEmail(entity.getEmail());
        dto.setMovil(entity.getMovil());
        dto.setPassword(entity.getPassword());
        dto.setNumSs(entity.getNumSs());
        dto.setRol(entity.getRol());
        return dto;
    }
    public static EmpleadosEntity ConvertToEntity(EmpleadosDTO dto){
        EmpleadosEntity entity = new EmpleadosEntity();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setEmail(dto.getEmail());
        entity.setMovil(dto.getMovil());
        entity.setPassword(dto.getPassword());
        entity.setNumSs(dto.getNumSs());
        entity.setRol(dto.getRol());
        return entity;
    }

}
