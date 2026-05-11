package com.github.penfeizhou.animation.glide;

import android.graphics.drawable.Drawable;
import c6.C1736a;
import d6.C2994b;
import f6.C3148a;
import g6.C3194a;
import i2.h;
import j6.C3503a;
import k2.v;
import k6.g;
import m6.AbstractC3655a;
import o6.C3757a;
import p6.l;
import t2.AbstractC4614j;
import w2.InterfaceC5032e;

/* loaded from: classes2.dex */
class b implements InterfaceC5032e {

    class a extends AbstractC4614j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1736a f23186b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Drawable drawable, C1736a c1736a) {
            super(drawable);
            this.f23186b = c1736a;
        }

        @Override // k2.v
        public Class a() {
            return Drawable.class;
        }

        @Override // t2.AbstractC4614j, k2.r
        public void initialize() {
            super.initialize();
        }

        @Override // k2.v
        public int k() {
            return this.f23186b.d();
        }

        @Override // k2.v
        public void recycle() {
            this.f23186b.stop();
        }
    }

    /* renamed from: com.github.penfeizhou.animation.glide.b$b, reason: collision with other inner class name */
    class C0393b extends AbstractC4614j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3757a f23188b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0393b(Drawable drawable, C3757a c3757a) {
            super(drawable);
            this.f23188b = c3757a;
        }

        @Override // k2.v
        public Class a() {
            return Drawable.class;
        }

        @Override // t2.AbstractC4614j, k2.r
        public void initialize() {
            super.initialize();
        }

        @Override // k2.v
        public int k() {
            return this.f23188b.d();
        }

        @Override // k2.v
        public void recycle() {
            this.f23188b.stop();
        }
    }

    class c extends AbstractC4614j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3503a f23190b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Drawable drawable, C3503a c3503a) {
            super(drawable);
            this.f23190b = c3503a;
        }

        @Override // k2.v
        public Class a() {
            return Drawable.class;
        }

        @Override // t2.AbstractC4614j, k2.r
        public void initialize() {
            super.initialize();
        }

        @Override // k2.v
        public int k() {
            return this.f23190b.d();
        }

        @Override // k2.v
        public void recycle() {
            this.f23190b.stop();
        }
    }

    class d extends AbstractC4614j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3148a f23192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Drawable drawable, C3148a c3148a) {
            super(drawable);
            this.f23192b = c3148a;
        }

        @Override // k2.v
        public Class a() {
            return Drawable.class;
        }

        @Override // t2.AbstractC4614j, k2.r
        public void initialize() {
            super.initialize();
        }

        @Override // k2.v
        public int k() {
            return this.f23192b.d();
        }

        @Override // k2.v
        public void recycle() {
            this.f23192b.stop();
        }
    }

    b() {
    }

    @Override // w2.InterfaceC5032e
    public v a(v vVar, h hVar) {
        com.github.penfeizhou.animation.decode.b bVar = (com.github.penfeizhou.animation.decode.b) vVar.get();
        boolean booleanValue = ((Boolean) hVar.c(AbstractC3655a.f37391d)).booleanValue();
        if (bVar instanceof C2994b) {
            C1736a c1736a = new C1736a((C2994b) bVar);
            c1736a.h(false);
            c1736a.i(booleanValue);
            return new a(c1736a, c1736a);
        }
        if (bVar instanceof l) {
            C3757a c3757a = new C3757a((l) bVar);
            c3757a.h(false);
            c3757a.i(booleanValue);
            return new C0393b(c3757a, c3757a);
        }
        if (bVar instanceof g) {
            C3503a c3503a = new C3503a((g) bVar);
            c3503a.h(false);
            c3503a.i(booleanValue);
            return new c(c3503a, c3503a);
        }
        if (!(bVar instanceof C3194a)) {
            return null;
        }
        C3148a c3148a = new C3148a((C3194a) bVar);
        c3148a.h(false);
        c3148a.i(booleanValue);
        return new d(c3148a, c3148a);
    }
}
