

public class DOg {

    //fields
    private String name = "Rex";
    private String breed = "Irish Setter";
    private int age = 1;

    //constructors
    public DOg() {   }
    public DOg(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    //Polymorphism: overloading, having many methods with the same name,
    // but have different purposes or functionality
    //


    //methods
    void Speak(){
        System.out.println("WOOOOOOF");
    }
    void Walk(){
        System.out.println("Go for a walk!");
    }
    private void GetOlder(){
        age += 7;
        //age = age + 7;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public void setName(String name){
        this.name = name;
    }
}
