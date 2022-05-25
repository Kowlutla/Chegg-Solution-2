import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		String re="^[a-z]*[a-z][-]";
		Pattern p=Pattern.compile(re);
		Matcher m=p.matcher("b-kowulta-bis good boy");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}
