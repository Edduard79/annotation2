public class Greetings {

    @DevAnnotation(DevName = "John", DevSurname = "Walker")
    public void sayWelcome(){
        System.out.println("Hello!!  :)");
    }

    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    public void sayGoodBye(){
        System.out.println("Good Bye!!  :(");
    }

}
