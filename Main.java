import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    //Variavel
    int numero1 = 0;
    int numero2 = 0;
    int numero3 = 0;
    int numero4 = 0;
    int resultado = 0;
    //Entrada de Dados
    System.out.println("\nDigite o Primeiro Número :");
    numero1 = leitor.nextInt();
    System.out.println("\nDigite o Segundo Número :");
    numero2 = leitor.nextInt();
    System.out.println("\nDigite o Terceiro Número :");
    numero3 = leitor.nextInt();
    System.out.println("\nDigite o Quarto Número :");
    numero4 = leitor.nextInt();
    //Processamento
    resultado = numero1 + numero2 + numero3 + numero4;
    //Saida 
    System.out.println("\nResultado da Soma :" + resultado);
  }
}