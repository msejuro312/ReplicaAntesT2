package cibertec.demo.controllers;

import cibertec.demo.dto.LoginRequest;
import cibertec.demo.entities.Usuario;
import cibertec.demo.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UsuarioService usuarioService;


    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        Usuario usuario = usuarioService.login(loginRequest.getCorreo(),loginRequest.getClave());
        if(usuario == null){
            return ResponseEntity.status(401).body("Credenciales inválidas");
        } else {
            return ResponseEntity.ok(usuario);
        }
    }
}
