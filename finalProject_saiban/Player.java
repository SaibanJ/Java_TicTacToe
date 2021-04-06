/**
 * Created By: James Saiban
 * Date Created: 
 * Description:
 *
 * Modification Log
 * Date		Programmer		Desc
 * 			SaibanJ
 */
package finalProject_saiban;

// implements the Info interface, inherits exception
public class Player extends Exception implements Info {
	
	//Instance variables using encapsulation//assessor methods will allow me to use these instance variables within demo.
	private String name;
	private int age;
	
	
	//Constructor
	public Player()
	{
		name = "Charles";
		age = 21;
	}
	
	//overload constructor
	public Player(String n, int a)
	{
		name = n;
		age = a;
	}
	
	void setName(String n) 
	{
		name = n;
	}
	
    public String getName() 
	{
		return name;
	}
	
	void setAge(int a) 
	{
		age = a;
	}
	
	int getAge() 
	{
		return age;
	}


	
	public void put(char ch) 
	{
		
		age = ch;
	}


	
	public char get() {
		
		return 0;
	}

	@Override
	public void placer(char ansa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char subgetter() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
