package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import java.util.Map;

/* renamed from: com.webengage.sdk.android.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2957e implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static C2957e f30501b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30502c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30503a;

    /* renamed from: com.webengage.sdk.android.e$a */
    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (C2957e.f30501b == null) {
                C2957e unused = C2957e.f30501b = new C2957e(context, null);
            }
            return C2957e.f30501b;
        }
    }

    private C2957e(Context context) {
        this.f30503a = null;
        this.f30503a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        return null;
    }

    /* synthetic */ C2957e(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        if (y3Var.equals(y3.f31170o) && a(obj)) {
            new i2(this.f30503a).d(b(y3Var, obj));
        }
    }

    public boolean a(Object obj) {
        return true;
    }
}
