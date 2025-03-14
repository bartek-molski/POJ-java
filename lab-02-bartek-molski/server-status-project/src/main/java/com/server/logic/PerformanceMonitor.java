package com.server.logic;

public class PerformanceMonitor {

    /**
     * Oblicza średnie użycie zasobów dla danego serwera.
     * @param serverId Indeks serwera.
     * @return Średnie użycie zasobów lub -1 jeśli serwer nie istnieje.
     */
    public static double getAverageUsage(int serverId) {
        double[] stats = Server.getServerStats(serverId);
        if(stats.length==0) {return -1;}
        return (stats[0]+stats[1]+stats[2])/3;
    }

    /**
     * Oblicza średnie użycie zasobów dla danego serwera.
     * @param server nazwa serwera.
     * @return Średnie użycie zasobów lub -1 jeśli serwer nie istnieje.
     */
    public static double getAverageUsage(String server) {
        return -10;
    }
}
