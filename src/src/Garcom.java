package src;

public class Garcom {
    public static void main(String[] args) {
        String nome =getNome();
        int matricula = getMatricula();
        toStr(nome, matricula);
    }
    
    public static String getNome(){
        String nome = "Thiago";
        return nome;
    }
    public static int getMatricula(){
        int matricula = 2;
        return matricula;
    }
    public static void toStr(String nome, int matricula){
        System.out.println("Garçom/Matricula: " + nome + ", " + matricula);
    }
}
