package barajafinal;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BarajaFinal {
    
    public static void main(String[] args) {
        Scanner seguir=new Scanner(System.in);
    Cupier cupier=new Cupier();
    Random numero=new Random();
    ArrayList manoJugador=new ArrayList();
        ArrayList manoCupier=new ArrayList();
    int sumaJugador=0;
    int sumaCupier=0;
    int numero2,numero5;
        String respuesta="s";
        numero2=numero.nextInt(52);
      manoJugador.add(cupier.repartir(numero2));
      sumaJugador=cupier.sumaPuntos(numero2, sumaJugador);
      numero5=numero.nextInt(52);
      manoCupier.add(cupier.repartir(numero5));
      sumaCupier=cupier.sumaPuntos(numero5, sumaCupier);
    do{
    int numero1=numero.nextInt(52);
    int numero3=numero.nextInt(52);
    manoJugador.add(cupier.repartir(numero1));
    sumaJugador=cupier.sumaPuntos(numero1, sumaJugador);
      System.out.println("mano del jugador "+manoJugador);
        System.out.println("mano de cupier"+manoCupier);
    manoCupier.add(cupier.repartir(numero3));
    sumaCupier=cupier.sumaPuntos(numero3, sumaCupier);
    if(sumaCupier>21 || sumaJugador >21){
        respuesta="n";
    }
    else
    {System.out.println("desea tomar otra carta?");
    respuesta=seguir.nextLine();    
    }
        System.out.println("-------------------------");
    }while (!respuesta.equalsIgnoreCase("n"));
    System.out.println("mano del jugador "+manoJugador);
        System.out.println("mano de cupier"+manoCupier);
    cupier.ganador(sumaJugador, sumaCupier);
    
    }
}
