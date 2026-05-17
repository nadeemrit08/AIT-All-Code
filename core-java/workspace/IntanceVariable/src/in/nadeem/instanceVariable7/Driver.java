package in.nadeem.instanceVariable7;

class Player {

	int pid;
	String pname;
	int age;
}

public class Driver {

	public Player m1(int id) {

		Player p = new Player();
		// logic

		if (id == 7) {
			p.pid = 7;
			p.pname = "dhoni";
			p.age = 47;
		} else if (id == 18) {
			p.pid = 18;
			p.pname = "kohli";
			p.age = 36;
		} else if (id == 45) {
			p.pid = 45;
			p.pname = "rohit";
			p.age = 38;
		}

		return p;

	}

	public static void main(String[] args) {

		Driver d = new Driver();
		Player p = d.m1(7);
		System.out.println(p.pid);
		System.out.println(p.pname);
		System.out.println(p.age);
	}
}
