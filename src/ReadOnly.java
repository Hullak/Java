public class ReadOnly {

    // getter pobierają wartośći z pól prywatnych
    // setter umozliwjaja ustawienie wartosci pola prywatnego
    private String name = "Bartek";

    public String getName(){
        return name = name + "jest okej";
       }

       public void setName(String name){
        this.name = name;
       }
}
