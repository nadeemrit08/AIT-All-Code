package in.nadeem.instanceVariable6;

class Player {
	int playerId;
	String PlayerName;
}

public class Driver {

	public Player getData(int id) {

		Player p = new Player();
		if (id == 7) {
			p.playerId = 7;
			p.PlayerName = "Dhoni";
		} else if (id == 18) {
			p.playerId = 18;
			p.PlayerName = "Kohli";
		} else if (id == 45) {
			p.playerId = 45;
			p.PlayerName = "Rohit";
		}
		return p;

	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Player player = d.getData(7);
		System.out.println(player.playerId + " , " + player.PlayerName);
	}

}
