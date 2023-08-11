package project;

import project.tests.OrganicVirtualPet;

public class test {
    public static void main(String[] args) {
        
        OrganicVirtualPet pet1 = new OrganicVirtualPet("Max", "Loveable");

        System.out.println(pet1.getTiredness());
        pet1.sleep();
        System.out.println(pet1.getTiredness());
    }

    
}
