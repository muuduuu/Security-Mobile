package Q2;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.C3877e;
import pe.b0;

/* loaded from: classes.dex */
public final class F implements A {

    /* renamed from: a, reason: collision with root package name */
    private final List f8078a;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(1);
            this.f8079a = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String c10 = B.c(it, this.f8079a);
            Intrinsics.checkNotNullExpressionValue(c10, "it.toSharableUtf8Content(context)");
            return c10;
        }
    }

    public F(List transactions, boolean z10) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        List list = transactions;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new E((HttpTransaction) it.next(), z10));
        }
        this.f8078a = arrayList;
    }

    @Override // Q2.A
    public b0 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C3877e c3877e = new C3877e();
        c3877e.T0(CollectionsKt.l0(this.f8078a, '\n' + context.getString(K2.g.f5237p) + '\n', Intrinsics.m(context.getString(K2.g.f5236o), "\n"), '\n' + context.getString(K2.g.f5235n) + '\n', 0, null, new a(context), 24, null));
        return c3877e;
    }
}
