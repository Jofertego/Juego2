import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner Usuario = new Scanner(System.in);
        int num=0,vida=15,User=0,puntaje=0, juego=0, turno=0, monedas=0, escudo=0, canje,canje2;
        while (juego==0){
            System.out.println("Se presentara a continuacion un juego, en el cual tiene 15 vidas, se le dara un numero aleatorio y segun el numero que sale gana puntos, escudos, gana vidas o pierde vidas.");
            if (vida==0){
                System.out.println("Ha perdido todas sus vidas, You lose 👎");
                juego=juego+1;}
            else if (puntaje>=100){
                System.out.println("El jugador ha completado el puntaje requerido, ha ganado 🏆");
                juego=juego+1;}
            System.out.println("""
                Escoja una opcion:
                1.Jugar
                2.Estado del jugador
                3.Comprar vidas
                4.Finalizar
                """);
            User= Usuario.nextInt();
            switch (User) {
                case 1:
                    turno=turno+1;
                    System.out.println("El juego ha iniciado");
                    num = (int) ((Math.random() * (10 - 1 + 1)) + 1);
                    if (num == 1) {
                        System.out.println("Salio el numero " + num + ", el jugador cae en una trampa y pierde 4 vidas ☠️☠️☠️☠️");
                            vida = vida - 4;
                    }
                    if (num == 2) {
                        System.out.println("Salio el numero " + num + ", el jugador recibe ataque enemigo y pierde 3 vidas ☠️☠️☠️");
                            vida = vida - 3;
                    }
                    if (num == 3) {
                        System.out.println("Salio el numero " + num + ", el jugador recibe daño leve y pierde 2 vidas ☠️☠️");
                            vida = vida - 2;
                    }
                    if (num == 4) {
                        System.out.println("Salio el numero " + num + ", el jugador encontro una pocion por lo cual gana dos vidas ❤️❤️");
                        vida = vida + 2;
                    }
                    if (num == 5) {
                        System.out.println("Salio el numero " + num + ", el jugador encontro un botin, gana 5 monedas 🪙🪙🪙🪙🪙");
                        monedas = monedas + 5;
                    }
                    if (num == 6) {
                        System.out.println("Salio el numero " + num + ", el jugador supera una mision y gana 10 puntos 🥳");
                        puntaje = puntaje + 10;
                    }
                    if (num == 7) {
                        System.out.println("Salio el numero " + num + ", el jugador obtiene 1 escudo 🛡️");
                        escudo = escudo + 1;
                    }
                    if (num == 8) {
                        System.out.println("Salio el numero " + num + ", el jugador encuentra un tesoro, gana 10 monedas y 5 puntos 🪙🥳");
                        puntaje = puntaje + 5;
                        monedas = monedas + 10;
                    }
                    if (num == 9) {
                        System.out.println("Salio el numero " + num + ", el jugador enfrenta un ataque critico y pierde 5 vidas, si tiene escudo solo pierde una vida ☠️");
                        if (escudo>0){
                            System.out.println("Se utilizo un escudo, pierde una vida");
                            escudo=escudo-1;
                            vida=vida-1;
                        }
                        else
                            vida=vida-5;
                    }
                    if (num == 10) {
                        System.out.println("Salio el numero " + num + ", el jugador encuentra un premio legendario, gana 3 vidas 10 monedas y 20 puntos ❤️🪙🥳");
                        puntaje = puntaje + 20;
                        monedas = monedas + 10;
                        vida = vida + 3;
                    }
                        break;
                case 2:
                    System.out.println("El jugador tiene " + vida + " vida/s, " + puntaje + " puntos, "+monedas+" monedas, "+escudo+" escudos y ha jugado "+turno+" turnos.");
                    break;
                case 3:
                    System.out.println("Tiene "+monedas+" monedas, cada 1 vida equivale a 8 monedas.");
                    canje=monedas/8;
                    canje2=monedas%8;
                    if (canje>0) {
                        System.out.println("Se le daran " + canje + " vidas y le quedan " + canje2 + " monedas");
                        vida=vida+canje;
                    }
                    System.out.println("Monedas insuficientes para hacer el canje.");
                    break;
                case 4:
                    juego = juego + 1;
                    System.out.println("El juego ha acabado con " + vida + " vida/s, " + puntaje + " puntos, "+monedas+" monedas, "+escudo+" escudos y ha jugado "+turno+" turnos.");
                    break;
            }
        }
    }
}
