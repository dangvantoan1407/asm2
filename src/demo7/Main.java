package demo7;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 2;
            if(y<5) {
                throw new ArithmeticException("Không đúng giá trị");
            }
            int z = x / y;
            System.out.println("z = " + z);
            demoException();
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }

    }
    public static void demoException() throws Exception{

    }
}
