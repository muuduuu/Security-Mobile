package qa;

import Ea.f;
import O4.g;
import O4.h;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import androidx.core.app.AbstractC1480b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import mb.C3664b;
import mb.InterfaceC3663a;

/* loaded from: classes2.dex */
public class e implements Ea.d, InterfaceC3663a, f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38870a;

    /* renamed from: b, reason: collision with root package name */
    private Ea.b f38871b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f38872c;

    /* renamed from: d, reason: collision with root package name */
    private mb.c f38873d;

    /* renamed from: e, reason: collision with root package name */
    private String[] f38874e;

    /* renamed from: f, reason: collision with root package name */
    private final Queue f38875f;

    /* renamed from: g, reason: collision with root package name */
    private mb.c f38876g;

    /* renamed from: h, reason: collision with root package name */
    private SharedPreferences f38877h;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38870a = context;
        this.f38875f = new LinkedList();
    }

    private final boolean A(String str) {
        SharedPreferences sharedPreferences = this.f38877h;
        if (sharedPreferences == null) {
            Intrinsics.v("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    private final int B(String str) {
        Activity a10;
        Ea.b bVar = this.f38871b;
        return (bVar == null || (a10 = bVar.a()) == null || !(a10 instanceof g)) ? C(str) : androidx.core.content.a.a(a10, str);
    }

    private final C3664b D(String str, int i10) {
        mb.d dVar = i10 == 0 ? mb.d.GRANTED : A(str) ? mb.d.DENIED : mb.d.UNDETERMINED;
        return new C3664b(dVar, dVar == mb.d.DENIED ? w(str) : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void E(Ba.d promise, Map permissionsMap) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(permissionsMap, "permissionsMap");
        boolean z12 = false;
        if (!permissionsMap.isEmpty()) {
            Iterator it = permissionsMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((C3664b) ((Map.Entry) it.next()).getValue()).b() != mb.d.GRANTED) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!permissionsMap.isEmpty()) {
            if (!permissionsMap.isEmpty()) {
                Iterator it2 = permissionsMap.entrySet().iterator();
                while (it2.hasNext()) {
                    if (((C3664b) ((Map.Entry) it2.next()).getValue()).b() == mb.d.DENIED) {
                    }
                }
            }
            z11 = true;
            if (!permissionsMap.isEmpty()) {
                Iterator it3 = permissionsMap.entrySet().iterator();
                while (it3.hasNext()) {
                    if (!((C3664b) ((Map.Entry) it3.next()).getValue()).a()) {
                        break;
                    }
                }
            }
            z12 = true;
            Bundle bundle = new Bundle();
            bundle.putString("expires", "never");
            bundle.putString("status", !z10 ? mb.d.GRANTED.getStatus() : z11 ? mb.d.DENIED.getStatus() : mb.d.UNDETERMINED.getStatus());
            bundle.putBoolean("canAskAgain", z12);
            bundle.putBoolean("granted", z10);
            promise.resolve(bundle);
        }
        z11 = false;
        if (!permissionsMap.isEmpty()) {
        }
        z12 = true;
        Bundle bundle2 = new Bundle();
        bundle2.putString("expires", "never");
        bundle2.putString("status", !z10 ? mb.d.GRANTED.getStatus() : z11 ? mb.d.DENIED.getStatus() : mb.d.UNDETERMINED.getStatus());
        bundle2.putBoolean("canAskAgain", z12);
        bundle2.putBoolean("granted", z10);
        promise.resolve(bundle2);
    }

    private final boolean F() {
        return Settings.System.canWrite(this.f38870a.getApplicationContext());
    }

    private final boolean G(String str) {
        return Intrinsics.b(str, "android.permission.WRITE_SETTINGS") ? F() : B(str) == 0;
    }

    private final Map H(String[] strArr, int[] iArr) {
        HashMap hashMap = new HashMap();
        for (Pair pair : AbstractC3574i.A0(iArr, strArr)) {
            int intValue = ((Number) pair.getFirst()).intValue();
            String str = (String) pair.getSecond();
            hashMap.put(str, D(str, intValue));
        }
        return hashMap;
    }

    private final void r(String[] strArr) {
        SharedPreferences sharedPreferences = this.f38877h;
        if (sharedPreferences == null) {
            Intrinsics.v("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : strArr) {
            edit.putBoolean(str, true);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(e this$0, mb.c responseListener, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(responseListener, "$responseListener");
        int i10 = this$0.F() ? 0 : -1;
        Intrinsics.d(map);
        map.put("android.permission.WRITE_SETTINGS", this$0.D("android.permission.WRITE_SETTINGS", i10));
        responseListener.a(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(e this$0, Ba.d promise, String[] permissions, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(permissions, "$permissions");
        this$0.b(promise, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    private final void v() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + this.f38870a.getPackageName()));
        intent.addFlags(268435456);
        this.f38872c = true;
        this.f38870a.startActivity(intent);
    }

    private final boolean w(String str) {
        Activity a10;
        Ea.b bVar = this.f38871b;
        return (bVar == null || (a10 = bVar.a()) == null || !AbstractC1480b.y(a10, str)) ? false : true;
    }

    private final h x() {
        return new h() { // from class: qa.a
            @Override // O4.h
            public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
                boolean y10;
                y10 = e.y(e.this, i10, strArr, iArr);
                return y10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(e this$0, int i10, String[] receivePermissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(receivePermissions, "receivePermissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i10 != 13) {
            return false;
        }
        synchronized (this$0) {
            try {
                mb.c cVar = this$0.f38876g;
                if (cVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.a(this$0.H(receivePermissions, grantResults));
                this$0.f38876g = null;
                Pair pair = (Pair) this$0.f38875f.poll();
                if (pair != null) {
                    Intrinsics.d(pair);
                    Ea.b bVar = this$0.f38871b;
                    Object a10 = bVar != null ? bVar.a() : null;
                    g gVar = a10 instanceof g ? (g) a10 : null;
                    if (gVar != null) {
                        this$0.f38876g = (mb.c) pair.d();
                        gVar.c((String[]) pair.c(), 13, this$0.x());
                        return false;
                    }
                    mb.c cVar2 = (mb.c) pair.d();
                    String[] strArr = (String[]) pair.c();
                    int length = ((Object[]) pair.c()).length;
                    int[] iArr = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr[i11] = -1;
                    }
                    cVar2.a(this$0.H(strArr, iArr));
                    for (Pair pair2 : this$0.f38875f) {
                        mb.c cVar3 = (mb.c) pair2.d();
                        String[] strArr2 = (String[]) pair2.c();
                        int length2 = ((Object[]) pair2.c()).length;
                        int[] iArr2 = new int[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            iArr2[i12] = -1;
                        }
                        cVar3.a(this$0.H(strArr2, iArr2));
                    }
                    this$0.f38875f.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected int C(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return androidx.core.content.a.a(this.f38870a, permission);
    }

    @Override // mb.InterfaceC3663a
    public void b(final Ba.d promise, String... permissions) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        g(new mb.c() { // from class: qa.d
            @Override // mb.c
            public final void a(Map map) {
                e.E(Ba.d.this, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    @Override // Ea.d
    public List e() {
        return CollectionsKt.e(InterfaceC3663a.class);
    }

    @Override // mb.InterfaceC3663a
    public boolean f(String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        try {
            PackageInfo packageInfo = this.f38870a.getPackageManager().getPackageInfo(this.f38870a.getPackageName(), 4096);
            if (packageInfo != null) {
                String[] strArr = packageInfo.requestedPermissions;
                Intrinsics.d(strArr);
                return AbstractC3574i.v(strArr, permission);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @Override // mb.InterfaceC3663a
    public void g(mb.c responseListener, String... permissions) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList(permissions.length);
        for (String str : permissions) {
            arrayList.add(Integer.valueOf(G(str) ? 0 : -1));
        }
        responseListener.a(H(permissions, CollectionsKt.N0(arrayList)));
    }

    @Override // mb.InterfaceC3663a
    public boolean h(String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        for (String str : permissions) {
            if (!G(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // Ea.k
    public void i(Ba.b moduleRegistry) {
        Intrinsics.checkNotNullParameter(moduleRegistry, "moduleRegistry");
        Ea.b bVar = (Ea.b) moduleRegistry.b(Ea.b.class);
        if (bVar == null) {
            throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
        }
        this.f38871b = bVar;
        ((Fa.c) moduleRegistry.b(Fa.c.class)).d(this);
        SharedPreferences sharedPreferences = this.f38870a.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f38877h = sharedPreferences;
    }

    @Override // mb.InterfaceC3663a
    public void l(final Ba.d promise, final String... permissions) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        m(new mb.c() { // from class: qa.b
            @Override // mb.c
            public final void a(Map map) {
                e.u(e.this, promise, permissions, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    @Override // mb.InterfaceC3663a
    public void m(final mb.c responseListener, String... permissions) {
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        if (permissions.length == 0) {
            responseListener.a(new LinkedHashMap());
            return;
        }
        if (!AbstractC3574i.v(permissions, "android.permission.WRITE_SETTINGS")) {
            s(permissions, responseListener);
            return;
        }
        List v02 = AbstractC3574i.v0(permissions);
        v02.remove("android.permission.WRITE_SETTINGS");
        String[] strArr = (String[]) v02.toArray(new String[0]);
        mb.c cVar = new mb.c() { // from class: qa.c
            @Override // mb.c
            public final void a(Map map) {
                e.t(e.this, responseListener, map);
            }
        };
        if (F()) {
            if (strArr.length == 0) {
                cVar.a(new LinkedHashMap());
                return;
            } else {
                s(strArr, cVar);
                return;
            }
        }
        if (this.f38873d != null) {
            throw new IllegalStateException("Another permissions request is in progress. Await the old request and then try again.");
        }
        this.f38873d = cVar;
        this.f38874e = strArr;
        r(new String[]{"android.permission.WRITE_SETTINGS"});
        v();
    }

    @Override // Ea.f
    public void onHostResume() {
        if (this.f38872c) {
            this.f38872c = false;
            mb.c cVar = this.f38873d;
            Intrinsics.d(cVar);
            String[] strArr = this.f38874e;
            Intrinsics.d(strArr);
            this.f38873d = null;
            this.f38874e = null;
            if (strArr.length == 0) {
                cVar.a(new LinkedHashMap());
            } else {
                s(strArr, cVar);
            }
        }
    }

    protected void s(String[] permissions, mb.c listener) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(listener, "listener");
        z((String[]) Arrays.copyOf(permissions, permissions.length), listener);
    }

    protected final void z(String[] permissions, mb.c listener) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(listener, "listener");
        r(permissions);
        Ea.b bVar = this.f38871b;
        ComponentCallbacks2 a10 = bVar != null ? bVar.a() : null;
        if (!(a10 instanceof g)) {
            int length = permissions.length;
            int[] iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = -1;
            }
            listener.a(H(permissions, iArr));
            return;
        }
        synchronized (this) {
            try {
                if (this.f38876g != null) {
                    this.f38875f.add(t.a(permissions, listener));
                } else {
                    this.f38876g = listener;
                    ((g) a10).c(permissions, 13, x());
                    Unit unit = Unit.f36324a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Ea.f
    public void onHostDestroy() {
    }

    @Override // Ea.f
    public void onHostPause() {
    }
}
