/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3VN.Reto3VN.Interface;

import Reto3VN.Reto3VN.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}
