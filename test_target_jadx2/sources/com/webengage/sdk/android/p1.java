package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public class p1 extends t4 {
    public p1(k3 k3Var) {
        super(k3Var);
    }

    private int a(ze.D d10) {
        if (d10.c() == null) {
            return -1;
        }
        int i10 = 1;
        for (Object obj : d10.c().k()) {
            if (obj == d10) {
                return i10;
            }
            if ((obj instanceof ze.D) && "li".equals(((ze.D) obj).e())) {
                i10++;
            }
        }
        return -1;
    }

    private String b(ze.D d10) {
        if (d10.c() == null) {
            return null;
        }
        return d10.c().e();
    }

    @Override // com.webengage.sdk.android.t4, com.webengage.sdk.android.k3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        q1 q1Var;
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            spannableStringBuilder.append("\n");
        }
        if (!"ol".equals(b(d10))) {
            if ("ul".equals(b(d10))) {
                q1Var = new q1();
            }
            super.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
        }
        q1Var = new q1(a(d10));
        b3Var.a(q1Var, i10, i11);
        super.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
    }
}
