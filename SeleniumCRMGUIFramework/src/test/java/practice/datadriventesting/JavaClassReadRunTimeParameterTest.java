package practice.datadriventesting;

public class JavaClassReadRunTimeParameterTest 
{
	// this is the argument (args)where we can receive the run time parameter from cmd
public static void main(String[] args) 
{
	System.out.println(args.length);
	for(String var:args)
	{
	System.out.println(var);
	}
}
}
