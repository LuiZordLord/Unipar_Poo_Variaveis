ATIVIDADE 1:

package Objetos;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void InformacoesCarro(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

}

package Main;

import Objetos.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println(" ");
        carro1.setMarca("Hyundai");
        carro1.setModelo("HB20");
        carro1.setAno(2016);
        carro1.setCor("Prata");

        carro2.setMarca("Honda");
        carro2.setModelo("CIVIC");
        carro2.setAno(2022);
        carro2.setCor("Branco");

        System.out.println("CARRO 1:");
        carro1.InformacoesCarro();
        System.out.println(" ");
        System.out.println("CARRO 2:");
        carro2.InformacoesCarro();

        // Modificando Atributos dos carros

        carro1.setMarca("Chevrolet");
        carro1.setModelo("Onix");
        carro1.setAno(2005);
        carro1.setCor("Azul");

        carro2.setMarca("Renault");
        carro2.setModelo("Kangoo");
        carro2.setAno(2008);
        carro2.setCor("Branco");

        System.out.println(" ");
        System.out.println("CARRO 1 (Após modificações):");
        carro1.InformacoesCarro();
        System.out.println(" ");
        System.out.println("CARRO 2 (Após modificações):");
        carro2.InformacoesCarro();

    }
}


ATIVIDADE 2:

package Objetos;

    public class Produto {
        private String nome;
        private double preco;
        private int QuantEstoque;


        // Métodos para acessar os atributos
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidadeEmEstoque() {
            return QuantEstoque;
        }

        // Métodos para modificar os atributos
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void setQuantEstoque(int QuantEstoque) {
            this.QuantEstoque = QuantEstoque;
        }

        // Método para exibir informações do produto
        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Preço: R$" + preco);
            System.out.println("Quantidade em estoque: " + QuantEstoque);
        }

        // Adicionar quantidade ao estoque
        public void adicionarQuantidadeEstoque(int quantidade) {
            QuantEstoque += quantidade;
        }

        // Remover quantidade do estoque
        public void removerQuantidadeEstoque(int quantidade) {
            if (QuantEstoque >= quantidade) {
                QuantEstoque -= quantidade;
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        }
}

package Main;

import br.unipar.objetos.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("Computador");
        produto1.setPreco(2500.55);
        produto1.setQuantEstoque(50);

        produto2.setNome("Celular");
        produto2.setPreco(5999.99);
        produto2.setQuantEstoque(30);

        System.out.println(" ");
        System.out.println("Produto 1:");
        produto1.exibirInformacoes();

        System.out.println(" ");
        produto2.exibirInformacoes();

        // MODIFICANDO PRODUTOS

        // PRODUTO 1
        produto1.setPreco(4500.00);
        produto1.adicionarQuantidadeEstoque(20);

        // PRODUTO 2
        produto2.setNome("Celular");
        produto2.removerQuantidadeEstoque(10);
        produto2.setPreco(1599.99);

        // EXIBINDO PRODUTOS MODIFICADOS

        System.out.println(" ");
        System.out.println("Produto 1 (Após modificações): ");
        produto1.exibirInformacoes();

        System.out.println(" ");
        System.out.println("Produto 2 (Após modificações): ");
        produto2.exibirInformacoes();
    }
}

ATIVIDADE 3:

package Objeto;

public class Produto {

    private String nome;
    private double preco;
    private int QuantEstoque;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantEstoque(int quantEstoque) {
        QuantEstoque = quantEstoque;
    }

    public int getQuantEstoque() {
        return QuantEstoque;
    }



}

package Main;

import br.unipar.Loja.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> estoque = new ArrayList<>();

        // Variáveis
        char continuar;

        do {
            System.out.println("Estoque de loja:");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Modificar Produto");
            System.out.println("3 - Consulta de Produto");
            System.out.println(" ");
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.next();
                System.out.print("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                System.out.print("Digite a quantidade em estoque do produto: ");
                int quantEstoque = scanner.nextInt();
                Produto novoProduto = new Produto();
                novoProduto.setNome(nome);
                novoProduto.setPreco(preco);
                novoProduto.setQuantEstoque(quantEstoque);
                estoque.add(novoProduto);
                System.out.println(" ");
                System.out.println("Produto adicionado com sucesso!");
                System.out.println(" ");
            }
            if (opcao == 2) {
                System.out.print("Digite o nome do produto que deseja modificar: ");
                scanner.nextLine();
                String nome = scanner.nextLine();
                System.out.print("Digite 'preco' para mudar o preço ou 'quantidade' para mudar " +
                        "a quantidade: ");
                String opcaoModificar = scanner.nextLine();
                boolean produtoEncontrado = false;
                for (Produto produto : estoque) {
                    if (produto.getNome().equalsIgnoreCase(nome)) {
                        if (opcaoModificar.equalsIgnoreCase("preco")) {
                            System.out.print("Digite o novo preço do produto: ");
                            double novoPreco = scanner.nextDouble();
                            produto.setPreco(novoPreco);
                        } else if (opcaoModificar.equalsIgnoreCase("quantidade")) {
                            System.out.print("Digite a nova quantidade em estoque: ");
                            int novaQuantidade = scanner.nextInt();
                            produto.setQuantEstoque(novaQuantidade);
                        }
                        System.out.println("Produto modificado com sucesso!");
                        break;
                    }
                }
            }
                if (opcao == 3) {
                    System.out.print("Digite o nome do produto que deseja consultar: ");
                    scanner.nextLine();
                    String nomeConsulta = scanner.nextLine();
                    for (Produto produto : estoque) {
                        if (produto.getNome().equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("Nome: " + produto.getNome());
                            System.out.println("Preço: " + produto.getPreco());
                            System.out.println("Quantidade em estoque: " + produto.getQuantEstoque());
                            break;
                        }

                    }
                }
                System.out.println(" ");
                System.out.println("Deseja continuar? s/n");
                continuar = scanner.next().charAt(0);
            }
            while (continuar == 's' || continuar == 'S') ;
            System.out.println(" ");
            System.out.println(" ---------------------");
            System.out.println("| PROGRAMA ENCERRADO  |");
            System.out.println(" ---------------------");
        }
    }

ATIVIDADE 4:

package Objeto;

public class Circulo {
    private double raio;
    private String cor;

    // Construtor da classe Circulo
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    // Métodos para acessar e modificar o raio
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Métodos para acessar e modificar a cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Método para calcular o perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

package Main;

import br.unipar.Objetos.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);

        System.out.println("Características do círculo:");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Cor: " + circulo.getCor());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        scanner.close();
    }
}

ATIVIDADE 5:

package Objeto;

public class Produto {

    private final String nome;
    private final double preco;
    private final int quantEstoque;

    public Produto(String nome){
        this.nome = nome;
        this.preco = 0.0;
        this.quantEstoque = 0;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = 0;
    }

    public Produto(String nome, double preco, int quantEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

}

package Main;
import br.unipar.objetos.Produto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto("Produto A");
        System.out.println("Produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade em estoque: " + produto1.getQuantEstoque());
        System.out.println(" ");

        System.out.print("Digite o nome do Produto B: ");
        String nomeProdutoB = scanner.nextLine();
        System.out.print("Digite o preço do Produto B: ");
        double precoProdutoB = scanner.nextDouble();
        Produto produto2 = new Produto(nomeProdutoB, precoProdutoB);
        System.out.println();
        System.out.println("Produto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: " + produto2.getPreco());
        System.out.println("Quantidade em estoque: " + produto2.getQuantEstoque());
        System.out.println();

        System.out.print("Digite o nome do Produto C: ");
        scanner.nextLine();
        String nomeProdutoC = scanner.next();
        System.out.print("Digite o preço do Produto C: ");
        double precoProdutoC = scanner.nextDouble();
        System.out.print("Digite a quantidade de estoque do Produto C: ");
        int estoqueProdutoC = scanner.nextInt();
        Produto produto3 = new Produto(nomeProdutoC, precoProdutoC, estoqueProdutoC);
        System.out.println();
        System.out.println("Produto 3:");
        System.out.println("Nome: " + produto3.getNome());
        System.out.println("Preço: " + produto3.getPreco());
        System.out.println("Quantidade em estoque: " + produto3.getQuantEstoque());

        scanner.close();
    }
}
