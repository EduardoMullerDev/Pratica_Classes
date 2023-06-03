public class Ex02Quadrado {
    
double tamanhodoLado;

public Ex02Quadrado(double tamanhodoLado){
    this.tamanhodoLado =tamanhodoLado;
}

public void MudarValordoLado (double NovoValor){
    this.tamanhodoLado = NovoValor;
}

public double RetornarValordoLado(){
    return this.tamanhodoLado;
}

public double CalcularArea(){
    return  tamanhodoLado * tamanhodoLado;
}


}
