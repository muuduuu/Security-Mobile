package com.webengage.sdk.android;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class z1 implements d3 {

    /* renamed from: a, reason: collision with root package name */
    Context f31184a;

    z1(Context context) {
        this.f31184a = context;
    }

    @Override // com.webengage.sdk.android.d3
    public boolean a(p0 p0Var) {
        ArrayList<p0> arrayList = new ArrayList<>();
        arrayList.add(p0Var);
        return a(arrayList);
    }

    public boolean a(ArrayList<p0> arrayList) {
        WebEngage.startService(l1.a(y3.f31161f, arrayList, this.f31184a), this.f31184a);
        return true;
    }
}
