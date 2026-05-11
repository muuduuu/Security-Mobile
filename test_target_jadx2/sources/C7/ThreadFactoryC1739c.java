package c7;

import V6.AbstractC1287s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ThreadFactoryC1739c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final String f19428a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f19429b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private final ThreadFactory f19430c = Executors.defaultThreadFactory();

    public ThreadFactoryC1739c(String str) {
        AbstractC1287s.n(str, "Name must not be null");
        this.f19428a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f19430c.newThread(new RunnableC1740d(runnable, 0));
        int andIncrement = this.f19429b.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f19428a;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        newThread.setName(sb2.toString());
        return newThread;
    }
}
