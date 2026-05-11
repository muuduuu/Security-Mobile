package E1;

import D1.s;
import Jd.AbstractC0900o0;
import Jd.J;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final s f1872a;

    /* renamed from: b, reason: collision with root package name */
    private final J f1873b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f1874c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final Executor f1875d = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f1874c.post(runnable);
        }
    }

    public c(Executor executor) {
        s sVar = new s(executor);
        this.f1872a = sVar;
        this.f1873b = AbstractC0900o0.a(sVar);
    }

    @Override // E1.b
    public J a() {
        return this.f1873b;
    }

    @Override // E1.b
    public Executor b() {
        return this.f1875d;
    }

    @Override // E1.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public s c() {
        return this.f1872a;
    }
}
