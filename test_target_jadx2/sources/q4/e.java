package q4;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f38757a = new e();

    private e() {
    }

    public static final int a(int i10) {
        return g.a(i10);
    }

    public static final int b(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        try {
            int d10 = f38757a.d(inputStream);
            if (d10 == 0) {
                return 0;
            }
            return g.d(inputStream, d10);
        } catch (IOException unused) {
            return 0;
        }
    }

    private final boolean c(int i10) {
        switch (i10) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    private final int d(InputStream inputStream) {
        if (e(inputStream, 225)) {
            int a10 = f.a(inputStream, 2, false);
            if (a10 - 2 > 6) {
                int a11 = f.a(inputStream, 4, false);
                int a12 = f.a(inputStream, 2, false);
                int i10 = a10 - 8;
                if (a11 == 1165519206 && a12 == 0) {
                    return i10;
                }
            }
        }
        return 0;
    }

    public static final boolean e(InputStream inputStream, int i10) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        while (f.a(inputStream, 1, false) == 255) {
            int i11 = 255;
            while (i11 == 255) {
                i11 = f.a(inputStream, 1, false);
            }
            if ((i10 != 192 || !f38757a.c(i11)) && i11 != i10) {
                if (i11 != 1 && i11 != 216) {
                    if (i11 == 217 || i11 == 218) {
                        break;
                    }
                    inputStream.skip(f.a(inputStream, 2, false) - 2);
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
