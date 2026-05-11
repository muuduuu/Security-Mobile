package c4;

import b3.l;
import com.facebook.imagepipeline.producers.AbstractC1836c;
import com.facebook.imagepipeline.producers.InterfaceC1847n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC3604a;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1724a extends AbstractC3604a {

    /* renamed from: h, reason: collision with root package name */
    private final l0 f19367h;

    /* renamed from: i, reason: collision with root package name */
    private final i4.d f19368i;

    /* renamed from: c4.a$a, reason: collision with other inner class name */
    public static final class C0345a extends AbstractC1836c {
        C0345a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        protected void f() {
            AbstractC1724a.this.D();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        protected void g(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            AbstractC1724a.this.E(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        protected void h(Object obj, int i10) {
            AbstractC1724a abstractC1724a = AbstractC1724a.this;
            abstractC1724a.F(obj, i10, abstractC1724a.C());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1836c
        protected void i(float f10) {
            AbstractC1724a.this.s(f10);
        }
    }

    protected AbstractC1724a(d0 producer, l0 settableProducerContext, i4.d requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f19367h = settableProducerContext;
        this.f19368i = requestListener;
        if (!n4.b.d()) {
            o(settableProducerContext.getExtras());
            if (n4.b.d()) {
                n4.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.b(settableProducerContext);
                    Unit unit = Unit.f36324a;
                } finally {
                }
            } else {
                requestListener.b(settableProducerContext);
            }
            if (!n4.b.d()) {
                producer.a(A(), settableProducerContext);
                return;
            }
            n4.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.a(A(), settableProducerContext);
                Unit unit2 = Unit.f36324a;
                return;
            } finally {
            }
        }
        n4.b.a("AbstractProducerToDataSourceAdapter()");
        try {
            o(settableProducerContext.getExtras());
            if (n4.b.d()) {
                n4.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.b(settableProducerContext);
                    Unit unit3 = Unit.f36324a;
                    n4.b.b();
                } finally {
                }
            } else {
                requestListener.b(settableProducerContext);
            }
            if (n4.b.d()) {
                n4.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.a(A(), settableProducerContext);
                    Unit unit4 = Unit.f36324a;
                    n4.b.b();
                } finally {
                }
            } else {
                producer.a(A(), settableProducerContext);
            }
            Unit unit5 = Unit.f36324a;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final InterfaceC1847n A() {
        return new C0345a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D() {
        l.i(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Throwable th) {
        if (super.q(th, B(this.f19367h))) {
            this.f19368i.h(this.f19367h, th);
        }
    }

    protected final Map B(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    public final l0 C() {
        return this.f19367h;
    }

    protected void F(Object obj, int i10, e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean d10 = AbstractC1836c.d(i10);
        if (super.u(obj, d10, B(producerContext)) && d10) {
            this.f19368i.f(this.f19367h);
        }
    }

    @Override // l3.AbstractC3604a, l3.InterfaceC3606c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.a()) {
            return true;
        }
        this.f19368i.i(this.f19367h);
        this.f19367h.t();
        return true;
    }
}
