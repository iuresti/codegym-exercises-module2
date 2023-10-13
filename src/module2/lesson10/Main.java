package module2.lesson10;

import java.io.File;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        printAllFilesIterative(new File("D:\\codegym\\presentations"));
    }

    public static void printAllFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                printAllFiles(file);
            } else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    public static void printAllFilesIterative(File dir) {
        Stack<File> stack = new Stack();

        stack.push(dir);

        while (!stack.isEmpty()) {
            File directory = stack.pop();

            for (File file : directory.listFiles()) {
                if(file.isDirectory()){
                    stack.push(file);
                }else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void countDown(int count) {
        if (count <= 0) {
            System.out.println("Boom!!");
            return;
        }

        System.out.println(count);
        countDown(count - 1);
    }
}
