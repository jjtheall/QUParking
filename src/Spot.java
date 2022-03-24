public class Spot {

    //instance vars to represent spot id and whether or not
    //spot is taken
    private int id;
    private boolean taken;

    //constructor for spot with id
    //defaults taken to false
    public Spot(int id){
        this.id = id;
        taken = false;
    }

    //constructor for both id and taken status
    public Spot(int id, boolean taken){
        this.id = id;
        this.taken = taken;
    }

    //returns id instance var
    public int getID(){
       return id;
    }

    //sets id instance var
    public void setId(int id){
        this.id = id;
    }

    //returns whether or not spot is taken
    public boolean isTaken(){
        return taken;
    }
    
    //sets taken status of spot
    public void setTaken(boolean taken){
        this.taken = taken;
    }
}
