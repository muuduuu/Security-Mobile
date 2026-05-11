package t7;

import java.util.Map;

/* loaded from: classes2.dex */
final class D extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Object f42454a;

    /* renamed from: b, reason: collision with root package name */
    private int f42455b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ F f42456c;

    D(F f10, int i10) {
        this.f42456c = f10;
        this.f42454a = F.i(f10, i10);
        this.f42455b = i10;
    }

    private final void a() {
        int y10;
        int i10 = this.f42455b;
        if (i10 == -1 || i10 >= this.f42456c.size() || !x6.a(this.f42454a, F.i(this.f42456c, this.f42455b))) {
            y10 = this.f42456c.y(this.f42454a);
            this.f42455b = y10;
        }
    }

    @Override // t7.r, java.util.Map.Entry
    public final Object getKey() {
        return this.f42454a;
    }

    @Override // t7.r, java.util.Map.Entry
    public final Object getValue() {
        Map o10 = this.f42456c.o();
        if (o10 != null) {
            return o10.get(this.f42454a);
        }
        a();
        int i10 = this.f42455b;
        if (i10 == -1) {
            return null;
        }
        return F.m(this.f42456c, i10);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map o10 = this.f42456c.o();
        if (o10 != null) {
            return o10.put(this.f42454a, obj);
        }
        a();
        int i10 = this.f42455b;
        if (i10 == -1) {
            this.f42456c.put(this.f42454a, obj);
            return null;
        }
        Object m10 = F.m(this.f42456c, i10);
        F.p(this.f42456c, this.f42455b, obj);
        return m10;
    }
}
