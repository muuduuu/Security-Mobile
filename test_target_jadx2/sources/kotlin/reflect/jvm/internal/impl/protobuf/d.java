package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class d implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public static final d f36469a = new o(new byte[0]);

    public interface a extends Iterator {
        byte e();
    }

    d() {
    }

    public static b A() {
        return new b(128);
    }

    private static d c(Iterator it, int i10) {
        if (i10 == 1) {
            return (d) it.next();
        }
        int i11 = i10 >>> 1;
        return c(it, i11).e(c(it, i10 - i11));
    }

    public static d h(Iterable iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            collection = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                collection.add((d) it.next());
            }
        }
        return collection.isEmpty() ? f36469a : c(collection.iterator(), collection.size());
    }

    public static d j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static d k(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o(bArr2);
    }

    public static d m(String str) {
        try {
            return new o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    protected abstract int B(int i10, int i11, int i12);

    protected abstract int D(int i10, int i11, int i12);

    protected abstract int E();

    public byte[] F() {
        int size = size();
        if (size == 0) {
            return j.f36524a;
        }
        byte[] bArr = new byte[size];
        t(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String G(String str);

    public String I() {
        try {
            return G("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    void J(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                L(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    abstract void L(OutputStream outputStream, int i10, int i11);

    public d e(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return t.R(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void r(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                t(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    public abstract int size();

    protected abstract void t(byte[] bArr, int i10, int i11, int i12);

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int u();

    protected abstract boolean v();

    public abstract boolean w();

    public static final class b extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f36470f = new byte[0];

        /* renamed from: a, reason: collision with root package name */
        private final int f36471a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f36472b;

        /* renamed from: c, reason: collision with root package name */
        private int f36473c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f36474d;

        /* renamed from: e, reason: collision with root package name */
        private int f36475e;

        b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f36471a = i10;
            this.f36472b = new ArrayList();
            this.f36474d = new byte[i10];
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void b(int i10) {
            this.f36472b.add(new o(this.f36474d));
            int length = this.f36473c + this.f36474d.length;
            this.f36473c = length;
            this.f36474d = new byte[Math.max(this.f36471a, Math.max(i10, length >>> 1))];
            this.f36475e = 0;
        }

        private void c() {
            int i10 = this.f36475e;
            byte[] bArr = this.f36474d;
            if (i10 >= bArr.length) {
                this.f36472b.add(new o(this.f36474d));
                this.f36474d = f36470f;
            } else if (i10 > 0) {
                this.f36472b.add(new o(a(bArr, i10)));
            }
            this.f36473c += this.f36475e;
            this.f36475e = 0;
        }

        public synchronized d d() {
            c();
            return d.h(this.f36472b);
        }

        public synchronized int size() {
            return this.f36473c + this.f36475e;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f36475e == this.f36474d.length) {
                    b(1);
                }
                byte[] bArr = this.f36474d;
                int i11 = this.f36475e;
                this.f36475e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f36474d;
                int length = bArr2.length;
                int i12 = this.f36475e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f36475e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    b(i13);
                    System.arraycopy(bArr, i10 + length2, this.f36474d, 0, i13);
                    this.f36475e = i13;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
