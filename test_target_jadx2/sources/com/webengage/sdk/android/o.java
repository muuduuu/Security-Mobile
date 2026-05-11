package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.m3;
import java.util.Map;

/* loaded from: classes2.dex */
public class o implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile o f30735b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30736c = new a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30737a;

    class a implements m3.a {
        a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (o.f30735b == null) {
                o unused = o.f30735b = new o(context, null);
            }
            return o.f30735b;
        }
    }

    private o(Context context) {
        this.f30737a = null;
        this.f30737a = context.getApplicationContext();
    }

    /* synthetic */ o(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        new C2966n(this.f30737a).d((Map<String, Object>) null);
    }
}
