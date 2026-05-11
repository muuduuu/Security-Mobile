package D1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import x1.C5104h;
import x1.InterfaceC5105i;

/* loaded from: classes.dex */
public class B implements InterfaceC5105i {

    /* renamed from: d, reason: collision with root package name */
    private static final String f1117d = x1.n.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final E1.b f1118a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.work.impl.foreground.a f1119b;

    /* renamed from: c, reason: collision with root package name */
    final C1.v f1120c;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f1121a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f1122b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5104h f1123c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f1124d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, C5104h c5104h, Context context) {
            this.f1121a = cVar;
            this.f1122b = uuid;
            this.f1123c = c5104h;
            this.f1124d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f1121a.isCancelled()) {
                    String uuid = this.f1122b.toString();
                    C1.u s10 = B.this.f1120c.s(uuid);
                    if (s10 == null || s10.f791b.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    B.this.f1119b.a(uuid, this.f1123c);
                    this.f1124d.startService(androidx.work.impl.foreground.b.c(this.f1124d, C1.x.a(s10), this.f1123c));
                }
                this.f1121a.p(null);
            } catch (Throwable th) {
                this.f1121a.q(th);
            }
        }
    }

    public B(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, E1.b bVar) {
        this.f1119b = aVar;
        this.f1118a = bVar;
        this.f1120c = workDatabase.K();
    }

    @Override // x1.InterfaceC5105i
    public h8.d a(Context context, UUID uuid, C5104h c5104h) {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        this.f1118a.d(new a(t10, uuid, c5104h, context));
        return t10;
    }
}
