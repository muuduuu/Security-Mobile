package M0;

import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5969a;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f5969a = name;
        }

        public final String a() {
            return this.f5969a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.b(this.f5969a, ((a) obj).f5969a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5969a.hashCode();
        }

        public String toString() {
            return this.f5969a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(G.w(a()), false);
    }

    public final f d() {
        return new c(G.w(a()), true);
    }
}
