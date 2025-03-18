package view;

import controller.Controller;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
        Random random = new Random();

        // Preenchendo a matriz com números aleatórios de 1 a 10
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }

        // Criando e iniciando as Threads
        for (int i = 0; i < 3; i++) {
            Controller thread = new Controller(matriz[i], i);
            thread.start();
        }
    }
}


