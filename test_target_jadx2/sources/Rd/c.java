package rd;

import rd.d;

/* loaded from: classes3.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40603a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f40604b;

        static {
            d.a aVar = d.f40606c;
            f40604b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // rd.c
        public int a() {
            return f40604b;
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f40605a = new b();

        private b() {
        }

        @Override // rd.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
