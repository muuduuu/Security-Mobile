package com.google.android.gms.internal.auth;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class P1 implements N1 {

    /* renamed from: a, reason: collision with root package name */
    public static final M f23638a;

    /* renamed from: b, reason: collision with root package name */
    public static final M f23639b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f23640c;

    /* renamed from: d, reason: collision with root package name */
    public static final M f23641d;

    /* renamed from: e, reason: collision with root package name */
    public static final M f23642e;

    /* renamed from: f, reason: collision with root package name */
    public static final M f23643f;

    /* renamed from: g, reason: collision with root package name */
    public static final M f23644g;

    /* renamed from: h, reason: collision with root package name */
    public static final M f23645h;

    /* renamed from: i, reason: collision with root package name */
    public static final M f23646i;

    /* renamed from: j, reason: collision with root package name */
    public static final M f23647j;

    /* renamed from: k, reason: collision with root package name */
    public static final M f23648k;

    /* renamed from: l, reason: collision with root package name */
    public static final M f23649l;

    /* renamed from: m, reason: collision with root package name */
    public static final M f23650m;

    static {
        I a10 = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f23638a = a10.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f23639b = a10.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f23640c = a10.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f23641d = a10.d("getTokenRefactor__android_id_shift", 0L);
        try {
            f23642e = a10.f("getTokenRefactor__blocked_packages", I1.r(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), O1.f23634a);
            f23643f = a10.e("getTokenRefactor__chimera_get_token_evolved", true);
            f23644g = a10.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f23645h = a10.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            f23646i = a10.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f23647j = a10.e("getTokenRefactor__gaul_token_api_evolved", false);
            f23648k = a10.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            f23649l = a10.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f23650m = a10.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.N1
    public final boolean a() {
        return ((Boolean) f23647j.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.auth.N1
    public final I1 zza() {
        return (I1) f23642e.b();
    }
}
