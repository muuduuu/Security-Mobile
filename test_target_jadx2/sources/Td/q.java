package Td;

import ae.k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    private Runnable f10192c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f10193d;

    /* renamed from: a, reason: collision with root package name */
    private int f10190a = 64;

    /* renamed from: b, reason: collision with root package name */
    private int f10191b = 5;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f10194e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f10195f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f10196g = new ArrayDeque();

    private final k.a d(String str) {
        Iterator it = this.f10195f.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            if (Intrinsics.b(aVar.f(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f10194e.iterator();
        while (it2.hasNext()) {
            k.a aVar2 = (k.a) it2.next();
            if (Intrinsics.b(aVar2.f(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f10192c;
            Unit unit = Unit.f36324a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i10;
        boolean z10;
        if (Wd.p.f11601e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f10194e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    k.a aVar = (k.a) it.next();
                    if (this.f10195f.size() >= this.f10190a) {
                        break;
                    }
                    if (aVar.e().get() < this.f10191b) {
                        it.remove();
                        aVar.e().incrementAndGet();
                        Intrinsics.d(aVar);
                        arrayList.add(aVar);
                        this.f10195f.add(aVar);
                    }
                }
                i10 = 0;
                z10 = k() > 0;
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c().isShutdown()) {
            int size = arrayList.size();
            while (i10 < size) {
                k.a aVar2 = (k.a) arrayList.get(i10);
                aVar2.e().decrementAndGet();
                synchronized (this) {
                    this.f10195f.remove(aVar2);
                }
                k.a.c(aVar2, null, 1, null);
                i10++;
            }
            Runnable runnable = this.f10192c;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                ((k.a) arrayList.get(i10)).a(c());
                i10++;
            }
        }
        return z10;
    }

    public final void a(k.a call) {
        k.a d10;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f10194e.add(call);
                if (!call.d().q() && (d10 = d(call.f())) != null) {
                    call.g(d10);
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        h();
    }

    public final synchronized void b(ae.k call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f10196g.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f10193d == null) {
                this.f10193d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Wd.p.o(Wd.p.f11602f + " Dispatcher", false));
            }
            executorService = this.f10193d;
            Intrinsics.d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void f(k.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.e().decrementAndGet();
        e(this.f10195f, call);
    }

    public final void g(ae.k call) {
        Intrinsics.checkNotNullParameter(call, "call");
        e(this.f10196g, call);
    }

    public final synchronized List i() {
        List unmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f10194e;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(arrayDeque, 10));
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((k.a) it.next()).d());
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized List j() {
        List unmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f10196g;
            ArrayDeque arrayDeque2 = this.f10195f;
            ArrayList arrayList = new ArrayList(CollectionsKt.u(arrayDeque2, 10));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((k.a) it.next()).d());
            }
            unmodifiableList = Collections.unmodifiableList(CollectionsKt.w0(arrayDeque, arrayList));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        } catch (Throwable th) {
            throw th;
        }
        return unmodifiableList;
    }

    public final synchronized int k() {
        return this.f10195f.size() + this.f10196g.size();
    }
}
