package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.f3;

/* renamed from: com.webengage.sdk.android.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2956d extends t4 {
    public C2956d(k3 k3Var) {
        super(k3Var);
    }

    @Override // com.webengage.sdk.android.t4, com.webengage.sdk.android.k3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        f3.e eVar;
        String l10 = d10.l("align");
        if ("right".equalsIgnoreCase(l10)) {
            eVar = f3.e.RIGHT;
        } else {
            if (!"center".equalsIgnoreCase(l10)) {
                if ("left".equalsIgnoreCase(l10)) {
                    eVar = f3.e.LEFT;
                }
                super.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
            }
            eVar = f3.e.CENTER;
        }
        f3Var = f3Var.a(eVar);
        super.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
    }
}
