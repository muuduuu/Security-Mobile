package w8;

import w8.d;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5044a {

    /* renamed from: a, reason: collision with root package name */
    private int f44337a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f44338b = d.a.DEFAULT;

    /* renamed from: w8.a$a, reason: collision with other inner class name */
    private static final class C0638a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f44339a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f44340b;

        C0638a(int i10, d.a aVar) {
            this.f44339a = i10;
            this.f44340b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f44339a == dVar.tag() && this.f44340b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f44339a) + (this.f44340b.hashCode() ^ 2041407134);
        }

        @Override // w8.d
        public d.a intEncoding() {
            return this.f44340b;
        }

        @Override // w8.d
        public int tag() {
            return this.f44339a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44339a + "intEncoding=" + this.f44340b + ')';
        }
    }

    public static C5044a b() {
        return new C5044a();
    }

    public d a() {
        return new C0638a(this.f44337a, this.f44338b);
    }

    public C5044a c(int i10) {
        this.f44337a = i10;
        return this;
    }
}
