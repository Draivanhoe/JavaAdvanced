package com.example.demowebappivan;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class CheTempoCheFaController {
    @GetMapping(path = "/{regione}")
    public Saluto restituisciJson(@PathVariable String regione, @RequestParam String nome) {
        return new Saluto(regione, nome);
    }
}