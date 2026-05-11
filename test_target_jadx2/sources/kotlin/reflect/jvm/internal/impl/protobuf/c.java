package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes3.dex */
class c extends o {

    /* renamed from: d, reason: collision with root package name */
    private final int f36464d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36465e;

    private class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        private int f36466a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36467b;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(e());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte e() {
            int i10 = this.f36466a;
            if (i10 >= this.f36467b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f36530b;
            this.f36466a = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36466a < this.f36467b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int O10 = c.this.O();
            this.f36466a = O10;
            this.f36467b = O10 + c.this.size();
        }
    }

    c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (i10 + i11 <= bArr.length) {
            this.f36464d = i10;
            this.f36465e = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    protected int O() {
        return this.f36464d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o, java.lang.Iterable
    /* renamed from: R */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f36465e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void t(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f36530b, O() + i10, bArr, i11, i12);
    }
}
