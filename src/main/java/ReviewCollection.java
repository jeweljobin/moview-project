import java.util.ArrayList;
import java.util.List;



/**
 * 
 */

/**
 * @author shari
 *
 */
public class ReviewCollection {
	private ArrayList<Review> reviews = new ArrayList<>();
    private int capacity;

    public ReviewCollection() {
    	

        this.capacity = 20;
    }

    public ReviewCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
    	if(reviews.size() != capacity) {
    		reviews.add(review);
    	}
    }

}
