package r3;

import android.content.Context;
import b3.p;
import b4.k;
import java.util.Set;
import l3.InterfaceC3606c;
import m4.b;
import v3.AbstractC4922b;

/* loaded from: classes.dex */
public class e extends AbstractC4922b {

    /* renamed from: t, reason: collision with root package name */
    private final k f39226t;

    /* renamed from: u, reason: collision with root package name */
    private final g f39227u;

    /* renamed from: v, reason: collision with root package name */
    private b3.f f39228v;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39229a;

        static {
            int[] iArr = new int[AbstractC4922b.c.values().length];
            f39229a = iArr;
            try {
                iArr[AbstractC4922b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39229a[AbstractC4922b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39229a[AbstractC4922b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context, g gVar, k kVar, Set set, Set set2) {
        super(context, set, set2);
        this.f39226t = kVar;
        this.f39227u = gVar;
    }

    public static b.c F(AbstractC4922b.c cVar) {
        int i10 = a.f39229a[cVar.ordinal()];
        if (i10 == 1) {
            return b.c.FULL_FETCH;
        }
        if (i10 == 2) {
            return b.c.DISK_CACHE;
        }
        if (i10 == 3) {
            return b.c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    private V2.d G() {
        m4.b bVar = (m4.b) l();
        Z3.k n10 = this.f39226t.n();
        if (n10 == null || bVar == null) {
            return null;
        }
        return bVar.k() != null ? n10.b(bVar, d()) : n10.d(bVar, d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4922b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public InterfaceC3606c g(B3.a aVar, String str, m4.b bVar, Object obj, AbstractC4922b.c cVar) {
        return this.f39226t.i(bVar, obj, F(cVar), I(aVar), str);
    }

    protected i4.e I(B3.a aVar) {
        if (aVar instanceof d) {
            return ((d) aVar).p0();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v3.AbstractC4922b
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public d v() {
        if (n4.b.d()) {
            n4.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            B3.a n10 = n();
            String c10 = AbstractC4922b.c();
            d c11 = n10 instanceof d ? (d) n10 : this.f39227u.c();
            c11.r0(w(c11, c10), c10, G(), d(), this.f39228v);
            c11.s0(null, this, p.f18551b);
            if (n4.b.d()) {
                n4.b.b();
            }
            return c11;
        } catch (Throwable th) {
            if (n4.b.d()) {
                n4.b.b();
            }
            throw th;
        }
    }

    public e K(O3.g gVar) {
        return (e) p();
    }
}
