public class Test {
    public static void main(String[] args) {

        //How to call a function in a Kotlin class from a java class.
        // Should call as KotlinClassName.functionName();
        // If we change the name by @file:JvmName("Name"), we should use new name.
        int result = DemoKt.addWithReturn(4, 5);
        System.out.println(result);
    }
}
