package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class j implements DynamiteModule.b {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0394b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0394b c0394b = new DynamiteModule.b.C0394b();
        c0394b.f23572a = aVar.b(context, str);
        int i10 = 1;
        int a10 = aVar.a(context, str, true);
        c0394b.f23573b = a10;
        int i11 = c0394b.f23572a;
        if (i11 == 0) {
            i11 = 0;
            if (a10 == 0) {
                i10 = 0;
                c0394b.f23574c = i10;
                return c0394b;
            }
        }
        if (a10 < i11) {
            i10 = -1;
        }
        c0394b.f23574c = i10;
        return c0394b;
    }
}
