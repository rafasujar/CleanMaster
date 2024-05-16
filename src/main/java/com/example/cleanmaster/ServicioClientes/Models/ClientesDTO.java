package com.example.cleanmaster.ServicioClientes.Models;

import lombok.Data;

@Data
public class ClientesDTO {
    private int id;
    private String nombre;
    private String direccion;
    private String email;
    private String movil;
    private String password;


    public static ClientesDTO ConvertToDTO(ClientesEntity entity){
        ClientesDTO dto = new ClientesDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setDireccion(entity.getDireccion());
        dto.setEmail(entity.getEmail());
        dto.setMovil(entity.getMovil());
        dto.setPassword(entity.getPassword());
        return dto;
    }

    public static ClientesEntity ConvertToEntity(ClientesDTO dto){
        ClientesEntity entity = new ClientesEntity();
        entity.setId(dto.getId());
        entity.setNombre(dto.getNombre());
        entity.setDireccion(dto.getDireccion());
        entity.setEmail(dto.getEmail());
        entity.setMovil(dto.getMovil());
        entity.setPassword(dto.getPassword());
        return entity;
    }

}
