package com.example.demowebappivan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CheTempoCheFa {
    @GetMapping("/ciao")
    public String salutaEChiedi (@RequestParam String nome, @RequestParam String regione) {
        return "Ciao, " + nome + "! Com'è il tempo in " + regione + "?";
    }
}
