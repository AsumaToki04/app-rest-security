package pe.edu.cibertec.app_rest_security.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioResponseDto {
    private Integer idusuario;
    private String nomusuario;
    private String token;
}
