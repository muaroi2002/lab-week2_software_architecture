package vn.iuh.se.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.iuh.se.services.ApiService;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<String> getProduct(@PathVariable String id){
        String productResponse = apiService.getProduct(id);
        return ResponseEntity.ok(productResponse);
    }
}
