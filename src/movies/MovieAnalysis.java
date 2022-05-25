package movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MovieAnalysis {
	List<Movie> movies;

	/**
	 * TODO Finish the constructor Initialize the List of movies
	 */
	public MovieAnalysis() {
		/* INSERT CODE ABOVE THIS LINE */
		this.movies=new ArrayList<Movie>();
		loadData();
	}

	/**
	 * This method has already been completed Initializes the movies list with data
	 * from a csv and initializes the ratings list for each movie with 100 random
	 * values
	 */
	public void loadData() {
		try {
			Scanner csvReader = new Scanner(new File("resources/IMDB-Movie-Data.csv"));
			String row = csvReader.nextLine();
			while (csvReader.hasNext()) {
				row = csvReader.nextLine();
				String[] data = row.split(",");
				//'Title' and 'Runtime (Minutes) columns are indices 1 and 7 respectively
				//create a new movie for each row in csv
				Movie cur = new Movie(data[0], Integer.parseInt(data[1]));
				movies.add(cur);
			}
			csvReader.close();
			//Set Ratings for movies
			Random r = new Random(5192020);
			//adds one hundred random ratings to the list for each movie
			for (Movie m : movies) {
				for (int i = 0; i < 100; i++) {
//gives us a number between 0 and 5
					int rating = r.nextInt(6);
					m.addRating(rating);
				}
			}
		} catch (FileNotFoundException f) {
			System.out.println("File not Found");
		}
	}

	/**
	 * TODO Complete this method This method should return the Movie object with the
	 * name of the function parameter 'title' or null if the movie is not in the
	 * list
	 * 
	 * @param title
	 */
	public Movie search(String title) {
		//look for all movies in movies list
		for(int i=0;i<movies.size();i++)
		{
			//get the movie at current index
			Movie current=movies.get(i);
			//if current movie name is given title
			if(current.getName().equalsIgnoreCase(title))
			{
				//return that current movie
				return current;
			}
		}
		//if no movie found with given title return null;
		return null;
	}

	/**
	 * TODO Complete this method This method should return the Movie with the
	 * highest average rating(use the getAverageRating() method you created earlier)
	 * First you might want to declare and initialize an int variable which will
	 * hold the highest rating Second, you might want to create a variable to hold
	 * the index of the highest rated movie Third, loop through the movies list and
	 * find the highest rated movie Fourth, return the movie from the movies list at
	 * the index
	 * 
	 * @return Movie with the highest rating
	 */
	public Movie getHighestRated() {
		//if no movies in movies list return null
		if(movies.size()==0)
		{
			return null;
		}
		
		double highestRating=-1;//to hold highestRating accross all movies
		int highestRatedIndex=-1;//to hold the index of highest rated movie in movies list
		
		//Look for all movies in movies list
		for(int i=0;i<movies.size();i++)
		{
			//get the movie at current index
			Movie current=movies.get(i);
			//if current movie average rating is greater than highestRating
			if(current.getAverageRating()>highestRating)
			{
				//change index of highest rating index to current index
				highestRatedIndex=i;
				//change highest rating to curent movie average ratings
				highestRating=current.getAverageRating();
			}
		}
		//return Movie at highestRating index in movies list
		return movies.get(highestRatedIndex);
	}

	/**
	 * TODO Complete this method This method should return the movie with the lowest
	 * average rating.
	 * 
	 * @return Movie object with the lowest average rating
	 */
	public Movie getLowestRated() {
		if(movies.size()==0)
		{
			return null;
		}
		double lowestRating=10;//to hold lowestRating accross all movies
		int lowestRatedIndex=-1;//to hold the index of lowest rated movie in movies list
		//Look for all movies in movies list
		for(int i=0;i<movies.size();i++)
		{
			//get the movie at current index
			Movie current=movies.get(i);
			//if current movie average rating is lesser than lowestRating
			if(current.getAverageRating()<lowestRating)
			{
				//change index of lowest rating index to current index
				lowestRatedIndex=i;
				//change lowest rating to curent movie average ratings
				lowestRating=current.getAverageRating();
			}
		}
		//return Movie at lowestRating index in movies list
		return movies.get(lowestRatedIndex);
	}

	public static void main(String[] args) {
		MovieAnalysis m = new MovieAnalysis();
		for (int i = 0; i < 10; i++) {
			System.out.println(m.movies.get(i));
		}
		Movie moana = m.search("Moana");
		if (moana != null) {
			System.out.println("Moana Found!");
		} else {
			System.out.println("Moana wasn't found");
		}
		System.out.printf("Moana rating: %.2f\n", moana.getAverageRating());
		Movie highest = m.getHighestRated();
		System.out.println("Highest Rated movie: " + highest.getName());
		Movie lowest = m.getLowestRated();
		System.out.println("Lowest Rated movie: " + lowest.getName());
	}
}