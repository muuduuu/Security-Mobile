package com.airbnb.lottie;

import O1.w;
import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f20100a = new HashSet();

    p() {
    }

    public boolean a(w wVar, boolean z10) {
        if (!z10) {
            return this.f20100a.remove(wVar);
        }
        if (Build.VERSION.SDK_INT >= wVar.minRequiredSdkVersion) {
            return this.f20100a.add(wVar);
        }
        b2.f.c(String.format("%s is not supported pre SDK %d", wVar.name(), Integer.valueOf(wVar.minRequiredSdkVersion)));
        return false;
    }

    public boolean b(w wVar) {
        return this.f20100a.contains(wVar);
    }
}
