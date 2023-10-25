package perso;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;


public class batalha {

    int escolha;
    Scanner a = new Scanner(System.in);
    perso j = new perso();
    mob m = new mob();
    mob2 m2 = new mob2();
    mob3 m3 = new mob3();
    mobgeral mg = new mobgeral();
    Random r = new Random();
    String[] opc1 = {"Lutar", "Fugir"};
    public int vidaplayer = j.vida;
    public void batalha(int escolha) {


        for (int vidamob = m.vida; vidamob > 0; ) {
            escolha = JOptionPane.showOptionDialog(null, "A vida do monstro é: " + vidamob + " Sua vida é: " + vidaplayer + " O que deseja fazer?", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc1, opc1[0]);
            if (escolha == 0) {
                vidamob = m.vidam(r.nextInt(j.danomax) + 1);
                vidaplayer = j.vidap(r.nextInt(m.danomax)+1);
                if (vidaplayer<= 0) {
                    JOptionPane.showMessageDialog(null, "Você morreu! o mob ficou com: " + vidamob + " de vida e você com: " + vidaplayer);
                break;
                }
                if (m.vida <= 0) {
                    JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou! Você ficou com: " + vidaplayer + " de vida");
                }
            }

        }
    }
}
