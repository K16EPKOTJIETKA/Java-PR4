package multithreading;

public class AsyncExecutor {
    public void execute(Runnable runnable)
    {
       final var t = new Thread(runnable);
       System.out.printf("Starting thread [%s]...%n", t.toString());

       t.start();
    }
}
