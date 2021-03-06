package main.com.teamalfa.blindvirologists.city.fields;

import main.com.teamalfa.blindvirologists.agents.genetic_code.GeneticCode;
import main.com.teamalfa.blindvirologists.virologist.Virologist;

public class Laboratory extends Field{
    private GeneticCode geneticCode;

    /**
     * This method is called when the Virologist searches the Laboratory they are standing on.
     * It puts the geneticCode from the laboratory into their Backpack.
     * @param virologist The Virologist who stands on the Field and searches it.
     */
    @Override
    public void searchedBy(Virologist virologist) {
        virologist.getBackpack().add(this.geneticCode);
    }

    /**
     * Adds the virologist to the field, sets the field as the virologist's field
     * The genetic code infects them.
     * @param virologist The virologist that's stepped on the field.
     */
    @Override
    public void accept(Virologist virologist) {
        virologists.add(virologist);
        virologist.setField(this);
        geneticCode.autoInfect(virologist);
    }

    //setter, getter
    public void setGeneticCode(GeneticCode geneticCode) {
        this.geneticCode = geneticCode;
    }

    public GeneticCode getGeneticCode() {
        return geneticCode;
    }
}