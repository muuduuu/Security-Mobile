package com.facebook.soloader;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public class F extends E {
    @Override // com.facebook.soloader.E
    public String c() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e10) {
            p.c("SoLoader", "Error loading library: " + str, e10);
            return 0;
        }
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        return c() + "[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }
}
