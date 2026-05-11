package com.webengage.sdk.android;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.webengage.sdk.android.f3;
import com.webengage.sdk.android.j3;

/* loaded from: classes2.dex */
public class h3 implements a3 {

    /* renamed from: e, reason: collision with root package name */
    private static final float f30634e = Resources.getSystem().getDisplayMetrics().densityDpi / 160;

    /* renamed from: a, reason: collision with root package name */
    private final int f30635a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30636b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f30637c;

    /* renamed from: d, reason: collision with root package name */
    private final f3 f30638d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30639a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30640b;

        static {
            int[] iArr = new int[f3.f.values().length];
            f30640b = iArr;
            try {
                iArr[f3.f.UNDERLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30640b[f3.f.LINETHROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[f3.e.values().length];
            f30639a = iArr2;
            try {
                iArr2[f3.e.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30639a[f3.e.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30639a[f3.e.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public h3(u0 u0Var, f3 f3Var, int i10, int i11) {
        this.f30637c = u0Var;
        this.f30638d = f3Var;
        this.f30635a = i10;
        this.f30636b = i11;
    }

    private v0 a(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        v0[] v0VarArr = (v0[]) spannableStringBuilder.getSpans(i10, i11, v0.class);
        if (v0VarArr == null || v0VarArr.length <= 0) {
            return null;
        }
        return v0VarArr[v0VarArr.length - 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b3  */
    @Override // com.webengage.sdk.android.a3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(f1 f1Var, SpannableStringBuilder spannableStringBuilder) {
        Object styleSpan;
        Object styleSpan2;
        Object standard;
        Object underlineSpan;
        Object absoluteSizeSpan;
        if (this.f30638d.g() != null || this.f30638d.i() != null || this.f30638d.j() != null) {
            v0 a10 = a(spannableStringBuilder, this.f30635a, this.f30636b);
            v0 v0Var = (this.f30638d.g() == null && a10 == null) ? new v0(this.f30637c) : this.f30638d.g() != null ? new v0(this.f30638d.g()) : new v0(a10.a());
            if (this.f30638d.j() != null) {
                v0Var.a(this.f30638d.j() == f3.d.BOLD);
                styleSpan = new StyleSpan(1);
            } else {
                if (a10 != null && a10.b()) {
                    v0Var.a(a10.b());
                    styleSpan = new StyleSpan(1);
                }
                if (this.f30638d.i() == null) {
                    v0Var.b(this.f30638d.i() == f3.c.ITALIC);
                    styleSpan2 = new StyleSpan(2);
                } else {
                    if (a10 != null && a10.c()) {
                        v0Var.b(a10.c());
                        styleSpan2 = new StyleSpan(2);
                    }
                    spannableStringBuilder.setSpan(v0Var, this.f30635a, this.f30636b, 33);
                }
                spannableStringBuilder.setSpan(styleSpan2, this.f30635a, this.f30636b, 33);
                spannableStringBuilder.setSpan(v0Var, this.f30635a, this.f30636b, 33);
            }
            spannableStringBuilder.setSpan(styleSpan, this.f30635a, this.f30636b, 33);
            if (this.f30638d.i() == null) {
            }
            spannableStringBuilder.setSpan(styleSpan2, this.f30635a, this.f30636b, 33);
            spannableStringBuilder.setSpan(v0Var, this.f30635a, this.f30636b, 33);
        }
        if (f1Var.f() && this.f30638d.a() != null && this.f30638d.c() == null) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f30638d.a().intValue()), this.f30635a, this.f30636b, 33);
        }
        if (this.f30638d.k() != null) {
            j3 k10 = this.f30638d.k();
            spannableStringBuilder.setSpan(k10.c() == j3.a.PX ? new n1((int) Math.ceil(k10.b() * f30634e)) : new n1(k10.a(), k10.c(), Float.valueOf(f1Var.c())), this.f30635a, this.f30636b, 33);
        }
        if (this.f30638d.c() != null) {
            spannableStringBuilder.setSpan(new q(this.f30638d, this.f30635a, this.f30636b, f1Var.f()), this.f30635a, this.f30636b, 33);
        }
        if (this.f30638d.h() != null) {
            j3 h10 = this.f30638d.h();
            if (h10.c() == j3.a.PX || h10.c() == j3.a.PT) {
                if (h10.b() > 0) {
                    absoluteSizeSpan = new AbsoluteSizeSpan(h10.b());
                    spannableStringBuilder.setSpan(absoluteSizeSpan, this.f30635a, this.f30636b, 33);
                }
            } else if (h10.a() > 0.0f) {
                absoluteSizeSpan = new RelativeSizeSpan(h10.a());
                spannableStringBuilder.setSpan(absoluteSizeSpan, this.f30635a, this.f30636b, 33);
            }
        }
        if (f1Var.f() && this.f30638d.e() != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f30638d.e().intValue()), this.f30635a, this.f30636b, 33);
        }
        if (this.f30638d.o() != null) {
            int i10 = a.f30639a[this.f30638d.o().ordinal()];
            spannableStringBuilder.setSpan(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : new C2955c() : new y() : new C2954b(), this.f30635a, this.f30636b, 33);
        }
        if (this.f30638d.p() != null) {
            int i11 = a.f30640b[this.f30638d.p().ordinal()];
            if (i11 == 1) {
                underlineSpan = new UnderlineSpan();
            } else if (i11 == 2) {
                underlineSpan = new StrikethroughSpan();
            }
            spannableStringBuilder.setSpan(underlineSpan, this.f30635a, this.f30636b, 33);
        }
        if (this.f30638d.q() != null) {
            j3 q10 = this.f30638d.q();
            int i12 = this.f30635a;
            while (i12 < this.f30636b && spannableStringBuilder.charAt(i12) == '\n') {
                i12++;
            }
            int min = Math.min(this.f30636b, i12 + 1);
            if (q10.c() == j3.a.PX) {
                if (q10.b() > 0) {
                    standard = new LeadingMarginSpan.Standard(q10.b(), 0);
                    spannableStringBuilder.setSpan(standard, i12, min, 33);
                }
            } else if (q10.a() > 0.0f) {
                standard = new LeadingMarginSpan.Standard((int) (q10.a() * 10.0f), 0);
                spannableStringBuilder.setSpan(standard, i12, min, 33);
            }
        }
        if (this.f30638d.m() != null) {
            j3 m10 = this.f30638d.m();
            if (m10.c() == j3.a.PX) {
                if (m10.b() > 0) {
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(m10.b()), this.f30635a, this.f30636b, 33);
                }
            } else if (m10.a() > 0.0f) {
                spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard((int) (m10.a() * 10.0f)), this.f30635a, this.f30636b, 33);
            }
        }
    }
}
