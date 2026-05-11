package com.facebook.imagepipeline.producers;

import android.os.Looper;
import h4.C3230a;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 implements d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20969c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d0 f20970a;

    /* renamed from: b, reason: collision with root package name */
    private final p0 f20971b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(e0 e0Var) {
            if (!C3230a.b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + e0Var.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(e0 e0Var) {
            return e0Var.e().F().j() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        private a() {
        }
    }

    public static final class b extends AbstractC1839f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f20972a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f20973b;

        b(m0 m0Var, o0 o0Var) {
            this.f20972a = m0Var;
            this.f20973b = o0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20972a.a();
            this.f20973b.d().a(this.f20972a);
        }
    }

    public static final class c extends m0 {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847n f20974f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f20975g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ e0 f20976h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ o0 f20977i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1847n interfaceC1847n, g0 g0Var, e0 e0Var, o0 o0Var) {
            super(interfaceC1847n, g0Var, e0Var, "BackgroundThreadHandoffProducer");
            this.f20974f = interfaceC1847n;
            this.f20975g = g0Var;
            this.f20976h = e0Var;
            this.f20977i = o0Var;
        }

        @Override // Z2.h
        protected void b(Object obj) {
        }

        @Override // Z2.h
        protected Object c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.m0, Z2.h
        protected void f(Object obj) {
            this.f20975g.j(this.f20976h, "BackgroundThreadHandoffProducer", null);
            this.f20977i.c().a(this.f20974f, this.f20976h);
        }
    }

    public o0(d0 inputProducer, p0 threadHandoffProducerQueue) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f20970a = inputProducer;
        this.f20971b = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC1847n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!n4.b.d()) {
            g0 p10 = context.p();
            a aVar = f20969c;
            if (aVar.d(context)) {
                p10.e(context, "BackgroundThreadHandoffProducer");
                p10.j(context, "BackgroundThreadHandoffProducer", null);
                this.f20970a.a(consumer, context);
                return;
            } else {
                c cVar = new c(consumer, p10, context, this);
                context.d(new b(cVar, this));
                this.f20971b.b(C3230a.a(cVar, aVar.c(context)));
                return;
            }
        }
        n4.b.a("ThreadHandoffProducer#produceResults");
        try {
            g0 p11 = context.p();
            a aVar2 = f20969c;
            if (aVar2.d(context)) {
                p11.e(context, "BackgroundThreadHandoffProducer");
                p11.j(context, "BackgroundThreadHandoffProducer", null);
                this.f20970a.a(consumer, context);
            } else {
                c cVar2 = new c(consumer, p11, context, this);
                context.d(new b(cVar2, this));
                this.f20971b.b(C3230a.a(cVar2, aVar2.c(context)));
                Unit unit = Unit.f36324a;
            }
        } finally {
            n4.b.b();
        }
    }

    public final d0 c() {
        return this.f20970a;
    }

    public final p0 d() {
        return this.f20971b;
    }
}
