package Nd;

import Jd.N;
import Jd.O;
import Jd.P;
import Jd.S;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;

/* loaded from: classes3.dex */
public abstract class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f6748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6749b;

    /* renamed from: c, reason: collision with root package name */
    public final Ld.a f6750c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f6751a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f6752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Md.f f6753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f6754d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Md.f fVar, e eVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f6753c = fVar;
            this.f6754d = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f6753c, this.f6754d, dVar);
            aVar.f6752b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6751a;
            if (i10 == 0) {
                lc.p.b(obj);
                N n10 = (N) this.f6752b;
                Md.f fVar = this.f6753c;
                Ld.w k10 = this.f6754d.k(n10);
                this.f6751a = 1;
                if (Md.g.g(fVar, k10, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f6755a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6756b;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            b bVar = e.this.new b(dVar);
            bVar.f6756b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ld.u uVar, kotlin.coroutines.d dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f6755a;
            if (i10 == 0) {
                lc.p.b(obj);
                Ld.u uVar = (Ld.u) this.f6756b;
                e eVar = e.this;
                this.f6755a = 1;
                if (eVar.g(uVar, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public e(CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        this.f6748a = coroutineContext;
        this.f6749b = i10;
        this.f6750c = aVar;
    }

    static /* synthetic */ Object f(e eVar, Md.f fVar, kotlin.coroutines.d dVar) {
        Object d10 = O.d(new a(fVar, eVar, null), dVar);
        return d10 == AbstractC3868b.e() ? d10 : Unit.f36324a;
    }

    @Override // Md.e
    public Object b(Md.f fVar, kotlin.coroutines.d dVar) {
        return f(this, fVar, dVar);
    }

    @Override // Nd.n
    public Md.e c(CoroutineContext coroutineContext, int i10, Ld.a aVar) {
        CoroutineContext l10 = coroutineContext.l(this.f6748a);
        if (aVar == Ld.a.SUSPEND) {
            int i11 = this.f6749b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            aVar = this.f6750c;
        }
        return (Intrinsics.b(l10, this.f6748a) && i10 == this.f6749b && aVar == this.f6750c) ? this : h(l10, i10, aVar);
    }

    protected String d() {
        return null;
    }

    protected abstract Object g(Ld.u uVar, kotlin.coroutines.d dVar);

    protected abstract e h(CoroutineContext coroutineContext, int i10, Ld.a aVar);

    public final Function2 i() {
        return new b(null);
    }

    public final int j() {
        int i10 = this.f6749b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public Ld.w k(N n10) {
        return Ld.s.c(n10, this.f6748a, j(), this.f6750c, P.ATOMIC, null, i(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d10 = d();
        if (d10 != null) {
            arrayList.add(d10);
        }
        if (this.f6748a != kotlin.coroutines.g.f36372a) {
            arrayList.add("context=" + this.f6748a);
        }
        if (this.f6749b != -3) {
            arrayList.add("capacity=" + this.f6749b);
        }
        if (this.f6750c != Ld.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f6750c);
        }
        return S.a(this) + '[' + CollectionsKt.l0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
