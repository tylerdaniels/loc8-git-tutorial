public class Main
{
    public static void main(String[] args)
    {
	    System.out.println("Hello, " + Main.getWorldName(args));
    }

    private static String getWorldName(String[] args)
    {
    	if (args == null || args.length == 0 || args[0].isEmpty())
    		return "World";
    	return args[0];
    }
}