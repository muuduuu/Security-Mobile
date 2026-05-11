package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1555w;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1548o {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C1548o f16427b;

    /* renamed from: c, reason: collision with root package name */
    static final C1548o f16428c = new C1548o(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f16429a = Collections.emptyMap();

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f16430a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16431b;

        a(Object obj, int i10) {
            this.f16430a = obj;
            this.f16431b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16430a == aVar.f16430a && this.f16431b == aVar.f16431b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f16430a) * 65535) + this.f16431b;
        }
    }

    C1548o(boolean z10) {
    }

    public static C1548o b() {
        if (b0.f16333d) {
            return f16428c;
        }
        C1548o c1548o = f16427b;
        if (c1548o == null) {
            synchronized (C1548o.class) {
                try {
                    c1548o = f16427b;
                    if (c1548o == null) {
                        c1548o = AbstractC1547n.a();
                        f16427b = c1548o;
                    }
                } finally {
                }
            }
        }
        return c1548o;
    }

    public AbstractC1555w.c a(P p10, int i10) {
        android.support.v4.media.session.b.a(this.f16429a.get(new a(p10, i10)));
        return null;
    }
}
