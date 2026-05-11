package com.webengage.sdk.android;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
class u implements d3 {

    /* renamed from: a, reason: collision with root package name */
    Context f30844a;

    u(Context context) {
        this.f30844a = context;
    }

    int a() {
        return m0.b(this.f30844a).e();
    }

    ArrayList<p0> a(int i10) {
        return m0.b(this.f30844a).a(i10);
    }

    @Override // com.webengage.sdk.android.d3
    public boolean a(p0 p0Var) {
        if (p0Var == null) {
            return false;
        }
        m0.b(this.f30844a).a(p0Var);
        if (!p0Var.b().equals("application")) {
            return true;
        }
        Logger.d("WebEngage", "Event : " + p0Var.d() + " successfully Logged");
        return true;
    }

    public boolean a(ArrayList<p0> arrayList) {
        if (arrayList == null) {
            return true;
        }
        Iterator<p0> it = arrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return true;
    }
}
