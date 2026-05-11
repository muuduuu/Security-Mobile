package u6;

import s6.AbstractC4318d;
import s6.C4317c;
import s6.InterfaceC4321g;
import u6.c;

/* loaded from: classes2.dex */
abstract class n {

    public static abstract class a {
        public abstract n a();

        abstract a b(C4317c c4317c);

        abstract a c(AbstractC4318d abstractC4318d);

        abstract a d(InterfaceC4321g interfaceC4321g);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract C4317c b();

    abstract AbstractC4318d c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    abstract InterfaceC4321g e();

    public abstract o f();

    public abstract String g();
}
