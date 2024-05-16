package com.example.cleanmaster.ServicioClientes.Services;

import com.example.cleanmaster.ServicioClientes.Models.ClientesDTO;
import com.example.cleanmaster.ServicioClientes.Repository.ClientesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClientesServices {

    @Autowired
    private ClientesRespository clientesRespository;

    @Override
    public void addClinte(ClientesDTO cliente) {

    }

    @Override
    public void updateCliente(ClientesDTO cliente) {

    }

    @Override
    public void deleteCliente(ClientesDTO cliente) {

    }

    @Override
    public ClientesDTO getClientebyemail(String email) {
        return null;
    }
}
