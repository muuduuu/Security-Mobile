package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;
import org.conscrypt.BuildConfig;

/* renamed from: com.google.android.gms.internal.vision.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2578j extends N0 implements InterfaceC2615v1 {
    private static final C2578j zzf;
    private static volatile E1 zzg;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.vision.j$a */
    public static final class a extends N0.b implements InterfaceC2615v1 {
        private a() {
            super(C2578j.zzf);
        }

        public final a s(String str) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2578j) this.f25051b).w(str);
            return this;
        }

        public final a w(String str) {
            if (this.f25052c) {
                n();
                this.f25052c = false;
            }
            ((C2578j) this.f25051b).z(str);
            return this;
        }

        /* synthetic */ a(AbstractC2625z abstractC2625z) {
            this();
        }
    }

    static {
        C2578j c2578j = new C2578j();
        zzf = c2578j;
        N0.n(C2578j.class, c2578j);
    }

    private C2578j() {
    }

    public static a t() {
        return (a) zzf.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.vision.E1, com.google.android.gms.internal.vision.N0$a] */
    @Override // com.google.android.gms.internal.vision.N0
    protected final Object j(int i10, Object obj, Object obj2) {
        AbstractC2625z abstractC2625z = null;
        switch (AbstractC2625z.f25224a[i10 - 1]) {
            case 1:
                return new C2578j();
            case 2:
                return new a(abstractC2625z);
            case 3:
                return N0.l(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                E1 e12 = zzg;
                E1 e13 = e12;
                if (e12 == null) {
                    synchronized (C2578j.class) {
                        try {
                            E1 e14 = zzg;
                            E1 e15 = e14;
                            if (e14 == null) {
                                ?? aVar = new N0.a(zzf);
                                zzg = aVar;
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
