package Md;

import kotlin.Unit;
import pc.AbstractC3868b;

/* renamed from: Md.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0989a implements e {

    /* renamed from: Md.a$a, reason: collision with other inner class name */
    static final class C0128a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f6381a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f6382b;

        /* renamed from: d, reason: collision with root package name */
        int f6384d;

        C0128a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6382b = obj;
            this.f6384d |= Integer.MIN_VALUE;
            return AbstractC0989a.this.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Md.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(f fVar, kotlin.coroutines.d dVar) {
        C0128a c0128a;
        int i10;
        Throwable th;
        Nd.r rVar;
        if (dVar instanceof C0128a) {
            c0128a = (C0128a) dVar;
            int i11 = c0128a.f6384d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0128a.f6384d = i11 - Integer.MIN_VALUE;
                Object obj = c0128a.f6382b;
                Object e10 = AbstractC3868b.e();
                i10 = c0128a.f6384d;
                if (i10 != 0) {
                    lc.p.b(obj);
                    Nd.r rVar2 = new Nd.r(fVar, c0128a.getContext());
                    try {
                        c0128a.f6381a = rVar2;
                        c0128a.f6384d = 1;
                        if (d(rVar2, c0128a) == e10) {
                            return e10;
                        }
                        rVar = rVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        rVar = rVar2;
                        rVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (Nd.r) c0128a.f6381a;
                    try {
                        lc.p.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        rVar.releaseIntercepted();
                        throw th;
                    }
                }
                rVar.releaseIntercepted();
                return Unit.f36324a;
            }
        }
        c0128a = new C0128a(dVar);
        Object obj2 = c0128a.f6382b;
        Object e102 = AbstractC3868b.e();
        i10 = c0128a.f6384d;
        if (i10 != 0) {
        }
        rVar.releaseIntercepted();
        return Unit.f36324a;
    }

    public abstract Object d(f fVar, kotlin.coroutines.d dVar);
}
