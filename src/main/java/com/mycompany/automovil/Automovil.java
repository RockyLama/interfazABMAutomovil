package com.mycompany.automovil;
import com.mycompany.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        
        //llamamos y hacemos visibles a nuestra IGU
        Principal princ = new Principal();
        //hacemos visible la interfaz
        princ.setVisible(true); 
        //para que no nos aparesca en cualquier lado hacenos esto=
        princ.setLocationRelativeTo(null);
    }
}
