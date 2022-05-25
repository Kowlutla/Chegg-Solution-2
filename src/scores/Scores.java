package scores;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Scores {

	// data member to hold scores of students
	ArrayList<ArrayList<Double>> scoresList = new ArrayList<>();

	// constructor that initialize the scores Object by taking num of students
	public Scores(int NUM_STUDENTS) {
		// add numbers of students to scoreList(initially with zero scores for all
		// students)
		for (int i = 0; i < NUM_STUDENTS; i++) {
			scoresList.add(new ArrayList<Double>());
		}
	}

	// Method to setScore of specific student at specific index with give d by
	// formatting upto two decimal places
	public void setScore(int studentidx, int testidx, double d) {
		DecimalFormat df = new DecimalFormat("#.##");
		String temp = df.format(d);
		d = Double.parseDouble(temp);
		scoresList.get(studentidx).add(testidx, d);
	}

	// Method to return all Scores og student in String form
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		String s = "";
		double totalAverageSum = 0;
		for (int i = 0; i < scoresList.size(); i++) {
			s = s + "Student#" + i + "->";
			s = s + scoresList.get(i);
			double avg = getAverage(scoresList.get(i));
			totalAverageSum += avg;
			s = s + " with avg=" + df.format(avg) + "\n";
		}
		s = s + "Average: " + df.format(totalAverageSum / scoresList.size());
		return s;
	}

	// helper method to calculate average of student scores
	private double getAverage(ArrayList<Double> arrayList) {
		double sum = 0;
		for (double d : arrayList) {
			sum += d;
		}
		return sum / arrayList.size();
	}
}
