package R6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import d7.C2998d;
import java.util.List;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8570a;

    /* renamed from: b, reason: collision with root package name */
    private int f8571b;

    /* renamed from: c, reason: collision with root package name */
    private int f8572c = 0;

    public E(Context context) {
        this.f8570a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f8571b == 0) {
            try {
                packageInfo = C2998d.a(this.f8570a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f8571b = packageInfo.versionCode;
            }
        }
        return this.f8571b;
    }

    public final synchronized int b() {
        int i10 = this.f8572c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f8570a;
        PackageManager packageManager = context.getPackageManager();
        if (C2998d.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!com.google.android.gms.common.util.m.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f8572c = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.f8572c = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == com.google.android.gms.common.util.m.e()) {
            i11 = 2;
        }
        this.f8572c = i11;
        return i11;
    }
}
