package vn.iuh.se.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    private final RestTemplate restTemplate;

    @Autowired
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public  String getProduct(String productId){
        String productUrl = "http://localhost:8081/users";
        return restTemplate.getForObject(productUrl, String.class);
    }
}

