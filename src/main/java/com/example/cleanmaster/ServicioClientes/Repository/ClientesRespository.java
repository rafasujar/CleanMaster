package com.example.cleanmaster.ServicioClientes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.example.cleanmaster.ServicioClientes.Models.ClientesEntity;
@Repository
public interface ClientesRespository extends JpaRepository<ClientesEntity , Long > {
}
