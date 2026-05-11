package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.webengage.sdk.android.v;

/* loaded from: classes2.dex */
public class w0 extends k3 {
    public w0() {
        super(new f3());
    }

    @Override // com.webengage.sdk.android.k3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        v.y a10;
        v.y a11;
        if (a().d()) {
            String l10 = d10.l(HVRetakeActivity.FACE_TAG);
            String l11 = d10.l("size");
            String l12 = d10.l("color");
            f3Var = f3Var.a(a().b(l10));
            if (l11 != null && (a11 = v.a("font-size", l11)) != null) {
                f3Var = a11.a(f3Var, a());
            }
            if (l12 != null && a().f() && (a10 = v.a("color", l12)) != null) {
                f3Var = a10.a(f3Var, a());
            }
        }
        super.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
    }
}
