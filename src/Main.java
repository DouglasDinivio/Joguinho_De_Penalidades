
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String Jogador1,Jogador2;
        int papel, bola,guardaRedes,J1Pontos,J2Pontos,ronda;
        ronda=1;
        J1Pontos=0;
        J2Pontos=0;
        System.out.println("===========================");
        System.out.println("BEM VINDO AO JOGO MULTIJOGADORES DE MARCAÇÃO DE PENALIDADES");
        System.out.println("===========================");
        System.out.println("Jogador1, Digite o teu nome:");
        Jogador1=input.next();
        System.out.println("===========================");
        System.out.println("Jogador2 Digite o teu nome:");
        Jogador2=input.next();
        System.out.println("===========================");
        System.out.println(Jogador1+" escolha entre: ");
        System.out.println("1.Marcador");
        System.out.println("2.Guarda-Redes");
        System.out.println("===========================");
        papel=input.nextInt();
        switch (papel){
            case 1:
                System.out.println("===========================");
                System.out.println(Jogador1+" é o Marcador.");
                System.out.println(Jogador2+" é o Guarda-Redes");
                System.out.println("===========================");
                System.out.println("O JOGO COMEÇOU!!!");System.out.println("===========================");
                while(ronda<5){
                    System.out.println(Jogador1+" para onde queres chutar a bola?");

                    System.out.println("1.Esquerda");
                    System.out.println("2.Direita");
                    System.out.println("3.Meio");
                    System.out.println("=================≠======================");
                    bola=input.nextInt();

                    System.out.println(Jogador2+" para onde queres saltar?");
                    System.out.println("1.Esquerda");
                    System.out.println("2.Direita");
                    System.out.println("3.Meio");
                    System.out.println("===========================");
                    guardaRedes=input.nextInt();
                    if(bola==guardaRedes){

                        System.out.println(Jogador2+"  DEFENDEU A BOLA.");
                        ronda++;
                        System.out.println("PROXIMA RONDA: Ronda "+ronda);
                        J2Pontos++;
                    }
                    if(bola!=guardaRedes){
                        System.out.println("===========================");
                        System.out.println("GOLOOO!!.."+Jogador1+" MARCOU!!");
                        ronda++;
                        System.out.println("PROXIMA RONDA Ronda "+ronda);
                        J1Pontos++;

                    }
                    System.out.println("===========================");
                    System.out.println("PONTUAÇÃO:");
                    System.out.println(Jogador1+" "+J1Pontos);
                    System.out.println(Jogador2+" "+J2Pontos);
                }
                if(J1Pontos>J2Pontos){
                    System.out.println("===========================");
                    System.out.println(Jogador1+" GANHOU O JOGO");
                }
                if(J2Pontos>J1Pontos){
                    System.out.println("===========================");
                    System.out.println(Jogador2+" GANHOU O JOGO");
                }
                break;

            case 2:
                System.out.println("===========================");
                System.out.println(Jogador1+" é o GUARDA-REDES.");
                System.out.println(Jogador2+" é o MARCADOR");
                System.out.println("===========================");
                System.out.println("O JOGO COMEÇOU!!!");System.out.println("===========================");
                while(ronda<6)	{
                    System.out.println("PROXIMA RONDA: Ronda "+ronda);
                    System.out.println("===========================");
                    System.out.println(Jogador1+" para que lado queres saltar?");
                    System.out.println("1.Esquerda");
                    System.out.println("2.Direita");
                    System.out.println("3.Meio");
                    System.out.println("===========================");
                    guardaRedes=input.nextInt();
                    System.out.println("===========================");System.out.println(Jogador2+" para que lado queres chutar a bola?");
                    System.out.println("1.Esquerda");
                    System.out.println("2.Direita");
                    System.out.println("3.Meio");
                    bola=input.nextInt();
                    System.out.println("===========================");

                    if(bola==guardaRedes){
                        System.out.println("===========================");
                        System.out.println(Jogador1+" DEFENDEU");
                        System.out.println("===========================");     ronda++;
                        J1Pontos++;

                    }
                    if(bola!=guardaRedes){
                        System.out.println("===========================");
                        System.out.println("GOLOOO!!.."+Jogador2+" MARCOU!!!");
                        ronda++;
                        J2Pontos++;
                    }
                    System.out.println("===========================");System.out.println("PONTUAÇÃO:");
                    System.out.println(Jogador1+" "+J1Pontos);
                    System.out.println(Jogador2+" "+J2Pontos);
                    System.out.println("===========================");}
                if(J1Pontos>J2Pontos){
                    System.out.println(Jogador1+" GANHOU O JOGO");
                }
                if(J2Pontos>J1Pontos){
                    System.out.println(Jogador2+" GANHOU O JOGO");
                }
                break;
        }
    }
}