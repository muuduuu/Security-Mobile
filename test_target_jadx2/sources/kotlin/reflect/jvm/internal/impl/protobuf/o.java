package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes3.dex */
class o extends d {

    /* renamed from: b, reason: collision with root package name */
    protected final byte[] f36530b;

    /* renamed from: c, reason: collision with root package name */
    private int f36531c = 0;

    private class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        private int f36532a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36533b;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(e());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte e() {
            try {
                byte[] bArr = o.this.f36530b;
                int i10 = this.f36532a;
                this.f36532a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36532a < this.f36533b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f36532a = 0;
            this.f36533b = o.this.size();
        }
    }

    o(byte[] bArr) {
        this.f36530b = bArr;
    }

    static int P(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int B(int i10, int i11, int i12) {
        return P(i10, this.f36530b, O() + i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int D(int i10, int i11, int i12) {
        int O10 = O() + i11;
        return x.g(i10, this.f36530b, O10, i12 + O10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int E() {
        return this.f36531c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String G(String str) {
        return new String(this.f36530b, O(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void L(OutputStream outputStream, int i10, int i11) {
        outputStream.write(this.f36530b, O() + i10, i11);
    }

    boolean M(o oVar, int i10, int i11) {
        if (i11 > oVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > oVar.size()) {
            int size2 = oVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f36530b;
        byte[] bArr2 = oVar.f36530b;
        int O10 = O() + i11;
        int O11 = O();
        int O12 = oVar.O() + i10;
        while (O11 < O10) {
            if (bArr[O11] != bArr2[O12]) {
                return false;
            }
            O11++;
            O12++;
        }
        return true;
    }

    protected int O() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return M((o) obj, 0, size());
        }
        if (obj instanceof t) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(valueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i10 = this.f36531c;
        if (i10 == 0) {
            int size = size();
            i10 = B(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f36531c = i10;
        }
        return i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f36530b.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void t(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f36530b, i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int u() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean v() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean w() {
        int O10 = O();
        return x.f(this.f36530b, O10, size() + O10);
    }
}
