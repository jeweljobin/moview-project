
import java.util.*;

public class MovieCollection {

    private ArrayList<Movie> movies = new ArrayList<>();
    private int capacity;
    private boolean movieResult;

    public MovieCollection() {
    	

        this.capacity = 20;
    }

    public MovieCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<Movie> getMovies() {
        return movies;
    }
    

    public void addMovie(Movie movie) {
    	if(movies.size() != capacity) {
    		movies.add(movie);
    	}
    }
    
    public void deleteMovie(Movie movie) {
    
    	movies.remove(movie);
    
    }
    
    public void updateMovie(Movie movie) {
    	movie.movieName = "Updated Movie";
    }
    
    public String getThisMovie(Movie movie) {
    	String name = movie.movieName;
    	movieResult = movies.contains(name);
    	return name;
    }
    
}
