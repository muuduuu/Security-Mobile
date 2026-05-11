package com.google.android.material.datepicker;

import androidx.fragment.app.ComponentCallbacksC1573o;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
abstract class o extends ComponentCallbacksC1573o {

    /* renamed from: a, reason: collision with root package name */
    protected final LinkedHashSet f27010a = new LinkedHashSet();

    o() {
    }

    boolean E(n nVar) {
        return this.f27010a.add(nVar);
    }

    void F() {
        this.f27010a.clear();
    }
}
