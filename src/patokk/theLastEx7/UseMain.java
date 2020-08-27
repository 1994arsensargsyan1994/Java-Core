package patokk.theLastEx7;

public class UseMain {
    public static void main(String[] args) {
        Thread thread;
        thread = Thread.currentThread();
        System.out.println("Name global Thread" + thread.getName());
        System.out.println("Priority" +thread.getPriority());
        System.out.println();
        System.out.println("set Thread name and priority");
        thread.setName("Thread #1");
        thread.setPriority(Thread.NORM_PRIORITY +3);
        System.out.println("New name global Thread"+thread.getName());
        System.out.println("New - Priority" +thread.getPriority());

    }
}
