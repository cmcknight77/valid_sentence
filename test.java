import java.util.Scanner; 
// import the Scanner class 


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence;
    char c = '"';
    int count = 0;

    boolean capLetter = false;
    boolean quotesEven = false;
    boolean sentenceEnd = false;
    
    // Enter sentence and press Enter
    System.out.println("Enter Sentence");
    sentence = scan.nextLine();   

    int inputLength = sentence.length(); 
    
    //Check for Uppercase start of string

    if (Character.isUpperCase(sentence.charAt(0)))
    {
        System.out.println("Sentence is valid ");
        capLetter = true;
    }
    else
    {
        System.out.println("Sentence is invalid ");
    }

    //Check for an even amount of quotation marks ("")

    for(int i=0; i < sentence.length(); i++)
    {    if(sentence.charAt(i) == c)
            count++;
    }

    if (count % 2 == 0 ) 
    {
        System.out.println("Sentence is valid ");
        quotesEven = true;
    }
    else 
    {
        System.out.println("Sentence is invalid ");
    }

    //checking sentence ends in "!", "?", or "."

    if (sentence.charAt(inputLength - 1) == '!' || 
        sentence.charAt(inputLength - 1) == '?' ||
        sentence.charAt(inputLength - 1) == '.')
    {

    System.out.println("Sentence Valid");
    sentenceEnd = true;
    }
    else
    {
    System.out.println("Sentence invalid");
    }

    




    scan.close();
  }
}
