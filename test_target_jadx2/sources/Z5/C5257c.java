package z5;

import com.fasterxml.jackson.core.e;
import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.j;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5257c extends j {

    /* renamed from: c, reason: collision with root package name */
    protected final C5257c f45747c;

    /* renamed from: d, reason: collision with root package name */
    protected C5255a f45748d;

    /* renamed from: e, reason: collision with root package name */
    protected C5257c f45749e;

    /* renamed from: f, reason: collision with root package name */
    protected String f45750f;

    /* renamed from: g, reason: collision with root package name */
    protected Object f45751g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f45752h;

    protected C5257c(int i10, C5257c c5257c, C5255a c5255a) {
        this.f23144a = i10;
        this.f45747c = c5257c;
        this.f45748d = c5255a;
        this.f23145b = -1;
    }

    private final void g(C5255a c5255a, String str) {
        if (c5255a.c(str)) {
            Object b10 = c5255a.b();
            throw new e("Duplicate field '" + str + "'", b10 instanceof f ? (f) b10 : null);
        }
    }

    public static C5257c m(C5255a c5255a) {
        return new C5257c(0, null, c5255a);
    }

    @Override // com.fasterxml.jackson.core.j
    public final String b() {
        return this.f45750f;
    }

    public C5257c h() {
        this.f45751g = null;
        return this.f45747c;
    }

    public C5257c i() {
        C5257c c5257c = this.f45749e;
        if (c5257c != null) {
            return c5257c.o(1);
        }
        C5255a c5255a = this.f45748d;
        C5257c c5257c2 = new C5257c(1, this, c5255a == null ? null : c5255a.a());
        this.f45749e = c5257c2;
        return c5257c2;
    }

    public C5257c j(Object obj) {
        C5257c c5257c = this.f45749e;
        if (c5257c != null) {
            return c5257c.p(1, obj);
        }
        C5255a c5255a = this.f45748d;
        C5257c c5257c2 = new C5257c(1, this, c5255a == null ? null : c5255a.a(), obj);
        this.f45749e = c5257c2;
        return c5257c2;
    }

    public C5257c k() {
        C5257c c5257c = this.f45749e;
        if (c5257c != null) {
            return c5257c.o(2);
        }
        C5255a c5255a = this.f45748d;
        C5257c c5257c2 = new C5257c(2, this, c5255a == null ? null : c5255a.a());
        this.f45749e = c5257c2;
        return c5257c2;
    }

    public C5257c l(Object obj) {
        C5257c c5257c = this.f45749e;
        if (c5257c != null) {
            return c5257c.p(2, obj);
        }
        C5255a c5255a = this.f45748d;
        C5257c c5257c2 = new C5257c(2, this, c5255a == null ? null : c5255a.a(), obj);
        this.f45749e = c5257c2;
        return c5257c2;
    }

    public C5255a n() {
        return this.f45748d;
    }

    public C5257c o(int i10) {
        this.f23144a = i10;
        this.f23145b = -1;
        this.f45750f = null;
        this.f45752h = false;
        this.f45751g = null;
        C5255a c5255a = this.f45748d;
        if (c5255a != null) {
            c5255a.d();
        }
        return this;
    }

    public C5257c p(int i10, Object obj) {
        this.f23144a = i10;
        this.f23145b = -1;
        this.f45750f = null;
        this.f45752h = false;
        this.f45751g = obj;
        C5255a c5255a = this.f45748d;
        if (c5255a != null) {
            c5255a.d();
        }
        return this;
    }

    public void q(Object obj) {
        this.f45751g = obj;
    }

    public C5257c r(C5255a c5255a) {
        this.f45748d = c5255a;
        return this;
    }

    public int s(String str) {
        if (this.f23144a != 2 || this.f45752h) {
            return 4;
        }
        this.f45752h = true;
        this.f45750f = str;
        C5255a c5255a = this.f45748d;
        if (c5255a != null) {
            g(c5255a, str);
        }
        return this.f23145b < 0 ? 0 : 1;
    }

    public int t() {
        int i10 = this.f23144a;
        if (i10 == 2) {
            if (!this.f45752h) {
                return 5;
            }
            this.f45752h = false;
            this.f23145b++;
            return 2;
        }
        if (i10 == 1) {
            int i11 = this.f23145b;
            this.f23145b = i11 + 1;
            return i11 < 0 ? 0 : 1;
        }
        int i12 = this.f23145b + 1;
        this.f23145b = i12;
        return i12 == 0 ? 0 : 3;
    }

    protected C5257c(int i10, C5257c c5257c, C5255a c5255a, Object obj) {
        this.f23144a = i10;
        this.f45747c = c5257c;
        this.f45748d = c5255a;
        this.f23145b = -1;
        this.f45751g = obj;
    }
}
