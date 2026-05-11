package com.webengage.sdk.android.actions.database;

import android.content.Context;
import android.os.Bundle;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.webengage.sdk.android.m3;
import com.webengage.sdk.android.p0;
import com.webengage.sdk.android.y3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements m3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f30282b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.a f30283c = new C0442a();

    /* renamed from: a, reason: collision with root package name */
    private Context f30284a;

    /* renamed from: com.webengage.sdk.android.actions.database.a$a, reason: collision with other inner class name */
    class C0442a implements m3.a {
        C0442a() {
        }

        @Override // com.webengage.sdk.android.m3.a
        public m3 a(Context context) {
            if (a.f30282b == null) {
                a unused = a.f30282b = new a(context, null);
            }
            return a.f30282b;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30285a;

        static {
            int[] iArr = new int[y3.values().length];
            f30285a = iArr;
            try {
                iArr[y3.f31159d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30285a[y3.f31158c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30285a[y3.f31164i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30285a[y3.f31165j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private a(Context context) {
        this.f30284a = null;
        this.f30284a = context.getApplicationContext();
    }

    public Map<String, Object> b(y3 y3Var, Object obj) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("action_data", obj);
        int i10 = b.f30285a[y3Var.ordinal()];
        if (i10 == 1) {
            str = "gcm";
        } else if (i10 == 2) {
            str = Keys.EVENT;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    str = "change_data";
                }
                return hashMap;
            }
            str = "internal_event";
        }
        hashMap.put("action_type", str);
        return hashMap;
    }

    /* synthetic */ a(Context context, C0442a c0442a) {
        this(context);
    }

    @Override // com.webengage.sdk.android.m3
    public void a(y3 y3Var, Object obj) {
        com.webengage.sdk.android.actions.database.b bVar;
        Object obj2;
        int i10 = b.f30285a[y3Var.ordinal()];
        if (i10 == 1) {
            Bundle bundle = (Bundle) obj;
            if (bundle == null || !bundle.containsKey("source") || !"webengage".equalsIgnoreCase(bundle.getString("source")) || !bundle.containsKey("message_data") || !bundle.containsKey("message_action")) {
                return;
            }
            bVar = new com.webengage.sdk.android.actions.database.b(this.f30284a);
            obj2 = bundle;
        } else {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                return;
            }
            if ((obj instanceof p0) && ((p0) obj).d().equals("we_wk_progress_bar_push_notification_rerender")) {
                return;
            }
            bVar = new com.webengage.sdk.android.actions.database.b(this.f30284a);
            obj2 = obj;
        }
        bVar.d(b(y3Var, obj2));
    }
}
