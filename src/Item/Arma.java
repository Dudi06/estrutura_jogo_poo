package Item;

import Jogador.Jogador;

public class Arma extends Item implements Equipavel {
    Integer dano;


    public void equipar(Jogador jogador) {
        jogador.equiparItemBolsa(this);
        jogador.aumentarDanoArma(this.dano);
    }
    public void desequipar(Jogador jogador) {
        jogador.diminuirDanoArma(this.dano);
        jogador.removerItemEquipado(this);
    }
    public Integer getDano() {
        return dano;
    }
}
