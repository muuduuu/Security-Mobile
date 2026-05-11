package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public class p extends t4 {
    public p(k3 k3Var) {
        super(k3Var);
    }

    @Override // com.webengage.sdk.android.t4, com.webengage.sdk.android.k3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        if (d10.l("border") != null) {
            b3Var.a(new q(f3Var, i10, i11, a().f()), i10, i11);
        }
        super.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
    }
}
