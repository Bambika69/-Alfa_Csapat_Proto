package main.com.teamalfa.blindvirologists.agents.virus;

import main.com.teamalfa.blindvirologists.virologist.Virologist;

public class AmnesiaVirus extends Virus {

    /**
     * This method is called when the Virus is applied to a Virologist.
     * If them infection is successful the Virus deletes every genetic code the Virologist
     * has learned so far.
     * @param target The Virologist the AmnesiaVirus is applied to.
     */
    @Override
    public void apply(Virologist target) {
        if (target.infectedBy(this)) {
            this.target = target;
            this.target.getBackpack().deleteAllGeneticCodes();
        }
    }
}