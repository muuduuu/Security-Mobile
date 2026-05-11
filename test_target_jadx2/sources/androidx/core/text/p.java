package androidx.core.text;

import co.hyperverge.hypersnapsdk.objects.HVError;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o f16008a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final o f16009b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final o f16010c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f16011d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f16012e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f16013f;

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f16014b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f16015a;

        private a(boolean z10) {
            this.f16015a = z10;
        }

        @Override // androidx.core.text.p.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = p.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f16015a) {
                        return 1;
                    }
                } else if (this.f16015a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f16015a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f16016a = new b();

        private b() {
        }

        @Override // androidx.core.text.p.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = p.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements o {

        /* renamed from: a, reason: collision with root package name */
        private final c f16017a;

        d(c cVar) {
            this.f16017a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f16017a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return b();
            }
            return false;
        }

        @Override // androidx.core.text.o
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f16017a == null ? b() : c(charSequence, i10, i11);
        }

        protected abstract boolean b();
    }

    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f16018b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f16018b = z10;
        }

        @Override // androidx.core.text.p.d
        protected boolean b() {
            return this.f16018b;
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f16019b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.p.d
        protected boolean b() {
            return q.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f16016a;
        f16010c = new e(bVar, false);
        f16011d = new e(bVar, true);
        f16012e = new e(a.f16014b, false);
        f16013f = f.f16019b;
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
