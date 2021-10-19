public class ProjectClassTest {
    
    public static void main( String args[] ){

        ProjectClass solarSystem = new ProjectClass("Solar System", "The solar system is the sun and everything that orbits around it.");
        ProjectClass lavaVolcano = new ProjectClass("Lava Volcano", "Lava, magma (molten rock) emerging as a liquid onto Earth's surface.");
        ProjectClass puppyApp = new ProjectClass("PuppyApp");

        System.out.println("Project Tittle: "+ solarSystem.getName());
        System.out.println("Project Description: "+ solarSystem.getDescription());
        solarSystem.print();
        lavaVolcano.elevatorPitch();
        System.out.println("*============================*");
        System.out.println("Project Tittle: "+ lavaVolcano.getName());
        System.out.println("Project Description: "+ lavaVolcano.getDescription());
        lavaVolcano.print();
        lavaVolcano.elevatorPitch();
        System.out.println("*============================*");
        System.out.println("Project Tittle: "+ puppyApp.getName());
        System.out.println("Project Description: "+ puppyApp.getDescription());
        puppyApp.print();
        puppyApp.elevatorPitch();

    }

}
