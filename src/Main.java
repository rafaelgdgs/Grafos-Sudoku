public class Main {

    public static void main(String[] args) {
        int[][] exemplo = {
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

        boolean solucao = SudokuSolver.resolverSudoku(exemplo);
        if (solucao) {
            System.out.println("Solução encontrada.");
        }
        else {
            System.out.println("Não foi possivel encontrar uma solução valida.");
        }
    }
}