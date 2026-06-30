package Item;

import Jogador.Jogador;

import java.util.ArrayList;

public class Bau {
    String nome;
    private ArrayList<Item> itensBau = new ArrayList<Item>();

    public Bau(String nome) {
        this.nome = nome;
    }

    public ArrayList<Item> getItensBau() {
        return itensBau;
    }

    public void addItemBau(Item item) {
        this.itensBau.add(item);
    }

    public void collectItemBau(Jogador jogador, Item item) {
        this.itensBau.remove(item);
        jogador.equiparItemBolsa(item);
    }
}
