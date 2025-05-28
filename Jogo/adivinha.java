import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {

        System.out.println("*********************************");
        System.out.println("*      JOGO DA ADIVINHAÇÃO      *");
        System.out.println("*********************************");

        System.out.println("Digite qual dificuldade você quer jogar (1) Fácil (2) Média (3) Difícil");
        int dificuldade = new Scanner(System.in).nextInt();

        switch (dificuldade) {
            case 1:
                System.out.println("Você escolheu jogar no Modo Fácil !");

                int numeroSecretoFacil = new Random().nextInt(25);
                int chuteFacil;
                int tentativasFacil = 0;
                boolean acertou = false;

                while(acertou == false) {

                    System.out.println("Chute um número: ");
                    chuteFacil = new Scanner(System.in).nextInt();

                    if(chuteFacil == numeroSecretoFacil){
                        System.out.println("Parabés ! Você acertou o número secreto !");
                        acertou = true;
                    }else {
                        System.out.println("Você errou ! Tente novamente !");
                        tentativasFacil++;
                    }

                    if(chuteFacil > numeroSecretoFacil){
                        System.out.println("Seu chute for maior que o número secreto !");
                    }else{
                        System.out.println("Seu chute foi menor que o número secreto !");
                    }

                    if(tentativasFacil == 15){
                        System.out.println("Suas tentativas esgotaram !");
                    }

                }
                break;

                case 2:
                    System.out.println("Você escolheu jogar na dificuldade Média !");

                    int numeroSecretoMedia = new Random().nextInt(50);
                    int chuteMedia, tentativasMedia = 0, errosMedia = 0;

                    while(tentativasMedia < 20) {

                        System.out.println("Chute um número: ");
                        chuteMedia = new Scanner(System.in).nextInt();

                        if (chuteMedia == numeroSecretoMedia) {
                            System.out.println("Parabés ! Você acertou o número secreto !");
                            break;
                        } else {
                            System.out.println("Você errou ! Tente novamente !");
                            tentativasMedia++;
                            errosMedia++;
                        }

                        if(errosMedia % 2 == 0){
                            if(chuteMedia > numeroSecretoMedia){
                                System.out.println("Você chutou um número maior que o número secreto !");
                            }else{
                            System.out.println("Voce chutou um númer menor que o número secreto !");
                            }
                        }

                        if(tentativasMedia == 20){
                            System.out.println("Suas tentativas esgotaram !");
                        }

                    }
                    break;

                    case 3:
                        System.out.println("Você escolheu jogar na dificuldade Difícil !");

                        int numeroSecretoDificil = new Random().nextInt(100);
                        int chuteDificil, tentativasDificil = 0, errosDificil = 0;

                        while(tentativasDificil < 30) {

                            System.out.println("Chute um número: ");
                            chuteDificil = new Scanner(System.in).nextInt();

                            if (chuteDificil == numeroSecretoDificil) {
                                System.out.println("Parabés ! Você acertou o número secreto !");
                                break;
                            } else {
                                System.out.println("Você errou ! Tente novamente !");
                                tentativasDificil++;
                                errosDificil++;
                            }

                            if(errosDificil % 2 == 0){
                                if(chuteDificil > numeroSecretoDificil){
                                    System.out.println("Você chutou um número maior que o número secreto !");
                                }else{
                                    System.out.println("Voce chutou um númer menor que o número secreto !");
                                }
                            }

                            if(tentativasDificil == 30){
                                System.out.println("Suas tentativas esgotaram !");
                            }

                        }
                        break;

                        default:
                            System.out.println("Opção Invalida !");
                            break;

        }

    }
}
