package io.sentry;

import java.util.Queue;

/* loaded from: classes2.dex */
final class j2 extends i2 implements Queue {
    private j2(Queue queue) {
        super(queue);
    }

    static j2 h(Queue queue) {
        return new j2(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.i2
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Queue c() {
        return (Queue) super.c();
    }

    @Override // java.util.Queue
    public Object element() {
        Object element;
        synchronized (this.f35155b) {
            element = c().element();
        }
        return element;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f35155b) {
            equals = c().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.f35155b) {
            hashCode = c().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        boolean offer;
        synchronized (this.f35155b) {
            offer = c().offer(obj);
        }
        return offer;
    }

    @Override // java.util.Queue
    public Object peek() {
        Object peek;
        synchronized (this.f35155b) {
            peek = c().peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public Object poll() {
        Object poll;
        synchronized (this.f35155b) {
            poll = c().poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public Object remove() {
        Object remove;
        synchronized (this.f35155b) {
            remove = c().remove();
        }
        return remove;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f35155b) {
            array = c().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f35155b) {
            array = c().toArray(objArr);
        }
        return array;
    }
}
