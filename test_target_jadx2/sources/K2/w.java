package k2;

import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.File;
import java.util.List;
import k2.InterfaceC3536f;
import o2.n;

/* loaded from: classes.dex */
class w implements InterfaceC3536f, d.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3536f.a f36172a;

    /* renamed from: b, reason: collision with root package name */
    private final C3537g f36173b;

    /* renamed from: c, reason: collision with root package name */
    private int f36174c;

    /* renamed from: d, reason: collision with root package name */
    private int f36175d = -1;

    /* renamed from: e, reason: collision with root package name */
    private i2.f f36176e;

    /* renamed from: f, reason: collision with root package name */
    private List f36177f;

    /* renamed from: g, reason: collision with root package name */
    private int f36178g;

    /* renamed from: h, reason: collision with root package name */
    private volatile n.a f36179h;

    /* renamed from: i, reason: collision with root package name */
    private File f36180i;

    /* renamed from: j, reason: collision with root package name */
    private x f36181j;

    w(C3537g c3537g, InterfaceC3536f.a aVar) {
        this.f36173b = c3537g;
        this.f36172a = aVar;
    }

    private boolean b() {
        return this.f36178g < this.f36177f.size();
    }

    @Override // k2.InterfaceC3536f
    public boolean a() {
        E2.b.a("ResourceCacheGenerator.startNext");
        try {
            List c10 = this.f36173b.c();
            boolean z10 = false;
            if (c10.isEmpty()) {
                E2.b.e();
                return false;
            }
            List m10 = this.f36173b.m();
            if (m10.isEmpty()) {
                if (File.class.equals(this.f36173b.r())) {
                    E2.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f36173b.i() + " to " + this.f36173b.r());
            }
            while (true) {
                if (this.f36177f != null && b()) {
                    this.f36179h = null;
                    while (!z10 && b()) {
                        List list = this.f36177f;
                        int i10 = this.f36178g;
                        this.f36178g = i10 + 1;
                        this.f36179h = ((o2.n) list.get(i10)).b(this.f36180i, this.f36173b.t(), this.f36173b.f(), this.f36173b.k());
                        if (this.f36179h != null && this.f36173b.u(this.f36179h.f37868c.a())) {
                            this.f36179h.f37868c.f(this.f36173b.l(), this);
                            z10 = true;
                        }
                    }
                    E2.b.e();
                    return z10;
                }
                int i11 = this.f36175d + 1;
                this.f36175d = i11;
                if (i11 >= m10.size()) {
                    int i12 = this.f36174c + 1;
                    this.f36174c = i12;
                    if (i12 >= c10.size()) {
                        E2.b.e();
                        return false;
                    }
                    this.f36175d = 0;
                }
                i2.f fVar = (i2.f) c10.get(this.f36174c);
                Class cls = (Class) m10.get(this.f36175d);
                this.f36181j = new x(this.f36173b.b(), fVar, this.f36173b.p(), this.f36173b.t(), this.f36173b.f(), this.f36173b.s(cls), cls, this.f36173b.k());
                File a10 = this.f36173b.d().a(this.f36181j);
                this.f36180i = a10;
                if (a10 != null) {
                    this.f36176e = fVar;
                    this.f36177f = this.f36173b.j(a10);
                    this.f36178g = 0;
                }
            }
        } catch (Throwable th) {
            E2.b.e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f36172a.c(this.f36181j, exc, this.f36179h.f37868c, EnumC3313a.RESOURCE_DISK_CACHE);
    }

    @Override // k2.InterfaceC3536f
    public void cancel() {
        n.a aVar = this.f36179h;
        if (aVar != null) {
            aVar.f37868c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void d(Object obj) {
        this.f36172a.b(this.f36176e, obj, this.f36179h.f37868c, EnumC3313a.RESOURCE_DISK_CACHE, this.f36181j);
    }
}
