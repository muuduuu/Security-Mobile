package com.webengage.sdk.android;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class t0 implements d3 {

    /* renamed from: a, reason: collision with root package name */
    private Context f30814a;

    /* renamed from: b, reason: collision with root package name */
    private z1 f30815b;

    t0(Context context, z1 z1Var) {
        this.f30814a = context;
        this.f30815b = z1Var;
    }

    private boolean a() {
        m0 b10 = m0.b(this.f30814a);
        for (int e10 = b10.e(); e10 > 0 && q2.d(); e10 -= 10) {
            this.f30815b.a(b10.a(10));
        }
        return true;
    }

    @Override // com.webengage.sdk.android.d3
    public boolean a(p0 p0Var) {
        return a();
    }

    public boolean a(ArrayList<p0> arrayList) {
        return a();
    }
}
