import java.io.*;


public class Main
{
	public static void main(String[] args) 
	{
	    Singletonlazy.getUniqueInstance().check();
	    Singletoneager.getInstance().check();
	
	
	}
}
