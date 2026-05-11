package a4;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import p4.InterfaceC3793a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private int f12586a = 100;

    /* renamed from: b, reason: collision with root package name */
    private int f12587b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12588c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12589d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12590e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12591f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12592g;

    /* renamed from: h, reason: collision with root package name */
    private Bitmap.Config f12593h;

    /* renamed from: i, reason: collision with root package name */
    private Bitmap.Config f12594i;

    /* renamed from: j, reason: collision with root package name */
    private e4.c f12595j;

    /* renamed from: k, reason: collision with root package name */
    private ColorSpace f12596k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12597l;

    public d() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f12593h = config;
        this.f12594i = config;
    }

    public c a() {
        return new c(this);
    }

    public Bitmap.Config b() {
        return this.f12594i;
    }

    public Bitmap.Config c() {
        return this.f12593h;
    }

    public InterfaceC3793a d() {
        return null;
    }

    public ColorSpace e() {
        return this.f12596k;
    }

    public e4.c f() {
        return this.f12595j;
    }

    public boolean g() {
        return this.f12591f;
    }

    public boolean h() {
        return this.f12588c;
    }

    public boolean i() {
        return this.f12597l;
    }

    public boolean j() {
        return this.f12592g;
    }

    public int k() {
        return this.f12587b;
    }

    public int l() {
        return this.f12586a;
    }

    public boolean m() {
        return this.f12590e;
    }

    public boolean n() {
        return this.f12589d;
    }
}
