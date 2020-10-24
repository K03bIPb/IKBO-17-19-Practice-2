package ru.rtu.main.Practice12.Tasks;

import java.util.Scanner;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            String[] split = input.split(" ");
            if (split.length <= 2) {
                if (split[0].equals("LIST")) {
                    System.out.println(treeSet);
                }
                if (split[0].equals("ADD")) {
                    if (split[1].contains("@")){
                        if (split[1].contains(".")){
                        String[] split2 = split[1].split(".");
                        String address = "";
                        for (int i = 1; i < split.length; i++)
                            address = address + split[i];
                        treeSet.add(address);
                    }
                }
            }
        }

    }
}