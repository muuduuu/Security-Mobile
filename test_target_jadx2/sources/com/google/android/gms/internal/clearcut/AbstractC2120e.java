package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.clearcut.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2120e {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f24028h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static Context f24029i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f24030j = false;

    /* renamed from: k, reason: collision with root package name */
    private static volatile Boolean f24031k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile Boolean f24032l;

    /* renamed from: a, reason: collision with root package name */
    private final C2150o f24033a;

    /* renamed from: b, reason: collision with root package name */
    final String f24034b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24035c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f24036d;

    /* renamed from: e, reason: collision with root package name */
    private Object f24037e;

    /* renamed from: f, reason: collision with root package name */
    private volatile C2114c f24038f;

    /* renamed from: g, reason: collision with root package name */
    private volatile SharedPreferences f24039g;

    private AbstractC2120e(C2150o c2150o, String str, Object obj) {
        this.f24037e = null;
        this.f24038f = null;
        this.f24039g = null;
        if (c2150o.f24084a == null && c2150o.f24085b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (c2150o.f24084a != null && c2150o.f24085b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f24033a = c2150o;
        String valueOf = String.valueOf(c2150o.f24086c);
        String valueOf2 = String.valueOf(str);
        this.f24035c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        String valueOf3 = String.valueOf(c2150o.f24087d);
        String valueOf4 = String.valueOf(str);
        this.f24034b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        this.f24036d = obj;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (f24029i == null) {
            synchronized (f24028h) {
                try {
                    if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                        context = applicationContext;
                    }
                    if (f24029i != context) {
                        f24031k = null;
                    }
                    f24029i = context;
                } catch (Throwable th) {
                    throw th;
                }
            }
            f24030j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC2120e c(C2150o c2150o, String str, Object obj, InterfaceC2147n interfaceC2147n) {
        return new C2141l(c2150o, str, obj, interfaceC2147n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC2120e d(C2150o c2150o, String str, String str2) {
        return new C2138k(c2150o, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC2120e e(C2150o c2150o, String str, boolean z10) {
        return new C2135j(c2150o, str, Boolean.valueOf(z10));
    }

    private static Object g(InterfaceC2144m interfaceC2144m) {
        try {
            return interfaceC2144m.b();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC2144m.b();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    static boolean h(final String str, boolean z10) {
        final boolean z11 = false;
        if (p()) {
            return ((Boolean) g(new InterfaceC2144m(str, z11) { // from class: com.google.android.gms.internal.clearcut.h

                /* renamed from: a, reason: collision with root package name */
                private final String f24071a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f24072b = false;

                {
                    this.f24071a = str;
                }

                @Override // com.google.android.gms.internal.clearcut.InterfaceC2144m
                public final Object b() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(Z1.h(AbstractC2120e.f24029i.getContentResolver(), this.f24071a, this.f24072b));
                    return valueOf;
                }
            })).booleanValue();
        }
        return false;
    }

    private final Object n() {
        boolean z10;
        if (h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f24034b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f24033a.f24085b != null) {
            if (this.f24038f == null) {
                this.f24038f = C2114c.a(f24029i.getContentResolver(), this.f24033a.f24085b);
            }
            final C2114c c2114c = this.f24038f;
            String str = (String) g(new InterfaceC2144m(this, c2114c) { // from class: com.google.android.gms.internal.clearcut.f

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC2120e f24042a;

                /* renamed from: b, reason: collision with root package name */
                private final C2114c f24043b;

                {
                    this.f24042a = this;
                    this.f24043b = c2114c;
                }

                @Override // com.google.android.gms.internal.clearcut.InterfaceC2144m
                public final Object b() {
                    return (String) this.f24043b.c().get(this.f24042a.f24034b);
                }
            });
            if (str != null) {
                return m(str);
            }
        } else if (this.f24033a.f24084a != null) {
            if (f24029i.isDeviceProtectedStorage()) {
                z10 = true;
            } else {
                if (f24032l == null || !f24032l.booleanValue()) {
                    f24032l = Boolean.valueOf(((UserManager) f24029i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                z10 = f24032l.booleanValue();
            }
            if (!z10) {
                return null;
            }
            if (this.f24039g == null) {
                this.f24039g = f24029i.getSharedPreferences(this.f24033a.f24084a, 0);
            }
            SharedPreferences sharedPreferences = this.f24039g;
            if (sharedPreferences.contains(this.f24034b)) {
                return f(sharedPreferences);
            }
        }
        return null;
    }

    private final Object o() {
        String str;
        if (this.f24033a.f24088e || !p() || (str = (String) g(new InterfaceC2144m(this) { // from class: com.google.android.gms.internal.clearcut.g

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC2120e f24069a;

            {
                this.f24069a = this;
            }

            @Override // com.google.android.gms.internal.clearcut.InterfaceC2144m
            public final Object b() {
                return this.f24069a.q();
            }
        })) == null) {
            return null;
        }
        return m(str);
    }

    private static boolean p() {
        if (f24031k == null) {
            Context context = f24029i;
            if (context == null) {
                return false;
            }
            f24031k = Boolean.valueOf(androidx.core.content.e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f24031k.booleanValue();
    }

    public final Object a() {
        if (f24029i == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.f24033a.f24089f) {
            Object o10 = o();
            if (o10 != null) {
                return o10;
            }
            Object n10 = n();
            if (n10 != null) {
                return n10;
            }
        } else {
            Object n11 = n();
            if (n11 != null) {
                return n11;
            }
            Object o11 = o();
            if (o11 != null) {
                return o11;
            }
        }
        return this.f24036d;
    }

    protected abstract Object f(SharedPreferences sharedPreferences);

    protected abstract Object m(String str);

    final /* synthetic */ String q() {
        return Z1.c(f24029i.getContentResolver(), this.f24035c, null);
    }

    /* synthetic */ AbstractC2120e(C2150o c2150o, String str, Object obj, AbstractC2132i abstractC2132i) {
        this(c2150o, str, obj);
    }
}
