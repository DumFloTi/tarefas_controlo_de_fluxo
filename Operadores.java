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
    
    //Mensagem usando if/else e mostrar a respetiva mensagem
    public void mensagemMedia() {
        double media = calcularMedia();
        if (media == 0) {
            System.out.println("Eita, proxima vez, toca a estudar!");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
