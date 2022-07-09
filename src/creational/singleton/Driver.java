package creational.singleton;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(100);
        Set<Integer> set = new HashSet<>();
        System.out.println("Normal");
        System.out.println("Total Created Instances: ");
        for (int i = 0; i < 100; i++) {
            Runnable worker = new NormalSingleTonRunnable(set);
            // execute(): Executes the given command at some time in the future.
            // The command may execute in a new thread, in a pooled thread,
            // or in the calling thread, at the discretion of the Executor implementation.
            executor.execute(worker);
        }
        System.out.println("Double Lock");
        System.out.println("Total Created Instances: ");
        set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            Runnable worker = new DoubleLockSingleTonRunnable(set);
            // execute(): Executes the given command at some time in the future.
            // The command may execute in a new thread, in a pooled thread,
            // or in the calling thread, at the discretion of the Executor implementation.
            executor.execute(worker);
        }

    }

    public static class NormalSingleTonRunnable implements Runnable {
        NormalSingleton normalSingleton;
        Set<Integer> set;

        NormalSingleTonRunnable(Set<Integer> set) {
           this.set =set;
        }

        @Override
        public void run() {
            normalSingleton = NormalSingleton.getInstance();
            System.out.println(normalSingleton.hashCode());
        }
    }

    public static class DoubleLockSingleTonRunnable implements Runnable {
        DoubleLockSingleton singleton;
        Set<Integer> set;

        DoubleLockSingleTonRunnable(Set<Integer> set) {
            this.set =set;
        }

        @Override
        public void run() {
            singleton = DoubleLockSingleton.getInstance();
            System.out.println(singleton.hashCode());
        }

    }
}