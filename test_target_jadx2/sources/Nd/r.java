package Nd;

import Jd.z0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public final class r extends kotlin.coroutines.jvm.internal.d implements Md.f, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a, reason: collision with root package name */
    public final Md.f f6789a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f6790b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6791c;

    /* renamed from: d, reason: collision with root package name */
    private CoroutineContext f6792d;

    /* renamed from: e, reason: collision with root package name */
    private kotlin.coroutines.d f6793e;

    public r(Md.f fVar, CoroutineContext coroutineContext) {
        super(o.f6784a, kotlin.coroutines.g.f36372a);
        this.f6789a = fVar;
        this.f6790b = coroutineContext;
        this.f6791c = ((Number) coroutineContext.K(0, new Function2() { // from class: Nd.q
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int j10;
                j10 = r.j(((Integer) obj).intValue(), (CoroutineContext.Element) obj2);
                return Integer.valueOf(j10);
            }
        })).intValue();
    }

    private final void i(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof j) {
            p((j) coroutineContext2, obj);
        }
        u.b(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    private final Object k(kotlin.coroutines.d dVar, Object obj) {
        InterfaceC5068n interfaceC5068n;
        CoroutineContext context = dVar.getContext();
        z0.f(context);
        CoroutineContext coroutineContext = this.f6792d;
        if (coroutineContext != context) {
            i(context, coroutineContext, obj);
            this.f6792d = context;
        }
        this.f6793e = dVar;
        interfaceC5068n = s.f6794a;
        Md.f fVar = this.f6789a;
        Intrinsics.e(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object n10 = interfaceC5068n.n(fVar, obj, this);
        if (!Intrinsics.b(n10, AbstractC3868b.e())) {
            this.f6793e = null;
        }
        return n10;
    }

    private final void p(j jVar, Object obj) {
        throw new IllegalStateException(StringsKt.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + jVar.f6783b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // Md.f
    public Object f(Object obj, kotlin.coroutines.d dVar) {
        try {
            Object k10 = k(dVar, obj);
            if (k10 == AbstractC3868b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return k10 == AbstractC3868b.e() ? k10 : Unit.f36324a;
        } catch (Throwable th) {
            this.f6792d = new j(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f6793e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.d
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f6792d;
        return coroutineContext == null ? kotlin.coroutines.g.f36372a : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable d10 = lc.o.d(obj);
        if (d10 != null) {
            this.f6792d = new j(d10, getContext());
        }
        kotlin.coroutines.d dVar = this.f6793e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return AbstractC3868b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
