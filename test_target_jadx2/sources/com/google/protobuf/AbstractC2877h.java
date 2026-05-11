package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2877h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2877h f28729b = new i(AbstractC2893y.f28821d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f28730c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator f28731d;

    /* renamed from: a, reason: collision with root package name */
    private int f28732a = 0;

    /* renamed from: com.google.protobuf.h$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f28733a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f28734b;

        a() {
            this.f28734b = AbstractC2877h.this.size();
        }

        @Override // com.google.protobuf.AbstractC2877h.g
        public byte e() {
            int i10 = this.f28733a;
            if (i10 >= this.f28734b) {
                throw new NoSuchElementException();
            }
            this.f28733a = i10 + 1;
            return AbstractC2877h.this.t(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28733a < this.f28734b;
        }
    }

    /* renamed from: com.google.protobuf.h$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC2877h abstractC2877h, AbstractC2877h abstractC2877h2) {
            g v10 = abstractC2877h.v();
            g v11 = abstractC2877h2.v();
            while (v10.hasNext() && v11.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC2877h.D(v10.e())).compareTo(Integer.valueOf(AbstractC2877h.D(v11.e())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC2877h.size()).compareTo(Integer.valueOf(abstractC2877h2.size()));
        }
    }

    /* renamed from: com.google.protobuf.h$c */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(e());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.h$d */
    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.AbstractC2877h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.h$e */
    private static final class e extends i {

        /* renamed from: f, reason: collision with root package name */
        private final int f28736f;

        /* renamed from: g, reason: collision with root package name */
        private final int f28737g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC2877h.j(i10, i10 + i11, bArr.length);
            this.f28736f = i10;
            this.f28737g = i11;
        }

        @Override // com.google.protobuf.AbstractC2877h.i
        protected int M() {
            return this.f28736f;
        }

        @Override // com.google.protobuf.AbstractC2877h.i, com.google.protobuf.AbstractC2877h
        public byte e(int i10) {
            AbstractC2877h.h(i10, size());
            return this.f28738e[this.f28736f + i10];
        }

        @Override // com.google.protobuf.AbstractC2877h.i, com.google.protobuf.AbstractC2877h
        public int size() {
            return this.f28737g;
        }

        @Override // com.google.protobuf.AbstractC2877h.i, com.google.protobuf.AbstractC2877h
        byte t(int i10) {
            return this.f28738e[this.f28736f + i10];
        }
    }

    /* renamed from: com.google.protobuf.h$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: com.google.protobuf.h$g */
    public interface g extends Iterator {
        byte e();
    }

    /* renamed from: com.google.protobuf.h$h, reason: collision with other inner class name */
    static abstract class AbstractC0424h extends AbstractC2877h {
        AbstractC0424h() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.v();
        }
    }

    /* renamed from: com.google.protobuf.h$i */
    private static class i extends AbstractC0424h {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f28738e;

        i(byte[] bArr) {
            bArr.getClass();
            this.f28738e = bArr;
        }

        @Override // com.google.protobuf.AbstractC2877h
        public final AbstractC2877h B(int i10, int i11) {
            int j10 = AbstractC2877h.j(i10, i11, size());
            return j10 == 0 ? AbstractC2877h.f28729b : new e(this.f28738e, M() + i10, j10);
        }

        @Override // com.google.protobuf.AbstractC2877h
        protected final String F(Charset charset) {
            return new String(this.f28738e, M(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC2877h
        final void J(AbstractC2876g abstractC2876g) {
            abstractC2876g.a(this.f28738e, M(), size());
        }

        final boolean L(AbstractC2877h abstractC2877h, int i10, int i11) {
            if (i11 > abstractC2877h.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC2877h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2877h.size());
            }
            if (!(abstractC2877h instanceof i)) {
                return abstractC2877h.B(i10, i12).equals(B(0, i11));
            }
            i iVar = (i) abstractC2877h;
            byte[] bArr = this.f28738e;
            byte[] bArr2 = iVar.f28738e;
            int M10 = M() + i11;
            int M11 = M();
            int M12 = iVar.M() + i10;
            while (M11 < M10) {
                if (bArr[M11] != bArr2[M12]) {
                    return false;
                }
                M11++;
                M12++;
            }
            return true;
        }

        protected int M() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC2877h
        public byte e(int i10) {
            return this.f28738e[i10];
        }

        @Override // com.google.protobuf.AbstractC2877h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC2877h) || size() != ((AbstractC2877h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int A10 = A();
            int A11 = iVar.A();
            if (A10 == 0 || A11 == 0 || A10 == A11) {
                return L(iVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC2877h
        public int size() {
            return this.f28738e.length;
        }

        @Override // com.google.protobuf.AbstractC2877h
        byte t(int i10) {
            return this.f28738e[i10];
        }

        @Override // com.google.protobuf.AbstractC2877h
        public final boolean u() {
            int M10 = M();
            return n0.n(this.f28738e, M10, size() + M10);
        }

        @Override // com.google.protobuf.AbstractC2877h
        protected final int w(int i10, int i11, int i12) {
            return AbstractC2893y.h(i10, this.f28738e, M() + i11, i12);
        }
    }

    /* renamed from: com.google.protobuf.h$j */
    private static final class j implements f {
        private j() {
        }

        @Override // com.google.protobuf.AbstractC2877h.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f28730c = AbstractC2873d.c() ? new j(aVar) : new d(aVar);
        f28731d = new b();
    }

    AbstractC2877h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int D(byte b10) {
        return b10 & 255;
    }

    private String I() {
        if (size() <= 50) {
            return g0.a(this);
        }
        return g0.a(B(0, 47)) + "...";
    }

    static void h(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int j(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static AbstractC2877h k(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC2877h m(byte[] bArr, int i10, int i11) {
        j(i10, i10 + i11, bArr.length);
        return new i(f28730c.a(bArr, i10, i11));
    }

    public static AbstractC2877h r(String str) {
        return new i(str.getBytes(AbstractC2893y.f28819b));
    }

    protected final int A() {
        return this.f28732a;
    }

    public abstract AbstractC2877h B(int i10, int i11);

    public final String E(Charset charset) {
        return size() == 0 ? BuildConfig.FLAVOR : F(charset);
    }

    protected abstract String F(Charset charset);

    public final String G() {
        return E(AbstractC2893y.f28819b);
    }

    abstract void J(AbstractC2876g abstractC2876g);

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f28732a;
        if (i10 == 0) {
            int size = size();
            i10 = w(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f28732a = i10;
        }
        return i10;
    }

    public abstract int size();

    abstract byte t(int i10);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), I());
    }

    public abstract boolean u();

    public g v() {
        return new a();
    }

    protected abstract int w(int i10, int i11, int i12);
}
