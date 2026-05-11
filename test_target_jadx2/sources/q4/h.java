package q4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.D;
import kotlin.jvm.internal.Intrinsics;
import lc.z;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f38764a = new h();

    private h() {
    }

    private final boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        Iterable B10 = AbstractC3574i.B(bArr);
        if (!(B10 instanceof Collection) || !((Collection) B10).isEmpty()) {
            Iterator it = B10.iterator();
            while (it.hasNext()) {
                int a10 = ((D) it).a();
                if (((byte) str.charAt(a10)) != bArr[a10]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final int b(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        h hVar = f38764a;
        return (hVar.e(stream) << 8) | hVar.e(stream);
    }

    private final String c(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append((char) (z.c(b10) & 65535));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "str.toString()");
        return sb3;
    }

    private final int d(InputStream inputStream) {
        int e10 = e(inputStream);
        int e11 = e(inputStream);
        return (e(inputStream) << 24) | (e(inputStream) << 16) | (e11 << 8) | e10;
    }

    private final int e(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    public static final Pair f(InputStream stream) {
        h hVar;
        Intrinsics.checkNotNullParameter(stream, "stream");
        byte[] bArr = new byte[4];
        try {
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            try {
                stream.read(bArr);
                hVar = f38764a;
            } catch (IOException e11) {
                e11.printStackTrace();
                stream.close();
            }
            if (!hVar.a(bArr, "RIFF")) {
                return null;
            }
            hVar.d(stream);
            stream.read(bArr);
            if (!hVar.a(bArr, "WEBP")) {
                try {
                    stream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                return null;
            }
            stream.read(bArr);
            String c10 = hVar.c(bArr);
            int hashCode = c10.hashCode();
            if (hashCode != 2640674) {
                if (hashCode != 2640718) {
                    if (hashCode == 2640730 && c10.equals("VP8X")) {
                        Pair i10 = hVar.i(stream);
                        try {
                            stream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        return i10;
                    }
                } else if (c10.equals("VP8L")) {
                    Pair h10 = hVar.h(stream);
                    try {
                        stream.close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                    return h10;
                }
            } else if (c10.equals("VP8 ")) {
                Pair g10 = hVar.g(stream);
                try {
                    stream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
                return g10;
            }
            stream.close();
            return null;
        } finally {
            try {
                stream.close();
            } catch (IOException e16) {
                e16.printStackTrace();
            }
        }
    }

    private final Pair g(InputStream inputStream) {
        inputStream.skip(7L);
        int e10 = e(inputStream);
        int e11 = e(inputStream);
        int e12 = e(inputStream);
        if (e10 == 157 && e11 == 1 && e12 == 42) {
            return new Pair(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    private final Pair h(InputStream inputStream) {
        d(inputStream);
        if (e(inputStream) != 47) {
            return null;
        }
        int read = inputStream.read() & 255;
        int read2 = inputStream.read();
        return new Pair(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((read2 & 192) >> 6)) + 1));
    }

    private final Pair i(InputStream inputStream) {
        inputStream.skip(8L);
        return new Pair(Integer.valueOf(j(inputStream) + 1), Integer.valueOf(j(inputStream) + 1));
    }

    private final int j(InputStream inputStream) {
        return (e(inputStream) << 16) | (e(inputStream) << 8) | e(inputStream);
    }
}
