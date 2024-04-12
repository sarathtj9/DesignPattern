package Prototype;

public class Client {

    private static void fillRegistry(StudentRegistry registry){
        Student march24MorningRegistry =new Student();
        march24MorningRegistry.setBatch("march24morning");
        march24MorningRegistry.setAvgbatchPsp(75.0);
        registry.register("march24MorningStudent",march24MorningRegistry);

        IntelligentStudent mar22MorningIntelligentStudent =
                new IntelligentStudent();
        mar22MorningIntelligentStudent.setIq(180);
        mar22MorningIntelligentStudent.setBatch("Mar22 Morning");
        mar22MorningIntelligentStudent.setAvgbatchPsp(70.0);
        registry.register("mar22MorningIntelligentStudent", mar22MorningIntelligentStudent);
    }

    public static void main(String[] args) {
        //Fill the registry with template objects

        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        //with the prototype, it is copying all the common attrs
        Student ram = registry.get("march24MorningStudent").copy();
        ram.setAge(25);
        ram.setName("ram");
        ram.setPsp(78.0);
        System.out.println("DEBUG");

        Student koteshwara = registry.get("mar22MorningIntelligentStudent").copy();

    }
}

//steps:
//        1. In the class where we want to create protype object, declare a method copy/clone () to create an object.
//Note: All the child class should overrride the clone/copy object methods
//2.  create the protype object & store it in registry.
//Map<String,Object>
//3.create the objects from prototype whenever it is required