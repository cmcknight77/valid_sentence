
import java.util.Scanner; 
// import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String sentence;
    char c = '"';
    char c2 = '.';
    int count = 0;
    int count2 = 0;

    boolean capLetter = false;
    boolean quotesEven = false;
    boolean sentenceEnd = false;
    boolean periodCheck = false;
    boolean numbersValid = false;
    
    // Enter sentence and press Enter
    System.out.println("Enter Sentence");
    sentence = scan.nextLine();   

    int inputLength = sentence.length(); 
    
    //Check for Uppercase start of string

    if (Character.isUpperCase(sentence.charAt(0)))
    {
        capLetter = true;
    }

    //Check for an even amount of quotation marks ("")

    for(int i=0; i < sentence.length(); i++)
    {    if(sentence.charAt(i) == c)
            count++;
    }
    if (count % 2 == 0 ) 
    {
        quotesEven = true;
    }

    //checking sentence ends in "!", "?", or "."

    if (sentence.charAt(inputLength - 1) == '!' || 
        sentence.charAt(inputLength - 1) == '?' ||
        sentence.charAt(inputLength - 1) == '.')
    {
    sentenceEnd = true;
    }

    // checking sentence doesn't contain "." throughout

    for(int x=0; x < sentence.length() - 2; x++)
    {    if(sentence.charAt(x) == c2)
            count2++;
    }
    if(count2 == 0)
    {
        sentenceEnd = true;
    }

    //Numbers below 13 are spelled out

    char[] c3 = sentence.toCharArray();
    StringBuilder sb = new StringBuilder();
    for(char c4 : c3)
    {
       if(Character.isDigit(c4))
       {
          sb.append(c4);
       }
    }
    String string = sb.toString();
    int z = 0;

    try{
    z = Integer.parseInt(string);
    }
    catch (NumberFormatException ex)
    {
        ex.printStackTrace();
    }

    if (z > 12)
    {
        numbersValid = true;
    }
    else if (z < 13)
    {
        numbersValid = false;
    }

    //Checking everything is valid

    if (capLetter == true &&
    quotesEven == true &&
    sentenceEnd == true &&
    periodCheck == true &&
    numbersValid == true)
    {
        System.out.println("Sentence valid");
    }
    else
    {
        System.out.println("Sentence invalid");
    }
    scan.close();
  }
}
