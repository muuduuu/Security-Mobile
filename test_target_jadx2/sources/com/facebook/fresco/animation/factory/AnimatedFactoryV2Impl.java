package com.facebook.fresco.animation.factory;

import T3.e;
import Y3.d;
import Z3.n;
import android.content.Context;
import android.graphics.Rect;
import b3.o;
import b3.p;
import b4.g;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import f4.InterfaceC3146a;
import g4.InterfaceC3190e;
import g4.i;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class AnimatedFactoryV2Impl implements U3.a {

    /* renamed from: a, reason: collision with root package name */
    private final d f20582a;

    /* renamed from: b, reason: collision with root package name */
    private final g f20583b;

    /* renamed from: c, reason: collision with root package name */
    private final n f20584c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20585d;

    /* renamed from: e, reason: collision with root package name */
    private U3.d f20586e;

    /* renamed from: f, reason: collision with root package name */
    private V3.b f20587f;

    /* renamed from: g, reason: collision with root package name */
    private W3.a f20588g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC3146a f20589h;

    /* renamed from: i, reason: collision with root package name */
    private Z2.g f20590i;

    /* renamed from: j, reason: collision with root package name */
    private int f20591j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f20592k;

    class a implements e4.c {
        a() {
        }

        @Override // e4.c
        public InterfaceC3190e a(i iVar, int i10, g4.n nVar, a4.c cVar) {
            return AnimatedFactoryV2Impl.this.n().b(iVar, cVar, cVar.f12582i);
        }
    }

    class b implements V3.b {
        b() {
        }

        @Override // V3.b
        public T3.a a(e eVar, Rect rect) {
            return new V3.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f20585d);
        }
    }

    class c implements V3.b {
        c() {
        }

        @Override // V3.b
        public T3.a a(e eVar, Rect rect) {
            return new V3.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f20585d);
        }
    }

    public AnimatedFactoryV2Impl(d dVar, g gVar, n nVar, boolean z10, boolean z11, int i10, Z2.g gVar2) {
        this.f20582a = dVar;
        this.f20583b = gVar;
        this.f20584c = nVar;
        this.f20591j = i10;
        this.f20592k = z11;
        this.f20585d = z10;
        this.f20590i = gVar2;
    }

    private U3.d j() {
        return new U3.e(new c(), this.f20582a, this.f20592k);
    }

    private L3.d k() {
        o oVar = new o() { // from class: L3.b
            @Override // b3.o
            public final Object get() {
                Integer o10;
                o10 = AnimatedFactoryV2Impl.o();
                return o10;
            }
        };
        ExecutorService executorService = this.f20590i;
        if (executorService == null) {
            executorService = new Z2.d(this.f20583b.a());
        }
        o oVar2 = new o() { // from class: L3.c
            @Override // b3.o
            public final Object get() {
                Integer p10;
                p10 = AnimatedFactoryV2Impl.p();
                return p10;
            }
        };
        o oVar3 = p.f18551b;
        return new L3.d(l(), Z2.i.h(), executorService, RealtimeSinceBootClock.get(), this.f20582a, this.f20584c, oVar, oVar2, oVar3, p.a(Boolean.valueOf(this.f20592k)), p.a(Boolean.valueOf(this.f20585d)), p.a(Integer.valueOf(this.f20591j)));
    }

    private V3.b l() {
        if (this.f20587f == null) {
            this.f20587f = new b();
        }
        return this.f20587f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public W3.a m() {
        if (this.f20588g == null) {
            this.f20588g = new W3.a();
        }
        return this.f20588g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public U3.d n() {
        if (this.f20586e == null) {
            this.f20586e = j();
        }
        return this.f20586e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer o() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer p() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC3190e q(i iVar, int i10, g4.n nVar, a4.c cVar) {
        return n().a(iVar, cVar, cVar.f12582i);
    }

    @Override // U3.a
    public InterfaceC3146a a(Context context) {
        if (this.f20589h == null) {
            this.f20589h = k();
        }
        return this.f20589h;
    }

    @Override // U3.a
    public e4.c b() {
        return new a();
    }

    @Override // U3.a
    public e4.c c() {
        return new e4.c() { // from class: L3.a
            @Override // e4.c
            public final InterfaceC3190e a(i iVar, int i10, g4.n nVar, a4.c cVar) {
                InterfaceC3190e q10;
                q10 = AnimatedFactoryV2Impl.this.q(iVar, i10, nVar, cVar);
                return q10;
            }
        };
    }
}
