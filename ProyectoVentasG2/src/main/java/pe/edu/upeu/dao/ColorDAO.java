package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ColorTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;

import pe.edu.upeu.util.UtilsX;

public class ColorDAO extends AppCrud{
   
    LeerArchivo lar;
    ColorTO colTO;
    
    LeerTeclado tre=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void registrarColor() {
        colTO=new ColorTO();
        lar=new LeerArchivo("color.txt");
        colTO.setIdCol(generarId(lar, 0, "C", 1)); 
        colTO.setNombre(tre.leer("", "Ingrese ID color:"));
        agregarContenido(lar, colTO);
    }

    public void reporteColor() {
        lar=new LeerArchivo("Color.txt");
        imprimirLista(listarContenido(lar));
    }
    public void editar(){
        lar=new LeerArchivo("Color.txt");
          colTO=new ColorTO();
          
          colTO.setNombre(tre.leer("","INGRESE EL COLOR"));
          editarRegistro(lar, 0, colTO.getIdCol(), colTO);
    }

}