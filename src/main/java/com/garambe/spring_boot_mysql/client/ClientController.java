package com.garambe.spring_boot_mysql.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(path = "api/v1/clients")
public class ClientController {

      private final ClientService clientService;

      @Autowired
      public ClientController(ClientService clientService) {
            this.clientService = clientService;
      }

      @GetMapping
      public List<Client> getAllClients() {
            return clientService.getAllClients();
      }

}
