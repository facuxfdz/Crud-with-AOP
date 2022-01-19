package com.clients.clientsspring.controller;

import com.clients.clientsspring.exceptions.MissedFieldsException;
import com.clients.clientsspring.model.Client;
import com.clients.clientsspring.service.ClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {

    Logger logger = LogManager.getLogger(ClientController.class);

    @Autowired
    ClientService clientService;


    @GetMapping
    public void getClients(){
        clientService.getClients();
    }

    @GetMapping("/{id}")
    public void getClientById(){
        clientService.getClientById();
    }

    @PostMapping
    public void createClient(){
        clientService.createClient();
    }

    @PutMapping("/{id}")
    public void updateClient( @RequestBody Client client, @PathVariable Integer id ) throws MissedFieldsException {
        clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void delete(){
        clientService.deleteClient();
    }

}
