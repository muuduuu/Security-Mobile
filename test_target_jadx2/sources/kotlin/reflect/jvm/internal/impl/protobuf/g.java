package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.i;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f36494b = new g(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f36495a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f36496a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36497b;

        a(Object obj, int i10) {
            this.f36496a = obj;
            this.f36497b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f36496a == aVar.f36496a && this.f36497b == aVar.f36497b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f36496a) * 65535) + this.f36497b;
        }
    }

    g() {
        this.f36495a = new HashMap();
    }

    public static g c() {
        return f36494b;
    }

    public static g d() {
        return new g();
    }

    public final void a(i.f fVar) {
        this.f36495a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public i.f b(p pVar, int i10) {
        return (i.f) this.f36495a.get(new a(pVar, i10));
    }

    private g(boolean z10) {
        this.f36495a = Collections.emptyMap();
    }
}
