package Ex06TV;

public class Televisor {
    private int canal;
    private int volume;

    public Televisor() {
        canal = 2;
        volume = 10;
    }

    public void setCanal(int novocanal) {
        if (novocanal >= 1 && novocanal <= 48) {
            canal = novocanal;
         System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal não existe");
        }
    }

public void diminuirvolume(){
    if (volume >0){
        volume --;  
        System.out.println("Volume atual " + volume);
    }
    else {System.out.println("Já está no volume minimo!");
}

}

public void aumentarvolume(){
    if(volume <50 ){
        volume ++;
        System.out.println("Volume atual: " + volume);
    }else {
        System.out.println("Já está no volume maximo!");
    }

}






}
