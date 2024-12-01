public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[9][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                // Sol dikey
                if ((j == 0) && (i > 0 && i < 8)) {
                    letter[i][j] = " * ";
                }
                // * * * * üst
                else if (i == 0 && j < 4) {
                    letter[i][j] = " * ";
                }
                // * * * * orta
                else if (i == 4 && j < 4) {
                    letter[i][j] = " * ";
                }
                // * * * * alt
                else if (i == 8 && j < 4) {
                    letter[i][j] = " * ";
                }
                // Sağ dikey üst
                else if ((j == 4) && (i > 0 && i < 4)) {
                    letter[i][j] = " * ";
                }
                // Sağ dikey alt
                else if ((j == 4) && (i > 4 && i < 8)) {
                    letter[i][j] = " * ";
                }
                else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
