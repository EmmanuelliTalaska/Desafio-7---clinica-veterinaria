/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.classes.Animal;
import br.ulbra.classes.Cadastro;
import java.util.Scanner;

/**
 *
 * @author Manu Talaska
 */
public class Menu {

    public static void main(String[] args) {
        int cod = 0;
        int op = 1;
        Scanner ler = new Scanner(System.in);
        Cadastro banco = new Cadastro();
        String pesquisa;

        while (op != 0) {
            System.out.println("\n=================");
            System.out.println("🐾 🐾 PETSHOP 🐾 🐾 ");
            System.out.println("=================\n");
            System.out.println("1 - Cadastrar ");
            System.out.println("2 - Liberar ");
            System.out.println("3 - Buscar dono ");
            System.out.println("4 - Buscar animal ");
            System.out.println("5 - Listar animais ");
            System.out.println("6 - Mostrar animais e donos ");
            System.out.println("7 - Mostrar quantos animais tem no sistema");
            System.out.println("DIGITE A OPÇÃO DESEJADA:");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    ler.nextLine();

                    Animal a = new Animal();

                    cod++;
                    a.setCodigo(cod);

                    System.out.println("====================");
                    System.out.println("🐾FICHA DE CADASTRO🐾");
                    System.out.println("====================");

                    System.out.println("Nome do animal: ");
                    a.setNomeAnimal(ler.nextLine());

                    System.out.println("Espécie dele: ");
                    a.setEspecie(ler.nextLine());

                    System.out.println("Nome do dono: ");
                    a.setNomeDono(ler.nextLine());
                    
                    System.out.println("Sobrenome do dono: ");
                    a.setSobrenome(ler.nextLine());

                    System.out.println("RG: ");
                    a.setRg(ler.nextLine());

                    System.out.println("CPF: ");
                    a.setCpf(ler.nextLine());

                    System.out.println("E-mail: ");
                    a.setEmail(ler.nextLine());

                    System.out.println("Telefone: ");
                    a.setFone(ler.nextLine());

                    banco.gravar(a);

                    break;

                case 2:
                    pesquisa = "";
                    ler.nextLine();
                    String nome;
                    System.out.println("=================");
                    System.out.println("🐾LIBERAR ANIMAL🐾");
                    System.out.println("=================");
                    System.out.println("Informe o nome do animal que deseja liberar: ");
                    pesquisa = ler.nextLine();
                    int i = banco.encontrarAnimal(pesquisa);
                    if (i != -1) {
                        banco.excluir(i);
                    } else {
                        System.out.println("Este animal já foi liberado!");
                    }
                    break;

                case 3:
                    ler.nextLine();
                    pesquisa = "";
                    System.out.println("Informe o nome do dono: ");
                    pesquisa = ler.nextLine();
                    int i1 = banco.encontrarDono(pesquisa);
                    if (i1 != -1) {
                        System.out.println(banco.listarDono());
                    } else {
                        System.out.println("Dono não registrado! ");
                    }
                    break;

                case 4:
                    ler.nextLine();
                    pesquisa = "";
                    System.out.println("Informe o nome do animal:");
                    pesquisa = ler.nextLine();
                    int i2 = banco.encontrarAnimal(pesquisa);
                    if (i2 != -1) {
                        System.out.println(banco.listarAni(i2));
                    } else {
                        System.out.println("Animal não registrado! ");
                    }
                    break;

                case 5:
                    System.out.println(banco.listarAnimal());
                    break;

                case 6:
                    System.out.println(banco.listarDupla());
                    break;

                case 7:
                    banco.Quantidade();
                    break;
            }
        }
    }
}
