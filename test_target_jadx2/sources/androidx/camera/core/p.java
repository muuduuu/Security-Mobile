package androidx.camera.core;

import A.AbstractC0700h0;
import A.Y;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.AbstractC1450n;
import androidx.camera.core.impl.InterfaceC1458r0;
import androidx.camera.core.impl.InterfaceC1469x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class p implements InterfaceC1458r0, e.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f14731a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC1450n f14732b;

    /* renamed from: c, reason: collision with root package name */
    private int f14733c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1458r0.a f14734d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14735e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1458r0 f14736f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC1458r0.a f14737g;

    /* renamed from: h, reason: collision with root package name */
    private Executor f14738h;

    /* renamed from: i, reason: collision with root package name */
    private final LongSparseArray f14739i;

    /* renamed from: j, reason: collision with root package name */
    private final LongSparseArray f14740j;

    /* renamed from: k, reason: collision with root package name */
    private int f14741k;

    /* renamed from: l, reason: collision with root package name */
    private final List f14742l;

    /* renamed from: m, reason: collision with root package name */
    private final List f14743m;

    class a extends AbstractC1450n {
        a() {
        }

        @Override // androidx.camera.core.impl.AbstractC1450n
        public void b(int i10, InterfaceC1469x interfaceC1469x) {
            super.b(i10, interfaceC1469x);
            p.this.t(interfaceC1469x);
        }
    }

    public p(int i10, int i11, int i12, int i13) {
        this(k(i10, i11, i12, i13));
    }

    private static InterfaceC1458r0 k(int i10, int i11, int i12, int i13) {
        return new d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    private void l(n nVar) {
        synchronized (this.f14731a) {
            try {
                int indexOf = this.f14742l.indexOf(nVar);
                if (indexOf >= 0) {
                    this.f14742l.remove(indexOf);
                    int i10 = this.f14741k;
                    if (indexOf <= i10) {
                        this.f14741k = i10 - 1;
                    }
                }
                this.f14743m.remove(nVar);
                if (this.f14733c > 0) {
                    o(this.f14736f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void m(r rVar) {
        final InterfaceC1458r0.a aVar;
        Executor executor;
        synchronized (this.f14731a) {
            try {
                if (this.f14742l.size() < f()) {
                    rVar.a(this);
                    this.f14742l.add(rVar);
                    aVar = this.f14737g;
                    executor = this.f14738h;
                } else {
                    AbstractC0700h0.a("TAG", "Maximum image number reached.");
                    rVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: A.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.p.this.p(aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(InterfaceC1458r0.a aVar) {
        aVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(InterfaceC1458r0 interfaceC1458r0) {
        synchronized (this.f14731a) {
            this.f14733c++;
        }
        o(interfaceC1458r0);
    }

    private void r() {
        synchronized (this.f14731a) {
            try {
                for (int size = this.f14739i.size() - 1; size >= 0; size--) {
                    Y y10 = (Y) this.f14739i.valueAt(size);
                    long a10 = y10.a();
                    n nVar = (n) this.f14740j.get(a10);
                    if (nVar != null) {
                        this.f14740j.remove(a10);
                        this.f14739i.removeAt(size);
                        m(new r(nVar, y10));
                    }
                }
                s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void s() {
        synchronized (this.f14731a) {
            try {
                if (this.f14740j.size() != 0 && this.f14739i.size() != 0) {
                    long keyAt = this.f14740j.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f14739i.keyAt(0);
                    y0.f.a(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f14740j.size() - 1; size >= 0; size--) {
                            if (this.f14740j.keyAt(size) < keyAt2) {
                                ((n) this.f14740j.valueAt(size)).close();
                                this.f14740j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f14739i.size() - 1; size2 >= 0; size2--) {
                            if (this.f14739i.keyAt(size2) < keyAt) {
                                this.f14739i.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public Surface a() {
        Surface a10;
        synchronized (this.f14731a) {
            a10 = this.f14736f.a();
        }
        return a10;
    }

    @Override // androidx.camera.core.e.a
    public void b(n nVar) {
        synchronized (this.f14731a) {
            l(nVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public n c() {
        synchronized (this.f14731a) {
            try {
                if (this.f14742l.isEmpty()) {
                    return null;
                }
                if (this.f14741k >= this.f14742l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f14742l.size() - 1; i10++) {
                    if (!this.f14743m.contains(this.f14742l.get(i10))) {
                        arrayList.add((n) this.f14742l.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                int size = this.f14742l.size();
                List list = this.f14742l;
                this.f14741k = size;
                n nVar = (n) list.get(size - 1);
                this.f14743m.add(nVar);
                return nVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void close() {
        synchronized (this.f14731a) {
            try {
                if (this.f14735e) {
                    return;
                }
                Iterator it = new ArrayList(this.f14742l).iterator();
                while (it.hasNext()) {
                    ((n) it.next()).close();
                }
                this.f14742l.clear();
                this.f14736f.close();
                this.f14735e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int d() {
        int d10;
        synchronized (this.f14731a) {
            d10 = this.f14736f.d();
        }
        return d10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void e() {
        synchronized (this.f14731a) {
            this.f14736f.e();
            this.f14737g = null;
            this.f14738h = null;
            this.f14733c = 0;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int f() {
        int f10;
        synchronized (this.f14731a) {
            f10 = this.f14736f.f();
        }
        return f10;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public n g() {
        synchronized (this.f14731a) {
            try {
                if (this.f14742l.isEmpty()) {
                    return null;
                }
                if (this.f14741k >= this.f14742l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List list = this.f14742l;
                int i10 = this.f14741k;
                this.f14741k = i10 + 1;
                n nVar = (n) list.get(i10);
                this.f14743m.add(nVar);
                return nVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getHeight() {
        int height;
        synchronized (this.f14731a) {
            height = this.f14736f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public int getWidth() {
        int width;
        synchronized (this.f14731a) {
            width = this.f14736f.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.InterfaceC1458r0
    public void h(InterfaceC1458r0.a aVar, Executor executor) {
        synchronized (this.f14731a) {
            this.f14737g = (InterfaceC1458r0.a) y0.f.g(aVar);
            this.f14738h = (Executor) y0.f.g(executor);
            this.f14736f.h(this.f14734d, executor);
        }
    }

    public AbstractC1450n n() {
        return this.f14732b;
    }

    void o(InterfaceC1458r0 interfaceC1458r0) {
        n nVar;
        synchronized (this.f14731a) {
            try {
                if (this.f14735e) {
                    return;
                }
                int size = this.f14740j.size() + this.f14742l.size();
                if (size >= interfaceC1458r0.f()) {
                    AbstractC0700h0.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        nVar = interfaceC1458r0.g();
                        if (nVar != null) {
                            this.f14733c--;
                            size++;
                            this.f14740j.put(nVar.G().a(), nVar);
                            r();
                        }
                    } catch (IllegalStateException e10) {
                        AbstractC0700h0.b("MetadataImageReader", "Failed to acquire next image.", e10);
                        nVar = null;
                    }
                    if (nVar == null || this.f14733c <= 0) {
                        break;
                    }
                } while (size < interfaceC1458r0.f());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void t(InterfaceC1469x interfaceC1469x) {
        synchronized (this.f14731a) {
            try {
                if (this.f14735e) {
                    return;
                }
                this.f14739i.put(interfaceC1469x.a(), new H.c(interfaceC1469x));
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    p(InterfaceC1458r0 interfaceC1458r0) {
        this.f14731a = new Object();
        this.f14732b = new a();
        this.f14733c = 0;
        this.f14734d = new InterfaceC1458r0.a() { // from class: A.i0
            @Override // androidx.camera.core.impl.InterfaceC1458r0.a
            public final void a(InterfaceC1458r0 interfaceC1458r02) {
                androidx.camera.core.p.this.q(interfaceC1458r02);
            }
        };
        this.f14735e = false;
        this.f14739i = new LongSparseArray();
        this.f14740j = new LongSparseArray();
        this.f14743m = new ArrayList();
        this.f14736f = interfaceC1458r0;
        this.f14741k = 0;
        this.f14742l = new ArrayList(f());
    }
}
