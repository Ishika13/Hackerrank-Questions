class Person {
    private int a;	
  
	public Person(int initialAge) {
  		
           if (initialAge > 0) {
                a = initialAge;
            } else {
                System.out.println("Age is not valid, setting age to 0.");
                a = 0;
            }
	}

	public void amIOld() {
  		
        if (a < 13) System.out.println("You are young.");
        else if (a < 18) System.out.println("You are a teenager.");
        else System.out.println("You are old.");
	}

	public void yearPasses() {
  		// Increment this person's age.
        a++;
	}


public static void main(String[] args){

}
}


