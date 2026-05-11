package Tb;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.N;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.AbstractActivityC1577t;
import javax.crypto.Cipher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import p.m;
import p.n;
import pc.AbstractC3868b;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9668d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f9669a;

    /* renamed from: b, reason: collision with root package name */
    private final Ba.b f9670b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9671c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: Tb.b$b, reason: collision with other inner class name */
    static final class C0183b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9672a;

        /* renamed from: c, reason: collision with root package name */
        int f9674c;

        C0183b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9672a = obj;
            this.f9674c |= Integer.MIN_VALUE;
            return b.this.c(null, false, null, this);
        }
    }

    static final class c extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Tb.c f9676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Cipher f9677c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f9678d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Tb.c cVar, Cipher cipher, b bVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9676b = cVar;
            this.f9677c = cipher;
            this.f9678d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new c(this.f9676b, this.f9677c, this.f9678d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f9675a;
            try {
                if (i10 == 0) {
                    p.b(obj);
                    Tb.c cVar = this.f9676b;
                    Cipher cipher = this.f9677c;
                    this.f9675a = 1;
                    obj = cVar.a(cipher, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                n.b bVar = (n.b) obj;
                if (bVar != null) {
                    return bVar;
                }
                throw new Tb.a("Couldn't get the authentication result", null, 2, null);
            } finally {
                this.f9678d.f9671c = false;
            }
        }
    }

    public b(Context context, Ba.b moduleRegistry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleRegistry, "moduleRegistry");
        this.f9669a = context;
        this.f9670b = moduleRegistry;
    }

    private final Activity d() {
        Object b10 = this.f9670b.b(Ea.b.class);
        Intrinsics.checkNotNullExpressionValue(b10, "getModule(...)");
        return ((Ea.b) b10).a();
    }

    private final Object e(Cipher cipher, String str, kotlin.coroutines.d dVar) {
        if (this.f9671c) {
            throw new Tb.a("Authentication is already in progress", null, 2, null);
        }
        this.f9671c = true;
        b();
        Activity d10 = d();
        AbstractActivityC1577t abstractActivityC1577t = d10 instanceof AbstractActivityC1577t ? (AbstractActivityC1577t) d10 : null;
        if (abstractActivityC1577t != null) {
            return AbstractC0887i.g(C0874b0.c().y0(), new c(new Tb.c(abstractActivityC1577t, this.f9669a, str), cipher, this, null), dVar);
        }
        throw new Tb.a("Cannot display biometric prompt when the app is not in the foreground", null, 2, null);
    }

    public final void b() {
        m g10 = m.g(this.f9669a);
        Intrinsics.checkNotNullExpressionValue(g10, "from(...)");
        int a10 = g10.a(15);
        if (a10 == -2) {
            throw new Tb.a("Biometric authentication is unsupported", null, 2, null);
        }
        if (a10 == -1) {
            throw new Tb.a("Biometric authentication status is unknown", null, 2, null);
        }
        if (a10 != 1) {
            if (a10 == 15) {
                throw new Tb.a("An update is required before the biometrics can be used", null, 2, null);
            }
            if (a10 == 11) {
                throw new Tb.a("No biometrics are currently enrolled", null, 2, null);
            }
            if (a10 != 12) {
                return;
            }
        }
        throw new Tb.a("No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Cipher cipher, boolean z10, String str, kotlin.coroutines.d dVar) {
        C0183b c0183b;
        int i10;
        Cipher a10;
        if (dVar instanceof C0183b) {
            c0183b = (C0183b) dVar;
            int i11 = c0183b.f9674c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0183b.f9674c = i11 - Integer.MIN_VALUE;
                Object obj = c0183b.f9672a;
                Object e10 = AbstractC3868b.e();
                i10 = c0183b.f9674c;
                if (i10 != 0) {
                    p.b(obj);
                    if (!z10) {
                        return cipher;
                    }
                    c0183b.f9674c = 1;
                    obj = e(cipher, str, c0183b);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p.b(obj);
                }
                n.c b10 = ((n.b) obj).b();
                a10 = b10 == null ? b10.a() : null;
                if (a10 == null) {
                    return a10;
                }
                throw new Tb.a("Couldn't get cipher from authentication result", null, 2, null);
            }
        }
        c0183b = new C0183b(dVar);
        Object obj2 = c0183b.f9672a;
        Object e102 = AbstractC3868b.e();
        i10 = c0183b.f9674c;
        if (i10 != 0) {
        }
        n.c b102 = ((n.b) obj2).b();
        if (b102 == null) {
        }
        if (a10 == null) {
        }
    }
}
