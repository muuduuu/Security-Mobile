package Z8;

import V6.AbstractC1286q;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f12466a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12467b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f12468c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f12469a = 0;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12470b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f12471c;

        public b a() {
            return new b(this.f12469a, this.f12470b, this.f12471c, null, null);
        }

        public a b(int i10, int... iArr) {
            this.f12469a = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.f12469a = i11 | this.f12469a;
                }
            }
            return this;
        }
    }

    /* synthetic */ b(int i10, boolean z10, Executor executor, d dVar, e eVar) {
        this.f12466a = i10;
        this.f12467b = z10;
        this.f12468c = executor;
    }

    public final int a() {
        return this.f12466a;
    }

    public final d b() {
        return null;
    }

    public final Executor c() {
        return this.f12468c;
    }

    public final boolean d() {
        return this.f12467b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12466a == bVar.f12466a && this.f12467b == bVar.f12467b && AbstractC1286q.a(this.f12468c, bVar.f12468c) && AbstractC1286q.a(null, null);
    }

    public int hashCode() {
        return AbstractC1286q.b(Integer.valueOf(this.f12466a), Boolean.valueOf(this.f12467b), this.f12468c, null);
    }
}
