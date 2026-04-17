package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Book[] book = new Book[]{
                new Book(1, "978-1-84356-091-2", "The Silent Horizon", false, ""),
                new Book(2, "978-0-45219-876-3", "Echoes of Tomorrow", false, ""),
                new Book(3, "978-1-56619-332-7", "Crimson Skies", false, ""),
                new Book(4, "978-0-74327-112-5", "Shadows Beneath", false, ""),
                new Book(5, "978-1-86197-554-8", "The Last Ember", false, ""),
                new Book(6, "978-0-31649-221-4", "Frozen Tides", false, ""),
                new Book(7, "978-1-40283-993-9", "The Glass Kingdom", false, ""),
                new Book(8, "978-0-52547-881-0", "Whispers in the Dark", false, ""),
                new Book(9, "978-1-25030-442-2", "The Iron Path", false, ""),
                new Book(10, "978-0-67002-198-7", "A Shattered Dawn", false, ""),
                new Book(11, "978-1-47673-421-6", "The Forgotten Code", false, ""),
                new Book(12, "978-0-14103-614-4", "Beneath Scarlet Leaves", false, ""),
                new Book(13, "978-1-98485-773-5", "The Midnight Library", false, ""),
                new Book(14, "978-0-37550-983-2", "Stormbreaker Rising", false, ""),
                new Book(15, "978-1-60309-452-8", "The Silver Lining", false, ""),
                new Book(16, "978-0-81299-721-3", "Fragments of Light", false, ""),
                new Book(17, "978-1-25076-321-0", "The Hidden Vale", false, ""),
                new Book(18, "978-0-55380-457-9", "The Obsidian Tower", false, ""),
                new Book(19, "978-1-25014-993-9", "A Winter's Secret", false, ""),
                new Book(20, "978-0-39959-050-4", "The Endless Journey", false, "")};

        while (true) {
            System.out.println("\n=== BOOK STORE HOME SCREEN ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int userInput = scanner.nextInt();



            if (userInput == 1){


            }
        }
    }

}