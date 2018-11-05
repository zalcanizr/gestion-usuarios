package com.cice.gestionusuarios.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String user;
    private String email;

    public UsuarioDTO(){
    }
    public UsuarioDTO (Long id, String Nombre, String user, STring email){
         this.id=id;
        this.nombre=nombre;
        this.user=user;
        this.email=email;
    }
}
