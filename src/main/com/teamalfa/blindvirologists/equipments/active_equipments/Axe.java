package main.com.teamalfa.blindvirologists.equipments.active_equipments;

import main.com.teamalfa.blindvirologists.turn_handler.TurnHandler;
import main.com.teamalfa.blindvirologists.virologist.Virologist;

public class Axe extends ActiveEquipment{
    boolean blunt;

    public Axe() {
        usetime = 1;
        blunt = false;

        TurnHandler.getInstance().accept(this);
    }

    /**
     * If the axe is sharp it kills the virologist, otherwise it doesn't do anything.
     * @param v
     */
    @Override
    public void use(Virologist v) {
        if(usetime == 1 && !(blunt)){

            virologist.die();
            usetime--;
        }
        else if(blunt && usetime < 1) {
            wornOut();
        }
    }

    /**
     * Doesn't do anything.
     */
    @Override
    public void wornOut() {}

    @Override
    public void step() {}
}
