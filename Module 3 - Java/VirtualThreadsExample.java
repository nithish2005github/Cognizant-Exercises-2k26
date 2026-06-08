public class VirtualThreadsExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            int task = i;

            Thread.startVirtualThread(() ->
                    System.out.println("Virtual Thread " + task));
        }
    }
}