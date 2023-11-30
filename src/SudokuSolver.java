public class SudokuSolver {

    public static boolean resolverSudoku(int[][] tabuleiro) {
        int N = tabuleiro.length;
        return resolver(tabuleiro, N);
    }

    private static boolean resolver(int[][] tabuleiro, int N) {
        for (int linha = 0; linha < N; linha++) {
            for (int coluna = 0; coluna < N; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isNumeroSeguro(tabuleiro, linha, coluna, num)) {
                            tabuleiro[linha][coluna] = num;

                            if (resolver(tabuleiro, N)) {
                                return true;
                            }

                            tabuleiro[linha][coluna] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isNumeroSeguro(int[][] tabuleiro, int linha, int coluna, int num) {
        return !usadoNaLinha(tabuleiro, linha, num) &&
                !usadoNaColuna(tabuleiro, coluna, num) &&
                !usadoNoBloco(tabuleiro, linha - linha % 3, coluna - coluna % 3, num);
    }

    private static boolean usadoNaLinha(int[][] tabuleiro, int linha, int num) {
        for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
            if (tabuleiro[linha][coluna] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean usadoNaColuna(int[][] tabuleiro, int coluna, int num) {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            if (tabuleiro[linha][coluna] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean usadoNoBloco(int[][] tabuleiro, int blocoLinha, int blocoColuna, int num) {
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha + blocoLinha][coluna + blocoColuna] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void mostrarTabuleiro(int[][] tabuleiro) {
        for (int[] x : tabuleiro)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
