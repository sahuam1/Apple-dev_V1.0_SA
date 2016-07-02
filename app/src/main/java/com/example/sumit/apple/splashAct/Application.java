package com.example.sumit.apple.splashAct;

import java.util.concurrent.Callable;

/**
 * Created by Smit on 6/6/2016.
 */
public class Application {
    private static Application ourInstance = new Application();

    public static Application getInstance() {
        return ourInstance;
    }

    private Callable<Void> mLogoutCallable;

    private Application() {
    }

    public void setLogoutCallable(Callable<Void> callable) {
        mLogoutCallable = callable;
    }
}
