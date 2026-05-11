package com.nextbillion.gobbler.internal.db;

import android.content.Context;
import h1.r;
import h1.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u5.C4870a;
import x9.b;
import x9.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/nextbillion/gobbler/internal/db/GobblerDatabase;", "Lh1/s;", "<init>", "()V", "Lx9/b;", "I", "()Lx9/b;", "Lx9/d;", "J", "()Lx9/d;", "p", C4870a.f43493a, "gobbler_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GobblerDatabase extends s {

    /* renamed from: q, reason: collision with root package name */
    private static volatile GobblerDatabase f29151q;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: r, reason: collision with root package name */
    private static final Object f29152r = new Object();

    /* renamed from: com.nextbillion.gobbler.internal.db.GobblerDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final GobblerDatabase a(Context context) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return (GobblerDatabase) r.a(applicationContext, GobblerDatabase.class, "gobbler_database").e().d();
        }

        public final GobblerDatabase b(Context context) {
            GobblerDatabase gobblerDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            GobblerDatabase gobblerDatabase2 = GobblerDatabase.f29151q;
            if (gobblerDatabase2 != null) {
                return gobblerDatabase2;
            }
            synchronized (GobblerDatabase.f29152r) {
                GobblerDatabase gobblerDatabase3 = GobblerDatabase.f29151q;
                if (gobblerDatabase3 == null) {
                    gobblerDatabase = GobblerDatabase.INSTANCE.a(context);
                    GobblerDatabase.f29151q = gobblerDatabase;
                } else {
                    gobblerDatabase = gobblerDatabase3;
                }
            }
            return gobblerDatabase;
        }

        private Companion() {
        }
    }

    public abstract b I();

    public abstract d J();
}
