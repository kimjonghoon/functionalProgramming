package net.java_school.examples;

public class Movie {
	private final String title;
	private final int releaseDate;
	private final double userRatings;

	public Movie(String title, int releaseDate, double userRatings) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.userRatings = userRatings;
	}

	public String getTitle() {
		return title;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public double getUserRatings() {
		return userRatings;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getTitle());
		sb.append(",");
		sb.append(this.getReleaseDate());
		sb.append(",");
		sb.append(this.getUserRatings());

		return sb.toString();
	}

	public static boolean isPopular(Movie movie) {
		return movie.getUserRatings() >= 8.0;
	}

}