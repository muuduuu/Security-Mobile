package k2;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import k2.InterfaceC3536f;
import m2.InterfaceC3639a;
import o2.n;

/* loaded from: classes.dex */
class z implements InterfaceC3536f, InterfaceC3536f.a {

    /* renamed from: a, reason: collision with root package name */
    private final C3537g f36193a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3536f.a f36194b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f36195c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C3533c f36196d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f36197e;

    /* renamed from: f, reason: collision with root package name */
    private volatile n.a f36198f;

    /* renamed from: g, reason: collision with root package name */
    private volatile C3534d f36199g;

    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f36200a;

        a(n.a aVar) {
            this.f36200a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.g(this.f36200a)) {
                z.this.i(this.f36200a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(Object obj) {
            if (z.this.g(this.f36200a)) {
                z.this.h(this.f36200a, obj);
            }
        }
    }

    z(C3537g c3537g, InterfaceC3536f.a aVar) {
        this.f36193a = c3537g;
        this.f36194b = aVar;
    }

    private boolean e(Object obj) {
        long b10 = D2.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e o10 = this.f36193a.o(obj);
            Object a10 = o10.a();
            i2.d q10 = this.f36193a.q(a10);
            C3535e c3535e = new C3535e(q10, a10, this.f36193a.k());
            C3534d c3534d = new C3534d(this.f36198f.f37866a, this.f36193a.p());
            InterfaceC3639a d10 = this.f36193a.d();
            d10.b(c3534d, c3535e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c3534d + ", data: " + obj + ", encoder: " + q10 + ", duration: " + D2.g.a(b10));
            }
            if (d10.a(c3534d) != null) {
                this.f36199g = c3534d;
                this.f36196d = new C3533c(Collections.singletonList(this.f36198f.f37866a), this.f36193a, this);
                this.f36198f.f37868c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f36199g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f36194b.b(this.f36198f.f37866a, o10.a(), this.f36198f.f37868c, this.f36198f.f37868c.e(), this.f36198f.f37866a);
                return false;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    this.f36198f.f37868c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean f() {
        return this.f36195c < this.f36193a.g().size();
    }

    private void j(n.a aVar) {
        this.f36198f.f37868c.f(this.f36193a.l(), new a(aVar));
    }

    @Override // k2.InterfaceC3536f
    public boolean a() {
        if (this.f36197e != null) {
            Object obj = this.f36197e;
            this.f36197e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f36196d != null && this.f36196d.a()) {
            return true;
        }
        this.f36196d = null;
        this.f36198f = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List g10 = this.f36193a.g();
            int i10 = this.f36195c;
            this.f36195c = i10 + 1;
            this.f36198f = (n.a) g10.get(i10);
            if (this.f36198f != null && (this.f36193a.e().c(this.f36198f.f37868c.e()) || this.f36193a.u(this.f36198f.f37868c.a()))) {
                j(this.f36198f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // k2.InterfaceC3536f.a
    public void b(i2.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, EnumC3313a enumC3313a, i2.f fVar2) {
        this.f36194b.b(fVar, obj, dVar, this.f36198f.f37868c.e(), fVar);
    }

    @Override // k2.InterfaceC3536f.a
    public void c(i2.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, EnumC3313a enumC3313a) {
        this.f36194b.c(fVar, exc, dVar, this.f36198f.f37868c.e());
    }

    @Override // k2.InterfaceC3536f
    public void cancel() {
        n.a aVar = this.f36198f;
        if (aVar != null) {
            aVar.f37868c.cancel();
        }
    }

    @Override // k2.InterfaceC3536f.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    boolean g(n.a aVar) {
        n.a aVar2 = this.f36198f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(n.a aVar, Object obj) {
        j e10 = this.f36193a.e();
        if (obj != null && e10.c(aVar.f37868c.e())) {
            this.f36197e = obj;
            this.f36194b.d();
        } else {
            InterfaceC3536f.a aVar2 = this.f36194b;
            i2.f fVar = aVar.f37866a;
            com.bumptech.glide.load.data.d dVar = aVar.f37868c;
            aVar2.b(fVar, obj, dVar, dVar.e(), this.f36199g);
        }
    }

    void i(n.a aVar, Exception exc) {
        InterfaceC3536f.a aVar2 = this.f36194b;
        C3534d c3534d = this.f36199g;
        com.bumptech.glide.load.data.d dVar = aVar.f37868c;
        aVar2.c(c3534d, exc, dVar, dVar.e());
    }
}
