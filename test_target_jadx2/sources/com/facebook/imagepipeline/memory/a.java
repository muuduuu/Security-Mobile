package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import b3.l;
import b3.n;
import b3.q;
import c3.AbstractC1721a;
import j4.C3492F;
import j4.G;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a implements e3.f {

    /* renamed from: a, reason: collision with root package name */
    private final Class f20693a;

    /* renamed from: b, reason: collision with root package name */
    final e3.d f20694b;

    /* renamed from: c, reason: collision with root package name */
    final C3492F f20695c;

    /* renamed from: d, reason: collision with root package name */
    final SparseArray f20696d;

    /* renamed from: e, reason: collision with root package name */
    final Set f20697e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20698f;

    /* renamed from: g, reason: collision with root package name */
    final C0367a f20699g;

    /* renamed from: h, reason: collision with root package name */
    final C0367a f20700h;

    /* renamed from: i, reason: collision with root package name */
    private final G f20701i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20702j;

    /* renamed from: com.facebook.imagepipeline.memory.a$a, reason: collision with other inner class name */
    static class C0367a {

        /* renamed from: a, reason: collision with root package name */
        int f20703a;

        /* renamed from: b, reason: collision with root package name */
        int f20704b;

        C0367a() {
        }

        public void a(int i10) {
            int i11;
            int i12 = this.f20704b;
            if (i12 < i10 || (i11 = this.f20703a) <= 0) {
                AbstractC1721a.P("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f20704b), Integer.valueOf(this.f20703a));
            } else {
                this.f20703a = i11 - 1;
                this.f20704b = i12 - i10;
            }
        }

        public void b(int i10) {
            this.f20703a++;
            this.f20704b += i10;
        }
    }

    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public a(e3.d dVar, C3492F c3492f, G g10) {
        this.f20693a = getClass();
        this.f20694b = (e3.d) l.g(dVar);
        C3492F c3492f2 = (C3492F) l.g(c3492f);
        this.f20695c = c3492f2;
        this.f20701i = (G) l.g(g10);
        this.f20696d = new SparseArray();
        if (c3492f2.f35794f) {
            s();
        } else {
            w(new SparseIntArray(0));
        }
        this.f20697e = n.b();
        this.f20700h = new C0367a();
        this.f20699g = new C0367a();
    }

    private synchronized void j() {
        boolean z10;
        try {
            if (u() && this.f20700h.f20704b != 0) {
                z10 = false;
                l.i(z10);
            }
            z10 = true;
            l.i(z10);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void k(SparseIntArray sparseIntArray) {
        this.f20696d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int keyAt = sparseIntArray.keyAt(i10);
            this.f20696d.put(keyAt, new com.facebook.imagepipeline.memory.b(q(keyAt), sparseIntArray.valueAt(i10), 0, this.f20695c.f35794f));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.b n(int i10) {
        return (com.facebook.imagepipeline.memory.b) this.f20696d.get(i10);
    }

    private synchronized void s() {
        try {
            SparseIntArray sparseIntArray = this.f20695c.f35791c;
            if (sparseIntArray != null) {
                k(sparseIntArray);
                this.f20698f = false;
            } else {
                this.f20698f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void w(SparseIntArray sparseIntArray) {
        try {
            l.g(sparseIntArray);
            this.f20696d.clear();
            SparseIntArray sparseIntArray2 = this.f20695c.f35791c;
            if (sparseIntArray2 != null) {
                for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                    int keyAt = sparseIntArray2.keyAt(i10);
                    this.f20696d.put(keyAt, new com.facebook.imagepipeline.memory.b(q(keyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(keyAt, 0), this.f20695c.f35794f));
                }
                this.f20698f = false;
            } else {
                this.f20698f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void x() {
        if (AbstractC1721a.x(2)) {
            AbstractC1721a.C(this.f20693a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f20699g.f20703a), Integer.valueOf(this.f20699g.f20704b), Integer.valueOf(this.f20700h.f20703a), Integer.valueOf(this.f20700h.f20704b));
        }
    }

    synchronized void A() {
        if (u()) {
            z(this.f20695c.f35790b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        r2.b();
     */
    @Override // e3.f, f3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Object obj) {
        l.g(obj);
        int p10 = p(obj);
        int q10 = q(p10);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b n10 = n(p10);
                if (this.f20697e.remove(obj)) {
                    if (n10 != null && !n10.f() && !u() && v(obj)) {
                        n10.h(obj);
                        this.f20700h.b(q10);
                        this.f20699g.a(q10);
                        this.f20701i.g(q10);
                        if (AbstractC1721a.x(2)) {
                            AbstractC1721a.A(this.f20693a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(p10));
                        }
                    }
                    if (AbstractC1721a.x(2)) {
                        AbstractC1721a.A(this.f20693a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(p10));
                    }
                    l(obj);
                    this.f20699g.a(q10);
                    this.f20701i.e(q10);
                } else {
                    AbstractC1721a.k(this.f20693a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(p10));
                    l(obj);
                    this.f20701i.e(q10);
                }
                x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e3.f
    public Object get(int i10) {
        Object obj;
        Object r10;
        j();
        int o10 = o(i10);
        synchronized (this) {
            try {
                com.facebook.imagepipeline.memory.b m10 = m(o10);
                if (m10 != null && (r10 = r(m10)) != null) {
                    l.i(this.f20697e.add(r10));
                    int p10 = p(r10);
                    int q10 = q(p10);
                    this.f20699g.b(q10);
                    this.f20700h.a(q10);
                    this.f20701i.b(q10);
                    x();
                    if (AbstractC1721a.x(2)) {
                        AbstractC1721a.A(this.f20693a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(r10)), Integer.valueOf(p10));
                    }
                    return r10;
                }
                int q11 = q(o10);
                if (!i(q11)) {
                    throw new c(this.f20695c.f35789a, this.f20699g.f20704b, this.f20700h.f20704b, q11);
                }
                this.f20699g.b(q11);
                if (m10 != null) {
                    m10.e();
                }
                try {
                    obj = h(o10);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.f20699g.a(q11);
                            com.facebook.imagepipeline.memory.b m11 = m(o10);
                            if (m11 != null) {
                                m11.b();
                            }
                            q.c(th);
                            obj = null;
                        } finally {
                        }
                    }
                }
                synchronized (this) {
                    try {
                        l.i(this.f20697e.add(obj));
                        A();
                        this.f20701i.a(q11);
                        x();
                        if (AbstractC1721a.x(2)) {
                            AbstractC1721a.A(this.f20693a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(o10));
                        }
                    } finally {
                    }
                }
                return obj;
            } finally {
            }
        }
    }

    protected abstract Object h(int i10);

    synchronized boolean i(int i10) {
        if (this.f20702j) {
            return true;
        }
        C3492F c3492f = this.f20695c;
        int i11 = c3492f.f35789a;
        int i12 = this.f20699g.f20704b;
        if (i10 > i11 - i12) {
            this.f20701i.f();
            return false;
        }
        int i13 = c3492f.f35790b;
        if (i10 > i13 - (i12 + this.f20700h.f20704b)) {
            z(i13 - i10);
        }
        if (i10 <= i11 - (this.f20699g.f20704b + this.f20700h.f20704b)) {
            return true;
        }
        this.f20701i.f();
        return false;
    }

    protected abstract void l(Object obj);

    synchronized com.facebook.imagepipeline.memory.b m(int i10) {
        try {
            com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) this.f20696d.get(i10);
            if (bVar == null && this.f20698f) {
                if (AbstractC1721a.x(2)) {
                    AbstractC1721a.z(this.f20693a, "creating new bucket %s", Integer.valueOf(i10));
                }
                com.facebook.imagepipeline.memory.b y10 = y(i10);
                this.f20696d.put(i10, y10);
                return y10;
            }
            return bVar;
        } finally {
        }
    }

    protected abstract int o(int i10);

    protected abstract int p(Object obj);

    protected abstract int q(int i10);

    protected synchronized Object r(com.facebook.imagepipeline.memory.b bVar) {
        return bVar.c();
    }

    protected void t() {
        this.f20694b.a(this);
        this.f20701i.c(this);
    }

    synchronized boolean u() {
        boolean z10;
        z10 = this.f20699g.f20704b + this.f20700h.f20704b > this.f20695c.f35790b;
        if (z10) {
            this.f20701i.d();
        }
        return z10;
    }

    protected boolean v(Object obj) {
        l.g(obj);
        return true;
    }

    com.facebook.imagepipeline.memory.b y(int i10) {
        return new com.facebook.imagepipeline.memory.b(q(i10), Integer.MAX_VALUE, 0, this.f20695c.f35794f);
    }

    synchronized void z(int i10) {
        try {
            int i11 = this.f20699g.f20704b;
            int i12 = this.f20700h.f20704b;
            int min = Math.min((i11 + i12) - i10, i12);
            if (min <= 0) {
                return;
            }
            if (AbstractC1721a.x(2)) {
                AbstractC1721a.B(this.f20693a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i10), Integer.valueOf(this.f20699g.f20704b + this.f20700h.f20704b), Integer.valueOf(min));
            }
            x();
            for (int i13 = 0; i13 < this.f20696d.size() && min > 0; i13++) {
                com.facebook.imagepipeline.memory.b bVar = (com.facebook.imagepipeline.memory.b) l.g((com.facebook.imagepipeline.memory.b) this.f20696d.valueAt(i13));
                while (min > 0) {
                    Object g10 = bVar.g();
                    if (g10 == null) {
                        break;
                    }
                    l(g10);
                    int i14 = bVar.f20705a;
                    min -= i14;
                    this.f20700h.a(i14);
                }
            }
            x();
            if (AbstractC1721a.x(2)) {
                AbstractC1721a.A(this.f20693a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i10), Integer.valueOf(this.f20699g.f20704b + this.f20700h.f20704b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public a(e3.d dVar, C3492F c3492f, G g10, boolean z10) {
        this(dVar, c3492f, g10);
        this.f20702j = z10;
    }
}
