package clinic.programming.training;

import java.util.ArrayList;  //interface
import java.util.List;		// implementation of this interface
import org.apache.commons.lang3.StringUtils;

public class Application {



	public int countWords(String words){ // accept string containging words
		String[] seperateWords = StringUtils.split(words, ' ');  //seperate words by spaces
		return (seperateWords == null) ? 0 : seperateWords.length; // return an int containing how many words in that string

	}

	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("hello");

		for (String greeting : greetings){
			System.out.println("Greeting: " + greeting);
		}
	}
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have four words");
		System.out.println("Word count: "	 + count);
    }
}