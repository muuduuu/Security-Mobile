package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1592i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class O {

    /* renamed from: a, reason: collision with root package name */
    private final r f17066a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f17067b;

    /* renamed from: c, reason: collision with root package name */
    private a f17068c;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final r f17069a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC1592i.a f17070b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f17071c;

        public a(r registry, AbstractC1592i.a event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f17069a = registry;
            this.f17070b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17071c) {
                return;
            }
            this.f17069a.i(this.f17070b);
            this.f17071c = true;
        }
    }

    public O(InterfaceC1599p provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f17066a = new r(provider);
        this.f17067b = new Handler();
    }

    private final void f(AbstractC1592i.a aVar) {
        a aVar2 = this.f17068c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f17066a, aVar);
        this.f17068c = aVar3;
        Handler handler = this.f17067b;
        Intrinsics.d(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public AbstractC1592i a() {
        return this.f17066a;
    }

    public void b() {
        f(AbstractC1592i.a.ON_START);
    }

    public void c() {
        f(AbstractC1592i.a.ON_CREATE);
    }

    public void d() {
        f(AbstractC1592i.a.ON_STOP);
        f(AbstractC1592i.a.ON_DESTROY);
    }

    public void e() {
        f(AbstractC1592i.a.ON_START);
    }
}
