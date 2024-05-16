package com.example.cleanmaster.ServicioMensajeria.Models;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class MensajesDTO {

    private int id;

    private Date fecha;

    private Time hora;

    private Integer idEmpleado;

    private Integer idCliente;

    private String mensaje;

    public static MensajesDTO fromEntity(MensajesEntity entity) {
        MensajesDTO dto = new MensajesDTO();
        dto.setId(entity.getId());
        dto.setFecha(entity.getFecha());
        dto.setHora(entity.getHora());
        dto.setIdEmpleado(entity.getIdEmpleado());
        dto.setIdCliente(entity.getIdCliente());
        dto.setMensaje(entity.getMensaje());
        return dto;
    }
    public static MensajesEntity toEntity(MensajesDTO dto) {
        MensajesEntity entity = new MensajesEntity();
        entity.setId(dto.getId());
        entity.setFecha(dto.getFecha());
        entity.setHora(dto.getHora());
        entity.setIdEmpleado(dto.getIdEmpleado());
        entity.setIdCliente(dto.getIdCliente());
        entity.setMensaje(dto.getMensaje());
        return entity;
    }

}
