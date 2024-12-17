package org.example;

public class Main {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = (a, b) -> a * b;
        System.out.println(multiplicacao.multiplicacao(10, 2));
    }
}