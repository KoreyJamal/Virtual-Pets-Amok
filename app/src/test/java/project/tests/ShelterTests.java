package project.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import project.tests.OrganicVirtualPet;

public class ShelterTests {

    OrganicVirtualPet dog = new OrganicDog("Mr.Babes", "Very protective when he got protection around");
    
    @Test
    public void returnPetName(){
        String petName = dog.getName();
        assertEquals(petName, "Mr.Babes");
    }

}
