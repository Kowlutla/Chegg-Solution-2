package scores;

public class ExamF_6 {

	public static void main(String[] args) {
		
		int NUM_STUDENTS=(int)(20.0*Math.random()+1.0);
		Scores classscores=new Scores(NUM_STUDENTS);
		for(int studentidx=0;studentidx<NUM_STUDENTS;studentidx++)
		{
			for(int testidx=0;testidx<(150.0*Math.random());testidx++)
			classscores.setScore(studentidx,testidx,100.0*Math.random());
		}
		
		System.out.printf("%s",classscores);
	}

}
