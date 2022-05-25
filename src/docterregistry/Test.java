package docterregistry;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Doctor d1=new Doctor("kowlutla","101","A");
		Doctor d2=new Doctor("hindu","102","b");
		Doctor d3=new Doctor("roopa","103","c");
		Doctor d4=new Doctor("hari","104","d");
		Doctor d5=new Doctor("hari","105","e");
		Doctor d6=new Doctor("deepu","106","f");
		
		DoctorRegistry dr=new DoctorRegistry(5,"KURNOOL ");
		System.out.println(dr.register(d1));
		System.out.println(dr.register(d2));
		System.out.println(dr.register(d3));
		System.out.println(dr.register(d4));
		System.out.println(dr.register(d5));
		System.out.println(dr.register(d6));
		System.out.println(Arrays.toString(dr.getDoctorList()));
		
		System.out.println(dr.deRegister("103"));
		
		System.out.println(Arrays.toString(dr.getDoctorList()));
		
	}

}
