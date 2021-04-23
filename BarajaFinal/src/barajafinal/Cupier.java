package barajafinal;
import java.util.ArrayList;
import java.util.Random;
public class Cupier {
Deck baraja=new Deck();    
ArrayList barajaRevuelta=new ArrayList();
public String repartir(int numero)
{
    int suma=0;
baraja.crearBaraja().get(numero);
return ""+baraja.crearBaraja().get(numero);
}
public int sumaPuntos(int posicion,int sumaActual)
{
    int suma;
    suma=sumaActual;
    suma+=baraja.mostrarCarta(posicion);
    return suma;
}
public void mostrarCarta(int posicion)
{
    System.out.println(baraja.crearBaraja().get(posicion));
}

public void ganador(int sumaJugador,int sumaCupier)
{
    if(sumaCupier > 21 && sumaJugador > 21)
        System.out.println("empate");
    else if((sumaCupier<22 && sumaCupier>sumaJugador) || sumaJugador>21)
    {   System.out.println("Cupier gana");}
    else if((sumaJugador<22 && sumaCupier<sumaJugador) || sumaCupier> 21)
     {
        System.out.println("Jugador gana");
     }      
     
}
}

