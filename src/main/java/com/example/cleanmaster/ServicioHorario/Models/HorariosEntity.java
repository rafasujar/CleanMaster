package com.example.cleanmaster.ServicioHorario.Models;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "horarios", schema = "cleanmaster", catalog = "")
public class HorariosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Fecha")
    private Date fecha;
    @Basic
    @Column(name = "HoraInicio")
    private Time horaInicio;
    @Basic
    @Column(name = "HoraFin")
    private Time horaFin;
    @Basic
    @Column(name = "ID_Empleado")
    private Integer idEmpleado;
    @Basic
    @Column(name = "ID_Cliente")
    private Integer idCliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HorariosEntity that = (HorariosEntity) o;

        if (id != that.id) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (horaInicio != null ? !horaInicio.equals(that.horaInicio) : that.horaInicio != null) return false;
        if (horaFin != null ? !horaFin.equals(that.horaFin) : that.horaFin != null) return false;
        if (idEmpleado != null ? !idEmpleado.equals(that.idEmpleado) : that.idEmpleado != null) return false;
        if (idCliente != null ? !idCliente.equals(that.idCliente) : that.idCliente != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (horaInicio != null ? horaInicio.hashCode() : 0);
        result = 31 * result + (horaFin != null ? horaFin.hashCode() : 0);
        result = 31 * result + (idEmpleado != null ? idEmpleado.hashCode() : 0);
        result = 31 * result + (idCliente != null ? idCliente.hashCode() : 0);
        return result;
    }
}
