package s6;

/* renamed from: s6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4318d {
    public static AbstractC4318d e(Object obj) {
        return new C4315a(null, obj, EnumC4319e.DEFAULT, null);
    }

    public static AbstractC4318d f(Object obj, AbstractC4320f abstractC4320f) {
        return new C4315a(null, obj, EnumC4319e.DEFAULT, abstractC4320f);
    }

    public static AbstractC4318d g(Object obj) {
        return new C4315a(null, obj, EnumC4319e.VERY_LOW, null);
    }

    public abstract Integer a();

    public abstract Object b();

    public abstract EnumC4319e c();

    public abstract AbstractC4320f d();
}
