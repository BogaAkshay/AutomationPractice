package ExceptionHandlingAndTryCatchFinallyBlocks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Progrem is Started...");
		System.out.println("Progrem in Progres....");
		
		FileInputStream file=new FileInputStream("C:\\TEXT.txt");
		
		
		Thread.sleep(5000);
		
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		
		System.out.println("Progrem is finished..");
	}

}
