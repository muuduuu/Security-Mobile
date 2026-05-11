package Q2;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.core.app.s;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.ClearDatabaseService;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8125e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final LongSparseArray f8126f = new LongSparseArray();

    /* renamed from: g, reason: collision with root package name */
    private static final HashSet f8127g = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final Context f8128a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f8129b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f8130c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f8131d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            synchronized (w.f8126f) {
                w.f8126f.clear();
                w.f8127g.clear();
                Unit unit = Unit.f36324a;
            }
        }

        private a() {
        }
    }

    static final class b extends xc.m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PendingIntent invoke() {
            return PendingIntent.getActivity(w.this.h(), 3546, L2.a.d(w.this.h(), 2), w.this.j() | 134217728);
        }
    }

    static final class c extends xc.m implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PendingIntent invoke() {
            return PendingIntent.getActivity(w.this.h(), 1138, L2.a.c(w.this.h()), w.this.j() | 134217728);
        }
    }

    public w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8128a = context;
        Object systemService = context.getSystemService("notification");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
        }
        NotificationManager notificationManager = (NotificationManager) systemService;
        this.f8129b = notificationManager;
        this.f8130c = lc.i.a(new c());
        this.f8131d = lc.i.a(new b());
        if (Build.VERSION.SDK_INT >= 26) {
            v.a();
            NotificationChannel a10 = u.a("chucker_transactions", context.getString(K2.g.f5242u), 2);
            v.a();
            notificationManager.createNotificationChannels(CollectionsKt.m(a10, u.a("chucker_errors", context.getString(K2.g.f5218T), 2)));
        }
    }

    private final void d(HttpTransaction httpTransaction) {
        if (httpTransaction.getId() == 0) {
            return;
        }
        LongSparseArray longSparseArray = f8126f;
        synchronized (longSparseArray) {
            try {
                f8127g.add(Long.valueOf(httpTransaction.getId()));
                longSparseArray.put(httpTransaction.getId(), httpTransaction);
                if (longSparseArray.size() > 10) {
                    longSparseArray.removeAt(0);
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final s.a e(ClearDatabaseService.a aVar) {
        String string = this.f8128a.getString(K2.g.f5227f);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.chucker_clear)");
        Intent intent = new Intent(this.f8128a, (Class<?>) ClearDatabaseService.class);
        intent.putExtra("EXTRA_ITEM_TO_CLEAR", aVar);
        return new s.a(K2.c.f5115b, string, PendingIntent.getService(this.f8128a, 11, intent, 1073741824 | j()));
    }

    private final PendingIntent i() {
        return (PendingIntent) this.f8130c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j() {
        return 67108864;
    }

    public final void f() {
        this.f8129b.cancel(3546);
    }

    public final void g() {
        this.f8129b.cancel(1138);
    }

    public final Context h() {
        return this.f8128a;
    }

    public final void k(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        d(transaction);
        if (com.chuckerteam.chucker.internal.ui.a.f20557a.a()) {
            return;
        }
        s.e b10 = new s.e(this.f8128a, "chucker_transactions").i(i()).q(true).u(K2.c.f5119f).h(androidx.core.content.a.c(this.f8128a, K2.a.f5105g)).k(this.f8128a.getString(K2.g.f5240s)).f(true).b(e(ClearDatabaseService.a.b.f20552b));
        Intrinsics.checkNotNullExpressionValue(b10, "Builder(context, TRANSACTIONS_CHANNEL_ID)\n                    .setContentIntent(transactionsScreenIntent)\n                    .setLocalOnly(true)\n                    .setSmallIcon(R.drawable.chucker_ic_transaction_notification)\n                    .setColor(ContextCompat.getColor(context, R.color.chucker_color_primary))\n                    .setContentTitle(context.getString(R.string.chucker_http_notification_title))\n                    .setAutoCancel(true)\n                    .addAction(createClearAction(ClearDatabaseService.ClearAction.Transaction))");
        s.f fVar = new s.f();
        LongSparseArray longSparseArray = f8126f;
        synchronized (longSparseArray) {
            try {
                int i10 = 0;
                Iterator it = kotlin.ranges.d.m(longSparseArray.size() - 1, 0).iterator();
                while (it.hasNext()) {
                    HttpTransaction httpTransaction = (HttpTransaction) f8126f.valueAt(((kotlin.collections.D) it).a());
                    if (httpTransaction != null && i10 < 10) {
                        if (i10 == 0) {
                            b10.j(httpTransaction.getNotificationText());
                        }
                        fVar.h(httpTransaction.getNotificationText());
                    }
                    i10++;
                }
                b10.w(fVar);
                b10.x(String.valueOf(f8127g.size()));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8129b.notify(1138, b10.c());
    }
}
