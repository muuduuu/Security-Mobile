package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public abstract class u3 {

    /* renamed from: a, reason: collision with root package name */
    private f1 f30852a;

    protected f1 a() {
        return this.f30852a;
    }

    public abstract void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, b3 b3Var);

    public boolean b() {
        return false;
    }

    public void a(f1 f1Var) {
        this.f30852a = f1Var;
    }

    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, b3 b3Var) {
    }

    protected boolean a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length();
        if (this.f30852a.e() && length > 2 && spannableStringBuilder.charAt(length - 1) == '\n' && spannableStringBuilder.charAt(length - 2) == '\n') {
            return false;
        }
        spannableStringBuilder.append("  \n");
        return true;
    }
}
