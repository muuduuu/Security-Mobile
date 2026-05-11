package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1540g implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1540g f16347b = new i(AbstractC1557y.f16479d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f16348c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator f16349d;

    /* renamed from: a, reason: collision with root package name */
    private int f16350a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.g$a */
    class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f16351a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f16352b;

        a() {
            this.f16352b = AbstractC1540g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.InterfaceC0280g
        public byte e() {
            int i10 = this.f16351a;
            if (i10 >= this.f16352b) {
                throw new NoSuchElementException();
            }
            this.f16351a = i10 + 1;
            return AbstractC1540g.this.u(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16351a < this.f16352b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1540g abstractC1540g, AbstractC1540g abstractC1540g2) {
            InterfaceC0280g v10 = abstractC1540g.v();
            InterfaceC0280g v11 = abstractC1540g2.v();
            while (v10.hasNext() && v11.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC1540g.E(v10.e())).compareTo(Integer.valueOf(AbstractC1540g.E(v11.e())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC1540g.size()).compareTo(Integer.valueOf(abstractC1540g2.size()));
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    static abstract class c implements InterfaceC0280g {
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

    /* renamed from: androidx.datastore.preferences.protobuf.g$d */
    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$e */
    private static final class e extends i {

        /* renamed from: f, reason: collision with root package name */
        private final int f16354f;

        /* renamed from: g, reason: collision with root package name */
        private final int f16355g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            AbstractC1540g.j(i10, i10 + i11, bArr.length);
            this.f16354f = i10;
            this.f16355g = i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.i
        protected int M() {
            return this.f16354f;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.i, androidx.datastore.preferences.protobuf.AbstractC1540g
        public byte e(int i10) {
            AbstractC1540g.h(i10, size());
            return this.f16356e[this.f16354f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.i, androidx.datastore.preferences.protobuf.AbstractC1540g
        public int size() {
            return this.f16355g;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.i, androidx.datastore.preferences.protobuf.AbstractC1540g
        protected void t(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f16356e, M() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.i, androidx.datastore.preferences.protobuf.AbstractC1540g
        byte u(int i10) {
            return this.f16356e[this.f16354f + i10];
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$f */
    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0280g extends Iterator {
        byte e();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$h */
    static abstract class h extends AbstractC1540g {
        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.v();
        }

        private h() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$i */
    private static class i extends h {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f16356e;

        i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f16356e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        public final AbstractC1540g B(int i10, int i11) {
            int j10 = AbstractC1540g.j(i10, i11, size());
            return j10 == 0 ? AbstractC1540g.f16347b : new e(this.f16356e, M() + i10, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        final void J(AbstractC1539f abstractC1539f) {
            abstractC1539f.a(this.f16356e, M(), size());
        }

        final boolean L(AbstractC1540g abstractC1540g, int i10, int i11) {
            if (i11 > abstractC1540g.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > abstractC1540g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC1540g.size());
            }
            if (!(abstractC1540g instanceof i)) {
                return abstractC1540g.B(i10, i12).equals(B(0, i11));
            }
            i iVar = (i) abstractC1540g;
            byte[] bArr = this.f16356e;
            byte[] bArr2 = iVar.f16356e;
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

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        public byte e(int i10) {
            return this.f16356e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1540g) || size() != ((AbstractC1540g) obj).size()) {
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

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        public int size() {
            return this.f16356e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        protected void t(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f16356e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        byte u(int i10) {
            return this.f16356e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g
        protected final int w(int i10, int i11, int i12) {
            return AbstractC1557y.g(i10, this.f16356e, M() + i11, i12);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$j */
    private static final class j implements f {
        private j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1540g.f
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
        f16348c = AbstractC1537d.c() ? new j(aVar) : new d(aVar);
        f16349d = new b();
    }

    AbstractC1540g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(byte b10) {
        return b10 & 255;
    }

    private String F() {
        if (size() <= 50) {
            return k0.a(this);
        }
        return k0.a(B(0, 47)) + "...";
    }

    static AbstractC1540g G(byte[] bArr) {
        return new i(bArr);
    }

    static AbstractC1540g I(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
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

    public static AbstractC1540g k(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC1540g m(byte[] bArr, int i10, int i11) {
        j(i10, i10 + i11, bArr.length);
        return new i(f16348c.a(bArr, i10, i11));
    }

    public static AbstractC1540g r(String str) {
        return new i(str.getBytes(AbstractC1557y.f16477b));
    }

    protected final int A() {
        return this.f16350a;
    }

    public abstract AbstractC1540g B(int i10, int i11);

    public final byte[] D() {
        int size = size();
        if (size == 0) {
            return AbstractC1557y.f16479d;
        }
        byte[] bArr = new byte[size];
        t(bArr, 0, 0, size);
        return bArr;
    }

    abstract void J(AbstractC1539f abstractC1539f);

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f16350a;
        if (i10 == 0) {
            int size = size();
            i10 = w(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f16350a = i10;
        }
        return i10;
    }

    public abstract int size();

    protected abstract void t(byte[] bArr, int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), F());
    }

    abstract byte u(int i10);

    public InterfaceC0280g v() {
        return new a();
    }

    protected abstract int w(int i10, int i11, int i12);
}
