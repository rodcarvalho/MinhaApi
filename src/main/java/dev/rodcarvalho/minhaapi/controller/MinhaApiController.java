package dev.rodcarvalho.minhaapi.controller;

import dev.rodcarvalho.minhaapi.dto.MinhaApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MinhaApiController {
    private  static  final  String HELLO = "Hello World";

    @GetMapping(value = "/get", produces = { "application/json"})
    public ResponseEntity<MinhaApiResponse> helloWorldGet() {
        System.out.println("Chamou GET");

        MinhaApiResponse response = new MinhaApiResponse();
        response.setMensagem(HELLO);
        return ResponseEntity.ok(response);
    }

    @PostMapping(value = "/post", produces = { "application/json"})
    public ResponseEntity<MinhaApiResponse> helloWorldPost() {
        System.out.println("Chamou POST");

        MinhaApiResponse response = new MinhaApiResponse();
        response.setMensagem(HELLO);
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/put", produces = { "application/json"})
    public ResponseEntity<MinhaApiResponse> helloWorldPut() {
        System.out.println("Chamou PUT");

        MinhaApiResponse response = new MinhaApiResponse();
        response.setMensagem(HELLO);
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/delete", produces = { "application/json"})
    public  ResponseEntity<MinhaApiResponse> helloWorldDelete() {
        System.out.println("Chamou DELETE");

        MinhaApiResponse response = new MinhaApiResponse();
        response.setMensagem(HELLO);
        return  ResponseEntity.ok(response);
    }
}

