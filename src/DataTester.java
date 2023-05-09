public class DataTester {
    public static void main(String[] args) {
        System.out.println("------- Q4 Part A Testing --------");
        boolean testPass = true;
        int[][] test1 = new int[5][6]; // initializes to all 0's
        Data d1 = new Data(test1);
        for (int i = 1; i <= 20; i++) {
            test1 = new int[5][6];
            d1 = new Data(test1);
            d1.repopulate();
            int[][] returnVal = d1.getGrid();
            if (returnVal.length != 5 || returnVal[0].length != 6) {
                testPass = false;
            } else {
                for (int[] row : returnVal) {
                    for (int value : row) {
                        if (value <= 0 || value > Data.MAX || value % 10 != 0 || value % 100 == 0) {
                            testPass = false;
                        }
                    }
                }
            }
            if (!testPass) {
                i = 20;
            }
        }
        for (int[] row : d1.getGrid()) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
            System.out.println("--> All numbers must be between 1 and MAX,");
            System.out.println("--> divisible by 10, and NOT divisible by 100");
        }

        System.out.println("\n------- Q4 Part B Testing --------");
        testPass = true;
        int[][] test2 = {{10, 50, 40},
                         {20, 40, 20},
                         {30, 50, 30}};
        Data d2 = new Data(test2);
        int returnVal = d2.countIncreasingCols();
        System.out.println(returnVal);
        if (returnVal != 1) {
            testPass = false;
        }
        int[][] test3 = {{10, 540, 440, 440},
                         {220, 450, 440, 190}};
        Data d3 = new Data(test3);
        returnVal = d3.countIncreasingCols();
        System.out.println(returnVal);
        if (returnVal != 2) {
            testPass = false;
        }
        int[][] test4 = {{10, 20, 30, 40},
                         {100, 200, 300, 400},
                         {5, 6, 7, 8}};
        Data d4 = new Data(test4);
        returnVal = d4.countIncreasingCols();
        System.out.println(returnVal);
        if (returnVal != 0) {
            testPass = false;
        }
        int[][] test5 = {{10, 20, 30, 40, 50},
                         {20, 25, 35, 40, 50},
                         {30, 25, 40, 40, 60},
                         {30, 30, 40, 30, 60}};
        Data d5 = new Data(test5);
        returnVal = d5.countIncreasingCols();
        System.out.println(returnVal);
        if (returnVal != 4) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}
