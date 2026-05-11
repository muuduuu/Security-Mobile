package com.google.android.gms.vision.clearcut;

import E7.c;
import android.content.Context;
import com.google.android.gms.internal.vision.A0;
import com.google.android.gms.internal.vision.AbstractC2566f;
import com.google.android.gms.internal.vision.C2619x;

/* loaded from: classes2.dex */
public class VisionClearcutLogger {
    private final Q6.a zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new Q6.a(context, "VISION", null);
    }

    public final void zza(int i10, C2619x c2619x) {
        byte[] e10 = c2619x.e();
        if (i10 < 0 || i10 > 3) {
            c.d("Illegal event code: %d", Integer.valueOf(i10));
            return;
        }
        try {
            if (this.zzb) {
                this.zza.a(e10).b(i10).a();
                return;
            }
            C2619x.a t10 = C2619x.t();
            try {
                t10.h(e10, 0, e10.length, A0.c());
                c.b("Would have logged:\n%s", t10.toString());
            } catch (Exception e11) {
                c.c(e11, "Parsing error", new Object[0]);
            }
        } catch (Exception e12) {
            AbstractC2566f.b(e12);
            c.c(e12, "Failed to log", new Object[0]);
        }
    }
}
