package com.example.projetospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController
{
    @GetMapping("/clientes")
    public String getClientes(){
        return "Vai retornar um dia todos os clientes da BD";
    }
    
    @GetMapping("/clientes/{codigo}")
    public String getCliente(@PathVariable int codigo){
        return "Vai retornar um dia o cliente do codigo " + codigo;
    }
}