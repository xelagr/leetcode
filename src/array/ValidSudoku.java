package array;

import java.util.BitSet;

public class ValidSudoku {

    public static final int BOARD_SIZE = 9;
    public static final int SUB_BOX_SIZE = 3;

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            BitSet bitSet = new BitSet(BOARD_SIZE);
            for (int j = 0; j < BOARD_SIZE; j++) {
                if(!checkDigit(board[i][j], bitSet)) {
                    return false;
                }
            }
        }
        for (int j = 0; j < BOARD_SIZE; j++) {
            BitSet bitSet = new BitSet(BOARD_SIZE);
            for (int i = 0; i < BOARD_SIZE; i++) {
                if(!checkDigit(board[i][j], bitSet)) {
                    return false;
                }
            }
        }
        for (int i = 0; i < BOARD_SIZE / SUB_BOX_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE / SUB_BOX_SIZE; j++) {
                BitSet bitSet = new BitSet(BOARD_SIZE);
                for (int k = 0; k < SUB_BOX_SIZE; k++) {
                    for (int l = 0; l < SUB_BOX_SIZE; l++) {
                        if(!checkDigit(board[i * SUB_BOX_SIZE + k][j * SUB_BOX_SIZE + l], bitSet)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private Boolean checkDigit(char c, BitSet bitSet) {
        if (c != '.') {
            if (bitSet.get(Character.digit(c, 10))) {
                return false;
            }
            bitSet.set(Character.digit(c, 10));
        }
        return true;
    }

}
