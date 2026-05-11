package com.webengage.sdk.android;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public class t4 extends k3 {

    /* renamed from: c, reason: collision with root package name */
    private final k3 f30843c;

    public t4(k3 k3Var) {
        super(new f3());
        this.f30843c = k3Var;
    }

    @Override // com.webengage.sdk.android.u3
    public void a(f1 f1Var) {
        super.a(f1Var);
        if (d() != null) {
            d().a(f1Var);
        }
    }

    @Override // com.webengage.sdk.android.k3
    public f3 c() {
        return this.f30843c.c();
    }

    public k3 d() {
        return this.f30843c;
    }

    @Override // com.webengage.sdk.android.k3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, int i10, int i11, f3 f3Var, b3 b3Var) {
        k3 k3Var = this.f30843c;
        if (k3Var != null) {
            k3Var.a(d10, spannableStringBuilder, i10, i11, f3Var, b3Var);
        }
    }

    @Override // com.webengage.sdk.android.k3, com.webengage.sdk.android.u3
    public void a(ze.D d10, SpannableStringBuilder spannableStringBuilder, b3 b3Var) {
        k3 k3Var = this.f30843c;
        if (k3Var != null) {
            k3Var.a(d10, spannableStringBuilder, b3Var);
        }
    }
}
