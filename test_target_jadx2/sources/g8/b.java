package G8;

import com.google.firebase.messaging.O;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f2969b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final G8.a f2970a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private G8.a f2971a = null;

        a() {
        }

        public b a() {
            return new b(this.f2971a);
        }

        public a b(G8.a aVar) {
            this.f2971a = aVar;
            return this;
        }
    }

    b(G8.a aVar) {
        this.f2970a = aVar;
    }

    public static a b() {
        return new a();
    }

    public G8.a a() {
        return this.f2970a;
    }

    public byte[] c() {
        return O.a(this);
    }
}
