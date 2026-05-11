package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import f3.AbstractC3142a;
import g4.InterfaceC3190e;

/* renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1843j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f20921a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20922b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20923c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20924d;

    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class a extends AbstractC1852t {

        /* renamed from: c, reason: collision with root package name */
        private final int f20925c;

        /* renamed from: d, reason: collision with root package name */
        private final int f20926d;

        a(InterfaceC1847n interfaceC1847n, int i10, int i11) {
            super(interfaceC1847n);
            this.f20925c = i10;
            this.f20926d = i11;
        }

        private void p(AbstractC3142a abstractC3142a) {
            InterfaceC3190e interfaceC3190e;
            Bitmap p12;
            int rowBytes;
            if (abstractC3142a == null || !abstractC3142a.s() || (interfaceC3190e = (InterfaceC3190e) abstractC3142a.p()) == null || interfaceC3190e.isClosed() || !(interfaceC3190e instanceof g4.f) || (p12 = ((g4.f) interfaceC3190e).p1()) == null || (rowBytes = p12.getRowBytes() * p12.getHeight()) < this.f20925c || rowBytes > this.f20926d) {
                return;
            }
            p12.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void h(AbstractC3142a abstractC3142a, int i10) {
            p(abstractC3142a);
            o().c(abstractC3142a, i10);
        }
    }

    public C1843j(d0 d0Var, int i10, int i11, boolean z10) {
        b3.l.b(Boolean.valueOf(i10 <= i11));
        this.f20921a = (d0) b3.l.g(d0Var);
        this.f20922b = i10;
        this.f20923c = i11;
        this.f20924d = z10;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n interfaceC1847n, e0 e0Var) {
        if (!e0Var.i() || this.f20924d) {
            this.f20921a.a(new a(interfaceC1847n, this.f20922b, this.f20923c), e0Var);
        } else {
            this.f20921a.a(interfaceC1847n, e0Var);
        }
    }
}
