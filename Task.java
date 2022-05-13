package com.example.Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task {
    static List<String> taski = new ArrayList<>();
    static String n;
    static Integer m;
    static Integer c = taski.size();
    public static void main(String[] args) {




        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("Podaj numer zadania ktore chcesz wykonac: 1 - Sprawdzenie listy taskow 2 - Dodanie taska, 3 - Modyfikacja Taska, 4 - Usuwanie taska");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer processNumber = 0;
            try {
                processNumber = Integer.parseInt(reader.readLine());
                Task.performProcess(processNumber);

            } catch (IOException e) {
                e.printStackTrace();
            }

            if (processNumber >= 5) {
                isFinished = true;
            }
        }

    }

    public static void performProcess(Integer processNumber) {



        Scanner si = new Scanner(System.in);


        switch(processNumber){
            case 1:
                System.out.println("Wyswietl liste taskow");
                System.out.println(taski);
                break;
            case 2:
                System.out.println("Dodawanie taska");
                taski.add(si.nextLine());
                break;
            case 3:
                System.out.println("Modyfikacja taska");
                System.out.println("Wpisz nowego taska");
                String n = si.nextLine();
                System.out.println("Wpisz index za ktory ma byc zamieniony (zaczynajac od 0)");
                System.out.println(taski);
                Integer m = si.nextInt();
                if (m<=c) {
                    taski.set(m, n);
                }
                else if (m >= c){
                    System.out.println("Nie ma takiego taska");
                }

                break;
            case 4:
                System.out.println("Usuwanie taska, Aby usunac taska podaj jego index zaczynajac od 0");
                System.out.println(taski);
                taski.remove(si.nextInt());
                break;


        }
    }
}
