package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;

/* loaded from: classes2.dex */
public class o1 extends u3 {
    @Override // com.webengage.sdk.android.u3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, b3 b3Var) {
        b3Var.a(new URLSpan(d10.l("href")), i10, i11);
    }
}
