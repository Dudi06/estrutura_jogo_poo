package Item;

import Jogador.Jogador;

public class PocaoCura extends Item implements Consumivel {
    Integer cura = 10;

    public void consumir(Jogador jogador) {
        if(jogador.checkHp() > jogador.checkHpMax()) {
            cura = jogador.checkHpMax() - jogador.checkHp();
        }
        jogador.cura(cura);
        jogador.removerItemBolsa(this);
    }
}
