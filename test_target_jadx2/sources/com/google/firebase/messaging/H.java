package com.google.firebase.messaging;

import D7.AbstractC0789m;
import D7.InterfaceC0779c;
import R6.C1145c;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Task;
import j8.C3511e;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import y8.j;

/* loaded from: classes2.dex */
class H {

    /* renamed from: a, reason: collision with root package name */
    private final C3511e f28070a;

    /* renamed from: b, reason: collision with root package name */
    private final M f28071b;

    /* renamed from: c, reason: collision with root package name */
    private final C1145c f28072c;

    /* renamed from: d, reason: collision with root package name */
    private final A8.b f28073d;

    /* renamed from: e, reason: collision with root package name */
    private final A8.b f28074e;

    /* renamed from: f, reason: collision with root package name */
    private final B8.f f28075f;

    H(C3511e c3511e, M m10, A8.b bVar, A8.b bVar2, B8.f fVar) {
        this(c3511e, m10, new C1145c(c3511e.l()), bVar, bVar2, fVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task d(Task task) {
        return task.i(new androidx.privacysandbox.ads.adservices.measurement.k(), new InterfaceC0779c() { // from class: com.google.firebase.messaging.G
            @Override // D7.InterfaceC0779c
            public final Object a(Task task2) {
                String j10;
                j10 = H.this.j(task2);
                return j10;
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f28070a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(AppConstants.VIDEO_RECORDING_ERROR);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j(Task task) {
        return h((Bundle) task.k(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void k(String str, String str2, Bundle bundle) {
        y8.j jVar;
        j.a b10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f28070a.q().c());
        bundle.putString("gmsv", Integer.toString(this.f28071b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f28071b.a());
        bundle.putString("app_ver_name", this.f28071b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String b11 = ((com.google.firebase.installations.g) AbstractC0789m.a(this.f28075f.a(false))).b();
            if (TextUtils.isEmpty(b11)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", b11);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) AbstractC0789m.a(this.f28075f.getId()));
            bundle.putString("cliv", "fcm-25.0.1");
            jVar = (y8.j) this.f28074e.get();
            I8.i iVar = (I8.i) this.f28073d.get();
            if (jVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) AbstractC0789m.a(this.f28075f.getId()));
            bundle.putString("cliv", "fcm-25.0.1");
            jVar = (y8.j) this.f28074e.get();
            I8.i iVar2 = (I8.i) this.f28073d.get();
            if (jVar == null) {
            }
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) AbstractC0789m.a(this.f28075f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        jVar = (y8.j) this.f28074e.get();
        I8.i iVar22 = (I8.i) this.f28073d.get();
        if (jVar == null || iVar22 == null || (b10 = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.getCode()));
        bundle.putString("Firebase-Client", iVar22.a());
    }

    private Task m(String str, String str2, Bundle bundle) {
        try {
            k(str, str2, bundle);
            return this.f28072c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return AbstractC0789m.f(e10);
        }
    }

    Task c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(m(M.c(this.f28070a), "*", bundle));
    }

    Task f() {
        return this.f28072c.a();
    }

    Task g() {
        return d(m(M.c(this.f28070a), "*", new Bundle()));
    }

    Task l(boolean z10) {
        return this.f28072c.d(z10);
    }

    Task n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(m(str, "/topics/" + str2, bundle));
    }

    Task o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(m(str, "/topics/" + str2, bundle));
    }

    H(C3511e c3511e, M m10, C1145c c1145c, A8.b bVar, A8.b bVar2, B8.f fVar) {
        this.f28070a = c3511e;
        this.f28071b = m10;
        this.f28072c = c1145c;
        this.f28073d = bVar;
        this.f28074e = bVar2;
        this.f28075f = fVar;
    }
}
