public class Calculo {
    //atributos
    public double peso;
    public double altura;
    public int sexo;

    public double result;

    //Método Construtor
    public Calculo(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos
    public double calcularIMC(){
        return this.peso / Math.pow(this.altura,2);
    }

    public String exibirMensagem(){

        double imc = calcularIMC();
        String condicao;

        if (imc < 18.5){
            condicao = "abaixo do peso";
        } else if (imc >= 18.5 && imc < 25){
            condicao = "peso ideal (parabéns)";
        }else if (imc >= 25 && imc < 30){
            condicao = "levemente acima do peso";
        }else if (imc >= 30 && imc < 35){
            condicao = "Obesidade grau I";
        }else if (imc >= 35 && imc < 40){
            condicao = "Obesidade grau II (severa)";
        }else{
            condicao = "Obesidade III (mórbida)";
        }
        return "Seu IMC é de " + imc + ", você está " + condicao;
    }

    public double pesoIdeal(){
        if (sexo == 1) {
            return 52 + (0.75 * (this.altura - 152.4));
        }else{
            return  52 + (0.67 * (this.altura - 152.4));
        }
    }
}

