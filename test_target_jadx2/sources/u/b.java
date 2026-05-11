package U;

import A.InterfaceC0703j;
import A.InterfaceC0705k;
import A.InterfaceC0713p;
import A.J0;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1598o;
import androidx.lifecycle.InterfaceC1599p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements InterfaceC1598o, InterfaceC0703j {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1599p f10247b;

    /* renamed from: c, reason: collision with root package name */
    private final H.f f10248c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f10246a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f10249d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10250e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10251f = false;

    b(InterfaceC1599p interfaceC1599p, H.f fVar) {
        this.f10247b = interfaceC1599p;
        this.f10248c = fVar;
        if (interfaceC1599p.getLifecycle().b().isAtLeast(AbstractC1592i.b.STARTED)) {
            fVar.k();
        } else {
            fVar.A();
        }
        interfaceC1599p.getLifecycle().a(this);
    }

    @Override // A.InterfaceC0703j
    public InterfaceC0705k a() {
        return this.f10248c.a();
    }

    @Override // A.InterfaceC0703j
    public InterfaceC0713p c() {
        return this.f10248c.c();
    }

    void f(Collection collection) {
        synchronized (this.f10246a) {
            this.f10248c.j(collection);
        }
    }

    public H.f j() {
        return this.f10248c;
    }

    public InterfaceC1599p k() {
        InterfaceC1599p interfaceC1599p;
        synchronized (this.f10246a) {
            interfaceC1599p = this.f10247b;
        }
        return interfaceC1599p;
    }

    @A(AbstractC1592i.a.ON_DESTROY)
    public void onDestroy(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10246a) {
            H.f fVar = this.f10248c;
            fVar.Z(fVar.J());
        }
    }

    @A(AbstractC1592i.a.ON_PAUSE)
    public void onPause(InterfaceC1599p interfaceC1599p) {
        this.f10248c.l(false);
    }

    @A(AbstractC1592i.a.ON_RESUME)
    public void onResume(InterfaceC1599p interfaceC1599p) {
        this.f10248c.l(true);
    }

    @A(AbstractC1592i.a.ON_START)
    public void onStart(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10246a) {
            try {
                if (!this.f10250e && !this.f10251f) {
                    this.f10248c.k();
                    this.f10249d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @A(AbstractC1592i.a.ON_STOP)
    public void onStop(InterfaceC1599p interfaceC1599p) {
        synchronized (this.f10246a) {
            try {
                if (!this.f10250e && !this.f10251f) {
                    this.f10248c.A();
                    this.f10249d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    InterfaceC0713p r() {
        return this.f10248c.G();
    }

    public List s() {
        List unmodifiableList;
        synchronized (this.f10246a) {
            unmodifiableList = Collections.unmodifiableList(this.f10248c.J());
        }
        return unmodifiableList;
    }

    public boolean t(J0 j02) {
        boolean contains;
        synchronized (this.f10246a) {
            contains = this.f10248c.J().contains(j02);
        }
        return contains;
    }

    public void u() {
        synchronized (this.f10246a) {
            try {
                if (this.f10250e) {
                    return;
                }
                onStop(this.f10247b);
                this.f10250e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void v(Collection collection) {
        synchronized (this.f10246a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f10248c.J());
            this.f10248c.Z(arrayList);
        }
    }

    void w() {
        synchronized (this.f10246a) {
            H.f fVar = this.f10248c;
            fVar.Z(fVar.J());
        }
    }

    public void x() {
        synchronized (this.f10246a) {
            try {
                if (this.f10250e) {
                    this.f10250e = false;
                    if (this.f10247b.getLifecycle().b().isAtLeast(AbstractC1592i.b.STARTED)) {
                        onStart(this.f10247b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
