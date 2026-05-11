package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
final class a implements DynamiteModule.b {
    a() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0394b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0394b c0394b = new DynamiteModule.b.C0394b();
        int b10 = aVar.b(context, str);
        c0394b.f23572a = b10;
        c0394b.f23574c = b10 != 0 ? -1 : 0;
        return c0394b;
    }
}
