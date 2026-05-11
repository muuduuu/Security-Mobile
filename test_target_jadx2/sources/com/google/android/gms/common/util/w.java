package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public abstract class w {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (m.i()) {
            StrictMode.setVmPolicy(v.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
