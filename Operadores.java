package tarefas_controlo_fluxo;
/**
 * Aqui têm a forma de somar e depois média da soma, para ter a nota final
 */

public class Operadores {
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    
    //Método Get/Set, receber as notas/valores e juntar ao respetivo objeto
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    //Somar todas a notas e dividir por 4
    public double calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
    
    //Mensagem de Apoio, caso a média seja 0
    public void mensagemMediaZero() {
        double media = calcularMedia();
        if (media == 0) {
            System.out.println("Eita, proxima vez, toca a estudar!");
        }
    }

    //Mensagem de Felicitação, caso a média seja maior ou igual que 7
    public void mensagemMediaMaiorOuIgualSete() {
        double media = calcularMedia();
        if (media >= 7) {
            System.out.println("Aprovado");
        }
    }

    //Mensagem de Felicitação, caso a média seja maior ou igual que 5 e menor que 7
    public void mensagemMediaMaiorOuIgualCinco() {
        double media = calcularMedia();
        if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        }
    }

    //Mensagem de Felicitação, caso a média seja menor que 5
    public void mensagemMediaMenorCinco() {
        double media = calcularMedia();
        if (media < 5) {
            System.out.println("Reprovado");
        }
    }
}
