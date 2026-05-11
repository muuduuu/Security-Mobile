package m8;

import V6.AbstractC1287s;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.internal.measurement.C2411z1;
import com.google.android.gms.measurement.internal.AbstractC2722l5;
import com.google.android.gms.measurement.internal.W3;
import j8.C3508b;
import j8.C3511e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m8.InterfaceC3657a;
import x8.C5133a;
import x8.InterfaceC5136d;
import y7.C5178a;

/* renamed from: m8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3658b implements InterfaceC3657a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile InterfaceC3657a f37417c;

    /* renamed from: a, reason: collision with root package name */
    final C5178a f37418a;

    /* renamed from: b, reason: collision with root package name */
    final Map f37419b;

    C3658b(C5178a c5178a) {
        AbstractC1287s.m(c5178a);
        this.f37418a = c5178a;
        this.f37419b = new ConcurrentHashMap();
    }

    public static InterfaceC3657a g(C3511e c3511e, Context context, InterfaceC5136d interfaceC5136d) {
        AbstractC1287s.m(c3511e);
        AbstractC1287s.m(context);
        AbstractC1287s.m(interfaceC5136d);
        AbstractC1287s.m(context.getApplicationContext());
        if (f37417c == null) {
            synchronized (C3658b.class) {
                try {
                    if (f37417c == null) {
                        Bundle bundle = new Bundle(1);
                        if (c3511e.x()) {
                            interfaceC5136d.c(C3508b.class, ExecutorC3660d.f37421a, C3659c.f37420a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c3511e.w());
                        }
                        f37417c = new C3658b(C2411z1.s(context, bundle).t());
                    }
                } finally {
                }
            }
        }
        return f37417c;
    }

    static /* synthetic */ void h(C5133a c5133a) {
        boolean z10 = ((C3508b) c5133a.a()).f35892a;
        synchronized (C3658b.class) {
            ((C3658b) AbstractC1287s.m(f37417c)).f37418a.h(z10);
        }
    }

    @Override // m8.InterfaceC3657a
    public Map a(boolean z10) {
        return this.f37418a.d(null, null, z10);
    }

    @Override // m8.InterfaceC3657a
    public void b(InterfaceC3657a.C0559a c0559a) {
        String str;
        int i10 = com.google.firebase.analytics.connector.internal.b.f27955g;
        if (c0559a == null || (str = c0559a.f37402a) == null || str.isEmpty()) {
            return;
        }
        Object obj = c0559a.f37404c;
        if ((obj == null || AbstractC2722l5.b(obj) != null) && com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.c(str, c0559a.f37403b)) {
            String str2 = c0559a.f37412k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.b.b(str2, c0559a.f37413l) && com.google.firebase.analytics.connector.internal.b.d(str, c0559a.f37412k, c0559a.f37413l))) {
                String str3 = c0559a.f37409h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.b.b(str3, c0559a.f37410i) && com.google.firebase.analytics.connector.internal.b.d(str, c0559a.f37409h, c0559a.f37410i))) {
                    String str4 = c0559a.f37407f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.b.b(str4, c0559a.f37408g) && com.google.firebase.analytics.connector.internal.b.d(str, c0559a.f37407f, c0559a.f37408g))) {
                        C5178a c5178a = this.f37418a;
                        Bundle bundle = new Bundle();
                        String str5 = c0559a.f37402a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = c0559a.f37403b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = c0559a.f37404c;
                        if (obj2 != null) {
                            W3.a(bundle, obj2);
                        }
                        String str7 = c0559a.f37405d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", c0559a.f37406e);
                        String str8 = c0559a.f37407f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = c0559a.f37408g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = c0559a.f37409h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = c0559a.f37410i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", c0559a.f37411j);
                        String str10 = c0559a.f37412k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = c0559a.f37413l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", c0559a.f37414m);
                        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, c0559a.f37415n);
                        bundle.putLong("triggered_timestamp", c0559a.f37416o);
                        c5178a.f(bundle);
                    }
                }
            }
        }
    }

    @Override // m8.InterfaceC3657a
    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f37418a.e(str, str2, bundle);
        }
    }

    @Override // m8.InterfaceC3657a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.b(str2, bundle)) {
            this.f37418a.a(str, str2, bundle);
        }
    }

    @Override // m8.InterfaceC3657a
    public int d(String str) {
        return this.f37418a.c(str);
    }

    @Override // m8.InterfaceC3657a
    public List e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f37418a.b(str, str2)) {
            int i10 = com.google.firebase.analytics.connector.internal.b.f27955g;
            AbstractC1287s.m(bundle);
            InterfaceC3657a.C0559a c0559a = new InterfaceC3657a.C0559a();
            c0559a.f37402a = (String) AbstractC1287s.m((String) W3.b(bundle, "origin", String.class, null));
            c0559a.f37403b = (String) AbstractC1287s.m((String) W3.b(bundle, "name", String.class, null));
            c0559a.f37404c = W3.b(bundle, "value", Object.class, null);
            c0559a.f37405d = (String) W3.b(bundle, "trigger_event_name", String.class, null);
            c0559a.f37406e = ((Long) W3.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            c0559a.f37407f = (String) W3.b(bundle, "timed_out_event_name", String.class, null);
            c0559a.f37408g = (Bundle) W3.b(bundle, "timed_out_event_params", Bundle.class, null);
            c0559a.f37409h = (String) W3.b(bundle, "triggered_event_name", String.class, null);
            c0559a.f37410i = (Bundle) W3.b(bundle, "triggered_event_params", Bundle.class, null);
            c0559a.f37411j = ((Long) W3.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            c0559a.f37412k = (String) W3.b(bundle, "expired_event_name", String.class, null);
            c0559a.f37413l = (Bundle) W3.b(bundle, "expired_event_params", Bundle.class, null);
            c0559a.f37415n = ((Boolean) W3.b(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            c0559a.f37414m = ((Long) W3.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            c0559a.f37416o = ((Long) W3.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(c0559a);
        }
        return arrayList;
    }

    @Override // m8.InterfaceC3657a
    public void f(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.c(str, str2)) {
            this.f37418a.g(str, str2, obj);
        }
    }
}
