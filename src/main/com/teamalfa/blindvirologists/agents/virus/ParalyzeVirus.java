package main.com.teamalfa.blindvirologists.agents.virus;

import main.com.teamalfa.blindvirologists.city.fields.Field;

public class ParalyzeVirus extends Virus {

    /**
     * This method doesnt let the Virologist leave their current Field while being affected by the Virus.
     * @param current The Field the Virologist is standing on.
     * @return The current Field.
     */
    @Override
    public Field affectMovement(Field current) {
        return current;
    }

    /**
     * Tells the Virologist that they can't do any actions, because they are paralyzed.
     * @return true
     */
    @Override
    public boolean affectUsage() {
        return true;
    }

    /**
     * Tells other Virologist that the Virologist is paralyzed so they can be robbed.
     * @return true
     */
    @Override
    public boolean affectRobbability() {
        return true;
    }
}