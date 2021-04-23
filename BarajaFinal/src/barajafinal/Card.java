package barajafinal;

public class Card {
  private int numero;
   private String figura;

    public Card(int numero, String figura)
    {
        this.figura=figura;
        this.numero=numero;
    }
    public String toString()
    {
        return numeros() +"  "+ figura;
    }
    public String numeros(){
        switch(this.numero){
            case 1:
                return "as";
            case 11:
                return "jota";
            case 12:
                return "reina";
            case 13:
                return "rey";
            default: 
                return String.valueOf(numero);
        }
    }
    public int getNumero()
    {
    return numero;
    }
    public String getFigura()
    {
    return figura;
    }    
}
