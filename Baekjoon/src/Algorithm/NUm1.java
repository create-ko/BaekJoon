package Algorithm;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Timer;

/**
 * Created by seung_hee on 2017. 6. 17..
 */
public class NUm1 {
    public static void main(String args[]){
        int board[][] = new int[][]{{11,13,15,16},{12,1,4,3},{10,2,7,8},{5,14,6,9}};
        int num[] = new int[]{14,3,2,4,13,1,16,11,5,15};

        long startTime = System.currentTimeMillis();
        System.out.println(solution(board, num));
        long endTime = System.currentTimeMillis();

        System.out.println((endTime-startTime));

    }



    public static int solution(int[][] board, int[] nums) {
        ArrayList<Integer> arrNums = new ArrayList<Integer>();
        for(int count = 0; count < nums.length; count++){
            arrNums.add(nums[count]);
        }

        int[] verticalBingo = new int[board[0].length];
        int bingoCount = 0;
        int curRowState = 0;
        int leftToBingo = 0;
        int rightToBingo = 0;

        // 행 비교
        for(int i = 0; i < board.length; i++){
            // 열 비교
            for(int j = 0; j < board[i].length; j++){
                // nums와 비교
                for(int count = 0; count < arrNums.size(); count++){
                    if(board[i][j] == arrNums.get(count)){
                        board[i][j] = 0;
                        arrNums.remove(count);
                        break;
                    }
                }
                curRowState += board[i][j];
                verticalBingo[j] += board[i][j];

                // 대각선
                if(i == j) {
                    leftToBingo += board[i][j];
                }
                if((i+j) == (board.length - 1)) {
                    rightToBingo += board[i][j];
                }

            }
            if(curRowState == 0) bingoCount++;
            curRowState = 0;
        }
        // 세로 빙고 개수
        for(int count = 0; count < verticalBingo.length; count++){
            if(verticalBingo[count] == 0) bingoCount++;
        }

        bingoCount = bingoCount + (rightToBingo == 0 ? 1:0) + (leftToBingo == 0 ? 1:0);

        return  bingoCount;
    }
}

