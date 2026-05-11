package I0;

import Jd.AbstractC0918y;
import Jd.InterfaceC0914w;
import kotlin.Unit;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private final Sd.a f4247a = Sd.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0914w f4248b = AbstractC0918y.b(null, 1, null);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f4249a;

        /* renamed from: b, reason: collision with root package name */
        Object f4250b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4251c;

        /* renamed from: e, reason: collision with root package name */
        int f4253e;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4251c = obj;
            this.f4253e |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    public final Object a(kotlin.coroutines.d dVar) {
        Object q10 = this.f4248b.q(dVar);
        return q10 == AbstractC3868b.e() ? q10 : Unit.f36324a;
    }

    protected abstract Object b(kotlin.coroutines.d dVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x006a, B:27:0x0072, B:30:0x007c), top: B:24:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        Sd.a aVar2;
        z zVar;
        Sd.a aVar3;
        Throwable th;
        z zVar2;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f4253e;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f4253e = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f4251c;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f4253e;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        if (this.f4248b.c()) {
                            return Unit.f36324a;
                        }
                        aVar2 = this.f4247a;
                        aVar.f4249a = this;
                        aVar.f4250b = aVar2;
                        aVar.f4253e = 1;
                        if (aVar2.b(null, aVar) == e10) {
                            return e10;
                        }
                        zVar = this;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar3 = (Sd.a) aVar.f4250b;
                            zVar2 = (z) aVar.f4249a;
                            try {
                                lc.p.b(obj);
                                InterfaceC0914w interfaceC0914w = zVar2.f4248b;
                                Unit unit = Unit.f36324a;
                                interfaceC0914w.H(unit);
                                aVar3.c(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar3.c(null);
                                throw th;
                            }
                        }
                        Sd.a aVar4 = (Sd.a) aVar.f4250b;
                        zVar = (z) aVar.f4249a;
                        lc.p.b(obj);
                        aVar2 = aVar4;
                    }
                    if (!zVar.f4248b.c()) {
                        Unit unit2 = Unit.f36324a;
                        aVar2.c(null);
                        return unit2;
                    }
                    aVar.f4249a = zVar;
                    aVar.f4250b = aVar2;
                    aVar.f4253e = 2;
                    if (zVar.b(aVar) == e10) {
                        return e10;
                    }
                    aVar3 = aVar2;
                    zVar2 = zVar;
                    InterfaceC0914w interfaceC0914w2 = zVar2.f4248b;
                    Unit unit3 = Unit.f36324a;
                    interfaceC0914w2.H(unit3);
                    aVar3.c(null);
                    return unit3;
                }
            }
            if (!zVar.f4248b.c()) {
            }
        } catch (Throwable th3) {
            aVar3 = aVar2;
            th = th3;
            aVar3.c(null);
            throw th;
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f4251c;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f4253e;
        if (i10 != 0) {
        }
    }
}
