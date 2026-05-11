package io.sentry;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class B1 {

    /* renamed from: a, reason: collision with root package name */
    private final R1 f34431a;

    public B1(R1 r12) {
        this.f34431a = (R1) io.sentry.util.n.c(r12, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.q b(Throwable th, io.sentry.protocol.j jVar, Long l10, List list, boolean z10) {
        Package r02 = th.getClass().getPackage();
        String name = th.getClass().getName();
        io.sentry.protocol.q qVar = new io.sentry.protocol.q();
        String message = th.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", BuildConfig.FLAVOR);
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.w wVar = new io.sentry.protocol.w(list);
            if (z10) {
                wVar.e(Boolean.TRUE);
            }
            qVar.l(wVar);
        }
        qVar.m(l10);
        qVar.n(name);
        qVar.j(jVar);
        qVar.k(name2);
        qVar.p(message);
        return qVar;
    }

    private List d(Deque deque) {
        return new ArrayList(deque);
    }

    Deque a(Throwable th) {
        Thread currentThread;
        boolean z10;
        io.sentry.protocol.j jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            if (th instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) th;
                io.sentry.protocol.j a10 = aVar.a();
                Throwable c10 = aVar.c();
                currentThread = aVar.b();
                z10 = aVar.d();
                jVar = a10;
                th = c10;
            } else {
                currentThread = Thread.currentThread();
                z10 = false;
                jVar = null;
            }
            arrayDeque.addFirst(b(th, jVar, Long.valueOf(currentThread.getId()), this.f34431a.a(th.getStackTrace()), z10));
            th = th.getCause();
        }
        return arrayDeque;
    }

    public List c(Throwable th) {
        return d(a(th));
    }

    public List e(io.sentry.protocol.x xVar, io.sentry.protocol.j jVar, Throwable th) {
        io.sentry.protocol.w n10 = xVar.n();
        if (n10 == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b(th, jVar, xVar.l(), n10.d(), true));
        return arrayList;
    }
}
