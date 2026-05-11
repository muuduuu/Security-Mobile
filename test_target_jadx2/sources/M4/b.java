package m4;

import a4.C1349a;
import a4.f;
import a4.g;
import android.net.Uri;
import android.os.Build;
import b3.e;
import b3.j;
import b3.l;
import d3.C2976a;
import java.io.File;
import s4.C4312a;
import t4.C4620a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: x, reason: collision with root package name */
    private static boolean f37333x;

    /* renamed from: y, reason: collision with root package name */
    private static boolean f37334y;

    /* renamed from: z, reason: collision with root package name */
    public static final e f37335z = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f37336a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC0557b f37337b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f37338c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37339d;

    /* renamed from: e, reason: collision with root package name */
    private File f37340e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f37341f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f37342g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f37343h;

    /* renamed from: i, reason: collision with root package name */
    private final a4.c f37344i;

    /* renamed from: j, reason: collision with root package name */
    private final f f37345j;

    /* renamed from: k, reason: collision with root package name */
    private final g f37346k;

    /* renamed from: l, reason: collision with root package name */
    private final C1349a f37347l;

    /* renamed from: m, reason: collision with root package name */
    private final a4.e f37348m;

    /* renamed from: n, reason: collision with root package name */
    private final c f37349n;

    /* renamed from: o, reason: collision with root package name */
    protected int f37350o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f37351p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f37352q;

    /* renamed from: r, reason: collision with root package name */
    private final Boolean f37353r;

    /* renamed from: s, reason: collision with root package name */
    private final d f37354s;

    /* renamed from: t, reason: collision with root package name */
    private final i4.e f37355t;

    /* renamed from: u, reason: collision with root package name */
    private final Boolean f37356u;

    /* renamed from: v, reason: collision with root package name */
    private final String f37357v;

    /* renamed from: w, reason: collision with root package name */
    private final int f37358w;

    class a implements e {
        a() {
        }

        @Override // b3.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri apply(b bVar) {
            if (bVar != null) {
                return bVar.u();
            }
            return null;
        }
    }

    /* renamed from: m4.b$b, reason: collision with other inner class name */
    public enum EnumC0557b {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);

        private int mValue;

        c(int i10) {
            this.mValue = i10;
        }

        public static c getMax(c cVar, c cVar2) {
            return cVar.getValue() > cVar2.getValue() ? cVar : cVar2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    protected b(m4.c cVar) {
        this.f37337b = cVar.d();
        Uri q10 = cVar.q();
        this.f37338c = q10;
        this.f37339d = w(q10);
        this.f37341f = cVar.v();
        this.f37342g = cVar.t();
        this.f37343h = cVar.i();
        this.f37344i = cVar.h();
        this.f37345j = cVar.n();
        this.f37346k = cVar.p() == null ? g.c() : cVar.p();
        this.f37347l = cVar.c();
        this.f37348m = cVar.m();
        this.f37349n = cVar.j();
        boolean s10 = cVar.s();
        this.f37351p = s10;
        int e10 = cVar.e();
        this.f37350o = s10 ? e10 : e10 | 48;
        this.f37352q = cVar.u();
        this.f37353r = cVar.P();
        this.f37354s = cVar.k();
        this.f37355t = cVar.l();
        this.f37356u = cVar.o();
        this.f37358w = cVar.f();
        this.f37357v = cVar.g();
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return m4.c.w(uri).a();
    }

    private static int w(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (j3.f.n(uri)) {
            return 0;
        }
        if (uri.getPath() != null && j3.f.l(uri)) {
            return C2976a.c(C2976a.b(uri.getPath())) ? 2 : 3;
        }
        if (j3.f.k(uri)) {
            return 4;
        }
        if (j3.f.h(uri)) {
            return 5;
        }
        if (j3.f.m(uri)) {
            return 6;
        }
        if (j3.f.g(uri)) {
            return 7;
        }
        return j3.f.o(uri) ? 8 : -1;
    }

    public C1349a b() {
        return this.f37347l;
    }

    public EnumC0557b c() {
        return this.f37337b;
    }

    public int d() {
        return this.f37350o;
    }

    public int e() {
        return this.f37358w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (f37333x) {
            int i10 = this.f37336a;
            int i11 = bVar.f37336a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
        }
        if (this.f37342g != bVar.f37342g || this.f37351p != bVar.f37351p || this.f37352q != bVar.f37352q || !j.a(this.f37338c, bVar.f37338c) || !j.a(this.f37337b, bVar.f37337b) || !j.a(this.f37357v, bVar.f37357v) || !j.a(this.f37340e, bVar.f37340e) || !j.a(this.f37347l, bVar.f37347l) || !j.a(this.f37344i, bVar.f37344i) || !j.a(this.f37345j, bVar.f37345j) || !j.a(this.f37348m, bVar.f37348m) || !j.a(this.f37349n, bVar.f37349n) || !j.a(Integer.valueOf(this.f37350o), Integer.valueOf(bVar.f37350o)) || !j.a(this.f37353r, bVar.f37353r) || !j.a(this.f37356u, bVar.f37356u) || !j.a(this.f37346k, bVar.f37346k) || this.f37343h != bVar.f37343h) {
            return false;
        }
        d dVar = this.f37354s;
        V2.d b10 = dVar != null ? dVar.b() : null;
        d dVar2 = bVar.f37354s;
        return j.a(b10, dVar2 != null ? dVar2.b() : null) && this.f37358w == bVar.f37358w;
    }

    public String f() {
        return this.f37357v;
    }

    public a4.c g() {
        return this.f37344i;
    }

    public boolean h() {
        return Build.VERSION.SDK_INT >= 29 && this.f37343h;
    }

    public int hashCode() {
        boolean z10 = f37334y;
        int i10 = z10 ? this.f37336a : 0;
        if (i10 == 0) {
            d dVar = this.f37354s;
            V2.d b10 = dVar != null ? dVar.b() : null;
            i10 = !C4312a.a() ? j.b(this.f37337b, this.f37357v, this.f37338c, Boolean.valueOf(this.f37342g), this.f37347l, this.f37348m, this.f37349n, Integer.valueOf(this.f37350o), Boolean.valueOf(this.f37351p), Boolean.valueOf(this.f37352q), this.f37344i, this.f37353r, this.f37345j, this.f37346k, b10, this.f37356u, Integer.valueOf(this.f37358w), Boolean.valueOf(this.f37343h)) : C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(C4620a.a(0, this.f37337b), this.f37338c), Boolean.valueOf(this.f37342g)), this.f37347l), this.f37348m), this.f37349n), Integer.valueOf(this.f37350o)), Boolean.valueOf(this.f37351p)), Boolean.valueOf(this.f37352q)), this.f37344i), this.f37353r), this.f37345j), this.f37346k), b10), this.f37356u), Integer.valueOf(this.f37358w)), Boolean.valueOf(this.f37343h));
            if (z10) {
                this.f37336a = i10;
            }
        }
        return i10;
    }

    public boolean i() {
        return this.f37342g;
    }

    public c j() {
        return this.f37349n;
    }

    public d k() {
        return this.f37354s;
    }

    public int l() {
        f fVar = this.f37345j;
        if (fVar != null) {
            return fVar.f12600b;
        }
        return 2048;
    }

    public int m() {
        f fVar = this.f37345j;
        if (fVar != null) {
            return fVar.f12599a;
        }
        return 2048;
    }

    public a4.e n() {
        return this.f37348m;
    }

    public boolean o() {
        return this.f37341f;
    }

    public i4.e p() {
        return this.f37355t;
    }

    public f q() {
        return this.f37345j;
    }

    public Boolean r() {
        return this.f37356u;
    }

    public g s() {
        return this.f37346k;
    }

    public synchronized File t() {
        try {
            if (this.f37340e == null) {
                l.g(this.f37338c.getPath());
                this.f37340e = new File(this.f37338c.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f37340e;
    }

    public String toString() {
        return j.c(this).b("uri", this.f37338c).b("cacheChoice", this.f37337b).b("decodeOptions", this.f37344i).b("postprocessor", this.f37354s).b("priority", this.f37348m).b("resizeOptions", this.f37345j).b("rotationOptions", this.f37346k).b("bytesRange", this.f37347l).b("resizingAllowedOverride", this.f37356u).c("progressiveRenderingEnabled", this.f37341f).c("localThumbnailPreviewsEnabled", this.f37342g).c("loadThumbnailOnly", this.f37343h).b("lowestPermittedRequestLevel", this.f37349n).a("cachesDisabled", this.f37350o).c("isDiskCacheEnabled", this.f37351p).c("isMemoryCacheEnabled", this.f37352q).b("decodePrefetches", this.f37353r).a("delayMs", this.f37358w).toString();
    }

    public Uri u() {
        return this.f37338c;
    }

    public int v() {
        return this.f37339d;
    }

    public boolean x(int i10) {
        return (i10 & d()) == 0;
    }

    public Boolean y() {
        return this.f37353r;
    }
}
