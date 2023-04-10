package control;
import java.util.*;

import model.*;
public class Play {
//javafx scene
	private static ArrayList <Place>map;
	private User user;
	private Movable movable;
	public Play() {
		this.map = new ArrayList<Place>();
		map.add(new Place("First place", "Description of place", Dir.WALL, Dir.WALL, Dir.WALL, 1 ));
		map.add(new Place("Second place", "Descrpition number 2", Dir.WALL, Dir.WALL,0, Dir.WALL));
		//create an user and put him at base index
		user = new User("User", "User description", map.get(0));
		
	}
	public Movable getMovable() {
        return movable;
    }

    public void setMovable(Movable aMovable) {
        movable = aMovable;
    }
    
	public static ArrayList<Place> getMap(){
		return map;
	}
	void setMap(ArrayList<Place> aMap) {
		map = aMap;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User aUser) {
		user = aUser;
	}

	//check ci je vstup v poho
	public String Command(String inputstr) {
		String s = "ok";
		if(!"q".equals(inputstr) && !"n".equals(inputstr) && !"s".equals(inputstr) && !"e".equals(inputstr) && !"w".equals(inputstr)) {
			s = "Wrong command!";
		}
		else {
			s = "ok";
		}
		return s;
	}
	
	public int moveUserTo(Dir dir) { 
		return moveTo(user, dir);
	}
	
	private void goN() {
		update(moveUserTo(Dir.NORTH));
	}
	
	private void goS() {
		update(moveUserTo(Dir.SOUTH));
	}
	
	private void goE() {
		update(moveUserTo(Dir.EAST));
	}
	
	private void goW() {
		update(moveUserTo(Dir.WEST));
	}

	int moveTo(User aUser, Dir dir) {
		Place m = aUser.getPlace();
		int exit;
		switch(dir) {
			case NORTH:
				exit = m.getN();
				break;
			case SOUTH:
				exit = m.getS();
				break;
			case EAST:
				exit = m.getE();
				break;
			case WEST:
				exit = m.getW();
				break;
			default:
				exit = Dir.WALL; //ostane na rovnakom mieste
				break;
		}
		if(exit != Dir.WALL) {
			moveUserTo(aUser, map.get(exit));
		}
		return exit;
	}
	
	public int moveUserTo(User u, Place aPlace) {
		u.setPlace(aPlace);
		return 0;
	}
	
	void update(int PlaceNum) {
		String s;
		Place m = getUser().getPlace();
		if(PlaceNum == Dir.WALL) {
			s = "Wrong direction - you hit a wall! ";
		}
		else {
			s = "You are in " + m.getName() + ". " + m.getDescription();		
		}
		System.out.println(s);
	}
	
	public void Process(String S) {
		Place p = getUser().getPlace();
		if("n".equals(S)) {
			goN();
		}
		
		if("s".equals(S)) {
			goS();
		}
		
		if("e".equals(S)) {
			goE();
		}
		
		if("w".equals(S)) {
			goW();
		}
		//S="";
	}
	
	public final void showIntro() {
		System.out.println("Controls --> n[go North], e[go East], s[go South], w[go West], q[Quit].");
	}
}
