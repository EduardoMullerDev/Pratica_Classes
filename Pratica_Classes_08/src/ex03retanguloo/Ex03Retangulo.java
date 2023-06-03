package ex03retanguloo;
public class Ex03Retangulo {
    
    double base;
    double altura;
    
    public Ex03Retangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void MudarValordoLado (double NovaBase, double NovaAltura){
        this.base = NovaBase;
        this.altura = NovaAltura;
    }
   
    public double[] RetornarValor(){
    double[] Valor ={base, altura};
    return  Valor;
    }
    
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }





}
