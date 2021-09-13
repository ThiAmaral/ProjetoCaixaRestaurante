package src;

public class Produto {
    public static void main(String[] args) {
        String nome =getNome();
        int matricula = getCodigo();
        double preco = getPreco();
        toStr(nome, matricula, preco);
    }
    public static String getNome(){
        String nome = "Thiago";
        return nome;
    }
    public static int getCodigo(){
        int codigo = 2;
        return codigo;
    }
    public static double getPreco(){
        double preco = 2.6;
        return preco;
    }
    
    
    public static String setNome(){
        String nome = "Batata";
        return nome;
    }
    public static int setCodigo(){
        int codigo = 2;
        return codigo;
    }
    public static float setPreco(){
        float preco = 2;
        return preco;
    }
    
    public static void toStr(String nome, int codigo, double preco){
        System.out.println("Produto: " + nome + " : "+ preco + ", " + codigo);
    }
}
