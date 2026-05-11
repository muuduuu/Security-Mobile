package ba;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ba.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1665c implements Closeable, Iterable {

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f18888m = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    final RandomAccessFile f18889a;

    /* renamed from: b, reason: collision with root package name */
    final File f18890b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f18891c;

    /* renamed from: d, reason: collision with root package name */
    final int f18892d;

    /* renamed from: e, reason: collision with root package name */
    long f18893e;

    /* renamed from: f, reason: collision with root package name */
    int f18894f;

    /* renamed from: g, reason: collision with root package name */
    b f18895g;

    /* renamed from: h, reason: collision with root package name */
    private b f18896h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f18897i;

    /* renamed from: j, reason: collision with root package name */
    int f18898j = 0;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f18899k;

    /* renamed from: l, reason: collision with root package name */
    boolean f18900l;

    /* renamed from: ba.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final File f18901a;

        /* renamed from: b, reason: collision with root package name */
        boolean f18902b = true;

        /* renamed from: c, reason: collision with root package name */
        boolean f18903c = false;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f18901a = file;
        }

        public C1665c a() {
            RandomAccessFile r10 = C1665c.r(this.f18901a, this.f18903c);
            try {
                return new C1665c(this.f18901a, r10, this.f18902b, this.f18903c);
            } catch (Throwable th) {
                r10.close();
                throw th;
            }
        }
    }

    /* renamed from: ba.c$b */
    static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f18904c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final long f18905a;

        /* renamed from: b, reason: collision with root package name */
        final int f18906b;

        b(long j10, int i10) {
            this.f18905a = j10;
            this.f18906b = i10;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position=" + this.f18905a + ", length=" + this.f18906b + "]";
        }
    }

    /* renamed from: ba.c$c, reason: collision with other inner class name */
    private final class C0327c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f18907a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f18908b;

        /* renamed from: c, reason: collision with root package name */
        int f18909c;

        C0327c() {
            this.f18908b = C1665c.this.f18895g.f18905a;
            this.f18909c = C1665c.this.f18898j;
        }

        private void a() {
            if (C1665c.this.f18898j != this.f18909c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (C1665c.this.f18900l) {
                throw new IllegalStateException("closed");
            }
            a();
            if (C1665c.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f18907a;
            C1665c c1665c = C1665c.this;
            if (i10 >= c1665c.f18894f) {
                throw new NoSuchElementException();
            }
            try {
                b F10 = c1665c.F(this.f18908b);
                byte[] bArr = new byte[F10.f18906b];
                long e22 = C1665c.this.e2(F10.f18905a + 4);
                this.f18908b = e22;
                C1665c.this.m1(e22, bArr, 0, F10.f18906b);
                this.f18908b = C1665c.this.e2(F10.f18905a + 4 + F10.f18906b);
                this.f18907a++;
                return bArr;
            } catch (IOException e10) {
                throw ((Error) C1665c.j(e10));
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (C1665c.this.f18900l) {
                throw new IllegalStateException("closed");
            }
            a();
            return this.f18907a != C1665c.this.f18894f;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            if (C1665c.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f18907a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                C1665c.this.a1();
                this.f18909c = C1665c.this.f18898j;
                this.f18907a--;
            } catch (IOException e10) {
                throw ((Error) C1665c.j(e10));
            }
        }
    }

    C1665c(File file, RandomAccessFile randomAccessFile, boolean z10, boolean z11) {
        long I10;
        long I11;
        byte[] bArr = new byte[32];
        this.f18897i = bArr;
        this.f18890b = file;
        this.f18889a = randomAccessFile;
        this.f18899k = z10;
        randomAccessFile.seek(0L);
        randomAccessFile.readFully(bArr);
        boolean z12 = (z11 || (bArr[0] & 128) == 0) ? false : true;
        this.f18891c = z12;
        if (z12) {
            this.f18892d = 32;
            int I12 = I(bArr, 0) & Integer.MAX_VALUE;
            if (I12 != 1) {
                throw new IOException("Unable to read version " + I12 + " format. Supported versions are 1 and legacy.");
            }
            this.f18893e = y0(bArr, 4);
            this.f18894f = I(bArr, 12);
            I10 = y0(bArr, 16);
            I11 = y0(bArr, 24);
        } else {
            this.f18892d = 16;
            this.f18893e = I(bArr, 0);
            this.f18894f = I(bArr, 4);
            I10 = I(bArr, 8);
            I11 = I(bArr, 12);
        }
        if (this.f18893e > randomAccessFile.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f18893e + ", Actual length: " + randomAccessFile.length());
        }
        if (this.f18893e > this.f18892d) {
            this.f18895g = F(I10);
            this.f18896h = F(I11);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f18893e + ") is invalid.");
        }
    }

    private static int I(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private long Z0() {
        return this.f18893e - v1();
    }

    private void e(long j10) {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long Z02 = Z0();
        if (Z02 >= j13) {
            return;
        }
        long j14 = this.f18893e;
        while (true) {
            Z02 += j14;
            j11 = j14 << 1;
            if (Z02 >= j13) {
                break;
            } else {
                j14 = j11;
            }
        }
        t1(j11);
        long e22 = e2(this.f18896h.f18905a + 4 + r2.f18906b);
        if (e22 <= this.f18895g.f18905a) {
            FileChannel channel = this.f18889a.getChannel();
            channel.position(this.f18893e);
            int i10 = this.f18892d;
            j12 = e22 - i10;
            if (channel.transferTo(i10, j12, channel) != j12) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j12 = 0;
        }
        long j15 = j12;
        long j16 = this.f18896h.f18905a;
        long j17 = this.f18895g.f18905a;
        if (j16 < j17) {
            long j18 = (this.f18893e + j16) - this.f18892d;
            f2(j11, this.f18894f, j17, j18);
            this.f18896h = new b(j18, this.f18896h.f18906b);
        } else {
            f2(j11, this.f18894f, j17, j16);
        }
        this.f18893e = j11;
        if (this.f18899k) {
            i1(this.f18892d, j15);
        }
    }

    private void f2(long j10, int i10, long j11, long j12) {
        this.f18889a.seek(0L);
        if (!this.f18891c) {
            g2(this.f18897i, 0, (int) j10);
            g2(this.f18897i, 4, i10);
            g2(this.f18897i, 8, (int) j11);
            g2(this.f18897i, 12, (int) j12);
            this.f18889a.write(this.f18897i, 0, 16);
            return;
        }
        g2(this.f18897i, 0, -2147483647);
        h2(this.f18897i, 4, j10);
        g2(this.f18897i, 12, i10);
        h2(this.f18897i, 16, j11);
        h2(this.f18897i, 24, j12);
        this.f18889a.write(this.f18897i, 0, 32);
    }

    private static void g2(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void h2(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >> 56);
        bArr[i10 + 1] = (byte) (j10 >> 48);
        bArr[i10 + 2] = (byte) (j10 >> 40);
        bArr[i10 + 3] = (byte) (j10 >> 32);
        bArr[i10 + 4] = (byte) (j10 >> 24);
        bArr[i10 + 5] = (byte) (j10 >> 16);
        bArr[i10 + 6] = (byte) (j10 >> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    private void i1(long j10, long j11) {
        while (j11 > 0) {
            byte[] bArr = f18888m;
            int min = (int) Math.min(j11, bArr.length);
            o1(j10, bArr, 0, min);
            long j12 = min;
            j11 -= j12;
            j10 += j12;
        }
    }

    private void o1(long j10, byte[] bArr, int i10, int i11) {
        long e22 = e2(j10);
        long j11 = i11 + e22;
        long j12 = this.f18893e;
        if (j11 <= j12) {
            this.f18889a.seek(e22);
            this.f18889a.write(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - e22);
        this.f18889a.seek(e22);
        this.f18889a.write(bArr, i10, i12);
        this.f18889a.seek(this.f18892d);
        this.f18889a.write(bArr, i10 + i12, i11 - i12);
    }

    static RandomAccessFile r(File file, boolean z10) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile t10 = t(file2);
            try {
                t10.setLength(4096L);
                t10.seek(0L);
                if (z10) {
                    t10.writeInt(4096);
                } else {
                    t10.writeInt(-2147483647);
                    t10.writeLong(4096L);
                }
                t10.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                t10.close();
                throw th;
            }
        }
        return t(file);
    }

    private static RandomAccessFile t(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void t1(long j10) {
        this.f18889a.setLength(j10);
        this.f18889a.getChannel().force(true);
    }

    private long v1() {
        if (this.f18894f == 0) {
            return this.f18892d;
        }
        long j10 = this.f18896h.f18905a;
        long j11 = this.f18895g.f18905a;
        return j10 >= j11 ? (j10 - j11) + 4 + r0.f18906b + this.f18892d : (((j10 + 4) + r0.f18906b) + this.f18893e) - j11;
    }

    private static long y0(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 56) + ((bArr[i10 + 1] & 255) << 48) + ((bArr[i10 + 2] & 255) << 40) + ((bArr[i10 + 3] & 255) << 32) + ((bArr[i10 + 4] & 255) << 24) + ((bArr[i10 + 5] & 255) << 16) + ((bArr[i10 + 6] & 255) << 8) + (bArr[i10 + 7] & 255);
    }

    b F(long j10) {
        if (j10 == 0) {
            return b.f18904c;
        }
        m1(j10, this.f18897i, 0, 4);
        return new b(j10, I(this.f18897i, 0));
    }

    public void a1() {
        g1(1);
    }

    public void c(byte[] bArr, int i10, int i11) {
        long e22;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f18900l) {
            throw new IllegalStateException("closed");
        }
        e(i11);
        boolean isEmpty = isEmpty();
        if (isEmpty) {
            e22 = this.f18892d;
        } else {
            e22 = e2(this.f18896h.f18905a + 4 + r0.f18906b);
        }
        b bVar = new b(e22, i11);
        g2(this.f18897i, 0, i11);
        o1(bVar.f18905a, this.f18897i, 0, 4);
        o1(bVar.f18905a + 4, bArr, i10, i11);
        f2(this.f18893e, this.f18894f + 1, isEmpty ? bVar.f18905a : this.f18895g.f18905a, bVar.f18905a);
        this.f18896h = bVar;
        this.f18894f++;
        this.f18898j++;
        if (isEmpty) {
            this.f18895g = bVar;
        }
    }

    public void clear() {
        if (this.f18900l) {
            throw new IllegalStateException("closed");
        }
        f2(4096L, 0, 0L, 0L);
        if (this.f18899k) {
            this.f18889a.seek(this.f18892d);
            this.f18889a.write(f18888m, 0, 4096 - this.f18892d);
        }
        this.f18894f = 0;
        b bVar = b.f18904c;
        this.f18895g = bVar;
        this.f18896h = bVar;
        if (this.f18893e > 4096) {
            t1(4096L);
        }
        this.f18893e = 4096L;
        this.f18898j++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18900l = true;
        this.f18889a.close();
    }

    long e2(long j10) {
        long j11 = this.f18893e;
        return j10 < j11 ? j10 : (this.f18892d + j10) - j11;
    }

    public void g1(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i10 + ") number of elements.");
        }
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f18894f) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i10 > this.f18894f) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i10 + ") than present in queue (" + this.f18894f + ").");
        }
        b bVar = this.f18895g;
        long j10 = bVar.f18905a;
        int i11 = bVar.f18906b;
        long j11 = 0;
        int i12 = 0;
        long j12 = j10;
        while (i12 < i10) {
            j11 += i11 + 4;
            long e22 = e2(j12 + 4 + i11);
            m1(e22, this.f18897i, 0, 4);
            i11 = I(this.f18897i, 0);
            i12++;
            j12 = e22;
        }
        f2(this.f18893e, this.f18894f - i10, j12, this.f18896h.f18905a);
        this.f18894f -= i10;
        this.f18898j++;
        this.f18895g = new b(j12, i11);
        if (this.f18899k) {
            i1(j10, j11);
        }
    }

    public boolean isEmpty() {
        return this.f18894f == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0327c();
    }

    void m1(long j10, byte[] bArr, int i10, int i11) {
        long e22 = e2(j10);
        long j11 = i11 + e22;
        long j12 = this.f18893e;
        if (j11 <= j12) {
            this.f18889a.seek(e22);
            this.f18889a.readFully(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - e22);
        this.f18889a.seek(e22);
        this.f18889a.readFully(bArr, i10, i12);
        this.f18889a.seek(this.f18892d);
        this.f18889a.readFully(bArr, i10 + i12, i11 - i12);
    }

    public int size() {
        return this.f18894f;
    }

    public String toString() {
        return "QueueFile{file=" + this.f18890b + ", zero=" + this.f18899k + ", versioned=" + this.f18891c + ", length=" + this.f18893e + ", size=" + this.f18894f + ", first=" + this.f18895g + ", last=" + this.f18896h + '}';
    }

    public byte[] u() {
        if (this.f18900l) {
            throw new IllegalStateException("closed");
        }
        if (isEmpty()) {
            return null;
        }
        b bVar = this.f18895g;
        int i10 = bVar.f18906b;
        byte[] bArr = new byte[i10];
        m1(4 + bVar.f18905a, bArr, 0, i10);
        return bArr;
    }

    static Throwable j(Throwable th) {
        throw th;
    }
}
