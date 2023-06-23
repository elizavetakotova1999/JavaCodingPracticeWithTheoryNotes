package SurroundedRegions;

public class SurroundedRegions {

    public static void main(String[] args) {

    }


    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Проходимо по першому та останньому рядку і знаходимо 'O', змінюючи їх та їх сусідів на спеціальний символ '#'
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][cols - 1] == 'O') {
                dfs(board, i, cols - 1);
            }
        }

        // Проходимо по першому та останньому стовпці, крім крайніх точок, і знаходимо 'O', змінюючи їх та їх сусідів на символ '#'
        for (int i = 0; i < cols; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i);
            }
            if (board[rows - 1][i] == 'O') {
                dfs(board, rows - 1, i);
            }
        }

        // Проходимо по всіх клітинах матриці, змінюючи 'O' на 'X', а '#' на 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        int rows = board.length;
        int cols = board[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != 'O') {
            return;
        }

        // Змінюємо 'O' на '#'
        board[row][col] = '#';

        // Рекурсивно викликаємо dfs для всіх сусідніх клітин
        dfs(board, row - 1, col);
        dfs(board, row + 1, col);
        dfs(board, row, col - 1);
        dfs(board, row, col + 1);
    }

}
