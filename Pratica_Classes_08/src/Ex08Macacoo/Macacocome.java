package Ex08Macacoo;

public class Macacocome {
    
    public static void main(String[] args) {

Macaco macaco1 = new Macaco("Macaco1");
Macaco macaco2 = new Macaco("Macaco2");

macaco1.comer("pêra");
macaco1.comer("banana");
macaco1.comer("jabuticaba");

macaco2.comer("abacaxi");
macaco2.comer("amora");
macaco2.comer("carambola");

macaco1.verBucho();
macaco2.verBucho();

macaco1.digerir();
macaco2.digerir();

macaco2.comer("macaco1");
macaco2.verBucho();

    }


}
