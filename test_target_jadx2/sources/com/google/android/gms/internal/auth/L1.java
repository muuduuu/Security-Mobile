package com.google.android.gms.internal.auth;

/* loaded from: classes2.dex */
public final class L1 implements K1 {

    /* renamed from: a, reason: collision with root package name */
    public static final M f23615a;

    /* renamed from: b, reason: collision with root package name */
    public static final M f23616b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f23617c;

    /* renamed from: d, reason: collision with root package name */
    public static final M f23618d;

    /* renamed from: e, reason: collision with root package name */
    public static final M f23619e;

    static {
        I a10 = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f23615a = a10.e("Aang__create_auth_exception_with_pending_intent", false);
        f23616b = a10.e("Aang__enable_add_account_restrictions", false);
        f23617c = a10.e("Aang__log_missing_gaia_id_event", true);
        f23618d = a10.e("Aang__log_obfuscated_gaiaid_status", true);
        f23619e = a10.e("Aang__switch_clear_token_to_aang", false);
    }

    @Override // com.google.android.gms.internal.auth.K1
    public final boolean zza() {
        return ((Boolean) f23615a.b()).booleanValue();
    }
}
