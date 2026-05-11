package u6;

import android.util.Base64;
import org.conscrypt.BuildConfig;
import s6.EnumC4319e;
import u6.d;

/* loaded from: classes2.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC4319e enumC4319e);
    }

    public static a a() {
        return new d.b().d(EnumC4319e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC4319e d();

    public boolean e() {
        return c() != null;
    }

    public o f(EnumC4319e enumC4319e) {
        return a().b(b()).d(enumC4319e).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2));
    }
}
