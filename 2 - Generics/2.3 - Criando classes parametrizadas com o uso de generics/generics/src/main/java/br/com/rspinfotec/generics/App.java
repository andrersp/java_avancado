package br.com.rspinfotec.generics;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        criarBufferString();
        criarBufferInteger();

    }

    private static void criarBufferString() {
        Buffer<String> b = new Buffer<>();
        b.adicionar("a");
        b.adicionar("b");
        b.adicionar("c");

        String e1 = b.remover();
        String e2 = b.remover();
        String e3 = b.remover();

        System.out.println(e1 + ", " + e2 + ", " + e3);
    }

    private static void criarBufferInteger() {
        Buffer<Integer> b = new Buffer<>();

        b.adicionar(10);
        b.adicionar(20);
        b.adicionar(30);

        int e1 = b.remover();
        int e2 = b.remover();
        int e3 = b.remover();

        System.out.println(e1 + ", " + e2 + ", " + e3);
    }
}
