package pe.edu.upeu.dao;



import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ModeloTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;

import pe.edu.upeu.util.UtilsX;

public class ModeloSansung extends AppCrud{
   
    LeerArchivo lar;
     ModeloTO modTO;
    
     
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarModelo() {
        modTO=new ModeloTO();
        lar=new LeerArchivo("Modelo.txt");
        modTO.setIdmod(generarId(lar, 0, "M00", 1)); 
        modTO.setModel(tre.leer("", "Ingrese el id:"));
        agregarContenido(lar, modTO);
    }

    
    public void editar(){
        lar=new LeerArchivo("Modelo.txt");
          modTO=new ModeloTO();
          
         modTO.setModel(tre.leer("","INGRESE EL MODELO"));
          editarRegistro(lar, 0, modTO.getIdmod(), modTO);
    }

}