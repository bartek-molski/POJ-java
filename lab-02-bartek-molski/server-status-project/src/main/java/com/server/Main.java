package com.server;

import com.server.logic.PerformanceMonitor;
import com.server.logic.Server;

public class Main {
    public static void main(String[] args) {

        /** Testowanie nazw serwerów */

        if (!Server.getServerName(0).equals("Alpha")) {
            System.out.println("Błąd: Niepoprawna nazwa serwera o ID 0");
            return;
        }
        if (!Server.getServerName(-1).equals("Nieznany serwer")) {
            System.out.println("Błąd: ID -1 powinno zwrócić 'Nieznany serwer'");
            return;
        }
        if (!Server.getServerName(10).equals("Nieznany serwer")) {
            System.out.println("Błąd: ID 10 powinno zwrócić 'Nieznany serwer'");
            return;
        }

        /**  Testowanie wyszukiwania serwera po nazwie */

        if (Server.findServerIndex("Gamma") != 2) {
            System.out.println("Błąd: Niepoprawny indeks dla serwera Gamma");
            return;
        }
        if (Server.findServerIndex("gamma") != 2) {
            System.out.println("Błąd: Wyszukiwanie nazw powinno być case-insensitive");
            return;
        }
        if (Server.findServerIndex("Omega") != -1) {
            System.out.println("Błąd: Serwer Omega nie istnieje, powinien zwrócić -1");
            return;
        }

        /** Testowanie pobierania statystyk serwera */

//        double[] stats = Server.getServerStats(0);
//        if (stats.length != 3 || stats[0] != 70.5 || stats[1] != 60.2 || stats[2] != 80.1) {
//            System.out.println("Błąd: Niepoprawne statystyki serwera Alpha");
//            return;
//        }
//        stats = Server.getServerStats(2);
//        if (stats.length != 3 || stats[0] != 85.0 || stats[1] != 90.5 || stats[2] != 95.2) {
//            System.out.println("Błąd: Niepoprawne statystyki serwera Alpha");
//            return;
//        }
//        double[] invalidStats = Server.getServerStats(10);
//        if (invalidStats.length != 0) {
//            System.out.println("Błąd: Statystyki dla nieistniejącego serwera powinny zwrócić pustą tablicę");
//            return;
//        }

        /**  Testowanie średniego zużycia zasobów */

        if (PerformanceMonitor.getAverageUsage(0) != 70.26666666666667) {
            System.out.println("Błąd: Niepoprawna średnia wydajność serwera Alpha");
            return;
        }
        if (PerformanceMonitor.getAverageUsage(10) != -1) {
            System.out.println("Błąd: Nieistniejący serwer powinien zwrócić -1");
            return;
        }

        if (PerformanceMonitor.getAverageUsage("Delta") != 50) {
            System.out.println("Błąd: Niepoprawna średnia wydajność serwera Delta");
            return;
        }


        /**  Testowanie systemu alertów */

//        if (!AlertSystem.isServerOverloaded(2)) {
//            System.out.println("Błąd: Serwer 2 powinien być przeciążony");
//            return;
//        }
//        if (!AlertSystem.isServerOverloaded("Gamma")) {
//            System.out.println("Błąd: Serwer Gamma powinien być przeciążony");
//            return;
//        }
//        if (AlertSystem.isServerOverloaded(1)) {
//            System.out.println("Błąd: Serwer 1 nie powinien być przeciążony");
//            return;
//        }
//
//        if (AlertSystem.isServerOverloaded("Beta")) {
//            System.out.println("Błąd: Serwer Beta nie powinien być przeciążony");
//            return;
//        }
//        if (AlertSystem.isServerOverloaded(10)) {
//            System.out.println("Błąd: Nieistniejący serwer nie powinien być przeciążony");
//            return;
//        }

        /**  Generowanie raportu */

//        ReportGenerator.generateReport();
//
//        System.out.println("wszystko dziala - koniec");
    }
}
