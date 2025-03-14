package com.server.logic;

public class Server {
    private static final String[] serverNames = {"Alpha", "Beta", "Gamma", "Delta"};
    private static final double[][] serverStats = {
            {70.5, 60.2, 80.1}, // CPU użycie (%), RAM (%), Dysk (%), serwer 0
            {30.0, 40.0, 20.5}, // serwer 1
            {85.0, 90.5, 95.2}, // serwer 2
            {55.0, 50.0, 45.0}  // serwer 3
    };

    /**
     * Zwraca nazwę serwera na podstawie jego ID.
     * @param id Indeks serwera w tablicy.
     * @return Nazwa serwera lub "Nieznany serwer" jeśli ID jest niepoprawne.
     */
    public static String getServerName(int id) {
        if(id>=0 && id<serverNames.length) {
            return serverNames[id];
        }
        else{
            return "Nieznany serwer";
        }
    }

    /**
     * Zwraca statystyki serwera na podstawie jego ID.
     * @param id Indeks serwera w tablicy.
     * @return Tablica z wartościami CPU, RAM i Dysk, lub pusta tablica jeśli ID jest niepoprawne.
     */
    public static double[] getServerStats(int id) {
        if(id<0 || id>=serverStats.length) { return new double[0];}
        return serverStats[id];
    }

    /**
     * Zwraca statystyki serwera na podstawie jego ID.
     * @param server nazwa serwera w tablicy.
     * @return Tablica z wartościami CPU, RAM i Dysk, lub pusta tablica jeśli ID jest niepoprawne.
     */
    public static double[] getServerStats(String server) {
        int index = findServerIndex(server);
        return getServerStats(index);
    }

    /**
     * Wyszukuje indeks serwera na podstawie jego nazwy.
     * @param name Nazwa serwera.
     * @return Indeks serwera lub -1, jeśli serwer nie został znaleziony.
     */
    public static int findServerIndex(String name) {
        int dl=serverNames.length;
        for(int i=0;i<dl;i++) {
            if(serverNames[i].toLowerCase().equals(name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}
