package D5;

/* loaded from: classes2.dex */
public abstract class o {

    public static abstract class a extends o {
    }

    public abstract Class c();

    public boolean d(B b10, Object obj) {
        return obj == null;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(Object obj, com.fasterxml.jackson.core.f fVar, B b10);

    public void g(Object obj, com.fasterxml.jackson.core.f fVar, B b10, M5.g gVar) {
        Class<?> c10 = c();
        if (c10 == null) {
            c10 = obj.getClass();
        }
        b10.j(c10, String.format("Type id handling not implemented for type %s (by serializer of type %s)", c10.getName(), getClass().getName()));
    }

    public boolean i() {
        return false;
    }

    public o h(T5.m mVar) {
        return this;
    }
}
