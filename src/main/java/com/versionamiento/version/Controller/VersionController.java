package com.versionamiento.version.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/holaMundo/api")
public class VersionController {

    @GetMapping("/V1")
    public String saludo(){
        return "Hola Mundo";
    }
}
