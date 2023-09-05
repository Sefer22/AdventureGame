
public class SafeHouse extends NormalLoc{

	SafeHouse(Player player) {
		super(player,"Safe House");
		
	}
	
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("You are well !");
		System.out.println("You are now in a safe house");
		return true;
	}
}
