package Z6;

import V6.AbstractC1287s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f12459a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f12460b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f12461a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private Executor f12462b;

        public a a(S6.i iVar) {
            this.f12461a.add(iVar);
            return this;
        }

        public f b() {
            return new f(this.f12461a, null, this.f12462b, true, null);
        }
    }

    /* synthetic */ f(List list, Z6.a aVar, Executor executor, boolean z10, j jVar) {
        AbstractC1287s.n(list, "APIs must not be null.");
        AbstractC1287s.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            AbstractC1287s.n(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f12459a = list;
        this.f12460b = executor;
    }

    public static a d() {
        return new a();
    }

    public List a() {
        return this.f12459a;
    }

    public Z6.a b() {
        return null;
    }

    public Executor c() {
        return this.f12460b;
    }
}
