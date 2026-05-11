package co.hyperverge.hypersnapsdk.utils;

import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public class NonBlockingFixedSizeQueue<E> extends ArrayBlockingQueue<E> {
    private static final long serialVersionUID = -7772085623838075506L;
    private int size;

    public NonBlockingFixedSizeQueue(int i10) {
        super(i10);
        this.size = i10;
    }

    @Override // java.util.concurrent.ArrayBlockingQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public synchronized boolean add(E e10) {
        try {
            if (super.size() == this.size) {
                remove();
            }
        } catch (Throwable th) {
            throw th;
        }
        return super.add(e10);
    }
}
