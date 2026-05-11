package t6;

import java.util.List;
import t6.C4628g;

/* renamed from: t6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4634m {

    /* renamed from: t6.m$a */
    public static abstract class a {
        public abstract AbstractC4634m a();

        public abstract a b(AbstractC4632k abstractC4632k);

        public abstract a c(List list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(EnumC4637p enumC4637p);

        public abstract a g(long j10);

        public abstract a h(long j10);

        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new C4628g.b();
    }

    public abstract AbstractC4632k b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract EnumC4637p f();

    public abstract long g();

    public abstract long h();
}
