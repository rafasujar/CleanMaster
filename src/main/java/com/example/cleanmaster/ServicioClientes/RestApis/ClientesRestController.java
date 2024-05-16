package com.example.cleanmaster.ServicioClientes.RestApis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.cleanmaster.ServicioClientes.Services.ClientesServices;

@RestController
public class ClientesRestController {

    @Autowired
    private ClientesServices clientesServices;

}
