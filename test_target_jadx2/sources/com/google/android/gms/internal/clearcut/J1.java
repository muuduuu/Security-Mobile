package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC2109a0;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class J1 extends AbstractC2109a0 implements D0 {
    private static volatile K0 zzbg;
    private static final J1 zzbir;
    private InterfaceC2124f0 zzbiq = AbstractC2109a0.j();

    public static final class a extends AbstractC2109a0.a implements D0 {
        private a() {
            super(J1.zzbir);
        }

        /* synthetic */ a(K1 k12) {
            this();
        }
    }

    public static final class b extends AbstractC2109a0 implements D0 {
        private static volatile K0 zzbg;
        private static final b zzbiv;
        private int zzbb;
        private String zzbis = BuildConfig.FLAVOR;
        private long zzbit;
        private long zzbiu;
        private int zzya;

        public static final class a extends AbstractC2109a0.a implements D0 {
            private a() {
                super(b.zzbiv);
            }

            public final a q(String str) {
                i();
                ((b) this.f23990b).z(str);
                return this;
            }

            public final a s(long j10) {
                i();
                ((b) this.f23990b).A(j10);
                return this;
            }

            public final a v(long j10) {
                i();
                ((b) this.f23990b).B(j10);
                return this;
            }

            /* synthetic */ a(K1 k12) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzbiv = bVar;
            AbstractC2109a0.h(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A(long j10) {
            this.zzbb |= 4;
            this.zzbit = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void B(long j10) {
            this.zzbb |= 8;
            this.zzbiu = j10;
        }

        public static a x() {
            return (a) ((AbstractC2109a0.a) zzbiv.e(AbstractC2109a0.c.f23997e, null, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z(String str) {
            str.getClass();
            this.zzbb |= 2;
            this.zzbis = str;
        }

        /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.clearcut.K0, com.google.android.gms.internal.clearcut.a0$b] */
        @Override // com.google.android.gms.internal.clearcut.AbstractC2109a0
        protected final Object e(int i10, Object obj, Object obj2) {
            K1 k12 = null;
            switch (K1.f23861a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(k12);
                case 3:
                    return AbstractC2109a0.f(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    K0 k02 = zzbg;
                    K0 k03 = k02;
                    if (k02 == null) {
                        synchronized (b.class) {
                            try {
                                K0 k04 = zzbg;
                                K0 k05 = k04;
                                if (k04 == null) {
                                    ?? bVar = new AbstractC2109a0.b(zzbiv);
                                    zzbg = bVar;
                                    k05 = bVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return k03;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int l() {
            return this.zzya;
        }

        public final boolean t() {
            return (this.zzbb & 1) == 1;
        }

        public final String u() {
            return this.zzbis;
        }

        public final long v() {
            return this.zzbit;
        }

        public final long w() {
            return this.zzbiu;
        }
    }

    static {
        J1 j12 = new J1();
        zzbir = j12;
        AbstractC2109a0.h(J1.class, j12);
    }

    private J1() {
    }

    public static J1 q() {
        return zzbir;
    }

    public static J1 s(byte[] bArr) {
        return (J1) AbstractC2109a0.i(zzbir, bArr);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.clearcut.K0, com.google.android.gms.internal.clearcut.a0$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC2109a0
    protected final Object e(int i10, Object obj, Object obj2) {
        K1 k12 = null;
        switch (K1.f23861a[i10 - 1]) {
            case 1:
                return new J1();
            case 2:
                return new a(k12);
            case 3:
                return AbstractC2109a0.f(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", b.class});
            case 4:
                return zzbir;
            case 5:
                K0 k02 = zzbg;
                K0 k03 = k02;
                if (k02 == null) {
                    synchronized (J1.class) {
                        try {
                            K0 k04 = zzbg;
                            K0 k05 = k04;
                            if (k04 == null) {
                                ?? bVar = new AbstractC2109a0.b(zzbir);
                                zzbg = bVar;
                                k05 = bVar;
                            }
                        } finally {
                        }
                    }
                }
                return k03;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final List l() {
        return this.zzbiq;
    }
}
