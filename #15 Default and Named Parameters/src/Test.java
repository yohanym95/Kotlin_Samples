public class Test {
    public static void main(String args[]){
        int amount = DemoKt.calAmount2(70); // Calling the Kotlin method with only the Int parameter, but java doesn't allow it.
        // We have to use @JvmOverloads annotation with the Kotlin method.

        System.out.println(amount);

        // Also we can pass both parameters if we want.
        amount = DemoKt.calAmount2(70, 0.08);
        System.out.println(amount);
    }
}
