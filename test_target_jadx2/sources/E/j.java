package E;

import E.i;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends FilterOutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f1851g = "Exif\u0000\u0000".getBytes(h.f1821e);

    /* renamed from: a, reason: collision with root package name */
    private final i f1852a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1853b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f1854c;

    /* renamed from: d, reason: collision with root package name */
    private int f1855d;

    /* renamed from: e, reason: collision with root package name */
    private int f1856e;

    /* renamed from: f, reason: collision with root package name */
    private int f1857f;

    static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public j(OutputStream outputStream, i iVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f1853b = new byte[1];
        this.f1854c = ByteBuffer.allocate(4);
        this.f1855d = 0;
        this.f1852a = iVar;
    }

    private int a(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f1854c.position());
        this.f1854c.put(bArr, i11, min);
        return min;
    }

    private void b(b bVar) {
        k[][] kVarArr = i.f1835i;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        for (k kVar : i.f1833g) {
            for (int i10 = 0; i10 < i.f1835i.length; i10++) {
                this.f1852a.c(i10).remove(kVar.f1859b);
            }
        }
        if (!this.f1852a.c(1).isEmpty()) {
            this.f1852a.c(0).put(i.f1833g[1].f1859b, h.f(0L, this.f1852a.d()));
        }
        if (!this.f1852a.c(2).isEmpty()) {
            this.f1852a.c(0).put(i.f1833g[2].f1859b, h.f(0L, this.f1852a.d()));
        }
        if (!this.f1852a.c(3).isEmpty()) {
            this.f1852a.c(1).put(i.f1833g[3].f1859b, h.f(0L, this.f1852a.d()));
        }
        for (int i11 = 0; i11 < i.f1835i.length; i11++) {
            Iterator it = this.f1852a.c(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int j10 = ((h) ((Map.Entry) it.next()).getValue()).j();
                if (j10 > 4) {
                    i12 += j10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < i.f1835i.length; i14++) {
            if (!this.f1852a.c(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f1852a.c(i14).size() * 12) + 6 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f1852a.c(1).isEmpty()) {
            this.f1852a.c(0).put(i.f1833g[1].f1859b, h.f(iArr[1], this.f1852a.d()));
        }
        if (!this.f1852a.c(2).isEmpty()) {
            this.f1852a.c(0).put(i.f1833g[2].f1859b, h.f(iArr[2], this.f1852a.d()));
        }
        if (!this.f1852a.c(3).isEmpty()) {
            this.f1852a.c(1).put(i.f1833g[3].f1859b, h.f(iArr[3], this.f1852a.d()));
        }
        bVar.f(i15);
        bVar.write(f1851g);
        bVar.d(this.f1852a.d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.a(this.f1852a.d());
        bVar.f(42);
        bVar.e(8L);
        for (int i16 = 0; i16 < i.f1835i.length; i16++) {
            if (!this.f1852a.c(i16).isEmpty()) {
                bVar.f(this.f1852a.c(i16).size());
                int size = iArr[i16] + 2 + (this.f1852a.c(i16).size() * 12) + 4;
                for (Map.Entry entry : this.f1852a.c(i16).entrySet()) {
                    int i17 = ((k) y0.f.h((k) ((HashMap) i.b.f1843f.get(i16)).get(entry.getKey()), "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f1858a;
                    h hVar = (h) entry.getValue();
                    int j11 = hVar.j();
                    bVar.f(i17);
                    bVar.f(hVar.f1825a);
                    bVar.c(hVar.f1826b);
                    if (j11 > 4) {
                        bVar.e(size);
                        size += j11;
                    } else {
                        bVar.write(hVar.f1828d);
                        if (j11 < 4) {
                            while (j11 < 4) {
                                bVar.b(0);
                                j11++;
                            }
                        }
                    }
                }
                bVar.e(0L);
                Iterator it2 = this.f1852a.c(i16).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((h) ((Map.Entry) it2.next()).getValue()).f1828d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0106, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0108, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int i12 = this.f1856e;
            if ((i12 > 0 || this.f1857f > 0 || this.f1855d != 2) && i11 > 0) {
                if (i12 > 0) {
                    int min = Math.min(i11, i12);
                    i11 -= min;
                    this.f1856e -= min;
                    i10 += min;
                }
                int i13 = this.f1857f;
                if (i13 > 0) {
                    int min2 = Math.min(i11, i13);
                    ((FilterOutputStream) this).out.write(bArr, i10, min2);
                    i11 -= min2;
                    this.f1857f -= min2;
                    i10 += min2;
                }
                if (i11 == 0) {
                    return;
                }
                int i14 = this.f1855d;
                if (i14 == 0) {
                    int a10 = a(2, bArr, i10, i11);
                    i10 += a10;
                    i11 -= a10;
                    if (this.f1854c.position() < 2) {
                        return;
                    }
                    this.f1854c.rewind();
                    if (this.f1854c.getShort() != -40) {
                        throw new IOException("Not a valid jpeg image, cannot write exif");
                    }
                    ((FilterOutputStream) this).out.write(this.f1854c.array(), 0, 2);
                    this.f1855d = 1;
                    this.f1854c.rewind();
                    b bVar = new b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                    bVar.d((short) -31);
                    b(bVar);
                } else if (i14 != 1) {
                    continue;
                } else {
                    int a11 = a(4, bArr, i10, i11);
                    i10 += a11;
                    i11 -= a11;
                    if (this.f1854c.position() == 2 && this.f1854c.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(this.f1854c.array(), 0, 2);
                        this.f1854c.rewind();
                    }
                    if (this.f1854c.position() < 4) {
                        return;
                    }
                    this.f1854c.rewind();
                    short s10 = this.f1854c.getShort();
                    if (s10 == -31) {
                        this.f1856e = (this.f1854c.getShort() & 65535) - 2;
                        this.f1855d = 2;
                    } else if (a.a(s10)) {
                        ((FilterOutputStream) this).out.write(this.f1854c.array(), 0, 4);
                        this.f1855d = 2;
                    } else {
                        ((FilterOutputStream) this).out.write(this.f1854c.array(), 0, 4);
                        this.f1857f = (this.f1854c.getShort() & 65535) - 2;
                    }
                    this.f1854c.rewind();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.f1853b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
