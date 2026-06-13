package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// HomeController feito como trabalho final.
@RestController
public class HomeController {

    @GetMapping("/aluno")
    public String aluno() {
        return "Nome: João da Silva\nCurso: Sistemas de Informação";
    }

    @GetMapping("/professor")
    public String professor() {
        return "Professor: Ana Paula Canal\nDisciplina: Sistemas Operacionais";
    }

    @GetMapping("/calculadora")
    public String calculadora(
            @RequestParam int a,
            @RequestParam int b,
            @RequestParam String operacao) {

        int resultado;

        if (operacao.equalsIgnoreCase("soma")) {
            resultado = a + b;
        } else if (operacao.equalsIgnoreCase("subtracao")) {
            resultado = a - b;
        } else if (operacao.equalsIgnoreCase("multiplicacao")) {
            resultado = a * b;
        } else if (operacao.equalsIgnoreCase("divisao")) {
            if (b == 0) {
                return "Divisão por zero não é permitida!";
            }
            resultado = a / b;
        } else {
            return "Operação inválida!";
        }

        return "Resultado: " + resultado;
    }
}
