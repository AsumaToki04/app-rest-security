package pe.edu.cibertec.app_rest_security.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_rest_security.model.Usuario;
import pe.edu.cibertec.app_rest_security.repository.UsuarioRepository;
import pe.edu.cibertec.app_rest_security.service.IUsuarioService;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Override
    public Usuario obtenerUsuarioXnombre(String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
