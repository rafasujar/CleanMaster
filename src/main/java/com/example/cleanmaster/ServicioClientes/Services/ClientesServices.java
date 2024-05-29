package com.example.cleanmaster.ServicioClientes.Services;

import com.example.cleanmaster.ServicioClientes.Models.ClientesDTO;

public interface ClientesServices {
    public boolean addClinte (ClientesDTO cliente);
    public boolean updateCliente (ClientesDTO cliente);
    public boolean deleteCliente (ClientesDTO cliente);
    public ClientesDTO getClientebyemail (String email);

}
