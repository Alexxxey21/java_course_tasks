package exceptions;

public class ExceptionsClass {

    public void example(int number) throws Throwable {}

    public void example2(int number){
        try {
        } catch (Throwable t) {}
    }

    public void example3(int number) {
        throw new Error();
    }

    public void example4() {
        Error error = new Error();
        throw error;
    }
}
