package androidx.work.impl;

import C1.InterfaceC0749b;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.h;
import u5.C4870a;
import x1.InterfaceC5098b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lh1/s;", "<init>", "()V", "LC1/v;", "K", "()LC1/v;", "LC1/b;", "F", "()LC1/b;", "LC1/z;", "L", "()LC1/z;", "LC1/j;", "H", "()LC1/j;", "LC1/o;", "I", "()LC1/o;", "LC1/r;", "J", "()LC1/r;", "LC1/e;", "G", "()LC1/e;", "p", C4870a.f43493a, "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkDatabase extends h1.s {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final l1.h c(Context context, h.b configuration) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            h.b.a a10 = h.b.f37002f.a(context);
            a10.d(configuration.f37004b).c(configuration.f37005c).e(true).a(true);
            return new m1.f().a(a10.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, InterfaceC5098b clock, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return (WorkDatabase) (z10 ? h1.r.c(context, WorkDatabase.class).c() : h1.r.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: androidx.work.impl.D
                @Override // l1.h.c
                public final l1.h a(h.b bVar) {
                    l1.h c10;
                    c10 = WorkDatabase.Companion.c(context, bVar);
                    return c10;
                }
            })).g(queryExecutor).a(new C1618d(clock)).b(C1625k.f18358c).b(new C1635v(context, 2, 3)).b(C1626l.f18359c).b(C1627m.f18360c).b(new C1635v(context, 5, 6)).b(C1628n.f18361c).b(C1629o.f18362c).b(C1630p.f18363c).b(new S(context)).b(new C1635v(context, 10, 11)).b(C1621g.f18354c).b(C1622h.f18355c).b(C1623i.f18356c).b(C1624j.f18357c).e().d();
        }

        private Companion() {
        }
    }

    public abstract InterfaceC0749b F();

    public abstract C1.e G();

    public abstract C1.j H();

    public abstract C1.o I();

    public abstract C1.r J();

    public abstract C1.v K();

    public abstract C1.z L();
}
