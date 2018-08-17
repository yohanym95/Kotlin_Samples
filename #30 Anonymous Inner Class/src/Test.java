interface Human1{
    void think();
}

public class Test {
    public static void main(String[] args){
        Human1 programmer = new Human1(){
                                    // This an anonymous inner class.
                                    public void think(){
                                        System.out.println("Programmer Thinking...");
                                    }
                                };

        programmer.think();
    }
}
