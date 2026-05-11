package V6;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.AbstractC2026s;

/* renamed from: V6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1290v {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f11019a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11020b;

    public C1290v(Context context) {
        AbstractC1287s.m(context);
        Resources resources = context.getResources();
        this.f11019a = resources;
        this.f11020b = resources.getResourcePackageName(AbstractC2026s.f23518a);
    }

    public String a(String str) {
        String str2 = this.f11020b;
        Resources resources = this.f11019a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
