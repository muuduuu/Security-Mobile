package V;

import V.C1251n;
import android.util.Range;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f10437a = new Range(0, Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final Range f10438b = new Range(0, Integer.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final C1261y f10439c;

    public static abstract class a {
        a() {
        }

        public abstract B0 a();

        abstract a b(int i10);

        public abstract a c(Range range);

        public abstract a d(Range range);

        public abstract a e(C1261y c1261y);
    }

    static {
        AbstractC1258v abstractC1258v = AbstractC1258v.f10728c;
        f10439c = C1261y.e(Arrays.asList(abstractC1258v, AbstractC1258v.f10727b, AbstractC1258v.f10726a), AbstractC1253p.a(abstractC1258v));
    }

    B0() {
    }

    public static a a() {
        return new C1251n.b().e(f10439c).d(f10437a).c(f10438b).b(-1);
    }

    abstract int b();

    public abstract Range c();

    public abstract Range d();

    public abstract C1261y e();

    public abstract a f();
}
