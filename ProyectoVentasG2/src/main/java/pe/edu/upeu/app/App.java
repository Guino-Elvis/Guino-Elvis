package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ClienteSansung;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.ClienteSansung;
import pe.edu.upeu.dao.VentaDao;
import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.dao.ColorDAO;
import pe.edu.upeu.dao.ModeloSansung;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;
/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("------------Registro de Categoria de Productos---------");
        System.out.println("IDCateg:"+categ.getIdCateg()+"\tNombre:"+categ.getNombre());
    }

    public static void menuMain(){
        String mensaje="Seleccion el algoritmo que desea Ejecutar:"+
        "\n1=Registrar Categoria"+
        "\n12=Reportar Categoria "+
        "\n2=Registrar Productos"+
        "\n21=Reportar Producto"+
        "\n22=Modificar Producto"+
        "\n3=Realizar Venta"+
        "\n31=Reporte de Venta en Rango de Fechas"+
        "\n6=Registrar color"+
        "\n4=Registrar Usuario"+
        "\n7=Registrar cliente"+
        "\n8=Registrar modelo"+
        "\n0=Salir del programa";
        LeerTeclado lt=new LeerTeclado(); 
        UtilsX ut=new UtilsX();
        CategoriaDao daoC;       
        UsuarioDao daoUso;
        ProductoDao proDao;
        ColorDAO colTO;
        VentaDao venDao;
        ClienteSansung cliTO;
        ModeloSansung modTO;
        int opcion=0;
        opcion=lt.leer(0, mensaje);
        do{            
            switch(opcion){
                case 1:                
                daoC=new CategoriaDao(); daoC.crearCategoria(); 
                ut.clearConsole(); break;
                case 12: 
                ut.clearConsole();
                daoC=new CategoriaDao(); daoC.reporteCategoria(); break;    
                case 2: proDao=new ProductoDao(); proDao.crearProducto(); break;
                case 21: proDao=new ProductoDao(); proDao.reporteProducto(); break;
                case 3: venDao=new VentaDao(); venDao.registroVentaGeneral(); break;
                case 31: venDao=new VentaDao(); venDao.reporteVentasRangoFecha(); break;
                case 6: colTO=new ColorDAO(); colTO.registrarColor(); break;
                case 4: daoUso=new UsuarioDao(); daoUso.crearNuevoUsuario(); break;
                case 7: cliTO=new ClienteSansung(); cliTO.RegistrarCliente(); break;
                case 8: modTO=new ModeloSansung(); modTO.registrarModelo(); break;
                case 5: break;
                default: System.out.println("La opcion que eligio no exuiste!");
                break;
            }
            if(opcion!=0){
                if(lt.leer("", "\nDesea seguir probando SI=S/NO=N:").toUpperCase().charAt(0)=='S'){
                    opcion=lt.leer(0, mensaje);
                }else{
                    opcion=0;
                }                
            }
            
        }while(opcion!=0);        
    }

    public static void validarAcceso() {
        LeerTeclado lt=new LeerTeclado(); 
        Console  constx= System.console();
        String usuario=lt.leer("", "Ingrese su usuario:");
        System.out.println("Ingrese su clave:");
        char[] clave=constx.readPassword();
        UsuarioDao usuDao=new UsuarioDao();
        if(usuDao.login(usuario, clave)){
            menuMain(); 
        }else{
            System.out.println("Intente Nuevamente!!");
            validarAcceso();
        }
    }


    public static void main( String[] args ){
        //AnsiConsole.systemInstall();
        //Ansi colorX=new Ansi();
        //System.out.println(colorX.bgBrightGreen().fgBlue().a("***************Ingreso al Sistema***********").reset());
        //AnsiConsole.systemInstall();
        //System.out.println(colorX.render("@|red Hello|@ gggg @|green World|@") );
        //validarAcceso();     
        menuMain(); 
        //new MainGUI();
    }
}
