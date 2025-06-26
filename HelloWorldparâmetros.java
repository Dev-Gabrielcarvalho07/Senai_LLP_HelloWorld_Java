public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            String parametros = String.join(" ", args);
            System.out.println("Hello World " + parametros);
        } else {
            System.out.println("Hello World");
        }
    }
}
