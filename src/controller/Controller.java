package controller;

public class Controller extends Thread {
	private int[] linha;
    private int indice;

    public Controller(int[] linha, int indice) {
        this.linha = linha;
        this.indice = indice;
    }

    @Override
    public void run() {
        int soma = 0;
        for (int num : linha) {
            soma += num;
        }
        System.out.println("Linha " + indice + " - Soma: " + soma);
    }
}

