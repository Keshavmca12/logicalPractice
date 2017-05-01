package nro;

import java.util.ArrayList;

public class Player {

	private String myPlayerName;
	private int myPlayerScore;
	public String getMyPlayerName() {
		return myPlayerName;
	}

	public void setMyPlayerName(String myPlayerName) {
		this.myPlayerName = myPlayerName;
	}

	public int getMyPlayerScore() {
		return myPlayerScore;
	}

	public void setMyPlayerScore(int myPlayerScore) {
		this.myPlayerScore = myPlayerScore;
	}

	public Player (String s) {    
        myPlayerName = s;
        myPlayerScore = 0;
    }
	
	public Player(){
		
	}
	
	static final ArrayList <Player> MY_PLAYER_LIST = new ArrayList<Player>();
	static final String [] TEST_PLAYER_LIST = {"adam", "eve", "john", "mary",};
	
	public void buildPlayerList () {    
        System.out.println("Before - " + MY_PLAYER_LIST.size());
        for (String temp: TEST_PLAYER_LIST) {
            Player tempPlayer = new Player(temp);
            MY_PLAYER_LIST.add(tempPlayer);
            System.out.println("Player: " + tempPlayer.getMyPlayerName());
        }
        System.out.println("After - " + MY_PLAYER_LIST.size());
        for (Player temp: MY_PLAYER_LIST) {    
            System.out.println(temp.getMyPlayerName());    
        }
    }
	
	public static void main(String[] args) {
		new Player().buildPlayerList();
	}
}
