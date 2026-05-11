package ja;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: ja.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3520a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3520a f35951a = new C3520a();

    private C3520a() {
    }

    public final boolean a(Context context) {
        PackageManager packageManager;
        return (context == null || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.software.leanback")) ? false : true;
    }
}
