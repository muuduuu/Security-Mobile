package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import c3.AbstractC1721a;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.common.mapbuffer.a;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1948i0;
import com.facebook.react.uimanager.C1973v0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: F, reason: collision with root package name */
    private static final int f22839F = 0;

    /* renamed from: e, reason: collision with root package name */
    protected int f22849e;

    /* renamed from: g, reason: collision with root package name */
    protected int f22851g;

    /* renamed from: a, reason: collision with root package name */
    protected float f22845a = Float.NaN;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f22846b = false;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f22847c = true;

    /* renamed from: d, reason: collision with root package name */
    protected float f22848d = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f22850f = false;

    /* renamed from: h, reason: collision with root package name */
    protected float f22852h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    protected int f22853i = -1;

    /* renamed from: j, reason: collision with root package name */
    protected int f22854j = -1;

    /* renamed from: k, reason: collision with root package name */
    protected float f22855k = -1.0f;

    /* renamed from: l, reason: collision with root package name */
    protected float f22856l = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    protected float f22857m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    protected int f22858n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected int f22859o = -1;

    /* renamed from: p, reason: collision with root package name */
    protected t f22860p = t.NONE;

    /* renamed from: q, reason: collision with root package name */
    protected float f22861q = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    protected float f22862r = 0.0f;

    /* renamed from: s, reason: collision with root package name */
    protected float f22863s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    protected int f22864t = 1426063360;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f22865u = false;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f22866v = false;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f22867w = true;

    /* renamed from: x, reason: collision with root package name */
    protected C1948i0.e f22868x = null;

    /* renamed from: y, reason: collision with root package name */
    protected C1948i0.f f22869y = null;

    /* renamed from: z, reason: collision with root package name */
    protected int f22870z = -1;

    /* renamed from: A, reason: collision with root package name */
    protected int f22840A = -1;

    /* renamed from: B, reason: collision with root package name */
    protected String f22841B = null;

    /* renamed from: C, reason: collision with root package name */
    protected String f22842C = null;

    /* renamed from: D, reason: collision with root package name */
    protected boolean f22843D = false;

    /* renamed from: E, reason: collision with root package name */
    protected float f22844E = Float.NaN;

    private q() {
    }

    private void A(float f10) {
        this.f22861q = C1944g0.g(f10);
    }

    private void B(float f10) {
        this.f22862r = C1944g0.g(f10);
    }

    private void C(float f10) {
        if (f10 != this.f22863s) {
            this.f22863s = f10;
        }
    }

    private void D(String str) {
        if (str == null || "none".equals(str)) {
            this.f22860p = t.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.f22860p = t.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.f22860p = t.LOWERCASE;
            return;
        }
        if ("capitalize".equals(str)) {
            this.f22860p = t.CAPITALIZE;
            return;
        }
        AbstractC1721a.J("ReactNative", "Invalid textTransform: " + str);
        this.f22860p = t.NONE;
    }

    public static q a(com.facebook.react.common.mapbuffer.a aVar) {
        q qVar = new q();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            a.c cVar = (a.c) it.next();
            switch (cVar.getKey()) {
                case 0:
                    qVar.m(Integer.valueOf(cVar.d()));
                    break;
                case 1:
                    qVar.l(Integer.valueOf(cVar.d()));
                    break;
                case 2:
                    qVar.w((float) cVar.b());
                    break;
                case 3:
                    qVar.n(cVar.c());
                    break;
                case 4:
                    qVar.o((float) cVar.b());
                    break;
                case 6:
                    qVar.r(cVar.c());
                    break;
                case 7:
                    qVar.p(cVar.c());
                    break;
                case 8:
                    qVar.q(cVar.e());
                    break;
                case 9:
                    qVar.k(cVar.f());
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    qVar.t((float) cVar.b());
                    break;
                case 11:
                    qVar.u((float) cVar.b());
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    qVar.y(cVar.c());
                    break;
                case 18:
                    qVar.C((float) cVar.b());
                    break;
                case 19:
                    qVar.z(cVar.d());
                    break;
                case HVRetakeActivity.CLOSE_ACTION /* 20 */:
                    qVar.A((float) cVar.b());
                    break;
                case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                    qVar.B((float) cVar.b());
                    break;
                case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                    qVar.s(cVar.c());
                    break;
                case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                    qVar.j(cVar.c());
                    break;
                case 26:
                    qVar.x(C1948i0.f.values()[cVar.d()]);
                    break;
                case 27:
                    qVar.D(cVar.c());
                    break;
                case 29:
                    qVar.v((float) cVar.b());
                    break;
            }
        }
        return qVar;
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("normal")) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    public static int d(C1973v0 c1973v0, int i10) {
        if (!c1973v0.c("textAlign")) {
            return i10;
        }
        if (!"justify".equals(c1973v0.b("textAlign")) || Build.VERSION.SDK_INT < 26) {
            return f22839F;
        }
        return 1;
    }

    public static int e(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        AbstractC1721a.J("ReactNative", "Invalid layoutDirection: " + str);
        return -1;
    }

    public static int h(C1973v0 c1973v0, boolean z10, int i10) {
        if (!c1973v0.c("textAlign")) {
            return i10;
        }
        String b10 = c1973v0.b("textAlign");
        if ("justify".equals(b10)) {
            return 3;
        }
        if (b10 != null && !"auto".equals(b10)) {
            if ("left".equals(b10)) {
                return z10 ? 5 : 3;
            }
            if ("right".equals(b10)) {
                return z10 ? 3 : 5;
            }
            if ("center".equals(b10)) {
                return 1;
            }
            AbstractC1721a.J("ReactNative", "Invalid textAlign: " + b10);
        }
        return 0;
    }

    public static int i(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals("simple") ? 1 : 0;
    }

    private void j(String str) {
        if (str == null) {
            this.f22868x = null;
        } else {
            this.f22868x = C1948i0.e.fromValue(str);
        }
    }

    private void k(boolean z10) {
        if (z10 != this.f22847c) {
            this.f22847c = z10;
            o(this.f22855k);
            u(this.f22856l);
        }
    }

    private void l(Integer num) {
        boolean z10 = num != null;
        this.f22850f = z10;
        if (z10) {
            this.f22851g = num.intValue();
        }
    }

    private void m(Integer num) {
        boolean z10 = num != null;
        this.f22846b = z10;
        if (z10) {
            this.f22849e = num.intValue();
        }
    }

    private void n(String str) {
        this.f22841B = str;
    }

    private void o(float f10) {
        this.f22855k = f10;
        if (f10 != -1.0f) {
            f10 = (float) (this.f22847c ? Math.ceil(C1944g0.j(f10, this.f22848d)) : Math.ceil(C1944g0.g(f10)));
        }
        this.f22854j = (int) f10;
    }

    private void p(String str) {
        this.f22870z = o.b(str);
    }

    private void q(com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar == null || aVar.getCount() == 0) {
            this.f22842C = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            String c10 = ((a.c) it.next()).c();
            if (c10 != null) {
                switch (c10) {
                    case "stylistic-thirteen":
                        arrayList.add("'ss13'");
                        break;
                    case "stylistic-fifteen":
                        arrayList.add("'ss15'");
                        break;
                    case "stylistic-eighteen":
                        arrayList.add("'ss18'");
                        break;
                    case "proportional-nums":
                        arrayList.add("'pnum'");
                        break;
                    case "lining-nums":
                        arrayList.add("'lnum'");
                        break;
                    case "tabular-nums":
                        arrayList.add("'tnum'");
                        break;
                    case "oldstyle-nums":
                        arrayList.add("'onum'");
                        break;
                    case "stylistic-eight":
                        arrayList.add("'ss08'");
                        break;
                    case "stylistic-seven":
                        arrayList.add("'ss07'");
                        break;
                    case "stylistic-three":
                        arrayList.add("'ss03'");
                        break;
                    case "stylistic-eleven":
                        arrayList.add("'ss11'");
                        break;
                    case "stylistic-five":
                        arrayList.add("'ss05'");
                        break;
                    case "stylistic-four":
                        arrayList.add("'ss04'");
                        break;
                    case "stylistic-nine":
                        arrayList.add("'ss09'");
                        break;
                    case "stylistic-one":
                        arrayList.add("'ss01'");
                        break;
                    case "stylistic-six":
                        arrayList.add("'ss06'");
                        break;
                    case "stylistic-ten":
                        arrayList.add("'ss10'");
                        break;
                    case "stylistic-two":
                        arrayList.add("'ss02'");
                        break;
                    case "stylistic-sixteen":
                        arrayList.add("'ss16'");
                        break;
                    case "stylistic-twelve":
                        arrayList.add("'ss12'");
                        break;
                    case "stylistic-twenty":
                        arrayList.add("'ss20'");
                        break;
                    case "small-caps":
                        arrayList.add("'smcp'");
                        break;
                    case "stylistic-nineteen":
                        arrayList.add("'ss19'");
                        break;
                    case "stylistic-fourteen":
                        arrayList.add("'ss14'");
                        break;
                    case "stylistic-seventeen":
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.f22842C = TextUtils.join(", ", arrayList);
    }

    private void r(String str) {
        this.f22840A = o.d(str);
    }

    private void s(String str) {
        this.f22859o = e(str);
    }

    private void t(float f10) {
        this.f22857m = f10;
    }

    private void u(float f10) {
        this.f22856l = f10;
        if (f10 == -1.0f) {
            this.f22845a = Float.NaN;
        } else {
            this.f22845a = this.f22847c ? C1944g0.i(f10) : C1944g0.g(f10);
        }
    }

    private void v(float f10) {
        if (f10 != this.f22848d) {
            this.f22848d = f10;
            o(this.f22855k);
            u(this.f22856l);
        }
    }

    private void w(float f10) {
        this.f22852h = f10;
    }

    private void x(C1948i0.f fVar) {
        this.f22869y = fVar;
    }

    private void y(String str) {
        this.f22865u = false;
        this.f22866v = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f22865u = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f22866v = true;
                }
            }
        }
    }

    private void z(int i10) {
        if (i10 != this.f22864t) {
            this.f22864t = i10;
        }
    }

    public float b() {
        if (!Float.isNaN(this.f22845a) && !Float.isNaN(this.f22844E)) {
            float f10 = this.f22844E;
            if (f10 > this.f22845a) {
                return f10;
            }
        }
        return this.f22845a;
    }

    public float f() {
        float i10 = this.f22847c ? C1944g0.i(this.f22857m) : C1944g0.g(this.f22857m);
        int i11 = this.f22854j;
        if (i11 > 0) {
            return i10 / i11;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f22854j);
    }

    public float g() {
        return this.f22852h;
    }
}
