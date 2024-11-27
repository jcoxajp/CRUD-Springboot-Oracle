package com.coxaj.miapirest.model.dao;

import com.coxaj.miapirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
