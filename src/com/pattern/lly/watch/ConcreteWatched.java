package com.pattern.lly.watch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午3:32
 */
public class ConcreteWatched implements AbstractWatched {
    List<AbstractWatcher> list = new ArrayList<AbstractWatcher>();

    @Override
    public void addWatcher(AbstractWatcher aw) {
        list.add(aw);
    }

    @Override
    public void removeWatcher(AbstractWatcher aw) {
        list.remove(aw);
    }

    @Override
    public void removeAllWatcher() {
        list.clear();
    }

    @Override
    public void notifyWatchers() {
        for (AbstractWatcher watcher : list) {
            watcher.update();
        }
    }
}
