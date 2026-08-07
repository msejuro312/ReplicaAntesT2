package cibertec.demo.util;

import org.springframework.stereotype.Component;

@Component
public class FormatoUtil {
    //primer letra en mayúscula y el resto en minúscula
    public String capitalizar(String texto){
        if(texto == null || texto.isEmpty()) return texto;
        return texto.substring(0,1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}
