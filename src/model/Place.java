package model;

public class Place extends Base implements Movable{

	private int n,s,w,e;

	public Place(String aName, String aDescription, int aN, int aS, int aW, int aE) {
		super(aName, aDescription);
		this.n = aN;
		this.s = aS;
		this.w = aW;
		this.e = aE;
	}
	
	
	public int getN() {
		return n;
	}
	public void setN(int aN) {
		this.n = aN;
	}
	
	
	public int getS() {
		return s;
	}
	public void setS(int aS) {
		this.s = aS;
	}
	
	
	public int getE() {
		return e;
	}
	public void setE(int aE) {
		this.e = aE;
	}
	
	
	public int getW() {
		return w;
	}
	public void setW(int aW) {
		this.w = aW;
	}
	
    @Override
    public int moveTo(Dir dir) {
        int exit;
        switch(dir) {
            case NORTH:
                exit = getN();
                break;
            case SOUTH:
                exit = getS();
                break;
            case EAST:
                exit = getE();
                break;
            case WEST:
                exit = getW();
                break;
            default:
                exit = Dir.WALL; //ostane na rovnakom mieste
                break;
        }
        return exit;
    }
}
