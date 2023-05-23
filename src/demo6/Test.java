package demo6;

public class Test {
    public static void main(String[] args) {
        IMale im = new IMale(){ //Anonymous class
            @Override
            public void drink() {
                System.out.println("Drink Vodka");

            }

        };
        //Up casting - down casting (ép kiểu)

        // lambda expression
        IMale im2 = () -> {
            System.out.println("Drink beer");
        };

    }
}
