package k2;

import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.io.File;
import java.util.List;
import k2.InterfaceC3536f;
import o2.n;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3533c implements InterfaceC3536f, d.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f35992a;

    /* renamed from: b, reason: collision with root package name */
    private final C3537g f35993b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3536f.a f35994c;

    /* renamed from: d, reason: collision with root package name */
    private int f35995d;

    /* renamed from: e, reason: collision with root package name */
    private i2.f f35996e;

    /* renamed from: f, reason: collision with root package name */
    private List f35997f;

    /* renamed from: g, reason: collision with root package name */
    private int f35998g;

    /* renamed from: h, reason: collision with root package name */
    private volatile n.a f35999h;

    /* renamed from: i, reason: collision with root package name */
    private File f36000i;

    C3533c(C3537g c3537g, InterfaceC3536f.a aVar) {
        this(c3537g.c(), c3537g, aVar);
    }

    private boolean b() {
        return this.f35998g < this.f35997f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (b() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f35997f;
        r3 = r7.f35998g;
        r7.f35998g = r3 + 1;
        r7.f35999h = ((o2.n) r0.get(r3)).b(r7.f36000i, r7.f35993b.t(), r7.f35993b.f(), r7.f35993b.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f35999h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f35993b.u(r7.f35999h.f37868c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f35999h.f37868c.f(r7.f35993b.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f35999h = null;
     */
    @Override // k2.InterfaceC3536f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a() {
        E2.b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f35997f != null && b()) {
                    break;
                }
                int i10 = this.f35995d + 1;
                this.f35995d = i10;
                if (i10 >= this.f35992a.size()) {
                    return false;
                }
                i2.f fVar = (i2.f) this.f35992a.get(this.f35995d);
                File a10 = this.f35993b.d().a(new C3534d(fVar, this.f35993b.p()));
                this.f36000i = a10;
                if (a10 != null) {
                    this.f35996e = fVar;
                    this.f35997f = this.f35993b.j(a10);
                    this.f35998g = 0;
                }
            } finally {
                E2.b.e();
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f35994c.c(this.f35996e, exc, this.f35999h.f37868c, EnumC3313a.DATA_DISK_CACHE);
    }

    @Override // k2.InterfaceC3536f
    public void cancel() {
        n.a aVar = this.f35999h;
        if (aVar != null) {
            aVar.f37868c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void d(Object obj) {
        this.f35994c.b(this.f35996e, obj, this.f35999h.f37868c, EnumC3313a.DATA_DISK_CACHE, this.f35996e);
    }

    C3533c(List list, C3537g c3537g, InterfaceC3536f.a aVar) {
        this.f35995d = -1;
        this.f35992a = list;
        this.f35993b = c3537g;
        this.f35994c = aVar;
    }
}
