package Jogador;


import Item.Item;

import java.util.ArrayList;

public abstract class Jogador implements Nivel {
    String nome;
    Integer hpMax;
    Integer hp;
    Integer nivel = 1;
    Integer xp = 0;
    Integer dano;
    ArrayList<Item> itensBolsa = new ArrayList<Item>();
    ArrayList<Jogador> listaDeAmigos = new ArrayList<Jogador>();
    ArrayList<Item> itensEquipados = new ArrayList<Item>();
    protected static int totalJogadores = 0;

    public static int getTotalJogadores() {
        return totalJogadores;
    }

    public void addAmigo(Jogador amigo){
        this.listaDeAmigos.add(amigo);
        amigo.listaDeAmigos.add(this);
    }

    public void removeAmigo(Jogador amigo){
        this.listaDeAmigos.remove(amigo);
        amigo.listaDeAmigos.remove(this);
    }

    public ArrayList<String> getListaDeAmigos(){
        ArrayList<String> nomeAmigos = new ArrayList<String>();
        for(Jogador amigo : this.listaDeAmigos){
            nomeAmigos.add(amigo.checkNome());
        }
        return nomeAmigos;
    }

    public void subirNivel() {}

    public void receberDano(Integer dano) {
        this.hp -= dano;
        if(this.hp <= 0) {
            System.out.println("Jogador morreu");
            System.exit(0);
        }
    }

    public void receberXp(Integer xp) {
        this.xp += xp;
        if(this.xp >= this.nivel*10) {
            this.xp = this.xp-this.nivel*10;
            subirNivel();
        }
    }

    public Integer checkXp() {
        return this.xp;
    }
    public Integer checkHp() {
        return this.hp;
    }
    public Integer checkHpMax() {
        return this.hpMax;
    }
    public String checkNome() {
        return this.nome;
    }
    public Integer checkNivel() {
        return this.nivel;
    }
    public void coletarItemBolsa(Item item) {
        this.itensBolsa.add(item);
    }
    public void removerItemBolsa(Item item) {
        this.itensBolsa.remove(item);
    }
    public ArrayList<Item> getItensBolsa() {
        return this.itensBolsa;
    }
    public void equiparItemBolsa(Item item) {
        this.itensEquipados.add(item);
        this.itensBolsa.remove(item);
    }
    public void removerItemEquipado(Item item) {
        this.itensEquipados.remove(item);
        this.itensBolsa.add(item);
    }
    public ArrayList<Item> getItensEquipados() {
        return this.itensEquipados;
    }
    public void aumentarDanoArma(Integer dano) {
        this.dano += dano;
    }
    public void diminuirDanoArma(Integer dano) {
        this.dano -= dano;
    }
    public void cura(Integer cura){
        this.hp += cura;
    }
}
