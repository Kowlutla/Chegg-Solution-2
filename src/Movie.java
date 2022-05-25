
public class Movie {
	// Two instance variables: title of type String and rating of type int
	private String title;
	private int rating;

	// Constructor that takes a tile and rating as arguments
	public Movie(String title, int rating) {
		this.title = title.toUpperCase();
		if (rating >= 0 && rating <= 10) {
			this.rating = rating;
		}
	}

	// Constructor copy constructor
	public Movie(Movie movie) {
		this.title = movie.title;
		this.rating = movie.rating;
	}

	// Setter method to set title of movie
	public void setTitle(String title) {
		this.title = title.toUpperCase();// movie in upper case
	}

	// Setter method to set rating of movie
	public void setRating(int rating) {
		// if entered rating between 0 and 10 (inclusive)
		if (rating >= 0 && rating <= 10) {
			this.rating = rating;
		}
	}

	// Getter method to get title of movie
	public String getTitle() {
		return title;
	}

	// Getter method to get rating of movie
	public int getRating() {
		return rating;
	}

	// Method getCategory that takes no arguments and return something of type char.
	public char getCategory() {
		// movie is considered A category if its rating is 9 or 10
		if (this.rating == 9 || this.rating == 10) {
			return 'A';
		}
		// B category if the rating is 7 or 8
		else if (this.rating == 7 || this.rating == 8) {
			return 'B';
		}
		// C category if the rating is 5 or 6
		else if (this.rating == 5 || this.rating == 6) {
			return 'C';
		}
		// D category if the rating is 3 or 4
		else if (this.rating == 3 || this.rating == 4) {
			return 'D';
		}
		// F category otherwise.
		else {
			return 'F';
		}
	}
}
