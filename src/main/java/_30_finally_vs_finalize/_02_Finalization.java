package _30_finally_vs_finalize;

public class _02_Finalization {

    public static void main(String[] args) {

        // Creating two objects
        _02_Finalization f1 = new _02_Finalization();
        _02_Finalization f2 = new _02_Finalization();

        // Making objects eligible for Garbage Collection
        // By removing references (no variable is pointing to these objects now)
        f1 = null;
        f2 = null;

        // Requesting JVM to run Garbage Collector
        // Note: This is just a request, not a guarantee
        System.gc();
    }

    // finalize() method is called by Garbage Collector
    // before destroying the object
    @Override
    public void finalize() {
        System.out.println("Finalize method called");
    }
}
