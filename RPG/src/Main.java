import java.util.Scanner;
import perso.*;
import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        perso j = new perso();
        mob m = new mob();
        mob2 m2 = new mob2();
        mob3 m3 = new mob3();
        mobgeral mg = new mobgeral();
        String[] opc1 = {"Lutar", "Fugir"};
        Random r = new Random();
        batalha b = new batalha();
        int vidaplayer = j.vidap;

        //aa
        String escolha1 = JOptionPane.showInputDialog("O que deseja fazer? \n 1. Ir para a floresta \n 2. Ir para as cavernas \n 3. Ir para a cachoeira");

        if (escolha1.equalsIgnoreCase("1")) {
            int mobe = mg.levelmob(3);
            JOptionPane.showMessageDialog(null, "Você escontra um monstro de nível: " + (mobe+1));
            int esc1 = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc1, opc1[0]);

            if (esc1 == 0) {
                b.batalha(Integer.parseInt(escolha1));
                //   for (int vidamob = m.vida; vidamob > 0;){
                //      esc1 = JOptionPane.showOptionDialog(null, "A vida do monstro é: " +vidamob + " Sua vida é: " +j.vida+ " O que deseja fazer?" , "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc1, opc1[0]);
                //     if (esc1 == 0){
                //        vidamob = m.vidam(r.nextInt(j.danomax) + 1);

                //      if (vidaplayer <= 0){
                //        JOptionPane.showMessageDialog(null, "Você morreu! o mob ficou com: " +vidamob +" de vida e você com: " +vidaplayer);
                //  }
                //if (vidamob <= 0){
                //  JOptionPane.showMessageDialog(null, "Parabéns! Você ganhou! Você ficou com: "  + vidaplayer + " de vida");
                //}
                //}

                //}
                //}

            }

        }

        JOptionPane.showMessageDialog(null, "vida é: " +b.vidaplayer);

      // cenario 2
        if (escolha1.equalsIgnoreCase("2")){
            int mobe = mg.levelmob(3);

        JOptionPane.showMessageDialog(null, "você encontoru um troll de nível: " + (mobe + 1));
        JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc1, opc1[0]);
        }


        if (escolha1.equalsIgnoreCase("3")) {

            int mobe = mg.levelmob(3);
            JOptionPane.showMessageDialog(null, "Você encontrou um jacaré de nivel: " +(mobe+1));

        }

    }

}