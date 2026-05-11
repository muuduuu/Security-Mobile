package ae;

import Td.C1225a;
import Td.w;
import kotlin.collections.C3573h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface r {

    public interface b {
        b a();

        l c();

        void cancel();

        boolean d();

        a e();

        a g();
    }

    static /* synthetic */ boolean a(r rVar, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return rVar.d(lVar);
    }

    C1225a b();

    boolean c(w wVar);

    boolean d(l lVar);

    boolean e();

    C3573h f();

    b g();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b f12877a;

        /* renamed from: b, reason: collision with root package name */
        private final b f12878b;

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f12879c;

        public a(b plan, b bVar, Throwable th) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f12877a = plan;
            this.f12878b = bVar;
            this.f12879c = th;
        }

        public final b a() {
            return this.f12878b;
        }

        public final Throwable b() {
            return this.f12879c;
        }

        public final b c() {
            return this.f12878b;
        }

        public final b d() {
            return this.f12877a;
        }

        public final Throwable e() {
            return this.f12879c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.b(this.f12877a, aVar.f12877a) && Intrinsics.b(this.f12878b, aVar.f12878b) && Intrinsics.b(this.f12879c, aVar.f12879c);
        }

        public final boolean f() {
            return this.f12878b == null && this.f12879c == null;
        }

        public int hashCode() {
            int hashCode = this.f12877a.hashCode() * 31;
            b bVar = this.f12878b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th = this.f12879c;
            return hashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f12877a + ", nextPlan=" + this.f12878b + ", throwable=" + this.f12879c + ')';
        }

        public /* synthetic */ a(b bVar, b bVar2, Throwable th, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : th);
        }
    }
}
