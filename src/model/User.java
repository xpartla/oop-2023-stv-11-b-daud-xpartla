package model;
import control.*;

public class User extends Base implements Movable{
	private Place place; //atm position
	//Play play = new Play();

	public User(String aName, String aDescription, Place aPlace) {
		super(aName, aDescription);
		this.place = aPlace;
		
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
	
    @Override
    public int moveTo(Dir dir) {
        int exit = getPlace().moveTo(dir);
        if(exit != Dir.WALL) {
            setPlace(Play.getMap().get(exit));
        }
        return exit;
    }

}
