package com.facebook.soloader;

import p5.InterfaceC3795b;

/* loaded from: classes2.dex */
public class u implements InterfaceC3795b {
    @Override // p5.InterfaceC3795b
    public boolean a(String str, int i10) {
        return SoLoader.u(str, (i10 & 1) != 0 ? 16 : 0);
    }
}
