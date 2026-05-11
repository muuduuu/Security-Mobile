package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import c3.AbstractC1721a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C1938d0;
import com.facebook.react.uimanager.C1944g0;
import com.facebook.react.uimanager.C1948i0;
import com.facebook.react.uimanager.C1971u0;
import com.facebook.react.uimanager.InterfaceC1969t0;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.V;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import com.rssignaturecapture.RSSignatureCaptureViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n5.AbstractC3708a;
import o5.C3756a;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
public abstract class c extends V {

    /* renamed from: A, reason: collision with root package name */
    protected r f22757A;

    /* renamed from: B, reason: collision with root package name */
    protected boolean f22758B;

    /* renamed from: C, reason: collision with root package name */
    protected int f22759C;

    /* renamed from: D, reason: collision with root package name */
    protected boolean f22760D;

    /* renamed from: E, reason: collision with root package name */
    protected int f22761E;

    /* renamed from: F, reason: collision with root package name */
    protected C1948i0.e f22762F;

    /* renamed from: G, reason: collision with root package name */
    protected C1948i0.f f22763G;

    /* renamed from: H, reason: collision with root package name */
    protected int f22764H;

    /* renamed from: I, reason: collision with root package name */
    protected int f22765I;

    /* renamed from: J, reason: collision with root package name */
    protected int f22766J;

    /* renamed from: K, reason: collision with root package name */
    protected int f22767K;

    /* renamed from: L, reason: collision with root package name */
    protected int f22768L;

    /* renamed from: M, reason: collision with root package name */
    protected float f22769M;

    /* renamed from: N, reason: collision with root package name */
    protected float f22770N;

    /* renamed from: O, reason: collision with root package name */
    protected float f22771O;

    /* renamed from: P, reason: collision with root package name */
    protected int f22772P;

    /* renamed from: Q, reason: collision with root package name */
    protected boolean f22773Q;

    /* renamed from: R, reason: collision with root package name */
    protected boolean f22774R;

    /* renamed from: S, reason: collision with root package name */
    protected boolean f22775S;

    /* renamed from: T, reason: collision with root package name */
    protected boolean f22776T;

    /* renamed from: U, reason: collision with root package name */
    protected float f22777U;

    /* renamed from: V, reason: collision with root package name */
    protected int f22778V;

    /* renamed from: W, reason: collision with root package name */
    protected int f22779W;

    /* renamed from: X, reason: collision with root package name */
    protected String f22780X;

    /* renamed from: Y, reason: collision with root package name */
    protected String f22781Y;

    /* renamed from: Z, reason: collision with root package name */
    protected boolean f22782Z;

    /* renamed from: a0, reason: collision with root package name */
    protected Map f22783a0;

    public c() {
        this(null);
    }

    private static void w1(c cVar, SpannableStringBuilder spannableStringBuilder, List list, r rVar, boolean z10, Map map, int i10) {
        float e02;
        float l10;
        r a10 = rVar != null ? rVar.a(cVar.f22757A) : cVar.f22757A;
        int c10 = cVar.c();
        for (int i11 = 0; i11 < c10; i11++) {
            C1971u0 b10 = cVar.b(i11);
            if (b10 instanceof e) {
                spannableStringBuilder.append((CharSequence) t.apply(((e) b10).v1(), a10.l()));
            } else if (b10 instanceof c) {
                w1((c) b10, spannableStringBuilder, list, a10, z10, map, spannableStringBuilder.length());
            } else if (b10 instanceof AbstractC3708a) {
                spannableStringBuilder.append("0");
                list.add(new o5.m(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((AbstractC3708a) b10).w1()));
            } else {
                if (!z10) {
                    throw new Q("Unexpected view type nested under a <Text> or <TextInput> node: " + b10.getClass());
                }
                int r10 = b10.r();
                YogaValue E10 = b10.E();
                YogaValue n10 = b10.n();
                w wVar = E10.f23105b;
                w wVar2 = w.POINT;
                if (wVar == wVar2 && n10.f23105b == wVar2) {
                    e02 = E10.f23104a;
                    l10 = n10.f23104a;
                } else {
                    b10.t();
                    e02 = b10.e0();
                    l10 = b10.l();
                }
                spannableStringBuilder.append("0");
                list.add(new o5.m(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new o5.p(r10, (int) e02, (int) l10)));
                map.put(Integer.valueOf(r10), b10);
                b10.e();
            }
            b10.e();
        }
        int length = spannableStringBuilder.length();
        if (length >= i10) {
            if (cVar.f22758B) {
                list.add(new o5.m(i10, length, new o5.g(cVar.f22759C)));
            }
            if (cVar.f22760D) {
                list.add(new o5.m(i10, length, new o5.e(cVar.f22761E)));
            }
            C1948i0.f fVar = cVar.f22763G;
            if (fVar == null ? cVar.f22762F == C1948i0.e.LINK : fVar == C1948i0.f.LINK) {
                list.add(new o5.m(i10, length, new o5.f(cVar.r())));
            }
            float d10 = a10.d();
            if (!Float.isNaN(d10) && (rVar == null || rVar.d() != d10)) {
                list.add(new o5.m(i10, length, new C3756a(d10)));
            }
            int c11 = a10.c();
            if (rVar == null || rVar.c() != c11) {
                list.add(new o5.m(i10, length, new o5.d(c11)));
            }
            if (cVar.f22778V != -1 || cVar.f22779W != -1 || cVar.f22780X != null) {
                list.add(new o5.m(i10, length, new o5.c(cVar.f22778V, cVar.f22779W, cVar.f22781Y, cVar.f22780X, cVar.H().getAssets())));
            }
            if (cVar.f22773Q) {
                list.add(new o5.m(i10, length, new o5.l()));
            }
            if (cVar.f22774R) {
                list.add(new o5.m(i10, length, new o5.j()));
            }
            if ((cVar.f22769M != 0.0f || cVar.f22770N != 0.0f || cVar.f22771O != 0.0f) && Color.alpha(cVar.f22772P) != 0) {
                list.add(new o5.m(i10, length, new o5.n(cVar.f22769M, cVar.f22770N, cVar.f22771O, cVar.f22772P)));
            }
            float e10 = a10.e();
            if (!Float.isNaN(e10) && (rVar == null || rVar.e() != e10)) {
                list.add(new o5.m(i10, length, new o5.b(e10)));
            }
            list.add(new o5.m(i10, length, new o5.k(cVar.r())));
        }
    }

    @Z4.a(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (u()) {
            this.f22762F = C1948i0.e.fromValue(str);
            y0();
        }
    }

    @Z4.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z10) {
        if (z10 != this.f22776T) {
            this.f22776T = z10;
            y0();
        }
    }

    @Z4.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z10) {
        if (z10 != this.f22757A.b()) {
            this.f22757A.m(z10);
            y0();
        }
    }

    @Z4.a(customType = "Color", name = RSSignatureCaptureViewManager.PROPS_BACKGROUND_COLOR)
    public void setBackgroundColor(Integer num) {
        if (u()) {
            boolean z10 = num != null;
            this.f22760D = z10;
            if (z10) {
                this.f22761E = num.intValue();
            }
            y0();
        }
    }

    @Z4.a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z10 = num != null;
        this.f22758B = z10;
        if (z10) {
            this.f22759C = num.intValue();
        }
        y0();
    }

    @Z4.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f22780X = str;
        y0();
    }

    @Z4.a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f10) {
        this.f22757A.n(f10);
        y0();
    }

    @Z4.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int b10 = o.b(str);
        if (b10 != this.f22778V) {
            this.f22778V = b10;
            y0();
        }
    }

    @Z4.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String c10 = o.c(readableArray);
        if (TextUtils.equals(c10, this.f22781Y)) {
            return;
        }
        this.f22781Y = c10;
        y0();
    }

    @Z4.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int d10 = o.d(str);
        if (d10 != this.f22779W) {
            this.f22779W = d10;
            y0();
        }
    }

    @Z4.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z10) {
        this.f22775S = z10;
    }

    @Z4.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(float f10) {
        this.f22757A.p(f10);
        y0();
    }

    @Z4.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f10) {
        this.f22757A.q(f10);
        y0();
    }

    @Z4.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f10) {
        if (f10 != this.f22757A.k()) {
            this.f22757A.r(f10);
            y0();
        }
    }

    @Z4.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f10) {
        if (f10 != this.f22777U) {
            this.f22777U = f10;
            y0();
        }
    }

    @Z4.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        this.f22764H = i10;
        y0();
    }

    @Z4.a(name = "role")
    public void setRole(String str) {
        if (u()) {
            this.f22763G = C1948i0.f.fromValue(str);
            y0();
        }
    }

    @Z4.a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f22768L = 1;
            }
            this.f22765I = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f22768L = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f22765I = 0;
            } else if ("left".equals(str)) {
                this.f22765I = 3;
            } else if ("right".equals(str)) {
                this.f22765I = 5;
            } else if ("center".equals(str)) {
                this.f22765I = 1;
            } else {
                AbstractC1721a.J("ReactNative", "Invalid textAlign: " + str);
                this.f22765I = 0;
            }
        }
        y0();
    }

    @Z4.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.f22766J = 1;
        } else if ("simple".equals(str)) {
            this.f22766J = 0;
        } else if ("balanced".equals(str)) {
            this.f22766J = 2;
        } else {
            AbstractC1721a.J("ReactNative", "Invalid textBreakStrategy: " + str);
            this.f22766J = 1;
        }
        y0();
    }

    @Z4.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f22773Q = false;
        this.f22774R = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f22773Q = true;
                } else if ("line-through".equals(str2)) {
                    this.f22774R = true;
                }
            }
        }
        y0();
    }

    @Z4.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i10) {
        if (i10 != this.f22772P) {
            this.f22772P = i10;
            y0();
        }
    }

    @Z4.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f22769M = 0.0f;
        this.f22770N = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f22769M = C1944g0.f(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f22770N = C1944g0.f(readableMap.getDouble("height"));
            }
        }
        y0();
    }

    @Z4.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f10) {
        if (f10 != this.f22771O) {
            this.f22771O = f10;
            y0();
        }
    }

    @Z4.a(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.f22757A.s(t.UNSET);
        } else if ("none".equals(str)) {
            this.f22757A.s(t.NONE);
        } else if ("uppercase".equals(str)) {
            this.f22757A.s(t.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.f22757A.s(t.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.f22757A.s(t.CAPITALIZE);
        } else {
            AbstractC1721a.J("ReactNative", "Invalid textTransform: " + str);
            this.f22757A.s(t.UNSET);
        }
        y0();
    }

    protected Spannable x1(c cVar, String str, boolean z10, C1938d0 c1938d0) {
        int i10;
        AbstractC4012a.b((z10 && c1938d0 == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = z10 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) t.apply(str, cVar.f22757A.l()));
        }
        w1(cVar, spannableStringBuilder, arrayList, null, z10, hashMap, 0);
        cVar.f22782Z = false;
        cVar.f22783a0 = hashMap;
        float f10 = Float.NaN;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o5.m mVar = (o5.m) arrayList.get((arrayList.size() - i11) - 1);
            o5.i iVar = mVar.f37949c;
            boolean z11 = iVar instanceof o5.o;
            if (z11 || (iVar instanceof o5.p)) {
                if (z11) {
                    i10 = ((o5.o) iVar).b();
                    cVar.f22782Z = true;
                } else {
                    o5.p pVar = (o5.p) iVar;
                    int a10 = pVar.a();
                    InterfaceC1969t0 interfaceC1969t0 = (InterfaceC1969t0) hashMap.get(Integer.valueOf(pVar.b()));
                    c1938d0.h(interfaceC1969t0);
                    interfaceC1969t0.P(cVar);
                    i10 = a10;
                }
                if (Float.isNaN(f10) || i10 > f10) {
                    f10 = i10;
                }
            }
            mVar.a(spannableStringBuilder, i11);
        }
        cVar.f22757A.o(f10);
        return spannableStringBuilder;
    }

    public c(n nVar) {
        this.f22758B = false;
        this.f22760D = false;
        this.f22762F = null;
        this.f22763G = null;
        this.f22764H = -1;
        this.f22765I = 0;
        this.f22766J = 1;
        this.f22767K = 0;
        this.f22768L = 0;
        this.f22769M = 0.0f;
        this.f22770N = 0.0f;
        this.f22771O = 0.0f;
        this.f22772P = 1426063360;
        this.f22773Q = false;
        this.f22774R = false;
        this.f22775S = true;
        this.f22776T = false;
        this.f22777U = 0.0f;
        this.f22778V = -1;
        this.f22779W = -1;
        this.f22780X = null;
        this.f22781Y = null;
        this.f22782Z = false;
        this.f22757A = new r();
    }
}
