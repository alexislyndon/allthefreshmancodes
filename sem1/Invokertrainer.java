import java.util.*;


public class Invokertrainer
{
	public static void main(String args[]) 
	{	
		Introduction();
		Game();	
	}
	
	
	public static void Introduction() //Program Introduction, Controls and Instructions
	{
		
		System.out.println("Dota 2 Invoker Trainer");
		System.out.println("Find out how many spells you can invoke within the time limit of 30 seconds");
		System.out.println(" ");
		System.out.println(" Spells:       Combinations:");
		System.out.println("Cold Snap          QQQ");
		System.out.println("Ghost Walk         QQW");
		System.out.println("Ice Wall           QQE");
		System.out.println("EMP                WWW");
		System.out.println("Tornado	           WWQ");
		System.out.println("Alacrity           WWE");
		System.out.println("SunStrike          EEE");
		System.out.println("Forge Spirit       EEQ");
		System.out.println("Meteor             EEW");
		System.out.println("Deafening Blast    QWE");
		System.out.println(" ");
		System.out.println("Controls: Q - Quas, W - Wex E - Exort, Enter = Invoke");
		System.out.println(" ");
		System.out.println("Press A to Start");
	}
	
	
	public static void Game() //Game Code
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		//Game Started Code
		String Starter = sc.nextLine();
		if(Starter.equalsIgnoreCase("A"))
		{
			
			//Invoker Spell Names and its assigned Combinations Array
			String Invoker[][]= {{"Cold Snap","QQQ"},{"Ghost walk","QQW"},{"Ice Wall","QQE"},
								{"EMP","WWW"},{"Tornado","WWQ"},{"Alacrity","WWE"},{"Sun Strike","EEE"},
								{"Forge Spirit","EEQ"},{"Meteor","EEW"},{"Deafening Blast","QWE"}};

			//Player Score
			int score = 0;
			
			//Game Timer
			long start=System.currentTimeMillis();
			long end = start + 30*1000;
			while(System.currentTimeMillis()<end)
				{
					//Invoker Spell Output
					int randomizer = random.nextInt(Invoker.length);
					System.out.println(Invoker[randomizer][0]);
					
					//Player Spell Combinations Input and the Decision of the Program of the said Input
					String combo = sc.nextLine();
					String combox = combo.toUpperCase();
					if(sortchars(combox, Invoker[randomizer][1]))
					{
					System.out.println("--CORRECT--" + "\n");
					score++;
					}
					else
					{
					System.out.println("--WRONG--" + "\n");	
					}
				}	
			System.out.println("~TIMES UP!~");
			System.out.println("You have Invoked [" + score + "] Spells in 30 seconds");
		}
		else 
		{
			System.out.println("Press A not triggered, please reset the program");
		}
	}

	public static boolean sortchars(String s1, String s2) {

    if (s1.length() != s2.length())
      return false;
	char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a, b);
	}
}