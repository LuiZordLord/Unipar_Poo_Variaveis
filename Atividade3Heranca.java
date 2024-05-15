package br.unipar;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.facaSom();

        Cachorro cachorro = new Cachorro();
        cachorro.facaSom();

        Calculadora calculadora = new Calculadora();
        int sum1 = calculadora.add(1,2);
        System.out.println(sum1);
        int sum2 = calculadora.add(1,2,3);
        System.out.println(sum2);
        double sum3 = calculadora.add(1.5,2.5);
        System.out.println(sum3);
    }
}

------------

package br.unipar;

public class Animal {
    public void facaSom(){
        System.out.println("Som");
    }
}

------------

  package br.unipar;

public class Cachorro extends Animal {
    @Override
    public void facaSom(){
        System.out.println("Au-ar-au");
    }

}

------------

package br.unipar;

public class Calculadora {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

