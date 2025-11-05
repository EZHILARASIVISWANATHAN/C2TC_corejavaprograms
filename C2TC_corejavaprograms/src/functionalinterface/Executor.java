package functionalinterface;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Message m1=(n)->{System.out.println("Enter greetings:"+n);};
		m1.greetings("Welcome"); 
	}

}
