package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.ColorTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud {
    LeerArchivo lar;
    CategoriaTO catTO;
    ProductoTO prodTO;
    ColorTO colTO;

    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();
    
    public Object[][] crearProducto() {
        System.out.println("-------------Registro de Productos------------");
        mostrarCategoria();
        prodTO=new ProductoTO();        
        lar=new LeerArchivo("Producto.txt");        
        prodTO.setIdCateg(lte.leer("", "Ingrese el Id de categoria:"));
        prodTO.setIdProducto(generarId(lar, 0, "P", 1));
        prodTO.setNombre(lte.leer("", "Ingrese nombre del Producto:"));  
       // prodTO.setUnidadMed(lte.leer("", "Ingrese Unidad medida:"));
        //prodTO.setPorceUtil(lte.leer(0.0, "Ingrese el porcentaje de utilidad:"));      
        prodTO.setPrecioUnit(lte.leer(0.0, "Ingrese Precio Unitario:"));
        prodTO.setIdCateg(lte.leer("", "Ingrese color:"));
        prodTO.setStock(lte.leer(0.0, "Ingrese el stock:"));
        lar=new LeerArchivo("Producto.txt");     
        return agregarContenido(lar, prodTO);
    }
    
    public void mostrarCategoria() {
        lar=new LeerArchivo("Categoria.txt"); 
        Object[][] data=listarContenido(lar);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i][0]+"="+data[i][1]+",");
        }
        System.out.println("");
    }

    public void reporteProducto() {
        System.out.println("-------------Reporte de Categoria------------");
        lar=new LeerArchivo("Producto.txt");
       Object[][] data=listarContenido(lar);
        String dataX="";
        ut.pintarLine('H',35);
        ut.pintarTextHeadBody('H', 2, "ID,Noombre,U.Medida,IdCat,P.Unit,%.Util,Stock"); 
        System.out.println("");
        ut.pintarLine('H',35);
       
       for (int i = 0; i < data.length; i++) {
           for (int j = 0; j < data[0].length; j++) {
               if(j==0){
                dataX+=""+data[i][j];
               }else{
                dataX+=","+data[i][j]; 
               }               
           }
           ut.pintarTextHeadBody('B', 2, dataX);  
           dataX="";
       }        
    }        
}
