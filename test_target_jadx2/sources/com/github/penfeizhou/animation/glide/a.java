package com.github.penfeizhou.animation.glide;

import i2.h;
import java.io.IOException;
import k2.v;
import l2.InterfaceC3602d;
import r2.C4008g;
import w2.InterfaceC5032e;

/* loaded from: classes2.dex */
class a implements InterfaceC5032e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3602d f23185a;

    a(InterfaceC3602d interfaceC3602d) {
        this.f23185a = interfaceC3602d;
    }

    @Override // w2.InterfaceC5032e
    public v a(v vVar, h hVar) {
        try {
            return C4008g.c(((com.github.penfeizhou.animation.decode.b) vVar.get()).v(0), this.f23185a);
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
