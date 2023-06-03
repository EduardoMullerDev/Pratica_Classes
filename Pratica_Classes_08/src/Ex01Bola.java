public class Ex01Bola {
   
        String Cor;
        double Circunferencia;
        String Material;
        
        public Ex01Bola(String Cor, double Circunferencia, String Material){
            this.Cor = Cor;
            this.Circunferencia = Circunferencia;
            this.Material = Material;
        
            
        }
        public void trocarCor(String novaCor){
            this.Cor = novaCor;
        }
   
        public String mostrarCor(){
            return this.Cor;
        }



    }






