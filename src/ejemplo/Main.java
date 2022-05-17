package ejemplo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TrianguloFactoryMethod factory=new TrianguloFactory();
        System.out.println("ingrese EL ladoA de triangulo:");
        double ladoA = sc.nextDouble();
        System.out.println("ingrese el ladoB de triangulo:");
        double ladoB = sc.nextDouble();
        System.out.println("ingrese el ladoC de triangulo:");
        double ladoC = sc.nextDouble();

        Triangulo triangulo= factory.createTriangulo(ladoA,ladoB,ladoC);
        System.out.println(triangulo.descripcion());
        System.out.println(triangulo.getArea());
    }
}
