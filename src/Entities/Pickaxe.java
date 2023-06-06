package Entities;

import Entities.Materials.Adamantium;
import Entities.Materials.Material;

public class Pickaxe extends Axe{
    int spikeLength;

    public Pickaxe(){
        this.name = "Pickaxe";
        this.shape = "Pickaxe";
        this.description = "A pickaxe is a tool used to mine stone-type blocks and ores in any Minecraft world. They are required to gather stone resources for crafting and building, as well as gathering mineral resources such as iron ore and coal. Pickaxes can also be used to gather other blocks, but they aren't as effective as the preferred tool type (e.g. using a pickaxe to break dirt).";
        this.weight = 2.0;
        this.length = 0.5;
        this.width = 0.1;
        this.sharpness = 100;
        this.spikeLength = 10;
    }

    //pickaxe constructor with parameters
    public Pickaxe(String name, String shape, String description, double weight, double length, double width, int sharpness, int spikeLength){
        super(new Adamantium(), null, null, weight, length, width, description, name, "Pickaxe");
        this.spikeLength = spikeLength;
    }

    @Override
    public int sharpnessDecrease(Material material, Material materialHit) {
        return (super.sharpnessDecrease(material, materialHit)/2);
    }
}
