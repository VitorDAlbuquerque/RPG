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

        //batalha 1

        if (escolha1.equalsIgnoreCase("1")) {
            int mobe = mg.levelmob(r.nextInt(3));
            JOptionPane.showMessageDialog(null, "Você escontra um monstro de nível: " + (mobe+1));
            int esc1 = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc1, opc1[0]);

            if (esc1 == 0) {
                b.batalha(Integer.parseInt(escolha1));
            }

        }

        JOptionPane.showMessageDialog(null, "vida é: " +b.vidaplayer);

      // cenario 2
        if (escolha1.equalsIgnoreCase("2")){
            int mobe = mg.levelmob(3);
            JOptionPane.showMessageDialog(null, "Você escontra um monstro de nível: " + (mobe+1));
            int esc1 = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc1, opc1[0]);



            b.batalha(Integer.parseInt(escolha1));
        }


        if (escolha1.equalsIgnoreCase("3")) {

            int mobe = mg.levelmob(3);
            JOptionPane.showMessageDialog(null, "Você escontra um monstro de nível: " + (mobe+1));
            int esc1 = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opc1, opc1[0]);


            b.batalha(Integer.parseInt(escolha1));

        }

    }

}