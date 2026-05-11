package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.f3;
import com.webengage.sdk.android.j3;

/* loaded from: classes2.dex */
public class k3 extends u3 {

    /* renamed from: b, reason: collision with root package name */
    private final f3 f30684b;

    public k3() {
        this.f30684b = new f3();
    }

    @Override // com.webengage.sdk.android.u3
    public final void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, b3 b3Var) {
        a(d10, spannableStringBuilder, i10, i11, b3Var.a(d10, c()), b3Var);
    }

    public f3 c() {
        this.f30684b.a(a().b("sans-serif"));
        return this.f30684b;
    }

    public k3(f3 f3Var) {
        this.f30684b = f3Var;
    }

    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        j4 j4Var;
        if (f3Var.f() == f3.b.BLOCK) {
            a(spannableStringBuilder);
            if (f3Var.l() != null) {
                j3 l10 = f3Var.l();
                if (l10.c() == j3.a.PX) {
                    if (l10.b() > 0) {
                        a(spannableStringBuilder);
                        j4Var = new j4(Integer.valueOf(l10.b()));
                        b3Var.a(j4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                } else if (l10.a() > 0.0f) {
                    a(spannableStringBuilder);
                    j4Var = new j4(Float.valueOf(l10.a()));
                    b3Var.a(j4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                }
            }
        }
        if (f3Var.k() != null && f3Var.a() == null) {
            b3Var.a(new h3(a().b().b(), f3Var, i10, spannableStringBuilder.length()));
        }
        if (spannableStringBuilder.length() > i10) {
            b3Var.a(new h3(a().b().b(), f3Var, i10, spannableStringBuilder.length()));
        }
    }

    @Override // com.webengage.sdk.android.u3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, b3 b3Var) {
        j4 j4Var;
        f3 a10 = b3Var.a(d10, c());
        if (spannableStringBuilder.length() > 0 && a10.f() == f3.b.BLOCK && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append('\n');
        }
        if (a10.n() != null) {
            j3 n10 = a10.n();
            if (n10.c() == j3.a.PX) {
                if (n10.b() <= 0 || !a(spannableStringBuilder)) {
                    return;
                } else {
                    j4Var = new j4(Integer.valueOf(n10.b()));
                }
            } else if (n10.a() <= 0.0f || !a(spannableStringBuilder)) {
                return;
            } else {
                j4Var = new j4(Float.valueOf(n10.a()));
            }
            b3Var.a(j4Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }
}
