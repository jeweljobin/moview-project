import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovieCollectionTest {

	private MovieCollection mc;
	private Movie m1;
	private Movie m2;
	private String name;

	private final int MOVIE_COLLECTION_SIZE = 2;

	@BeforeEach
	void setUp() throws Exception {

		mc = new MovieCollection();
		m1 = new Movie("100", "testName",
				"https://t3.ftcdn.net/jpg/02/48/42/64/360_F_248426448_NVKLywWqArG2ADUxDq6QprtIzsF82dMF.jpg",
				"testGenre", "testDesc", "PG", "testTrailer");
		m2 = new Movie("101", "testName2",
				"https://t3.ftcdn.net/jpg/02/48/42/64/360_F_248426448_NVKLywWqArG2ADUxDq6QprtIzsF82dMF.jpg",
				"testGenre2", "testDesc2", "PG2", "testTrailer");
		mc.addMovie(m1);
		mc.addMovie(m2);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetMovies() {
		List<Movie> testMc = mc.getMovies();
		// Assert that get movies function gets the existing movies
		assertEquals(testMc.size(), 2);

	}

	@Test
	void testAddMovie() {
		List<Movie> testMc = mc.getMovies();
		// Assert that movie Collection is equals to movie collection size 1
		assertEquals(testMc.size(), MOVIE_COLLECTION_SIZE);
		// Act
		mc.addMovie(m1);
		// Assert that song collection is equals to movie collection size 1 + 1
		assertEquals(mc.getMovies().size(), MOVIE_COLLECTION_SIZE + 1);
	}

	@Test
	void testDeleteMovie() {
		List<Movie> testMc = mc.getMovies();
		// Assert that movie Collection is equals to movie collection size 1
		assertEquals(testMc.size(), MOVIE_COLLECTION_SIZE);
		// Act
		mc.deleteMovie(m1);
		// Assert that song collection is equals to movie collection size 1 + 1
		assertEquals(mc.getMovies().size(), MOVIE_COLLECTION_SIZE - 1);
	}

	@Test
	void testUpdateMovie() {
		List<Movie> testMc = mc.getMovies();
		//Act
		mc.updateMovie(m1);
		// Assert that movie got updated
		assertEquals(m1.movieName, "Updated Movie");
	}
	
	@Test
	void testFindMovie() {
	List<Movie> testMc = mc.getMovies();
	name = mc.getThisMovie(m1);
	assertEquals(name, "testName");
	}

}
