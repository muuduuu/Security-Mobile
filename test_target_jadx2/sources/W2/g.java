package W2;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f11284a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11285b;

    /* renamed from: c, reason: collision with root package name */
    private final b3.o f11286c;

    /* renamed from: d, reason: collision with root package name */
    private final long f11287d;

    /* renamed from: e, reason: collision with root package name */
    private final long f11288e;

    /* renamed from: f, reason: collision with root package name */
    private final long f11289f;

    /* renamed from: g, reason: collision with root package name */
    private final m f11290g;

    /* renamed from: h, reason: collision with root package name */
    private final V2.a f11291h;

    /* renamed from: i, reason: collision with root package name */
    private final V2.c f11292i;

    /* renamed from: j, reason: collision with root package name */
    private final Y2.b f11293j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f11294k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f11295l;

    class a implements b3.o {
        a() {
        }

        @Override // b3.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public File get() {
            b3.l.g(g.this.f11294k);
            return g.this.f11294k.getApplicationContext().getCacheDir();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f11297a;

        /* renamed from: b, reason: collision with root package name */
        private String f11298b;

        /* renamed from: c, reason: collision with root package name */
        private b3.o f11299c;

        /* renamed from: d, reason: collision with root package name */
        private long f11300d;

        /* renamed from: e, reason: collision with root package name */
        private long f11301e;

        /* renamed from: f, reason: collision with root package name */
        private long f11302f;

        /* renamed from: g, reason: collision with root package name */
        private m f11303g;

        /* renamed from: h, reason: collision with root package name */
        private V2.a f11304h;

        /* renamed from: i, reason: collision with root package name */
        private V2.c f11305i;

        /* renamed from: j, reason: collision with root package name */
        private Y2.b f11306j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f11307k;

        /* renamed from: l, reason: collision with root package name */
        private final Context f11308l;

        public g n() {
            return new g(this);
        }

        private b(Context context) {
            this.f11297a = 1;
            this.f11298b = "image_cache";
            this.f11300d = 41943040L;
            this.f11301e = 10485760L;
            this.f11302f = 2097152L;
            this.f11303g = new f();
            this.f11308l = context;
        }
    }

    protected g(b bVar) {
        Context context = bVar.f11308l;
        this.f11294k = context;
        b3.l.j((bVar.f11299c == null && context == null) ? false : true, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f11299c == null && context != null) {
            bVar.f11299c = new a();
        }
        this.f11284a = bVar.f11297a;
        this.f11285b = (String) b3.l.g(bVar.f11298b);
        this.f11286c = (b3.o) b3.l.g(bVar.f11299c);
        this.f11287d = bVar.f11300d;
        this.f11288e = bVar.f11301e;
        this.f11289f = bVar.f11302f;
        this.f11290g = (m) b3.l.g(bVar.f11303g);
        this.f11291h = bVar.f11304h == null ? V2.g.b() : bVar.f11304h;
        this.f11292i = bVar.f11305i == null ? V2.h.i() : bVar.f11305i;
        this.f11293j = bVar.f11306j == null ? Y2.c.b() : bVar.f11306j;
        this.f11295l = bVar.f11307k;
    }

    public static b m(Context context) {
        return new b(context);
    }

    public String b() {
        return this.f11285b;
    }

    public b3.o c() {
        return this.f11286c;
    }

    public V2.a d() {
        return this.f11291h;
    }

    public V2.c e() {
        return this.f11292i;
    }

    public long f() {
        return this.f11287d;
    }

    public Y2.b g() {
        return this.f11293j;
    }

    public m h() {
        return this.f11290g;
    }

    public boolean i() {
        return this.f11295l;
    }

    public long j() {
        return this.f11288e;
    }

    public long k() {
        return this.f11289f;
    }

    public int l() {
        return this.f11284a;
    }
}
