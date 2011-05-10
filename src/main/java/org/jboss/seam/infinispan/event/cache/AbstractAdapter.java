package org.jboss.seam.infinispan.event.cache;

import javax.enterprise.event.Event;

public abstract class AbstractAdapter<T extends org.infinispan.notifications.cachelistener.event.Event> {

    private final Event<T> event;

    public AbstractAdapter(Event<T> event) {
        this.event = event;
    }

    public void fire(T payload) {
        this.event.fire(payload);
    }

}
