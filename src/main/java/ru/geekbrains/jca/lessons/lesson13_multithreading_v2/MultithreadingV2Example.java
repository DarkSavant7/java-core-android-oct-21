package ru.geekbrains.jca.lessons.lesson13_multithreading_v2;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MultithreadingV2Example {
    public static void main(String[] args) throws InterruptedException {
//        executorsExample();
//        simpleReentrantLockExample();
//        reentrantReadWriteLockExample();
//        simpleCdlExample();
//        anotherCdlExample();
//        cyclicBarrierExample();
//        cyclicBarrierWithRunnable();
//        semaphoreExample();
//        collectionsExample();

    }

    private static void collectionsExample() {
        List<String> list = new ArrayList<>();
        List<String> syncList1 = new Vector<>();
        List<String> syncList2 = new CopyOnWriteArrayList<>();
        List<String> syncList3 = Collections.synchronizedList(list);

        Set<String> set = new HashSet<>();
        Set<String> syncSet = new CopyOnWriteArraySet<>();
        Set<String> syncSet2 = Collections.synchronizedSet(set);

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> syncMap = new Hashtable<>();
        Map<String, Integer> syncMap2 = new ConcurrentHashMap<>();
    }

    private static void semaphoreExample() {
        int threadsCount = 10;
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < threadsCount; i++) {
            int j = i + 1;
            new Thread(() -> {
                try {
                    System.out.printf("Car #%d is before the bridge\n", j);
                    semaphore.acquire();
                    System.out.printf("Car #%d rides on the bridge for a long time\n", j);
                    Thread.sleep((long) (200 + 600 * Math.random()));
                    System.out.printf("Car #%d finished\n", j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }).start();
        }
    }

    private static void cyclicBarrierWithRunnable() {
        int threadsCount = 10;
        CyclicBarrier barrier = new CyclicBarrier(threadsCount, () -> {
            System.out.println("All cars are ready!!!");
        });
        System.out.println("Start");
        for (int i = 0; i < threadsCount; i++) {
            int j = i + 1;
            new Thread(() -> {
                try {
                    System.out.printf("Car #%d is preparing\n", j);
                    Thread.sleep((long) (200 + 300 * Math.random()));
                    System.out.printf("Car #%d is on start line\n", j);
                    barrier.await();
                    System.out.printf("Car #%d started\n", j);
                    Thread.sleep((long) (200 + 300 * Math.random()));
                    System.out.printf("Car #%d finished\n", j);
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    private static void cyclicBarrierExample() {
        int threadsCount = 10;
        CyclicBarrier barrier = new CyclicBarrier(threadsCount);
        System.out.println("Start");
        for (int i = 0; i < threadsCount; i++) {
            int j = i + 1;
            new Thread(() -> {
                try {
                    System.out.printf("Car #%d is preparing\n", j);
                    Thread.sleep((long) (200 + 300 * Math.random()));
                    System.out.printf("Car #%d is on start line\n", j);
                    barrier.await();
                    System.out.printf("Car #%d started\n", j);
                    Thread.sleep((long) (200 + 300 * Math.random()));
                    System.out.printf("Car #%d finished\n", j);
                    barrier.await();
                    System.out.printf("Car #%d goes to car wash\n", j);
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    private static void anotherCdlExample() {
        int threadsCount = 10;
        CountDownLatch cdl = new CountDownLatch(threadsCount);
        System.out.println("Start");
        for (int i = 0; i < threadsCount; i++) {
            int j = i + 1;
            new Thread(() -> {
                try {
                    Thread.sleep((long) (200 + 300 * Math.random()));
                    System.out.printf("Thread #%d ready\n", j);
                    cdl.countDown();
                    cdl.await();
                    System.out.printf("Thread #%d started\n", j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    private static void simpleCdlExample() throws InterruptedException {
        int threadsCount = 10;
        CountDownLatch cdl = new CountDownLatch(threadsCount);
        System.out.println("Start");
        for (int i = 0; i < threadsCount; i++) {
            int j = i + 1;
            new Thread(() -> {
                try {
                    Thread.sleep((long) (200 + 300 * Math.random()));
                    System.out.printf("Thread #%d ready\n", j);
                    cdl.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        cdl.await(2, TimeUnit.SECONDS);
        System.out.println("All threads ready");
    }

    private static void reentrantReadWriteLockExample() {
        //Читать могут несколько потоков одновременно
        //Писать может только один поток одновременно
        //Во время записи, никто не читает
        ReentrantReadWriteLock rrwl = new ReentrantReadWriteLock();
        new Thread(() -> {
            try {
                rrwl.readLock().lock();
                System.out.println("Read started 1");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Read 1 finished");
                rrwl.readLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                rrwl.readLock().lock();
                System.out.println("Read started 2");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Read 2 finished");
                rrwl.readLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                rrwl.readLock().lock();
                System.out.println("Read started 3");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Read 3 finished");
                rrwl.readLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                rrwl.writeLock().lock();
                System.out.println("Write started 1");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Write 1 finished");
                rrwl.writeLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                rrwl.readLock().lock();
                System.out.println("Read started 4");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Read 4 finished");
                rrwl.readLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                rrwl.readLock().lock();
                System.out.println("Read started 5");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Read 5 finished");
                rrwl.readLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                rrwl.writeLock().lock();
                System.out.println("Write started 2");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Write 2 finished");
                rrwl.writeLock().unlock();
            }
        }).start();
        new Thread(() -> {
            try {
                rrwl.writeLock().lock();
                System.out.println("Write started 3");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Write 3 finished");
                rrwl.writeLock().unlock();
            }
        }).start();
    }

    private static void simpleReentrantLockExample() {
        Lock lock = new ReentrantLock();

        new Thread(() -> {
            System.out.println("Before lock 1");
            try {
                lock.lock();
                System.out.println("Got lock 1");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Lock 1 released");
                lock.unlock();
            }
        }).start();

//        new Thread(() -> {
////            System.out.println("Before lock 2");
////            try {
////                lock.lock();
////                System.out.println("Got lock 2");
////                Thread.sleep(2000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            } finally {
////                System.out.println("Lock 2 released");
////                lock.unlock();
////            }
////        }).start();

        new Thread(() -> {
            System.out.println("Before lock 3");
            try {
                if (lock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println("Got lock 3");
                        Thread.sleep(2000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        System.out.println("Lock 3 released");
                        lock.unlock();
                    }
                } else {
                    System.out.println("Lock is busy");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static void executorsExample() {
        //        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newSingleThreadExecutor(new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                Thread t = new Thread(r);
//                t.setName("Executor thread");
//                t.setPriority(5);
//                return t;
//            }
//        });
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            int j = i + 1;
            executorService.execute(() -> {
                try {
                    System.out.printf("Task #%d started. Thread %s\n", j, Thread.currentThread().getName());
                    Thread.sleep((long) (200 + 200 * Math.random()));
                    System.out.printf("Task #%d completed.\n", j);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        System.out.println("All tasks given");
        executorService.shutdown();
//        System.out.println("Processors: " + Runtime.getRuntime().availableProcessors());
//        executorService.shutdownNow();
//        executorService.execute(() -> System.out.println("Final task"));
        try {
            executorService.awaitTermination(20, TimeUnit.SECONDS);
            System.out.println("Executor service shut down");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//       Future<String> future = executorService.submit(() -> "XXXX");
//
//        try {
//            System.out.println(future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }
}
