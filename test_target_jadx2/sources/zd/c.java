package Zd;

import Wd.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final d f12514a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12515b;

    /* renamed from: c, reason: collision with root package name */
    private final ReentrantLock f12516c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12517d;

    /* renamed from: e, reason: collision with root package name */
    private Zd.a f12518e;

    /* renamed from: f, reason: collision with root package name */
    private final List f12519f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12520g;

    public static final class a extends Zd.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f12521e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z10, Function0 function0) {
            super(str, z10);
            this.f12521e = function0;
        }

        @Override // Zd.a
        public long f() {
            this.f12521e.invoke();
            return -1L;
        }
    }

    public static final class b extends Zd.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f12522e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Function0 function0) {
            super(str, false, 2, null);
            this.f12522e = function0;
        }

        @Override // Zd.a
        public long f() {
            return ((Number) this.f12522e.invoke()).longValue();
        }
    }

    public c(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f12514a = taskRunner;
        this.f12515b = name;
        this.f12516c = new ReentrantLock();
        this.f12519f = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j10, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        cVar.c(str, j11, z10, function0);
    }

    public static /* synthetic */ void m(c cVar, Zd.a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.k(aVar, j10);
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f12516c;
        if (p.f11601e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock h10 = this.f12514a.h();
        h10.lock();
        try {
            if (b()) {
                this.f12514a.j(this);
            }
            Unit unit = Unit.f36324a;
            h10.unlock();
        } catch (Throwable th) {
            h10.unlock();
            throw th;
        }
    }

    public final boolean b() {
        Zd.a aVar = this.f12518e;
        if (aVar != null) {
            Intrinsics.d(aVar);
            if (aVar.a()) {
                this.f12520g = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f12519f.size() - 1; -1 < size; size--) {
            if (((Zd.a) this.f12519f.get(size)).a()) {
                Logger i10 = this.f12514a.i();
                Zd.a aVar2 = (Zd.a) this.f12519f.get(size);
                if (i10.isLoggable(Level.FINE)) {
                    Zd.b.c(i10, aVar2, this, "canceled");
                }
                this.f12519f.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(String name, long j10, boolean z10, Function0 block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        k(new a(name, z10, block), j10);
    }

    public final Zd.a e() {
        return this.f12518e;
    }

    public final boolean f() {
        return this.f12520g;
    }

    public final List g() {
        return this.f12519f;
    }

    public final String h() {
        return this.f12515b;
    }

    public final boolean i() {
        return this.f12517d;
    }

    public final d j() {
        return this.f12514a;
    }

    public final void k(Zd.a task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        ReentrantLock h10 = this.f12514a.h();
        h10.lock();
        try {
            if (!this.f12517d) {
                if (n(task, j10, false)) {
                    this.f12514a.j(this);
                }
                Unit unit = Unit.f36324a;
            } else if (task.a()) {
                Logger i10 = this.f12514a.i();
                if (i10.isLoggable(Level.FINE)) {
                    Zd.b.c(i10, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger i11 = this.f12514a.i();
                if (i11.isLoggable(Level.FINE)) {
                    Zd.b.c(i11, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        } finally {
            h10.unlock();
        }
    }

    public final void l(String name, long j10, Function0 block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        k(new b(name, block), j10);
    }

    public final boolean n(Zd.a task, long j10, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        long b10 = this.f12514a.f().b();
        long j11 = b10 + j10;
        int indexOf = this.f12519f.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j11) {
                Logger i10 = this.f12514a.i();
                if (i10.isLoggable(Level.FINE)) {
                    Zd.b.c(i10, task, this, "already scheduled");
                }
                return false;
            }
            this.f12519f.remove(indexOf);
        }
        task.g(j11);
        Logger i11 = this.f12514a.i();
        if (i11.isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + Zd.b.b(j11 - b10);
            } else {
                str = "scheduled after " + Zd.b.b(j11 - b10);
            }
            Zd.b.c(i11, task, this, str);
        }
        Iterator it = this.f12519f.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((Zd.a) it.next()).c() - b10 > j10) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            i12 = this.f12519f.size();
        }
        this.f12519f.add(i12, task);
        return i12 == 0;
    }

    public final void o(Zd.a aVar) {
        this.f12518e = aVar;
    }

    public final void p(boolean z10) {
        this.f12520g = z10;
    }

    public final void q() {
        ReentrantLock reentrantLock = this.f12516c;
        if (p.f11601e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock h10 = this.f12514a.h();
        h10.lock();
        try {
            this.f12517d = true;
            if (b()) {
                this.f12514a.j(this);
            }
            Unit unit = Unit.f36324a;
            h10.unlock();
        } catch (Throwable th) {
            h10.unlock();
            throw th;
        }
    }

    public String toString() {
        return this.f12515b;
    }
}
