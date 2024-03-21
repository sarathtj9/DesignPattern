package Builder;

public class Client {
    public static void main(String[] args) {
        //Basic way of building it
       // Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Sai");
//        builder.setAge(27);
//        builder.setBatch("Morning");
//        builder.setGradYear(2014);


       // Student student = new Student(builder);
//        Student student = builder.build();
//        System.out.println("DEBUG");

        //prod level code
        Student student = Student.getBuilder()
                .setGradYear(2022)
                .setName("Sarath")
                .setAge(25)
                .setUnivName("XYZ")
                .setBatch("Morning")
                .build();
    }
}


//steps: Builder pattern
//Allows us to create an object where  we have
//1.class with too many attributes
//2.Need to valid the  object before its creation.

//1.getBuilder() static method
//2. Build method in Builder class
//* 3. build method in Builder class.
// 4. Make the setters of Builder class return Builder object.

//In first version there are 2 classes student , builder
//second version it is binded to one class - Student . when the client wants to add student ,he can pass the parameters in any way & builder class inside the student class validate the Student object before creation.


//  Why we made setters return Builder object -> To support Method chaining.
