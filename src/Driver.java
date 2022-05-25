import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {

	// Attributes
	private String name;
	private String civil_ID;
	private String email;
	private double distance;

	// Method to set name
	public void setName(String name) {
		// if passed name is null assign as no name
		if (name == null) {
			this.name = "no name";
		}
		// other wise set passed name
		else {
			this.name = name;
		}
	}

	// Method to get Name
	public String getName() {
		return this.name;
	}

	// Method to set civil_ID
	public void setCivil_ID(String CID) {
		// if civil_ID is null or length is not 12
		if (CID == null || CID.length() != 12) {
			this.civil_ID = "000000000000";
		} else {
			this.civil_ID = CID;
		}
	}

	// Method to get Civil_ID
	public String getCivil_ID() {
		return this.civil_ID;
	}

	// Method to set Mail
	public void setEmail(String email) {
		// getting compiled version of Pattern with regex '@'
		Pattern p = Pattern.compile("@");
		// creating equivalent Matcher Object to p
		Matcher m = p.matcher(email);

		// if we found regex i.e '@' in passed email
		if (m.find()) {
			this.email = email;
		} else// Otherwise assign xx@xx
		{
			this.email = "xx@xx";
		}
	}

	// Method to get email
	public String getEmail() {
		return this.email;
	}

	// Method to add distance to driver distance
	public void addDistance(double c_distance) {
		this.distance = this.distance + c_distance;
	}

	// Method to get distance
	public double getDistance() {
		return this.distance;
	}

	// Method to remove distance to driver distance
	public void removeDistance(double c_distance) {
		this.distance -= c_distance;
	}

	// Method to reset the distance
	public void resetDistance() {
		this.distance = 0;
	}

	// toString method
	public String toString() {
		return "Driver [name=" + name + ", civil_ID=" + civil_ID + ", email=" + email + ", distance=" + distance + "]";
	}
}
