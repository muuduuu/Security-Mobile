package T6;

import D7.C0787k;
import S6.a;
import T6.C1181k;
import com.google.android.gms.common.C2012d;

/* renamed from: T6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1186p {

    /* renamed from: a, reason: collision with root package name */
    private final C1181k f9457a;

    /* renamed from: b, reason: collision with root package name */
    private final C2012d[] f9458b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9459c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9460d;

    protected AbstractC1186p(C1181k c1181k, C2012d[] c2012dArr, boolean z10, int i10) {
        this.f9457a = c1181k;
        this.f9458b = c2012dArr;
        this.f9459c = z10;
        this.f9460d = i10;
    }

    public void a() {
        this.f9457a.a();
    }

    public C1181k.a b() {
        return this.f9457a.b();
    }

    public C2012d[] c() {
        return this.f9458b;
    }

    protected abstract void d(a.b bVar, C0787k c0787k);

    public final int e() {
        return this.f9460d;
    }

    public final boolean f() {
        return this.f9459c;
    }
}
