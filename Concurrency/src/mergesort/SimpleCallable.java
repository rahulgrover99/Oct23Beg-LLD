package mergesort;

import java.util.concurrent.Callable;

public class SimpleCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1;
    }
}
