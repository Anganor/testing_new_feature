package com.kodilla.testing.random;

import java.util.*;

import static java.util.Arrays.*;

public class LotteryMachine {

//    Pracujesz nad projektem maszyny przeznaczonej do gier losowych. Celem jest stworzenie oprogramowania dla urządzenia. Użytkownik może wybrać typ gry
//    oraz wpisać określoną liczbę liczb. Losowaniem zajmuje się odrębna firma, która na tym etapie prac udostępnia tylko interfejs do komunikacji.
//    interface Database {
//        Set<Integer> wylosuj(int iloscLiczb);
//    }
//    Stwórz klasę MaszynaLosująca, która do wylosowania liczb będzie korzystać z dostarczonego interfejsu.
//    Klasa powinna zawierać metodę:
//            1) miniLotto - metoda przyjmuje 5 liczb z zakresu 1-36 oraz zwraca ile liczb z podanych przez użytkownika pokryło się z liczbami wylosowanymi.
//            Przykład:
//    Użytkownik podaje: 5, 7, 2, 8, 18
//    Wylosowane liczby: 2, 6, 17, 1, 9
//    Wynik: 1
//            2) jackpot - metoda może przyjmować 2 lub 5 liczb (użyj odpowiedniej kolekcji lub varargs), zwraca liczbę liczb poprawnie wytypowanych.
//            Jeśli użytkownik podał 2 liczby, następuje losowanie z zakresu 1-10, jeśli podał 5 liczb, losowanie następuje z zakresu 1-50.
//
//    Do każdej z metod dopisz odpowiednie testy.

    int miniLotto(Set<Integer> randomNumbers, int... userNumbers) {

        sort(userNumbers);
        sort(randomNumbers.toArray());

        if(userNumbers.length == randomNumbers.size()) {
            int quantity = 0;
            for (int number : userNumbers) {
                randomNumbers.contains(number);
                quantity++;
            }
            return quantity;
        } else {
            return 0;
        }
    }

    int jackpot(int... numbers) {
        return -1;
    }
}
