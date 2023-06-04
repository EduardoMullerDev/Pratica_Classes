package Ex09PontoeRetangulo;

public class Retangulo {
    
    private ponto verticedepartida;
    private int largura;
    private int altura;

    public Retangulo(ponto verticedepartida, int largura, int altura) {
        this.verticedepartida = verticedepartida;
        this.largura = largura;
        this.altura = altura;
        
}
public ponto encontrarCentro() {
    int centroX = verticedepartida.getX() + largura / 2;
    int centroY = verticedepartida.getY() + altura / 2;
    return new ponto(centroX, centroY);
}
}