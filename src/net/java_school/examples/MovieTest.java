package net.java_school.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieTest {

	static List<Movie> filterMovies(List<Movie> movies, Predicate<Movie> p) {
		List<Movie> result = new ArrayList<>();
		for (Movie movie : movies) {
			if (p.test(movie)) {
				result.add(movie);
			}
		}

		return result;
	}

	public static void main(String[] args) throws Exception {
		String fileName = "./src/movies.txt";
		String str = null;
		List<Movie> movies = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((str = br.readLine()) != null) {
				String[] arr = str.split(",");
				Movie movie = new Movie(arr[0], Integer.parseInt(arr[1]), Double.parseDouble(arr[2]));
				movies.add(movie);
			}
		}

		//List<Movie> result = filterMovies(movies, new Rated8OrAbovePredicate()); //1.
		//List<Movie> result = filterMovies(movies, (Movie movie) -> movie.getUserRatings() >= 8.0); //2.
		//List<Movie> result = filterMovies(movies, Movie::isPopular); //3.
		Predicate<Movie> popularMovies = Movie::isPopular;
		//List<Movie> result = filterMovies(movies, popularMovies.negate()); //4.
		List<Movie> result = filterMovies(movies, popularMovies.negate().and(m -> m.getReleaseDate() > 2015)); //5.

		for (Movie movie : result) {
			System.out.println(movie);
		}

	}

}