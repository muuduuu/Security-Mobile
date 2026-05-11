package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class g implements DynamiteModule.b {
    g() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0394b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0394b c0394b = new DynamiteModule.b.C0394b();
        int a10 = aVar.a(context, str, false);
        c0394b.f23573b = a10;
        c0394b.f23574c = a10 != 0 ? 1 : 0;
        return c0394b;
    }
}
