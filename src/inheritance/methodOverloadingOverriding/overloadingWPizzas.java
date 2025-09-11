package inheritance.methodOverloadingOverriding;

public class overloadingWPizzas {
    public static void main(String[] args){
        String pizza;
        System.out.println(bakePizza("flatbread"));
        System.out.println(bakePizza("flatbread", "mozarella"));
        System.out.println(bakePizza("flatbread", "mozarella", "veggies"));
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return bread + cheese +" pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return bread + cheese + topping+ " pizza";
    }
}
