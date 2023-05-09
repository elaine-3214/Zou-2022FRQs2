import java.util.ArrayList;

public class ReviewTester {
    public static void main(String[] args) {
        System.out.println("------- Q3 Part A Testing --------");
        Review r1 = new Review(4, "Good! Thx");
        Review r2 = new Review(3, "OK site");
        Review r3 = new Review(5, "Great!");
        Review r4 = new Review(2, "Poor! Bad.");
        Review r5 = new Review(3, "");
        Review[] reviews = {r1, r2, r3, r4, r5};
        ReviewAnalysis analysis = new ReviewAnalysis(reviews);
        boolean testPass = true;
        double returnVal = analysis.getAverageRating();
        System.out.println(returnVal);
        if (returnVal != 3.4) {
            testPass = false;
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }

        System.out.println("\n------- Q3 Part B Testing --------");
        testPass = true;
        ArrayList<String> returnList = analysis.collectComments();
        System.out.println(returnList);
        if (returnList.size() != 3) {
            testPass = false;
        } else {
            if (!returnList.get(0).equals("0-Good! Thx.")
                    || !returnList.get(1).equals("2-Great!")
                    || !returnList.get(2).equals("3-Poor! Bad.")) {
                testPass = false;
            }
        }
        if (testPass) {
            System.out.println("--> TEST PASSED");
        } else {
            System.out.println("--> !!!!!TEST FAILED!!!!!");
        }
    }
}
