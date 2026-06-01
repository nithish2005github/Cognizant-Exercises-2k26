import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<Integer>> tasks = new ArrayList<>();

        tasks.add(() -> 10);
        tasks.add(() -> 20);
        tasks.add(() -> 30);

        try {
            List<Future<Integer>> results = executor.invokeAll(tasks);

            for (Future<Integer> result : results) {
                System.out.println(result.get());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        executor.shutdown();
    }
}