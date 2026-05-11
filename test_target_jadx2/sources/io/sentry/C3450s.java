package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: io.sentry.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3450s implements J {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f35489b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final Q f35490a;

    public C3450s(Q q10) {
        this.f35490a = q10;
    }

    private C3419i1 b(byte[] bArr, int i10, int i11) {
        return (C3419i1) this.f35490a.c(new StringReader(new String(bArr, i10, i11, f35489b)), C3419i1.class);
    }

    private C3474z1 c(byte[] bArr, int i10, int i11) {
        return (C3474z1) this.f35490a.c(new StringReader(new String(bArr, i10, i11, f35489b)), C3474z1.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        r11 = new io.sentry.C3416h1(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
    
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3416h1 a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i11 == -1 && i12 < read) {
                        if (bArr[i12] == 10) {
                            i11 = i10 + i12;
                            break;
                        }
                        i12++;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i10 += read;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        C3419i1 b10 = b(byteArray, 0, i11);
        if (b10 == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i13 = i11 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i14 = i13;
            while (true) {
                if (i14 >= byteArray.length) {
                    i14 = -1;
                    break;
                }
                if (byteArray[i14] == 10) {
                    break;
                }
                i14++;
            }
            if (i14 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            C3474z1 c10 = c(byteArray, i13, i14 - i13);
            if (c10 == null || c10.a() <= 0) {
                break;
            }
            int a10 = c10.a() + i14;
            int i15 = a10 + 1;
            if (i15 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i15 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new C3471y1(c10, Arrays.copyOfRange(byteArray, i14 + 1, i15)));
            if (i15 == byteArray.length) {
                break;
            }
            i13 = a10 + 2;
            if (i13 == byteArray.length) {
                if (byteArray[i15] != 10) {
                    throw new IllegalArgumentException("Envelope has invalid data following an item.");
                }
            }
        }
    }
}
