package com.google.android.gms.vision.clearcut;

import E7.c;
import android.content.Context;
import com.google.android.gms.internal.vision.AbstractC2554c;
import com.google.android.gms.internal.vision.AbstractC2591n0;
import com.google.android.gms.internal.vision.C2619x;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza = AbstractC2554c.a().h(2, AbstractC2591n0.f25175a);
    private b zzb = new b(0.03333333333333333d);
    private VisionClearcutLogger zzc;

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i10, C2619x c2619x) {
        if (i10 != 3 || this.zzb.a()) {
            zza.execute(new a(this, i10, c2619x));
        } else {
            c.e("Skipping image analysis log due to rate limiting", new Object[0]);
        }
    }
}
