public class Main {
    public static final int PORT = 9999;
    public static final int THREADS = 64;
    public static void main(String[] args) {
        var server = new Server(THREADS);
        server.start(PORT);
    }
}
