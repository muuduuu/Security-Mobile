package L2;

import Jd.AbstractC0891k;
import Jd.C0874b0;
import Jd.N;
import Jd.O;
import L2.e;
import Q2.w;
import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5648a;

    /* renamed from: b, reason: collision with root package name */
    private final e f5649b;

    /* renamed from: c, reason: collision with root package name */
    private final w f5650c;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f5651a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HttpTransaction f5652b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HttpTransaction httpTransaction, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f5652b = httpTransaction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new a(this.f5652b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f5651a;
            if (i10 == 0) {
                p.b(obj);
                O2.b c10 = O2.e.f7006a.c();
                HttpTransaction httpTransaction = this.f5652b;
                this.f5651a = 1;
                if (c10.h(httpTransaction, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public b(Context context, boolean z10, e.b retentionPeriod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(retentionPeriod, "retentionPeriod");
        this.f5648a = z10;
        this.f5649b = new e(context, retentionPeriod);
        this.f5650c = new w(context);
        O2.e.f7006a.a(context);
    }

    public final void a(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        AbstractC0891k.d(O.a(C0874b0.b()), null, null, new a(transaction, null), 3, null);
        if (this.f5648a) {
            this.f5650c.k(transaction);
        }
        this.f5649b.b();
    }

    public final void b(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        int b10 = O2.e.f7006a.c().b(transaction);
        if (!this.f5648a || b10 <= 0) {
            return;
        }
        this.f5650c.k(transaction);
    }

    public /* synthetic */ b(Context context, boolean z10, e.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? e.b.ONE_WEEK : bVar);
    }
}
