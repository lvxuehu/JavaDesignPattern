package com.pattern.lly.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 12-12-31
 * Time: 下午3:42
 */
public class DBManager {
    private static DBManager instance=null;

    protected DBManager() {
    }

    public static synchronized DBManager getInstance(){
        if (instance==null){
            instance=new DBManager();
        }
        return instance;
    }
}
