public class Main {

    public static void main(String[] args) {
        int[][] exemploJogoValido = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0},
                { 6, 0, 0, 1, 9, 5, 0, 0, 0},
                { 0, 9, 8, 0, 0, 0, 0, 6, 0},
                { 8, 0, 0, 0, 6, 0, 0, 0, 3},
                { 4, 0, 0, 8, 0, 3, 0, 0, 1},
                { 7, 0, 0, 0, 2, 0, 0, 0, 6},
                { 0, 6, 0, 0, 0, 0, 2, 8, 0},
                { 0, 0, 0, 4, 1, 9, 0, 0, 5},
                { 0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[][] exemploJogoInvalido = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 5},
                { 6, 0, 0, 1, 9, 5, 0, 0, 0},
                { 0, 9, 8, 0, 0, 0, 0, 6, 0},
                { 8, 0, 0, 0, 6, 0, 0, 0, 3},
                { 4, 0, 0, 8, 0, 3, 0, 0, 1},
                { 7, 0, 0, 0, 2, 0, 0, 0, 6},
                { 0, 6, 0, 0, 0, 0, 2, 8, 0},
                { 0, 0, 0, 4, 1, 9, 0, 0, 5},
                { 0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        int[][] exemploJogoQuaseCompleto = {
                { 4, 0, 2, 0, 5, 3, 8, 9, 0},
                { 0, 8, 3, 4, 9, 6, 0, 2, 5},
                { 0, 5, 9, 0, 8, 0, 4, 3, 0},
                { 0, 0, 5, 9, 4, 0, 0, 8, 0},
                { 2, 7, 8, 6, 0, 5, 0, 4, 9},
                { 0, 9, 4, 0, 0, 8, 5, 6, 0},
                { 5, 4, 6, 3, 7, 9, 2, 1, 8},
                { 8, 2, 1, 5, 6, 4, 9, 7, 3},
                { 9, 3, 7, 8, 2, 1, 6, 5, 4}
        };

        System.out.println("Solução de sudoku utilizando coloração de grafos.\n\n");

        System.out.println("Iniciando primeiro teste, jogo de sudoku valido!");
        System.out.println("Situação inicial do jogo:");
        SudokuSolver.mostrarTabuleiro(exemploJogoValido);
        if (SudokuSolver.resolverSudoku(exemploJogoValido)) {
            System.out.println("Solução encontrada.");
            SudokuSolver.mostrarTabuleiro(exemploJogoValido);
        }
        else {
            System.out.println("Não foi possivel encontrar uma solução valida.");
        }
        System.out.println();

        System.out.println("Iniciando segundo teste, jogo de sudoku invalido!");
        System.out.println("Situação inicial do jogo:");
        SudokuSolver.mostrarTabuleiro(exemploJogoInvalido);
        if (SudokuSolver.resolverSudoku(exemploJogoInvalido)) {
            System.out.println("Solução encontrada.");
            SudokuSolver.mostrarTabuleiro(exemploJogoInvalido);
        }
        else {
            System.out.println("Não foi possivel encontrar uma solução valida.");
        }
        System.out.println();

        System.out.println("Iniciando terceiro teste, jogo de sudoku quase completo!");
        System.out.println("Situação inicial do jogo:");
        SudokuSolver.mostrarTabuleiro(exemploJogoQuaseCompleto);
        if (SudokuSolver.resolverSudoku(exemploJogoQuaseCompleto)) {
            System.out.println("Solução encontrada.");
            SudokuSolver.mostrarTabuleiro(exemploJogoQuaseCompleto);
        }
        else {
            System.out.println("Não foi possivel encontrar uma solução valida.");
        }
        System.out.println();

    }
}