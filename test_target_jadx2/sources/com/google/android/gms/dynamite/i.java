package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class i implements DynamiteModule.b {
    i() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0394b a(Context context, String str, DynamiteModule.b.a aVar) {
        int a10;
        DynamiteModule.b.C0394b c0394b = new DynamiteModule.b.C0394b();
        int b10 = aVar.b(context, str);
        c0394b.f23572a = b10;
        int i10 = 1;
        int i11 = 0;
        if (b10 != 0) {
            a10 = aVar.a(context, str, false);
            c0394b.f23573b = a10;
        } else {
            a10 = aVar.a(context, str, true);
            c0394b.f23573b = a10;
        }
        int i12 = c0394b.f23572a;
        if (i12 != 0) {
            i11 = i12;
        } else if (a10 == 0) {
            i10 = 0;
            c0394b.f23574c = i10;
            return c0394b;
        }
        if (i11 >= a10) {
            i10 = -1;
        }
        c0394b.f23574c = i10;
        return c0394b;
    }
}
