import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * 
 */

/**
 * @author shari
 *
 */
class ReviewCollectionTest {
	private ReviewCollection sc;
	private Review s1;
	private Review s2;
	private Review s3;
	private Review s4;
	private final int REVIEW_COLLECTION_SIZE = 4;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		sc = new ReviewCollection();
		s1 = new Review("0001","Batman","5","dope");
		s2 = new Review("0002","Avengers","3","cool");
		s3 = new Review("0003","Spiderman","4","love it");
		s4 = new Review("0004","Venom","3","amazing");
		sc.addReview(s1);
		sc.addReview(s2);
		sc.addReview(s3);
		sc.addReview(s4);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testAddReview() {
		//fail("Not yet implemented");
		List<Review> testSc =sc.getReviews();
		
		//assert that Song Collection is equals to song collection size 4
		assertEquals(testSc.size(), REVIEW_COLLECTION_SIZE);
		
		//ACT
		sc.addReview(s1);
		
		//assert that song collection is equals to song collection size 4 + 1
		assertEquals(sc.getReviews().size(), REVIEW_COLLECTION_SIZE+1);
	}

	


}
