import Entities.Materials.Adamantium;
import Entities.Axe;
import Entities.Materials.Material;
import Entities.Materials.Steel;
import Entities.Materials.Stone;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


//this is a test class for axe class
public class AxeUnitTest {
/*    //test for axe sharpness change function
    @Test
    void testSharpnessDecrease(){
        //creating new axe
        Axe axe = new Axe();
        //setting axe sharpness to 100
        axe.sharpness = 100;
        //creating new material
        Material material = new Material();
        //setting material density to 1
        material.density = 1;
        //creating new material
        Material materialHit = new Material();
        //setting material density to 2
        materialHit.density = 2;
        //checking if sharpness decrease function works correctly
        assert axe.sharpnessDecrease(material, materialHit) == 50;
    }*/

    @Test
    void testSharpnessDecrease(){
        //creating new axe
        Axe axe = new Axe();
        //setting axe sharpness to 100
        axe.setSharpness(100);
        //creating new adamantium
        Material material = new Adamantium();
        //creating new stone
        Material materialHit = new Stone();
        //checking if sharpness decrease function works correctly
        assert axe.sharpnessDecrease(material, materialHit) == 1;
    }
    // Junit parameterized test for axe sharpness change function
    @Test
    void testSharpnessDecreaseParameterized(){
        //creating new axe
        Axe axe = new Axe();
        //setting axe sharpness to 100
        axe.setSharpness(100);
        //creating new adamantium
        Material material = new Adamantium();
        //creating new stone
        Material materialHit = new Stone();
        //checking if sharpness decrease function works correctly
        assert axe.sharpnessDecrease(material, materialHit) == 1;
    }
    //manually created parameterized test for axe sharpness change function
    @ParameterizedTest
    @CsvSource({"100,4", "20,4", "45,4"})
    void testSharpnessDecreaseParameterizedManually(String sharpness, String resultingSharpness){
        Axe testAxe = new Axe();
        System.out.println("sharpness: " + sharpness);
        System.out.println("resultingSharpness: " + resultingSharpness);
        testAxe.setSharpness(Integer.parseUnsignedInt(sharpness));
        Material testMaterial = new Stone();
        testMaterial.setDensity(1.0);
        testAxe.setMaterial(testMaterial);

        Material hitMaterial = new Steel();
        int result = testAxe.sharpnessDecrease(testMaterial, hitMaterial);
        System.out.println("result: " + result);
        assert result == Integer.parseUnsignedInt(resultingSharpness);
    }





    //test for axe clone function -> clone should be the same as the original //this was generated right after the clone function was created
    @Test
    void testCloneAxe(){
        //creating new axe
        Axe axe = new Axe();
        //setting axe sharpness to 100
        axe.setSharpness(100);
        //creating new adamantium
        Material material = new Adamantium();
        //setting axe material to adamantium
        axe.setMaterial(material);
        //creating new axe -> this is the problem, as it should have cloned the axe, not created a new one
        Axe axeClone = new Axe();
        //setting axe sharpness to 100
        axeClone.setSharpness(100);
        //creating new adamantium
        Material materialClone = new Adamantium();
        //setting axe material to adamantium
        axeClone.setMaterial(materialClone);
        //checking if clone function works correctly
        assert axeClone.equals(axe);
    }


}
