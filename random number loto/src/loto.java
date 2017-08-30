import java.util.*;
public class loto {
   
	private static int randomNumArray[] = new int[7]; 
	private static int userNumbers[] = new int[7];
	private final int arraysize = 7;
   
	
	public static void main(String[] args)
	{   
		loto newArray = new loto();
       
        System.out.println("Welcome to Java loto!"); 
        System .out.println("Guess as many numbers");
        System .out.println("Test your luck! \n");
        //newArray.printArray(); 
        newArray.getUserNums(); 
        newArray.printArrayUser();
        newArray.randomNumbers();  
        newArray.linearSearch();
        
	}
	
	public int randomNumbers() 
	{   
		int i; 
		
		for(i=0 ; i < arraysize; i++) 
		{
			randomNumArray[i]= (int) (Math.random()*50);
		}
		
		return 0;
		
	} 
     public void printArray(){
		
		System.out.println("----------");
		for(int i = 0; i < arraysize; i++){
			
			System.out.print("| " + i + " | ");
			System.out.println(randomNumArray[i] + " | ");
			
			System.out.println("----------");
			
		}
		
	}
    public int getUserNums() 
    {   int numInputed = 0;
    	Scanner userNum = new Scanner(System.in); 
    	for(int i = 0; i< arraysize; i++) 
    	{
    		for(int j = 0; j == numInputed ; j++) 
    		{
    			System.out.print("Type a number between 1-49 \n"); 
    			
    			userNumbers[i] = userNum.nextInt();
    			
    		}
    	}
    	
		return 0;
    	
    } 
    
    public void printArrayUser(){
    	System.out.println("Your numbers: ");
		System.out.println("------------");
		for(int i = 0; i < arraysize; i++){
			
			System.out.print("|  " + i + "  | ");
			System.out.println(userNumbers[i] + "  | ");
			
			System.out.println("------------");
			
		}
		
	} 
    public void linearSearch( ) 
    {   
    	String matchedNums = "";
    	for(int i = 0; i < arraysize ; i++) 
    	{
    		for(int j = 0; j < arraysize; j++) 
    		{
    			if(randomNumArray[i] == userNumbers[j] ) 
    			{
    				matchedNums += " " + userNumbers[j];
    			}
    		}
    	} 
    	if(matchedNums == "") 
    	{
    		System.out.println("You matched : no numbers");
    	}
    	else 
    	{
    		System.out.println("You matched :" + matchedNums);
    	}
    	
    }
}
