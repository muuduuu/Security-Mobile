package O2;

import Q2.r;
import androidx.lifecycle.AbstractC1604v;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;
import xc.m;

/* loaded from: classes.dex */
public final class a implements O2.b {

    /* renamed from: a, reason: collision with root package name */
    private final ChuckerDatabase f6999a;

    /* renamed from: O2.a$a, reason: collision with other inner class name */
    static final class C0138a extends m implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0138a f7000a = new C0138a();

        C0138a() {
            super(2);
        }

        public final boolean a(HttpTransaction httpTransaction, HttpTransaction httpTransaction2) {
            boolean z10 = false;
            if (httpTransaction != null && !httpTransaction.hasTheSameContent(httpTransaction2)) {
                z10 = true;
            }
            return !z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(a((HttpTransaction) obj, (HttpTransaction) obj2));
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7001a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7002b;

        /* renamed from: d, reason: collision with root package name */
        int f7004d;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7002b = obj;
            this.f7004d |= Integer.MIN_VALUE;
            return a.this.h(null, this);
        }
    }

    public a(ChuckerDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f6999a = database;
    }

    private final P2.a i() {
        return this.f6999a.G();
    }

    @Override // O2.b
    public AbstractC1604v a() {
        return i().h();
    }

    @Override // O2.b
    public int b(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return i().d(transaction);
    }

    @Override // O2.b
    public Object c(long j10, kotlin.coroutines.d dVar) {
        Object c10 = i().c(j10, dVar);
        return c10 == AbstractC3868b.e() ? c10 : Unit.f36324a;
    }

    @Override // O2.b
    public Object d(kotlin.coroutines.d dVar) {
        return i().e(dVar);
    }

    @Override // O2.b
    public AbstractC1604v e(long j10) {
        return r.j(i().a(j10), null, C0138a.f7000a, 1, null);
    }

    @Override // O2.b
    public Object f(kotlin.coroutines.d dVar) {
        Object b10 = i().b(dVar);
        return b10 == AbstractC3868b.e() ? b10 : Unit.f36324a;
    }

    @Override // O2.b
    public AbstractC1604v g(String code, String path) {
        String str;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(path, "path");
        if (path.length() > 0) {
            str = '%' + path + '%';
        } else {
            str = "%";
        }
        return i().g(Intrinsics.m(code, "%"), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(HttpTransaction httpTransaction, kotlin.coroutines.d dVar) {
        b bVar;
        int i10;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f7004d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f7004d = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f7002b;
                Object e10 = AbstractC3868b.e();
                i10 = bVar.f7004d;
                if (i10 != 0) {
                    p.b(obj);
                    P2.a i12 = i();
                    bVar.f7001a = httpTransaction;
                    bVar.f7004d = 1;
                    obj = i12.f(httpTransaction, bVar);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpTransaction = (HttpTransaction) bVar.f7001a;
                    p.b(obj);
                }
                Long l10 = (Long) obj;
                httpTransaction.setId(l10 != null ? 0L : l10.longValue());
                return Unit.f36324a;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f7002b;
        Object e102 = AbstractC3868b.e();
        i10 = bVar.f7004d;
        if (i10 != 0) {
        }
        Long l102 = (Long) obj2;
        httpTransaction.setId(l102 != null ? 0L : l102.longValue());
        return Unit.f36324a;
    }
}
