import Entities.Axe;
import Entities.Materials.Material;

public class AxeFactory {

    /* initial proposal without any information, just by class name was given:
      public Axe createAxe() {
        return new Axe();
    }*/

// Axe factory method using builder pattern
/*    public Axe createAxe() {
        return new Axe.Builder()
                .setMaterial(new Adamantium())
                .setSharpness(100)
                .setWeight(10)
                .setLength(10)
                .setWidth(10)
                .setDescription("Axe")
                .setName("Axe")
                .setShape("Axe")
                .build();
    }*/


    // Axe factory method using builder pattern, with parameters
    public Axe createAxe(Material material, int sharpness, double weight, double length, double width, String description, String name, String shape) {
        return new Axe.Builder()
                .setMaterial(material)
                .setSharpness(sharpness)
                .setWeight(weight)
                .setLength(length)
                .setWidth(width)
                .setDescription(description)
                .setName(name)
                .setShape(shape)
                .build();
    }

    // Axe factory clone method
    /*public Axe cloneAxe(Axe axe) {
        return new Axe.Builder()
                .setMaterial(axe.getMaterial())
                .setSharpness(axe.getSharpness())
                .setWeight(axe.getWeight())
                .setLength(axe.getLength()) // generated by copilot, but there is no such method in Axe class
                .setWidth(axe.getWidth())
                .setDescription(axe.getDescription())
                .setName(axe.getName())
                .setShape(axe.getShape())
                .build();
    }
*/
}
