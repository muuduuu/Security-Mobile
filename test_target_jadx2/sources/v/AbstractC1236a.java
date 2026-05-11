package V;

import V.C1240c;
import android.util.Range;

/* renamed from: V.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1236a {

    /* renamed from: a, reason: collision with root package name */
    public static final Range f10590a = new Range(0, Integer.MAX_VALUE);

    /* renamed from: b, reason: collision with root package name */
    public static final Range f10591b = new Range(0, Integer.MAX_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1236a f10592c = a().c(0).a();

    /* renamed from: V.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0198a {
        AbstractC0198a() {
        }

        public abstract AbstractC1236a a();

        public abstract AbstractC0198a b(Range range);

        public abstract AbstractC0198a c(int i10);

        public abstract AbstractC0198a d(Range range);

        public abstract AbstractC0198a e(int i10);
    }

    AbstractC1236a() {
    }

    public static AbstractC0198a a() {
        return new C1240c.b().f(-1).e(-1).c(-1).b(f10590a).d(f10591b);
    }

    public abstract Range b();

    public abstract int c();

    public abstract Range d();

    public abstract int e();

    public abstract int f();
}
