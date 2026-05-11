package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f36524a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f36525b;

    public interface a {
        int getNumber();
    }

    public interface b {
        a a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f36524a = bArr;
        f36525b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return x.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
