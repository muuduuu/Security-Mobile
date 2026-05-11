package t6;

import t6.C4626e;

/* renamed from: t6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4632k {

    /* renamed from: t6.k$a */
    public static abstract class a {
        public abstract AbstractC4632k a();

        public abstract a b(AbstractC4622a abstractC4622a);

        public abstract a c(b bVar);
    }

    /* renamed from: t6.k$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i10) {
            this.value = i10;
        }
    }

    public static a a() {
        return new C4626e.b();
    }

    public abstract AbstractC4622a b();

    public abstract b c();
}
