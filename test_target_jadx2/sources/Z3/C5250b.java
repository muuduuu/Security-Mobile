package z3;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import b3.l;
import java.util.Iterator;
import java.util.List;
import y3.p;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5250b {

    /* renamed from: t, reason: collision with root package name */
    public static final p.b f45701t = p.b.f45292h;

    /* renamed from: u, reason: collision with root package name */
    public static final p.b f45702u = p.b.f45293i;

    /* renamed from: a, reason: collision with root package name */
    private Resources f45703a;

    /* renamed from: b, reason: collision with root package name */
    private int f45704b;

    /* renamed from: c, reason: collision with root package name */
    private float f45705c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f45706d;

    /* renamed from: e, reason: collision with root package name */
    private p.b f45707e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f45708f;

    /* renamed from: g, reason: collision with root package name */
    private p.b f45709g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f45710h;

    /* renamed from: i, reason: collision with root package name */
    private p.b f45711i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f45712j;

    /* renamed from: k, reason: collision with root package name */
    private p.b f45713k;

    /* renamed from: l, reason: collision with root package name */
    private p.b f45714l;

    /* renamed from: m, reason: collision with root package name */
    private Matrix f45715m;

    /* renamed from: n, reason: collision with root package name */
    private PointF f45716n;

    /* renamed from: o, reason: collision with root package name */
    private ColorFilter f45717o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f45718p;

    /* renamed from: q, reason: collision with root package name */
    private List f45719q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f45720r;

    /* renamed from: s, reason: collision with root package name */
    private C5252d f45721s;

    public C5250b(Resources resources) {
        this.f45703a = resources;
        s();
    }

    private void s() {
        this.f45704b = 300;
        this.f45705c = 0.0f;
        this.f45706d = null;
        p.b bVar = f45701t;
        this.f45707e = bVar;
        this.f45708f = null;
        this.f45709g = bVar;
        this.f45710h = null;
        this.f45711i = bVar;
        this.f45712j = null;
        this.f45713k = bVar;
        this.f45714l = f45702u;
        this.f45715m = null;
        this.f45716n = null;
        this.f45717o = null;
        this.f45718p = null;
        this.f45719q = null;
        this.f45720r = null;
        this.f45721s = null;
    }

    public static C5250b t(Resources resources) {
        return new C5250b(resources);
    }

    private void v() {
        List list = this.f45719q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l.g((Drawable) it.next());
            }
        }
    }

    public C5249a a() {
        v();
        return new C5249a(this);
    }

    public ColorFilter b() {
        return this.f45717o;
    }

    public PointF c() {
        return this.f45716n;
    }

    public p.b d() {
        return this.f45714l;
    }

    public Drawable e() {
        return this.f45718p;
    }

    public int f() {
        return this.f45704b;
    }

    public Drawable g() {
        return this.f45710h;
    }

    public p.b h() {
        return this.f45711i;
    }

    public List i() {
        return this.f45719q;
    }

    public Drawable j() {
        return this.f45706d;
    }

    public p.b k() {
        return this.f45707e;
    }

    public Drawable l() {
        return this.f45720r;
    }

    public Drawable m() {
        return this.f45712j;
    }

    public p.b n() {
        return this.f45713k;
    }

    public Resources o() {
        return this.f45703a;
    }

    public Drawable p() {
        return this.f45708f;
    }

    public p.b q() {
        return this.f45709g;
    }

    public C5252d r() {
        return this.f45721s;
    }

    public C5250b u(C5252d c5252d) {
        this.f45721s = c5252d;
        return this;
    }
}
