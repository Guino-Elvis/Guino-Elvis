package pe.edu.upeu.arreglos;

/**
 * EjemplosVectores
 */
public class EjemplosVectores {

    
    public static void ejemploVectores() {
        //definir vector con valores
        int[] v1={1,2,3,4,5,6,7,8,9,10};  //los indices siempre inician en cero/0      
        System.out.println("v1[7]="+v1[9]);//imprimiento el valor 8 del indice 7

        //definiendo vector de tamanho 2
        int[] v2=new int[2];
                v2[0]=20;//asignando valores en indice 0
                v2[1]=2;//asignando valores en indice 1
        System.out.println("v1[0]="+v2[0]);//imprimiento el valor 20 del indice 0
        //como saber de que tamanho es el vctor
        System.out.println("Tamanho del vector v2="+v2.length);
        System.out.println("Tamanho del vector v1="+v1.length);
    }

    public static void sumaNumPares(int[] v1) {
        int sumaV=0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i]%2==0) {
                sumaV=sumaV+v1[i];
            }
        }
        System.out.println("La suma de numeros pares es="+sumaV);
    }

    public static void almacenarValoresEnVector() {
        int[] vx=new int[20];
        vx[0]=30;
        vx[1]=20;
        int valInicial=10;
        for (int i = 0; i < vx.length; i++) {
            vx[i]=valInicial;
            System.out.println("vx["+i+"]="+vx[i]);
            valInicial=valInicial+10;
        }
    }

    public void vectoresOtrosTiposValores() {
        double[] vA={12.5}, vB={12.5, 14.9}, vC={12.5, 14.9, 45};
        
        int[] vAi={12}, vBi={12, 14}, vCi={12, 14, 45};

        String[] vAs={"A"}, vBs={"A", "B"}, vCs={"A", "12.5","54"};

        char[] vAc={'*', '/', '+', '-', 'A', '5', 'B'};

        Object[] vAo={14, "Hola", '*', 45.3};

    }

    public static void tablaMultiplicar() {
        int[] vA=new int[10], vB=new int[10];
        for (int i = 0; i < vA.length; i++) {
            vA[i]=(i+1);
            for (int j = 0; j < vB.length; j++) {
                vB[j]=(j+1);
                System.out.println(vA[i]+"x"+vB[j]+"="+(vA[i]*vB[j]));
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        ejemploVectores();
        System.out.println("El mismo resultado");
        int[] v1={1,2,3,4,5,6,7,8,9,10};        
        sumaNumPares(v1);
        int[] v1x=new int[]{1,2,3,4,5,6,7,8,9,10};
        sumaNumPares(v1x);
        System.out.println("Resultado 12");
        int[] v1y=new int[10];
        v1y[0]=1; v1y[1]=2;      v1y[9]=10;        
        sumaNumPares(v1y);
        //almacenarValoresEnVector();
        tablaMultiplicar();
    }

}