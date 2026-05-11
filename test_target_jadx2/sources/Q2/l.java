package Q2;

import android.content.Context;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import pe.C3877e;
import pe.InterfaceC3879g;
import pe.M;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8101a;

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8101a = context;
    }

    public final boolean a(String str) {
        return str == null || str.length() == 0 || StringsKt.r(str, "identity", true) || StringsKt.r(str, "gzip", true);
    }

    public final InterfaceC3879g b(InterfaceC3879g input, boolean z10) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (z10) {
            pe.r rVar = new pe.r(input);
            try {
                input = M.c(rVar);
                kotlin.io.c.a(rVar, null);
                Intrinsics.checkNotNullExpressionValue(input, "{\n        val source = GzipSource(input)\n        source.use { Okio.buffer(it) }\n    }");
            } finally {
            }
        }
        return input;
    }

    public final boolean c(C3877e buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        try {
            C3877e c3877e = new C3877e();
            buffer.l(c3877e, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            int i10 = 0;
            do {
                i10++;
                if (c3877e.p0()) {
                    break;
                }
                int Q10 = c3877e.Q();
                if (Character.isISOControl(Q10) && !Character.isWhitespace(Q10)) {
                    return false;
                }
            } while (i10 < 16);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final String d(C3877e buffer, Charset charset, long j10) {
        String m10;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(charset, "charset");
        long size = buffer.size();
        try {
            m10 = buffer.N(Math.min(size, j10), charset);
            Intrinsics.checkNotNullExpressionValue(m10, "buffer.readString(maxBytes, charset)");
        } catch (EOFException unused) {
            m10 = Intrinsics.m(BuildConfig.FLAVOR, this.f8101a.getString(K2.g.f5225d));
        }
        return size > j10 ? Intrinsics.m(m10, this.f8101a.getString(K2.g.f5222a)) : m10;
    }
}
