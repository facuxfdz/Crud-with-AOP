package com.clients.clientsspring.service;

import com.clients.clientsspring.annotations.LogAfter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    Logger logger = LogManager.getLogger(ClientService.class);

    public void getClients() {
        logger.debug("Client list");
    }

    public void createClient() {
        logger.debug("Created client");
    }

    @LogAfter
    public void updateClient() {
        logger.debug("Updated client info");
    }

    public void getClientById() {
        logger.debug("Client with given id");
    }

    @LogAfter
    public void deleteClient() {
        logger.debug("Deleted client id");
    }

}
