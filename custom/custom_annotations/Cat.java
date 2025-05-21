package dowlath.io.example.custom.custom_annotations;

@VeryImportant
public class Cat {
    @ImportantStrings
    String name;
    int age;

    public Cat(String name){
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void meow(){
        System.out.println("Meow!");
    }

    public void eat(){
        System.out.println("Munch");
    }
}
