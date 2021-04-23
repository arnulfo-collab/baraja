package barajafinal;
import java.util.ArrayList;
public class Deck {
  private ArrayList<Card> baraja;
    private ArrayList<Card> sacar;
    private ArrayList<Card> sacar1;
    private int x;
    private Card carta;
    private String figura;
    public Deck()
    {
       baraja = new ArrayList<Card>();
    }
    public ArrayList crearBaraja()
    {
    int contador=1;
while(contador<5){
    if(contador==1)
    figura="diamante";
    if(contador==2)
    figura="corazones";
    if(contador==3)
    figura="espadas";
    if(contador==4)
    figura="trebol";
    for(x=1;x<14;x++)
    {
    carta=new Card(x,figura);    
    baraja.add(carta);
    }
    contador++;
}
return baraja;
    }  
    public void sacarCarta(int posicion){
    baraja.remove(posicion);
    }
    public int mostrarCarta(int posicion)
    {
    int x;
        baraja.get(posicion).getFigura();
    x=baraja.get(posicion).getNumero();
    return x;
    }
    
}
