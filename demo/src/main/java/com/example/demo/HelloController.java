package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// HelloController feito em aula.
@RestController
public class HelloController {

    // --- SUA HOME (Mantida e intacta!) ---
    @GetMapping("/")
    public String home() {
        return getHeader() + getBodyContent() + getFooter();
    }

    private String getHeader() {
        return """
        <!DOCTYPE html>
        <html lang="pt-BR">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Spring Boot Success</title>
            <style>
                body {
                    margin: 0; padding: 0;
                    font-family: 'Segoe UI', sans-serif;
                    background-color: #121212; color: #ffffff;
                    display: flex; justify-content: center; align-items: center;
                    height: 100vh;
                }
                .card {
                    background-color: #1e1e1e; padding: 40px;
                    border-radius: 16px; text-align: center;
                    border: 1px solid #333; max-width: 400px;
                }
                .icon { font-size: 50px; margin-bottom: 20px; animation: pulse 2s infinite; }
                h1 { color: #6db33f; margin-bottom: 10px; }
                p { color: #b3b3b3; line-height: 1.5; }
                .badge {
                    display: inline-block; background-color: #2d2d2d;
                    color: #6db33f; padding: 6px 12px; border-radius: 20px;
                }
                @keyframes pulse {
                    0% { transform: scale(1); }
                    50% { transform: scale(1.1); }
                    100% { transform: scale(1); }
                }
            </style>
        </head>
        <body>
            <div class="card">
        """;
    }

    private String getBodyContent() {
        return """
                <div class="icon">🌱</div>
                <h1>Spring Boot no Ar!</h1>
                <p>Parabéns! Seu ambiente Java 23 + Gradle no VS Code está configurado e rodando com sucesso.</p>
                <div class="badge">Status: Online (Porta 8080)</div>
        """;
    }

    private String getFooter() {
        return """
            </div>
        </body>
        </html>
        """;
    }

    // --- ENDPOINTS DO EXERCÍCIO ---

    // Endpoint 1
    @GetMapping("/nome")
    public String nome() {
        return "Cleber";
    }

    // Endpoint 2
    @GetMapping("/cpf")
    public String cpf() {
        return "123.456.789-00";
    }

    // Endpoint 3
    @GetMapping("/endereco")
    public String endereco() {
        return "Cleber - Rua das Flores, 123";
    }

    // Endpoint 4
    @GetMapping("/soma")
    public String soma(@RequestParam int a, @RequestParam int b) {
        int resultado = a + b;
        return "A soma de " + a + " + " + b + " é igual a: " + resultado;
    }
}
