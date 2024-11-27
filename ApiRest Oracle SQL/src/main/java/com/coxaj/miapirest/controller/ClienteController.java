package com.coxaj.miapirest.controller;

import com.coxaj.miapirest.model.entity.Cliente;
import com.coxaj.miapirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ICliente clienteService;

    @PostMapping("cliente")
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("cliente")
    public Cliente update(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("cliente/{id}")
    public Cliente delete(@PathVariable Integer id) {
        Cliente clienteDelete =  clienteService.findById(id);
        clienteService.delete(clienteDelete);
        return clienteDelete;
    }

    @GetMapping("cliente/{id}")
    public Cliente showById(@PathVariable Integer id) {
        return clienteService.findById(id);
    }
}
