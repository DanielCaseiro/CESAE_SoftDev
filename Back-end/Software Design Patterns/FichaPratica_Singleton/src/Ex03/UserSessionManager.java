package Ex03;

import Ex02.Logger;

import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private String lastAccess;


    private UserSessionManager() {
        this.sessionToken = generateRandomSessionToken();
        this.lastAccess = updateLastAccessTime();
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public String updateLastAccessTime() {
        this.lastAccess = String.valueOf(System.currentTimeMillis());

        return lastAccess;
    }

    public int generateRandomSessionToken() {

        Random r = new Random();

        int sessionToken = r.nextInt();

        return sessionToken;
    }

    public static UserSessionManager getInstance() {
        if (instance == null) {

            instance = new UserSessionManager();
        }
        return instance;
    }

}
