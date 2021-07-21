package pe.edu.upeu.arreglos;

public class EjemplosMatrices {

    public void conceptosMatrices() {
        //declarar matriz con datos predefinidos
        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2},
            {5,	6,	2},
            {5,	6,	2}
            };
        //declarar una matrizX sin datos pero de 3x3
        int[][] matrizX=new int[3][5];

        matrizX=new int[4][4];
        //Colocando valores en una matrizX   en los indices 1,0 
        matrizX[1][0]=12;
        //obteniendo el valor o el elemento de los indices 1,0
        System.out.println("matrizX[1][0] su valor es:"+matrizX[1][0]);
        //obteniendo el tamanho de la matriz en filas
        System.out.println("Obtener tamanho en filas:"+matrizX.length); 
        //obteniendo el tamanho de la matriz en columnas
        System.out.println("Obtener tamanho en filas:"+matrizX[0].length);
        //declarando una matriz 
        int[][] matrizXY;
        matrizXY=new int[matrizX[0].length][matrizX.length];

    }

    public void sumarContenidoMatriz() {
        int[][] matriz={
            {5,	6,	6},
            {5,	6,	2},
            {5,	6,	2},
            {5,	6,	2}
            };        
        int sumaValores=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaValores=sumaValores+matriz[i][j];
            }
        }
        System.out.println("La suma de los valores/elementos de la matriz es:"+sumaValores);        
    }

    public void sumarContenidoMatrizConParametrosE(int[][] matriz) {
        int sumaValores=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaValores=sumaValores+matriz[i][j];
            }
        }
        System.out.println("La suma de los valores/elementos de la matriz es:"+sumaValores);              
    }    

    public void imprimirContenidoMatrizEnteros(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }        
    }
    public void imprimirContenidoMatrizEnteros(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }         
    }
    public void imprimirContenidoMatrizEnteros(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }         
    }    
    public void imprimirContenidoMatrizEnteros(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }         
    } 

    public void registroProductos() {
        /*
        P0002	Pera	4.6	20
        P0003	Naranza	2	2        
        */ 
        Object[][] productos={
                {"P0001","Manzana",3.5,50},
                {"P0002","Pera",4.6,20},
                {"P0003","Naranza",2,2}
        };
        imprimirContenidoMatrizEnteros(productos);
    }

    private void calcularPositivosNegativosCerosM(int[][] matriz) {
        int cantNeg=0, cantPos=0, canCeros=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]<0) {
                    System.out.println("iF="+i+" iC="+j+" V.Negativo="+matriz[i][j]);
                    cantNeg++;
                }else if(matriz[i][j]==0){
                    System.out.println("iF="+i+" iC="+j+" V.Cero="+matriz[i][j]);
                    canCeros++;
                }else{
                    System.out.println("iF="+i+" iC="+j+" V.Positivo="+matriz[i][j]);
                    cantPos++;
                }
            }         

        }
         System.out.println("Cantidad Negativos es:"+cantNeg);
         System.out.println("Cantidad Positivos es:"+cantPos);
         System.out.println("Cantidad ceros es:"+canCeros);
    }

    
    public static void main(String[] args) {
        EjemplosMatrices em=new EjemplosMatrices();
        int[][] matriz={
            {5,	6,	6},
            {5,	-6,	2},
            {0,	6,	2},
            {5,	0,	-2}
            };  
        int[][] matrizy;           
        em.sumarContenidoMatriz();
        em.sumarContenidoMatrizConParametrosE(matriz);
        em.imprimirContenidoMatrizEnteros(matriz);
        matrizy=matriz;
        System.out.println("funciones valor:"+matrizy[0][0]);
        System.out.println("Atributos:"+matriz.length);
        em.registroProductos();
        System.out.println("");
        em.calcularPositivosNegativosCerosM(matriz);
    }


}
