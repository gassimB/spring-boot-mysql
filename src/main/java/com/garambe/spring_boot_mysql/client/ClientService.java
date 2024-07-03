package com.garambe.spring_boot_mysql.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

      @Autowired
      ClientRepository clientRepository;

      List<Client> getAllClients() {
            return clientRepository.findAll();
      }

}
