package pe;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import pe.C3880h;

/* renamed from: pe.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3873a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f38643a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f38644b;

    static {
        C3880h.a aVar = C3880h.f38683d;
        f38643a = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").q();
        f38644b = aVar.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").q();
    }

    public static final byte[] a(String str) {
        int i10;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i11 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            char charAt2 = str.charAt(i15);
            if ('A' <= charAt2 && charAt2 < '[') {
                i10 = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i10 = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
                i10 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i10 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i10 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i13 = (i13 << 6) | i10;
            i12++;
            if (i12 % 4 == 0) {
                bArr[i14] = (byte) (i13 >> 16);
                int i16 = i14 + 2;
                bArr[i14 + 1] = (byte) (i13 >> 8);
                i14 += 3;
                bArr[i16] = (byte) i13;
            }
        }
        int i17 = i12 % 4;
        if (i17 == 1) {
            return null;
        }
        if (i17 == 2) {
            bArr[i14] = (byte) ((i13 << 12) >> 16);
            i14++;
        } else if (i17 == 3) {
            int i18 = i13 << 6;
            int i19 = i14 + 1;
            bArr[i14] = (byte) (i18 >> 16);
            i14 += 2;
            bArr[i19] = (byte) (i18 >> 8);
        }
        if (i14 == i11) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i14);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] map) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr2[i11] = map[(b10 & 255) >> 2];
            bArr2[i11 + 1] = map[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            bArr2[i11] = map[(b13 & 255) >> 2];
            bArr2[i11 + 1] = map[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i14];
            bArr2[i11] = map[(b14 & 255) >> 2];
            bArr2[i11 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i11 + 2] = map[(b15 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        return f0.c(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f38643a;
        }
        return b(bArr, bArr2);
    }
}
