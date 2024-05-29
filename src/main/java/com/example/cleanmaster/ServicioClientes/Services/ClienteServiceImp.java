package com.example.cleanmaster.ServicioClientes.Services;

import com.example.cleanmaster.ServicioClientes.Models.ClientesDTO;
import com.example.cleanmaster.ServicioClientes.Models.ClientesEntity;
import com.example.cleanmaster.ServicioClientes.Repository.ClientesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClientesServices {

    @Autowired
    private ClientesRespository clientesRespository;

    @Override
    public boolean addClinte(ClientesDTO cliente) {
        ClientesEntity clientesEntity = ClientesDTO.ConvertToEntity(cliente);
        clientesRespository.save(clientesEntity);
        if (clientesRespository.getClientebyemail(clientesEntity.getEmail())
            return true;
        else
            return false;
    }

    @Override
    public boolean updateCliente(ClientesDTO cliente) {
        return false;

    }

    @Override
    public boolean deleteCliente(ClientesDTO cliente) {
        return false;

    }

    @Override
    public ClientesDTO getClientebyemail(String email) {
        return null;
    }
}
