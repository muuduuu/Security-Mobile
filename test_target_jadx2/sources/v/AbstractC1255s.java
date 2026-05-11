package V;

import android.location.Location;

/* renamed from: V.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1255s {

    /* renamed from: a, reason: collision with root package name */
    private final b f10710a;

    /* renamed from: V.s$a */
    static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        final b.a f10711a;

        a(b.a aVar) {
            this.f10711a = aVar;
            aVar.b(0L);
            aVar.a(0L);
        }

        public Object a(long j10) {
            y0.f.b(j10 >= 0, "The specified duration limit can't be negative.");
            this.f10711a.a(j10);
            return this;
        }

        public Object b(long j10) {
            y0.f.b(j10 >= 0, "The specified file size limit can't be negative.");
            this.f10711a.b(j10);
            return this;
        }
    }

    /* renamed from: V.s$b */
    static abstract class b {

        /* renamed from: V.s$b$a */
        static abstract class a {
            a() {
            }

            abstract Object a(long j10);

            abstract Object b(long j10);
        }

        b() {
        }

        abstract long a();

        abstract long b();

        abstract Location c();
    }

    AbstractC1255s(b bVar) {
        this.f10710a = bVar;
    }

    public long a() {
        return this.f10710a.a();
    }

    public long b() {
        return this.f10710a.b();
    }

    public Location c() {
        return this.f10710a.c();
    }
}
