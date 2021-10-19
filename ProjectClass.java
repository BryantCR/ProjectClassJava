

public class ProjectClass{
    // Attributes
    private String name;
    private String description;
    private String elevatorPitch;

    public ProjectClass( String name, String description ){
        this.name = name;
        this.description = description;
    }

    // Constructor overloaded
    public ProjectClass( String name ){
        this.name = name;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    // Setters
    public void setName( String name ){
        this.name = name;
    }

    public void setDescription( String description ){
        this.description = description;
    }

    public void print(){
        System.out.println( "Name: " + this.name );
        System.out.println( "Description: " + this.description );    
    }

    public void elevatorPitch() {
        System.out.println(String.format("Project %s: %s", this.name, this.description));
    }

}