package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0394b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0394b c0394b = new DynamiteModule.b.C0394b();
        int a10 = aVar.a(context, str, true);
        c0394b.f23573b = a10;
        if (a10 != 0) {
            c0394b.f23574c = 1;
        } else {
            int b10 = aVar.b(context, str);
            c0394b.f23572a = b10;
            if (b10 != 0) {
                c0394b.f23574c = -1;
            }
        }
        return c0394b;
    }
}
