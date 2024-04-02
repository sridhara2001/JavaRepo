package com.threads.basic;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("virat");
        thread.setPriority(Thread.MIN_PRIORITY+6);
        System.out.println(thread);
        thread.setName("kohli");
        String[] nums = null;
        System.out.println(nums[0]);
    }
}
