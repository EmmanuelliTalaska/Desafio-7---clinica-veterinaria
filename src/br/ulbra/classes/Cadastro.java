/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classes;

import java.util.ArrayList;

/**
 *
 * @author Manu Talaska
 */
public class Cadastro {

    public ArrayList<Animal> lista = new ArrayList();

    public void gravar(Animal a) {
        lista.add(a);
        System.out.println("O animal " + a.getNomeAnimal() + " foi cadastrado com sucesso. "
                + "\nproprietário: "
                + a.getNomeDono());
    }

    public String listarAnimal() {
        String resultado = "🐾LISTA DE ANIMAIS🐾\n";
        System.out.println("====================");
        if (lista.isEmpty()) {
            resultado = "A sua lista está vazia";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                resultado += "Nome: " + lista.get(i).getNomeAnimal() + " - "
                        + "Especie: " + lista.get(i).getEspecie() + " - "
                        + "Código: " + lista.get(i).getCodigo()
                        + "\n";
            }
        }
        return resultado;
    }

    public String listarDono() {
        String listaDono = "🐾DONO🐾\n";
        System.out.println("========");

        if (lista.isEmpty()) {
            listaDono = "A sua lista está vazia";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                listaDono += "Nome: " + lista.get(i).getNomeDono() + " - "
                        + "Sobrenome: " + lista.get(i).getSobrenome() + " - "
                        + "RG: " + lista.get(i).getRg() + " - "
                        + "CPF: " + lista.get(i).getCpf() + " - "
                        + "Email: " + lista.get(i).getEmail()
                        + "\n";
            }
        }
        return listaDono;
    }

    public String listarDupla() {
        String resultado = "🐾CADASTRO🐾\n";
        System.out.println("============");
        if (lista.isEmpty()) {
            resultado = " Não tem clientes cadastrados ";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                resultado += " Nome do animal: " + lista.get(i).getNomeAnimal() + " - "
                        + " Espécie: " + lista.get(i).getEspecie() + " - "
                        + " Código: " + lista.get(i).getCodigo() + " - "
                        + "\n"
                        + " Nome do dono: " + lista.get(i).getNomeDono()
                        + " Sobrenome do dono: " + lista.get(i).getSobrenome()
                        + " RG: " + lista.get(i).getRg()
                        + " CPF: " + lista.get(i).getCpf()
                        + " E-mail: " + lista.get(i).getEmail()
                        + " Telefone: " + lista.get(i).getFone()
                        + "\n";
            }
        }
        return resultado;
    }

    public int encontrarAnimal(String nome) {
        int aux = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNomeAnimal().equals(nome)) {
                aux = i;
            }
        }
        return aux;
    }
    
    public String listarAni(int i) {
        String resultado = "🐾ANIMAL🐾\n"
                + "Nome: " + lista.get(i).getNomeAnimal() + " - "
                + "Especie: " + lista.get(i).getEspecie() + " - "
                + "Código: " + lista.get(i).getCodigo()
                + "\n";
        return resultado;

    }

    public void excluir(int i) {
        lista.remove(i);
    }

    public int encontrarDono(String nome) {
        int aux = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNomeDono().equals(nome)) {
                aux = i;
            }
        }
        return aux;

    }
    public String listarDono(int i){
       String listaDono = "Nome: " +lista.get(i).getNomeDono() + " - "
                        +"Sobrenome: " + lista.get(i).getSobrenome() + " - "
                        +"RG: " + lista.get(i).getRg() +     " - "
                        +"CPF: " + lista.get(i).getCpf() +   " - "
                        +"Email: " + lista.get(i).getEmail() 
                        + "\n";
        return listaDono;
   }
public void Quantidade(){
        System.out.println("Quantidade de animais cadastrados no sistema: " + lista.size());
    }
}
