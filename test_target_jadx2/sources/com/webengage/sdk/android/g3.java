package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;
import com.webengage.sdk.android.v;

/* loaded from: classes2.dex */
public class g3 extends t4 {
    public g3(k3 k3Var) {
        super(k3Var);
    }

    private f3 a(f3 f3Var, String str) {
        f3 f3Var2 = f3Var;
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length != 2) {
                return f3Var;
            }
            v.y a10 = v.a(split[0].toLowerCase().trim(), split[1].toLowerCase().trim());
            if (a10 != null) {
                f3Var2 = a10.a(f3Var2, a());
            }
        }
        return f3Var2;
    }

    @Override // com.webengage.sdk.android.t4, com.webengage.sdk.android.k3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        String l10 = d10.l("style");
        if (!a().d() || l10 == null) {
            super.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
        } else {
            super.a(d10, spannableStringBuilder, i10, i11, a(f3Var, l10), b3Var);
        }
    }
}
