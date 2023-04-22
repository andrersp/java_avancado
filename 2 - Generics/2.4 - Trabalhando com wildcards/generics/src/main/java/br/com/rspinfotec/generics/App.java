package br.com.rspinfotec.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<Bebida> bebidas = new ArrayList<Bebida>();
        bebidas.add(new Cafe());
        bebidas.add(new Cha());

        prepararBebidas(bebidas);

        List<Cha> chas = new ArrayList<>();
        chas.add(new Cha());
        prepararBebidas(chas);

        List<Cafe> cafes = new ArrayList<>();
        cafes.add(new Cafe());
        prepararBebidas(cafes);

        prepararBebidas2(bebidas);
        prepararBebidas2(chas);

    }

    private static void prepararBebidas(List<? extends Bebida> bebidas) {
        System.out.println("void prepararBebidas");

        for (Bebida b : bebidas) {
            b.preparar();
        }

    }

    private static void prepararBebidas2(List<? super Cha> bebidas) {
        System.out.println("void prepararBebidas2");

        // bebidas.add(new Cha());

        for (Object b : bebidas) {

            if (b instanceof Cha) {
                Cha cha = (Cha) b;
                cha.preparar();

            }

        }

    }

    private static void prepararBebidas3(List<?> bebidas) {
        System.out.println("void prepararBebidas3");

        for (Object b : bebidas) {

            if (b instanceof Cha) {
                Cha cha = (Cha) b;
                cha.preparar();

            }

        }

    }
}
