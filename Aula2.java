import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {

Scanner leia = new Scanner(System.in);

System.out.println("Informe seu nome: ");
String nomePessoa = leia.nextLine();
System.out.println();

System.out.println("Informe sua idade: ");
int idadePessoa = leia.nextInt();
System.out.println();

System.out.println("Informe seu peso: ");
double pesoPessoa = leia.nextDouble();
System.out.println();

System.out.println("Seu nome e: " + nomePessoa);
System.out.println("Sua idade e: " + idadePessoa);
System.out.println("Seu peso e: " + pesoPessoa);

    }
}
