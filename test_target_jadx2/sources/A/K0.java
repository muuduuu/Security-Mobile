package A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    private final L0 f84a;

    /* renamed from: b, reason: collision with root package name */
    private final List f85b;

    /* renamed from: c, reason: collision with root package name */
    private final List f86c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final List f87d = Arrays.asList(1, 2, 4, 3, 7);

        /* renamed from: a, reason: collision with root package name */
        private L0 f88a;

        /* renamed from: b, reason: collision with root package name */
        private final List f89b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List f90c = new ArrayList();

        private void c() {
            Iterator it = this.f90c.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public a a(J0 j02) {
            this.f89b.add(j02);
            return this;
        }

        public K0 b() {
            y0.f.b(!this.f89b.isEmpty(), "UseCase must not be empty.");
            c();
            return new K0(this.f88a, this.f89b, this.f90c);
        }
    }

    K0(L0 l02, List list, List list2) {
        this.f84a = l02;
        this.f85b = list;
        this.f86c = list2;
    }

    public List a() {
        return this.f86c;
    }

    public List b() {
        return this.f85b;
    }

    public L0 c() {
        return this.f84a;
    }
}
