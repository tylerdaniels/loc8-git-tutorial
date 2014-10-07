import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
	    System.out.println("Hello, " + Main.getWorldName());
	    System.out.println("Currently it is " + new Date().toString());
    }

    private static String getWorldName()
    {
    	return "World";
    }
}