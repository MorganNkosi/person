public class MainProgram {
    public static void main(String[] args) {
        Person person = new Person("Morgan",24,"male", new String[]
                {"Coding","Movies","learning new things"});
        String intro = person.hello();
        System.out.println(intro);
    }
}
