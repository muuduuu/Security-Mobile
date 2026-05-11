package S3;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.D;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8745a = new e();

    private e() {
    }

    public static final byte[] a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Charset forName = Charset.forName("ASCII");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = value.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static final boolean b(byte[] byteArray, byte[] pattern, int i10) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (pattern.length + i10 > byteArray.length) {
            return false;
        }
        Iterable B10 = AbstractC3574i.B(pattern);
        if (!(B10 instanceof Collection) || !((Collection) B10).isEmpty()) {
            Iterator it = B10.iterator();
            while (it.hasNext()) {
                int a10 = ((D) it).a();
                if (byteArray[i10 + a10] != pattern[a10]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean c(byte[] byteArray, byte[] pattern) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return b(byteArray, pattern, 0);
    }
}
