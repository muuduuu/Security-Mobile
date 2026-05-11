package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* loaded from: classes2.dex */
public final class r extends N0 implements InterfaceC2615v1 {
    private static final r zzg;
    private static volatile E1 zzh;
    private int zzc;
    private C2604s zzd;
    private C2610u zze;
    private X0 zzf = N0.s();

    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(r.zzg);
        }

        public final a s(C2604s c2604s) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((r) this.f25051b).x(c2604s);
            return this;
        }

        public final a w(Iterable iterable) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((r) this.f25051b).y(iterable);
            return this;
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        r rVar = new r();
        zzg = rVar;
        N0.n(r.class, rVar);
    }

    private r() {
    }

    private final void B() {
        X0 x02 = this.zzf;
        if (x02.zza()) {
            return;
        }
        this.zzf = N0.i(x02);
    }

    public static a t() {
        return (a) zzg.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(C2604s c2604s) {
        c2604s.getClass();
        this.zzd = c2604s;
        this.zzc |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(Iterable iterable) {
        B();
        X.c(iterable, this.zzf);
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new r();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", C2593o.class});
            case 4:
                return zzg;
            case 5:
                E1 e12 = zzh;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (r.class) {
                        try {
                            E1 e14 = zzh;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzg);
                                zzh = aVar;
                                e15 = aVar;
                            }
                        } finally {
                        }
                    }
                }
                return e13;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
