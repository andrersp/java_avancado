package br.com.rspinfotec;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {

        String nome = "Andre";
        if (StringUtils.isBlank(nome)) {

            System.out.println("Vazia");

        }

    }

}
