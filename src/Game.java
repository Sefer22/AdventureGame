import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	
	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Adventure Game !");
		System.out.println("Write your name before starting the game :");
		// String playerName = scan.nextLine();
		player = new Player("Safar Jafarli");
		player.selectCha();
		start();
	}

	public void start() {
	while(true) {
		System.out.println();
		System.out.println("=================");
		System.out.println();
		System.out.println("Choose location,please !");
		System.out.println("1. Safe House --> There is not enemy !");
		System.out.println("2. Cave --> You can see zombie ! ");
		System.out.println("3. Forest --> You can see vampire ! ");
		System.out.println("4. Lake --> You can see bear ! ");
		System.out.println("5. Store --> You can buy weapon or armour ! ");
		System.out.print("Place where you want to go !");
		int selLoc= scan.nextInt();
		while(selLoc < 0 || selLoc > 5) {
			System.out.print("Please,choose valid location !");
			selLoc=scan.nextInt();
		}
		
		switch(selLoc) {
		case 1:
			location = new SafeHouse(player);
			break;
		case 5:	
			location = new ToolStore(player);
			break;
			default:
				location = new SafeHouse(player);
		}
		if(!location.getLocation()) {
			System.out.println("Game is over !");
			break;
		}
	}
	}
}
