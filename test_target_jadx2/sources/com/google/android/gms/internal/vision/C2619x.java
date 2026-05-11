package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

/* renamed from: com.google.android.gms.internal.vision.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2619x extends N0 implements InterfaceC2615v1 {
    private static final C2619x zzi;
    private static volatile E1 zzj;
    private int zzc;
    private C2590n zzd;
    private C2607t zze;
    private r zzf;
    private int zzg;
    private boolean zzh;

    /* renamed from: com.google.android.gms.internal.vision.x$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2619x.zzi);
        }

        public final a s(r rVar) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2619x) this.f25051b).u(rVar);
            return this;
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2619x c2619x = new C2619x();
        zzi = c2619x;
        N0.n(C2619x.class, c2619x);
    }

    private C2619x() {
    }

    public static a t() {
        return (a) zzi.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(r rVar) {
        rVar.getClass();
        this.zzf = rVar;
        this.zzc |= 4;
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2619x();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                E1 e12 = zzj;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2619x.class) {
                        try {
                            E1 e14 = zzj;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzi);
                                zzj = aVar;
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
