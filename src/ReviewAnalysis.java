import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        double total = 0;
        for (int i = 0; i < allReviews.length; i++) {
            total += allReviews[i].getRating();
        }
        return total / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        String temp;
        ArrayList<String> com = new ArrayList<String>();
        for (int i = 0; i < allReviews.length; i++) {
            if (allReviews[i].getComment().contains("!")) {
                temp = i + "-" + allReviews[i].getComment();
                if (!temp.substring(temp.length()-1).equals("!") &&
                        !temp.substring(temp.length()-1).equals(".")) {
                    temp += ".";
                }
                com.add(temp);
            }
        }
        return com;
    }
}
