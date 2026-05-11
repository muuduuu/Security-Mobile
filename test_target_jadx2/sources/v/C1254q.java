package V;

import V.AbstractC1255s;
import V.C1243f;
import java.io.File;

/* renamed from: V.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254q extends AbstractC1255s {

    /* renamed from: b, reason: collision with root package name */
    private final b f10707b;

    /* renamed from: V.q$a */
    public static final class a extends AbstractC1255s.a {

        /* renamed from: b, reason: collision with root package name */
        private final b.a f10708b;

        public a(File file) {
            super(new C1243f.b());
            y0.f.h(file, "File can't be null.");
            b.a aVar = (b.a) this.f10711a;
            this.f10708b = aVar;
            aVar.d(file);
        }

        @Override // V.AbstractC1255s.a
        public /* bridge */ /* synthetic */ Object a(long j10) {
            return super.a(j10);
        }

        @Override // V.AbstractC1255s.a
        public /* bridge */ /* synthetic */ Object b(long j10) {
            return super.b(j10);
        }

        public C1254q c() {
            return new C1254q(this.f10708b.c());
        }
    }

    /* renamed from: V.q$b */
    static abstract class b extends AbstractC1255s.b {

        /* renamed from: V.q$b$a */
        static abstract class a extends AbstractC1255s.b.a {
            a() {
            }

            abstract b c();

            abstract a d(File file);
        }

        b() {
        }

        abstract File d();
    }

    C1254q(b bVar) {
        super(bVar);
        this.f10707b = bVar;
    }

    public File d() {
        return this.f10707b.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1254q) {
            return this.f10707b.equals(((C1254q) obj).f10707b);
        }
        return false;
    }

    public int hashCode() {
        return this.f10707b.hashCode();
    }

    public String toString() {
        return this.f10707b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
