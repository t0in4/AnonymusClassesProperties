package iterators;

class IteratorExecutor {

    static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
        for (int i = 0; i < numberOfIterations; i++) {
            callback.onNewIteration(i);
        }
    }

    static void startIterations(int numberOfIterations) {
       LoopCallback start = new LoopCallback() {
           @Override
           public void onNewIteration(int iteration) {

           }
       }
    }
}
