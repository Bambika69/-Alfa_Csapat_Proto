package main.com.teamalfa.blindvirologists.agents.virus;

import main.com.teamalfa.blindvirologists.city.fields.Field;
import main.com.teamalfa.blindvirologists.random.MyRandom;
import main.com.teamalfa.blindvirologists.random.TrueRandom;

public class DanceVirus extends Virus {

    public MyRandom random;

    public DanceVirus(){
        this.random = new TrueRandom();
    }

    public void setRandom(MyRandom random){
        this.random = random;
    }


    /**
     * This method makes the Virologist move to a random Field instead of the chosen one.
     * There's a slight chance the chosen Field and the random Field will be the same.
     * @param current The Field the Virologist is standing on.
     * @return The chosen Field.
     */
    @Override
    public Field affectMovement(Field current) {
        int r = random.PickRandom(current.getNeighbours().size());
        return current.getNeighbours().get(r);
    }

}