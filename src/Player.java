import java.util.Scanner;

public class Player {
	private int damage,healthy,money,rHealthy;
	private String name,cName;
	private Inventory inv;
	Scanner scan = new Scanner(System.in);
	
	public Player(String name) {
		this.name=name;
		this.inv = new Inventory();
	}
	
	public void selectCha() {
		switch(chaMenu()) {
		case 1:
			initPlayer("Samurai",5,21,15);
			break;
		case 2:	
			initPlayer("Hunter",7,18,20);
			break;
		case 3:
			initPlayer("Knight",8,24,5);
			break;
		default:
			initPlayer("Samurai",5,21,15);
			break;
		}
		System.out.println("Character : " + getcName() +" ,Damage : " + getDamage() + " ,Healthy : " + getHealthy() + " ,Money : " + getMoney());
	}
	
	public int chaMenu() {
		System.out.println("Choose a character,please ! ");
		System.out.println("1- Samurai , \tDamage :5 ,\tHealthy :21, \tMoney :15");
		System.out.println("2- Hunter , \tDamage :7 ,\tHealthy :18, \tMoney :20");
		System.out.println("3- Knight , \tDamage :8 ,\tHealthy :24, \tMoney :5");
		System.out.println("Your character choice :");
		int chaID = scan.nextInt();
		
		while(chaID <1 || chaID>3) {
			System.out.print("Please,select a valid character : ");
			chaID = scan.nextInt();
		}
		
		return chaID;
	}
	
	public void initPlayer(String cName,int dmg,int hlthy,int mny) {
		setcName(cName);
		setDamage(dmg);
		setHealthy(hlthy);
		setMoney(mny);
		setHealthy(hlthy);
	}
	
	public int getDamage() {
		return damage;
	} 
	public void setDamage(int damage) {
		this.damage=damage;
	}
	
	public int getHealthy() {
		return healthy;
	}
	public void setHealthy(int healthy) {
		this.healthy=healthy;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		 this.cName=cName;
	}
	public Inventory getInv() {
		return inv;
	}
	public void setInv(Inventory inv) {
		this.inv=inv;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	
}
