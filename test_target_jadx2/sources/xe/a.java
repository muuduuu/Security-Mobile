package xe;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class a {

    /* renamed from: d, reason: collision with root package name */
    private InputStream f45034d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45035e;

    /* renamed from: f, reason: collision with root package name */
    long f45036f;

    /* renamed from: g, reason: collision with root package name */
    int f45037g;

    /* renamed from: h, reason: collision with root package name */
    private int f45038h;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f45031a = new byte[4160];

    /* renamed from: b, reason: collision with root package name */
    private final int[] f45032b = new int[1040];

    /* renamed from: c, reason: collision with root package name */
    private final i f45033c = new i();

    /* renamed from: i, reason: collision with root package name */
    private int f45039i = 0;

    a() {
    }

    static void a(a aVar, boolean z10) {
        if (aVar.f45035e) {
            int i10 = ((aVar.f45038h << 2) + ((aVar.f45037g + 7) >> 3)) - 8;
            int i11 = aVar.f45039i;
            if (i10 > i11) {
                throw new c("Read after end");
            }
            if (z10 && i10 != i11) {
                throw new c("Unused bytes after end");
            }
        }
    }

    static void b(a aVar) {
        InputStream inputStream = aVar.f45034d;
        aVar.f45034d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void c(a aVar, byte[] bArr, int i10, int i11) {
        if ((aVar.f45037g & 7) != 0) {
            throw new c("Unaligned copyBytes");
        }
        while (true) {
            int i12 = aVar.f45037g;
            if (i12 == 64 || i11 == 0) {
                break;
            }
            bArr[i10] = (byte) (aVar.f45036f >>> i12);
            aVar.f45037g = i12 + 8;
            i11--;
            i10++;
        }
        if (i11 == 0) {
            return;
        }
        int min = Math.min(f(aVar), i11 >> 2);
        if (min > 0) {
            int i13 = min << 2;
            System.arraycopy(aVar.f45031a, aVar.f45038h << 2, bArr, i10, i13);
            i10 += i13;
            i11 -= i13;
            aVar.f45038h += min;
        }
        if (i11 == 0) {
            return;
        }
        if (f(aVar) <= 0) {
            while (i11 > 0) {
                try {
                    int read = aVar.f45034d.read(bArr, i10, i11);
                    if (read == -1) {
                        throw new c("Unexpected end of input");
                    }
                    i10 += read;
                    i11 -= read;
                } catch (IOException e10) {
                    throw new c("Failed to read input", e10);
                }
            }
            return;
        }
        d(aVar);
        while (i11 != 0) {
            long j10 = aVar.f45036f;
            int i14 = aVar.f45037g;
            bArr[i10] = (byte) (j10 >>> i14);
            aVar.f45037g = i14 + 8;
            i11--;
            i10++;
        }
        a(aVar, false);
    }

    static void d(a aVar) {
        int i10 = aVar.f45037g;
        if (i10 >= 32) {
            int[] iArr = aVar.f45032b;
            aVar.f45038h = aVar.f45038h + 1;
            aVar.f45036f = (iArr[r3] << 32) | (aVar.f45036f >>> 32);
            aVar.f45037g = i10 - 32;
        }
    }

    static void e(a aVar, InputStream inputStream) {
        if (aVar.f45034d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        i.b(aVar.f45033c, aVar.f45031a, aVar.f45032b);
        aVar.f45034d = inputStream;
        aVar.f45036f = 0L;
        aVar.f45037g = 64;
        aVar.f45038h = 1024;
        aVar.f45035e = false;
        h(aVar);
    }

    static int f(a aVar) {
        return (aVar.f45035e ? (aVar.f45039i + 3) >> 2 : 1024) - aVar.f45038h;
    }

    static void g(a aVar) {
        int i10 = (64 - aVar.f45037g) & 7;
        if (i10 != 0 && i(aVar, i10) != 0) {
            throw new c("Corrupted padding bits");
        }
    }

    private static void h(a aVar) {
        j(aVar);
        a(aVar, false);
        d(aVar);
        d(aVar);
    }

    static int i(a aVar, int i10) {
        d(aVar);
        long j10 = aVar.f45036f;
        int i11 = aVar.f45037g;
        int i12 = ((int) (j10 >>> i11)) & ((1 << i10) - 1);
        aVar.f45037g = i11 + i10;
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        r4.f45035e = true;
        r4.f45039i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void j(a aVar) {
        int i10 = aVar.f45038h;
        if (i10 <= 1015) {
            return;
        }
        if (aVar.f45035e) {
            if (f(aVar) < -2) {
                throw new c("No more input");
            }
            return;
        }
        int i11 = i10 << 2;
        int i12 = 4096 - i11;
        byte[] bArr = aVar.f45031a;
        System.arraycopy(bArr, i11, bArr, 0, i12);
        aVar.f45038h = 0;
        while (true) {
            if (i12 >= 4096) {
                break;
            }
            try {
                int read = aVar.f45034d.read(aVar.f45031a, i12, 4096 - i12);
                if (read <= 0) {
                    break;
                } else {
                    i12 += read;
                }
            } catch (IOException e10) {
                throw new c("Failed to read input", e10);
            }
        }
        i.a(aVar.f45033c, i12 >> 2);
    }

    static void k(a aVar) {
        if (aVar.f45037g == 64) {
            h(aVar);
        }
    }
}
