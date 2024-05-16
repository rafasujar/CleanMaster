package com.example.cleanmaster.ServicioClientes.Services;

import com.example.cleanmaster.ServicioClientes.Models.ClientesDTO;

public interface ClientesServices {
    public void addClinte (ClientesDTO cliente);
    public void updateCliente (ClientesDTO cliente);
    public void deleteCliente (ClientesDTO cliente);
    public ClientesDTO getClientebyemail (String email);

}
