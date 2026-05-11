package c7;

import V6.AbstractC1287s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ThreadFactoryC1738b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f19426a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f19427b = Executors.defaultThreadFactory();

    public ThreadFactoryC1738b(String str) {
        AbstractC1287s.n(str, "Name must not be null");
        this.f19426a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f19427b.newThread(new RunnableC1740d(runnable, 0));
        newThread.setName(this.f19426a);
        return newThread;
    }
}
