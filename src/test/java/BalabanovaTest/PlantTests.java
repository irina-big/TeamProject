package BalabanovaTest;
import allclasses.balabanova.Plant;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PlantTests {
    @Test
    public void testGetTypesReturnsFloweringPlants() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getTypes("Цветковые"), List.of("Роза", "Тюльпан", "Лилия"));
    }

    @Test
    public void testGetTypesReturnsNonFloweringPlants() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getTypes("Всеядные"), List.of("Папоротник", "Кактус", "Мох"));
    }

    @Test(expected = Exception.class)
    public void testGetTypesThrowsExceptionForUnknownCategory() throws Exception {
        Plant plant = new Plant();
        plant.getTypes("Неизвестная категория");
    }

    @Test
    public void testGetHabitatForRose() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getHabitat("Роза"), "Сады и парки");
    }

    @Test
    public void testGetHabitatForCactus() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getHabitat("Кактус"), "Пустыни");
    }

    @Test(expected = Exception.class)
    public void testGetHabitatThrowsExceptionForUnknownPlant() throws Exception {
        Plant plant = new Plant();
        plant.getHabitat("Неизвестный вид растения");
    }

    @Test
    public void testGetReproductionMethodForRose() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getReproductionMethod("Роза"), "Семенами или черенками.");
    }

    @Test
    public void testGetReproductionMethodForCactus() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getReproductionMethod("Кактус"), "Семенами, а также образованием дочерних растений.");
    }

    @Test(expected = Exception.class)
    public void testGetReproductionMethodThrowsExceptionForUnknownPlant() throws Exception {
        Plant plant = new Plant();
        plant.getReproductionMethod("Неизвестный вид растения");
    }

    @Test
    public void testGetCareInstructionsForRose() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getCareInstructions("Роза"), "Полив раз в неделю, удобрение в сезон цветения.");
    }

    @Test
    public void testGetCareInstructionsForCactus() throws Exception {
        Plant plant = new Plant();
        Assert.assertEquals(plant.getCareInstructions("Кактус"), "Малый полив, предпочитает солнечные места.");
    }

    @Test(expected = Exception.class)
    public void testGetCareInstructionsThrowsExceptionForUnknownPlant() throws Exception {
        Plant plant = new Plant();
        plant.getCareInstructions("Неизвестный вид растения");
    }
}
