package Monstro;

import Jogador.Jogador;

public abstract class  Monstro  {

    Integer vida;
    Integer xpValue;
    Boolean isVivo = true;
    Integer dano;

    public void atacar(Jogador jogador){
        jogador.receberDano(dano);
    }

    public void receberDano(Integer dano, Jogador jogador){
        this.vida = this.vida - dano ;
        if(this.vida<=0){
        isVivo = false;
        jogador.receberXp(this.xpValue);
        }
    }

}
