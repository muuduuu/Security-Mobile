package androidx.privacysandbox.ads.adservices.measurement;

import Jd.C0899o;
import Jd.N;
import Jd.O;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public abstract class l extends b {

    /* renamed from: b, reason: collision with root package name */
    private final MeasurementManager f17204b;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f17205a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f17206b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f17207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, l lVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f17207c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(null, this.f17207c, dVar);
            aVar.f17206b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f17205a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            throw null;
        }
    }

    public l(MeasurementManager mMeasurementManager) {
        Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
        this.f17204b = mMeasurementManager;
    }

    static /* synthetic */ Object h(l lVar, androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        new C0899o(AbstractC3868b.c(dVar), 1).F();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object j(l lVar, kotlin.coroutines.d<? super Integer> dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        lVar.i().getMeasurementApiStatus(new k(), androidx.core.os.n.a(c0899o));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }

    static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super Unit> dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        lVar.i().registerSource(uri, inputEvent, new k(), androidx.core.os.n.a(c0899o));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10 == AbstractC3868b.e() ? y10 : Unit.f36324a;
    }

    static /* synthetic */ Object l(l lVar, m mVar, kotlin.coroutines.d<? super Unit> dVar) {
        Object d10 = O.d(new a(mVar, lVar, null), dVar);
        return d10 == AbstractC3868b.e() ? d10 : Unit.f36324a;
    }

    static /* synthetic */ Object m(l lVar, Uri uri, kotlin.coroutines.d<? super Unit> dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        lVar.i().registerTrigger(uri, new k(), androidx.core.os.n.a(c0899o));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10 == AbstractC3868b.e() ? y10 : Unit.f36324a;
    }

    static /* synthetic */ Object n(l lVar, n nVar, kotlin.coroutines.d<? super Unit> dVar) {
        new C0899o(AbstractC3868b.c(dVar), 1).F();
        lVar.i();
        throw null;
    }

    static /* synthetic */ Object o(l lVar, o oVar, kotlin.coroutines.d<? super Unit> dVar) {
        new C0899o(AbstractC3868b.c(dVar), 1).F();
        lVar.i();
        throw null;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        return h(this, aVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object b(kotlin.coroutines.d<? super Integer> dVar) {
        return j(this, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object c(Uri uri, InputEvent inputEvent, kotlin.coroutines.d<? super Unit> dVar) {
        return k(this, uri, inputEvent, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object d(m mVar, kotlin.coroutines.d<? super Unit> dVar) {
        return l(this, mVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object e(Uri uri, kotlin.coroutines.d<? super Unit> dVar) {
        return m(this, uri, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object f(n nVar, kotlin.coroutines.d<? super Unit> dVar) {
        return n(this, nVar, dVar);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.b
    public Object g(o oVar, kotlin.coroutines.d<? super Unit> dVar) {
        return o(this, oVar, dVar);
    }

    protected final MeasurementManager i() {
        return this.f17204b;
    }
}
