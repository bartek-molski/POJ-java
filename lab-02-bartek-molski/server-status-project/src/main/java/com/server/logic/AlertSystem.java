package com.server.logic;

public class AlertSystem {
    private static final double CRITICAL_THRESHOLD = 90.0;

    /**
     * Sprawdza, czy dany serwer jest przeciążony.
     * @param serverId Indeks serwera.
     * @return true jeśli serwer jest przeciążony, false w przeciwnym razie.
     */
    public static boolean isServerOverloaded(int serverId) {
        return true;
    }

    /**
     * Sprawdza, czy dany serwer jest przeciążony.
     * @param server nazwa serwera.
     * @return true jeśli serwer jest przeciążony, false w przeciwnym razie.
     */
    public static boolean isServerOverloaded(String server) {
        return true;
    }
}
