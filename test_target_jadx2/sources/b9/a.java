package B9;

import android.content.Context;
import androidx.work.b;
import com.nextbillion.gobbler.internal.eventsync.OneTimeEventSyncWork;
import com.nextbillion.gobbler.internal.eventsync.PeriodicEventSyncWork;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import lc.t;
import pc.AbstractC3868b;
import v9.C4973b;
import v9.g;
import x1.AbstractC5094A;
import x1.C5100d;
import x1.EnumC5102f;
import x1.EnumC5103g;
import x1.o;
import x1.q;
import x1.t;
import x1.z;
import z9.InterfaceC5264a;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f540a = new a();

    /* renamed from: B9.a$a, reason: collision with other inner class name */
    static final class C0011a extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f541a;

        /* renamed from: b, reason: collision with root package name */
        Object f542b;

        /* renamed from: c, reason: collision with root package name */
        Object f543c;

        /* renamed from: d, reason: collision with root package name */
        int f544d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f545e;

        /* renamed from: g, reason: collision with root package name */
        int f547g;

        C0011a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f545e = obj;
            this.f547g |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    private a() {
    }

    private final long a() {
        InterfaceC5264a.C0676a c0676a = InterfaceC5264a.f45781a;
        return F9.d.f2658a.a(c0676a.a().f(), c0676a.a().i().getBase(), r1.getCapInMinutes() * 60 * 1000);
    }

    private final void c(Context context, boolean z10, g gVar) {
        String str;
        if (gVar == null || (str = gVar.getValue()) == null) {
            str = "ALL";
        }
        String str2 = "Gobbler_One_Time_Task_" + str;
        long a10 = a();
        q.a aVar = new q.a(OneTimeEventSyncWork.class);
        C5100d.a aVar2 = new C5100d.a();
        aVar2.b(o.CONNECTED);
        q.a aVar3 = (q.a) aVar.i(aVar2.a());
        Pair[] pairArr = {t.a("IS_FOREGROUND_SYNC", Boolean.valueOf(z10)), t.a("SERVICE_NAME", gVar != null ? gVar.getValue() : null)};
        b.a aVar4 = new b.a();
        for (int i10 = 0; i10 < 2; i10++) {
            Pair pair = pairArr[i10];
            aVar4.b((String) pair.c(), pair.d());
        }
        b a11 = aVar4.a();
        Intrinsics.checkNotNullExpressionValue(a11, "dataBuilder.build()");
        AbstractC5094A.f(context).e(str2, EnumC5103g.KEEP, (q) ((q.a) ((q.a) ((q.a) aVar3.l(a11)).k(a10, TimeUnit.MILLISECONDS)).a(str2)).b());
    }

    static /* synthetic */ void d(a aVar, Context context, boolean z10, g gVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        aVar.c(context, z10, gVar);
    }

    private final z e(Context context, int i10) {
        Object obj;
        Object obj2 = AbstractC5094A.f(context).g("Gobbler_Periodic_Task").get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        Iterator it = ((Iterable) obj2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            z.b a10 = ((z) obj).a();
            if (a10 != null && a10.a() == i10 * 60 * 1000) {
                break;
            }
        }
        return (z) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g gVar, kotlin.coroutines.d dVar) {
        C0011a c0011a;
        Object obj;
        int i10;
        a aVar;
        C4973b c4973b;
        g gVar2;
        int i11;
        if (dVar instanceof C0011a) {
            c0011a = (C0011a) dVar;
            int i12 = c0011a.f547g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0011a.f547g = i12 - Integer.MIN_VALUE;
                obj = c0011a.f545e;
                Object e10 = AbstractC3868b.e();
                i10 = c0011a.f547g;
                if (i10 != 0) {
                    p.b(obj);
                    InterfaceC5264a.C0676a c0676a = InterfaceC5264a.f45781a;
                    C4973b j10 = c0676a.a().j();
                    int triggerLimit = c0676a.a().i().e(gVar).getTriggerLimit();
                    E9.a e11 = c0676a.a().e();
                    c0011a.f541a = this;
                    c0011a.f542b = gVar;
                    c0011a.f543c = j10;
                    c0011a.f544d = triggerLimit;
                    c0011a.f547g = 1;
                    obj = e11.b("todo", gVar, c0011a);
                    if (obj == e10) {
                        return e10;
                    }
                    aVar = this;
                    c4973b = j10;
                    gVar2 = gVar;
                    i11 = triggerLimit;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = c0011a.f544d;
                    c4973b = (C4973b) c0011a.f543c;
                    gVar2 = (g) c0011a.f542b;
                    aVar = (a) c0011a.f541a;
                    p.b(obj);
                }
                if (((Number) obj).intValue() >= i11) {
                    Context applicationContext = c4973b.a().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    aVar.c(applicationContext, true, gVar2);
                }
                return Unit.f36324a;
            }
        }
        c0011a = new C0011a(dVar);
        obj = c0011a.f545e;
        Object e102 = AbstractC3868b.e();
        i10 = c0011a.f547g;
        if (i10 != 0) {
        }
        if (((Number) obj).intValue() >= i11) {
        }
        return Unit.f36324a;
    }

    public final void f(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (e(context, i10) != null) {
            return;
        }
        AbstractC5094A.f(context).c("Gobbler_Periodic_Task", EnumC5102f.UPDATE, (x1.t) ((t.a) ((t.a) new t.a(PeriodicEventSyncWork.class, i10, TimeUnit.MINUTES).i(new C5100d.a().b(o.CONNECTED).a())).a("Gobbler_Periodic_Task")).b());
    }

    public final void g() {
        Context applicationContext = InterfaceC5264a.f45781a.a().j().a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        d(this, applicationContext, false, null, 4, null);
    }
}
