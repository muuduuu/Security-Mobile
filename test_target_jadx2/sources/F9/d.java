package F9;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Lazy;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lc.i;
import org.conscrypt.BuildConfig;
import xc.m;
import z9.InterfaceC5264a;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2658a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Lazy f2659b = i.a(b.f2661a);

    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f2660a = new a();

        a() {
            super(1);
        }

        public final CharSequence a(byte b10) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).byteValue());
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2661a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(InterfaceC5264a.f45781a.a().j().c());
        }
    }

    private d() {
    }

    private final boolean b() {
        return ((Boolean) f2659b.getValue()).booleanValue();
    }

    private final String d(byte[] bArr, String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(bArr);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return AbstractC3574i.Q(digest, BuildConfig.FLAVOR, null, null, 0, null, a.f2660a, 30, null);
    }

    public static /* synthetic */ String e(d dVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "SHA-256";
        }
        return dVar.c(str, str2);
    }

    public static /* synthetic */ void g(d dVar, String str, String str2, Throwable th, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "Gobbler";
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        dVar.f(str, str2, th);
    }

    public final long a(int i10, int i11, long j10) {
        double d10 = i11;
        return (long) kotlin.ranges.d.f(d10 + (h() * Math.pow(2.0d, i10) * d10 * ((1 + h()) / 2) * 3), j10);
    }

    public final String c(String input, String algorithm) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return d(bytes, algorithm);
    }

    public final void f(String tag, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (b()) {
            Ge.a.f3026a.d(tag).a(th, str, new Object[0]);
        }
    }

    public final double h() {
        return ThreadLocalRandom.current().nextDouble();
    }
}
