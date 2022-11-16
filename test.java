import java.util.Scanner; 
// import the Scanner class 


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String sentence;
    boolean capLetter = false;
    
    // Enter username and press Enter
    System.out.println("Enter Sentence");
    sentence = myObj.nextLine();   
       
    System.out.println("Sentence is: " + sentence);        

    if (Character.isUpperCase(sentence.charAt(0)))
    {
        System.out.println("Sentence is valid ");
        capLetter = true;
    }
    else
    {
        System.out.println("Sentence is invalid ");
    }



    myObj.close();
  }
}


