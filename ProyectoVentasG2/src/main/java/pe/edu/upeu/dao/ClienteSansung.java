package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ClienteSansung extends AppCrud{
    LeerArchivo lar;
    ClienteTO cliTO;
    

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();    

    public void RegistrarCliente() {
        cliTO=new ClienteTO();
        lar=new LeerArchivo("Cliente.txt");
        String DNI=lte.leer("", "Ingrese DNI del cliente:").toLowerCase();
        if(validarExistUser(DNI)){
            
            cliTO.setDNI(DNI);
            cliTO.setCliente(lte.leer("", "Ingrese nombrea y apellido del cliente:").toUpperCase());        
            
            
            agregarContenido(lar, cliTO);            
        }else{
           System.out.println("Ingresar otro cliente:"); 
           RegistrarCliente();
        }
    }

    
    public boolean validarExistUser(String user) {
        lar=new LeerArchivo("Cliente.txt");
       Object[][] data=buscarContenido(lar, 1, user);  
       if(data!=null && data.length>0){
           System.out.println("-----ya se registro el nombre de ese cliente ingrese otro-----");
        return false;
       }
       return true;
    }

}