package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ColorTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

/**
 * CategoriaDao
 */
public class CategoriaDao extends AppCrud {
    LeerArchivo lar;
    CategoriaTO catTO;
    ColorTO   colTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public Object[][] crearCategoria() {
        catTO=new CategoriaTO();
        colTO=new ColorTO();
        System.out.println("-------------Registro de Categoria------------");
        lar=new LeerArchivo("Categoria.txt");
        catTO.setIdCateg(generarId(lar, 0, "C", 1));

        catTO.setNombre(lte.leer("", "Ingrese nombre de categoria:"));  
        colTO.setIdCol(generarId(lar, 0, "X", 1)); 
        colTO.setNombre(lte.leer("", "Ingrese color:"));      
        return agregarContenido(lar, catTO);
    }
    
    public void reporteCategoria(Object[][] data) {
        System.out.println("-------------Reporte de Categoria------------");
        //lar=new LeerArchivo("Categoria.txt");
        //listarContenido(aq);
        imprimirLista(data);
    }

    public void reporteCategoria() {
        System.out.println("-------------Reporte de Categoria------------");
        lar=new LeerArchivo("Categoria.txt");
       Object[][] data=listarContenido(lar);
        String dataX="";
        ut.pintarLine('H',13);
        ut.pintarTextHeadBody('H', 3, "ID,Noombre"); 
        System.out.println("");
        ut.pintarLine('H',13);
       
       for (int i = 0; i < data.length; i++) {
           for (int j = 0; j < data[0].length; j++) {
               if(j==0){
                dataX+=""+data[i][j];
               }else{
                dataX+=","+data[i][j]; 
               }               
           }
           ut.pintarTextHeadBody('B', 3, dataX);  
           dataX="";
       }        
    }    
}