package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class g2 extends u3 {
    private void a(StringBuffer stringBuffer, Object obj) {
        if (obj instanceof ze.l) {
            stringBuffer.append(w3.a(((ze.l) obj).d(), true));
        } else if (obj instanceof ze.D) {
            Iterator it = ((ze.D) obj).k().iterator();
            while (it.hasNext()) {
                a(stringBuffer, it.next());
            }
        }
    }

    @Override // com.webengage.sdk.android.u3
    public boolean b() {
        return true;
    }

    @Override // com.webengage.sdk.android.u3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, b3 b3Var) {
        StringBuffer stringBuffer = new StringBuffer();
        a(stringBuffer, d10);
        spannableStringBuilder.append((CharSequence) stringBuffer.toString());
        b3Var.a(new v0(a().b().a()), i10, spannableStringBuilder.length());
        a(spannableStringBuilder);
        a(spannableStringBuilder);
    }
}
