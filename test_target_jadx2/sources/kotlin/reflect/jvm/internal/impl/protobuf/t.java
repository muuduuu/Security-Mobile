package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* loaded from: classes3.dex */
class t extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f36535h;

    /* renamed from: b, reason: collision with root package name */
    private final int f36536b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f36537c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f36538d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36539e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36540f;

    /* renamed from: g, reason: collision with root package name */
    private int f36541g;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Stack f36542a;

        private b() {
            this.f36542a = new Stack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d dVar3 = (kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.pop();
            while (!this.f36542a.isEmpty()) {
                dVar3 = new t((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.pop(), dVar3);
            }
            return dVar3;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.v()) {
                e(dVar);
                return;
            }
            if (dVar instanceof t) {
                t tVar = (t) dVar;
                c(tVar.f36537c);
                c(tVar.f36538d);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(t.f36535h, i10);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int d10 = d(dVar.size());
            int i10 = t.f36535h[d10 + 1];
            if (this.f36542a.isEmpty() || ((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.peek()).size() >= i10) {
                this.f36542a.push(dVar);
                return;
            }
            int i11 = t.f36535h[d10];
            kotlin.reflect.jvm.internal.impl.protobuf.d dVar2 = (kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.pop();
            while (true) {
                if (this.f36542a.isEmpty() || ((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.peek()).size() >= i11) {
                    break;
                } else {
                    dVar2 = new t((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.pop(), dVar2);
                }
            }
            t tVar = new t(dVar2, dVar);
            while (!this.f36542a.isEmpty()) {
                if (((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.peek()).size() >= t.f36535h[d(tVar.size()) + 1]) {
                    break;
                } else {
                    tVar = new t((kotlin.reflect.jvm.internal.impl.protobuf.d) this.f36542a.pop(), tVar);
                }
            }
            this.f36542a.push(tVar);
        }
    }

    private static class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private final Stack f36543a;

        /* renamed from: b, reason: collision with root package name */
        private o f36544b;

        private o a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof t) {
                t tVar = (t) dVar;
                this.f36543a.push(tVar);
                dVar = tVar.f36537c;
            }
            return (o) dVar;
        }

        private o b() {
            while (!this.f36543a.isEmpty()) {
                o a10 = a(((t) this.f36543a.pop()).f36538d);
                if (!a10.isEmpty()) {
                    return a10;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o next() {
            o oVar = this.f36544b;
            if (oVar == null) {
                throw new NoSuchElementException();
            }
            this.f36544b = b();
            return oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36544b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f36543a = new Stack();
            this.f36544b = a(dVar);
        }
    }

    private class d implements d.a {

        /* renamed from: a, reason: collision with root package name */
        private final c f36545a;

        /* renamed from: b, reason: collision with root package name */
        private d.a f36546b;

        /* renamed from: c, reason: collision with root package name */
        int f36547c;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(e());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte e() {
            if (!this.f36546b.hasNext()) {
                this.f36546b = this.f36545a.next().iterator();
            }
            this.f36547c--;
            return this.f36546b.e();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36547c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(t.this);
            this.f36545a = cVar;
            this.f36546b = cVar.next().iterator();
            this.f36547c = t.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f36535h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f36535h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.d R(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        t tVar = dVar instanceof t ? (t) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return S(dVar, dVar2);
            }
            if (tVar != null && tVar.f36538d.size() + dVar2.size() < 128) {
                dVar2 = new t(tVar.f36537c, S(tVar.f36538d, dVar2));
            } else {
                if (tVar == null || tVar.f36537c.u() <= tVar.f36538d.u() || tVar.u() <= dVar2.u()) {
                    return size >= f36535h[Math.max(dVar.u(), dVar2.u()) + 1] ? new t(dVar, dVar2) : new b().b(dVar, dVar2);
                }
                dVar2 = new t(tVar.f36537c, new t(tVar.f36538d, dVar2));
            }
        }
        return dVar2;
    }

    private static o S(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.r(bArr, 0, 0, size);
        dVar2.r(bArr, 0, size, size2);
        return new o(bArr);
    }

    private boolean T(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        o oVar = (o) cVar.next();
        c cVar2 = new c(dVar);
        o oVar2 = (o) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = oVar.size() - i10;
            int size2 = oVar2.size() - i11;
            int min = Math.min(size, size2);
            if (!(i10 == 0 ? oVar.M(oVar2, i11, min) : oVar2.M(oVar, i10, min))) {
                return false;
            }
            i12 += min;
            int i13 = this.f36536b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                oVar = (o) cVar.next();
                i10 = 0;
            } else {
                i10 += min;
            }
            if (min == size2) {
                oVar2 = (o) cVar2.next();
                i11 = 0;
            } else {
                i11 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int B(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f36539e;
        if (i13 <= i14) {
            return this.f36537c.B(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f36538d.B(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f36538d.B(this.f36537c.B(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int D(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f36539e;
        if (i13 <= i14) {
            return this.f36537c.D(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f36538d.D(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f36538d.D(this.f36537c.D(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int E() {
        return this.f36541g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String G(String str) {
        return new String(F(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void L(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f36539e;
        if (i12 <= i13) {
            this.f36537c.L(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f36538d.L(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f36537c.L(outputStream, i10, i14);
            this.f36538d.L(outputStream, 0, i11 - i14);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int E10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f36536b != dVar.size()) {
            return false;
        }
        if (this.f36536b == 0) {
            return true;
        }
        if (this.f36541g == 0 || (E10 = dVar.E()) == 0 || this.f36541g == E10) {
            return T(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f36541g;
        if (i10 == 0) {
            int i11 = this.f36536b;
            i10 = B(i11, 0, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f36541g = i10;
        }
        return i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f36536b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void t(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f36539e;
        if (i13 <= i14) {
            this.f36537c.t(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f36538d.t(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f36537c.t(bArr, i10, i11, i15);
            this.f36538d.t(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int u() {
        return this.f36540f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean v() {
        return this.f36536b >= f36535h[this.f36540f];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean w() {
        int D10 = this.f36537c.D(0, 0, this.f36539e);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f36538d;
        return dVar.D(D10, 0, dVar.size()) == 0;
    }

    private t(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f36541g = 0;
        this.f36537c = dVar;
        this.f36538d = dVar2;
        int size = dVar.size();
        this.f36539e = size;
        this.f36536b = size + dVar2.size();
        this.f36540f = Math.max(dVar.u(), dVar2.u()) + 1;
    }
}
