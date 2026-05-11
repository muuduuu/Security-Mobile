package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public class a2 extends s4 {

    /* renamed from: c, reason: collision with root package name */
    private final int f30271c;

    public a2(int i10, u3 u3Var) {
        super(u3Var);
        this.f30271c = i10;
    }

    @Override // com.webengage.sdk.android.s4, com.webengage.sdk.android.u3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, b3 b3Var) {
        super.a(d10, spannableStringBuilder, i10, i11, b3Var);
        for (int i12 = 0; i12 < this.f30271c; i12++) {
            a(spannableStringBuilder);
        }
    }
}
