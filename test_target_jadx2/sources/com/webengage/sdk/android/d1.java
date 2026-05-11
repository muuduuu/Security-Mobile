package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public class d1 extends t4 {
    public d1(k3 k3Var) {
        super(k3Var);
    }

    @Override // com.webengage.sdk.android.t4, com.webengage.sdk.android.k3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        int i12 = i11 + 1;
        b3Var.a(new e1(f3Var, i10, i12), i10, i12);
        a(spannableStringBuilder);
        super.a(d10, spannableStringBuilder, i10, i12, f3Var, b3Var);
    }
}
