package main.com.teamalfa.blindvirologists.equipments.active_equipments;

import main.com.teamalfa.blindvirologists.agents.virus.Virus;
import main.com.teamalfa.blindvirologists.turn_handler.TurnHandler;
import main.com.teamalfa.blindvirologists.virologist.Virologist;

public class Gloves extends ActiveEquipment {

    private Virus usedVirus = null;

    public Gloves() {
        cooldownDuration = 3;
        usetime = 3;
        cooldown = 0;

        TurnHandler.getInstance().accept(this);
    }

    //setters
    public void setUseTime(int num) {
        usetime = num;
    }

    public void setUsedVirus(Virus virus) {
        usedVirus = virus;
    }

    /**
     * Removes the virus from the virologist and applies it to the target virologist.
     * Only if the usetime is greater than 0, and the cooldown is at zero.
     * Usetime-1;
     * And starts the cooldown.
     * @param target
     */
    public void use(Virologist target){
        if(usedVirus != null && usetime > 0 && cooldown == 0) {
            virologist.removeVirus(usedVirus);
            usedVirus.apply(target);
            startCooldown();
            usetime--;
            usedVirus = null;
        }
    }

    /**
     * Removes the equipment from the virologist.
     */
    public void wornOut() {
        virologist.removeWorn(this);
        virologist.removeActive(this);
        TurnHandler.getInstance().remove(this);
    }

    /**
     * If the cooldown is greater than zero, decreases it.
     * If the usetime is zero calls the wornout methond.
     */
    public void step() {
        if(usetime == 0)
            wornOut();
        else if(cooldown > 0)
            cooldown--;
    }
}
