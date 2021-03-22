public class Lexus extends Car {
    private String name="Lexus_Is";
    private int power=208;
    public void setPower(int whitepower){
        if (whitepower<0){
            System.out.println("Да ты че?!");
        }
        else{
            power=whitepower;}
    }

    public int getPower() {

        return power;
    }

    public void ride(){
        System.out.println("я могу ездить");
    }
    public void sayName(){
        System.out.println("Я называюсь "+ name+" у меня "+ power+ " кобыл");
    }
}
