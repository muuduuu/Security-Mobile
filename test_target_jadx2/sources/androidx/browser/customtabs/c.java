package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.InterfaceC1638a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final b.b f14286a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f14287b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f14288c;

    class a extends InterfaceC1638a.AbstractBinderC0318a {

        /* renamed from: f, reason: collision with root package name */
        private Handler f14289f = new Handler(Looper.getMainLooper());

        a(b bVar) {
        }

        @Override // b.InterfaceC1638a
        public void F0(int i10, Bundle bundle) {
        }

        @Override // b.InterfaceC1638a
        public Bundle I(String str, Bundle bundle) {
            return null;
        }

        @Override // b.InterfaceC1638a
        public void T0(String str, Bundle bundle) {
        }

        @Override // b.InterfaceC1638a
        public void Z0(Bundle bundle) {
        }

        @Override // b.InterfaceC1638a
        public void a1(int i10, Uri uri, boolean z10, Bundle bundle) {
        }

        @Override // b.InterfaceC1638a
        public void f0(int i10, int i11, Bundle bundle) {
        }

        @Override // b.InterfaceC1638a
        public void q0(String str, Bundle bundle) {
        }
    }

    c(b.b bVar, ComponentName componentName, Context context) {
        this.f14286a = bVar;
        this.f14287b = componentName;
        this.f14288c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private InterfaceC1638a.AbstractBinderC0318a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z10) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean V10;
        InterfaceC1638a.AbstractBinderC0318a b10 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                V10 = this.f14286a.y0(b10, bundle);
            } else {
                V10 = this.f14286a.V(b10);
            }
            if (V10) {
                return new f(this.f14286a, b10, this.f14287b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j10) {
        try {
            return this.f14286a.O(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
