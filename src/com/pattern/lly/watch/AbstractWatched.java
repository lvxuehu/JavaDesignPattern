package com.pattern.lly.watch;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午3:28
 */
public interface AbstractWatched {
    public void addWatcher(AbstractWatcher aw);

    public void removeWatcher(AbstractWatcher aw);

    public void removeAllWatcher();

    public void notifyWatchers();
}
