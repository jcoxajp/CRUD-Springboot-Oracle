package com.coxaj.miapirest.service;

import com.coxaj.miapirest.model.entity.Cliente;

public interface ICliente {
    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);


}
