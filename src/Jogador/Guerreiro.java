package Jogador;

import Monstro.Monstro;

public class Guerreiro extends Jogador {

    public Guerreiro(String nome) {
        this.nome = nome;
        this.hpMax = 20;
        this.hp = hpMax;
        this.dano = 6;
        totalJogadores++;
    }

    public void atacar(Monstro m) {
        m.receberDano(this.dano,this);
    }

    @Override
    public void subirNivel() {
        this.nivel += 1;
        this.hpMax += 5;
        if(this.hp < this.hpMax) {
            if(this.hp > this.hpMax-5) {
                this.hp = this.hpMax;
            } else  {
                this.hp += 5;
            }
        }
        this.dano += 1;
    }



}
