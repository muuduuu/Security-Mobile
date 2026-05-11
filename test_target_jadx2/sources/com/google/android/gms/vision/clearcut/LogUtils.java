package com.google.android.gms.vision.clearcut;

import E7.c;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.vision.C2;
import com.google.android.gms.internal.vision.C2578j;
import com.google.android.gms.internal.vision.C2593o;
import com.google.android.gms.internal.vision.C2604s;
import com.google.android.gms.internal.vision.C2616w;
import com.google.android.gms.internal.vision.C2619x;
import com.google.android.gms.internal.vision.N0;
import com.google.android.gms.internal.vision.r;
import d7.C2998d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class LogUtils {
    public static C2619x zza(long j10, int i10, String str, String str2, List<C2616w> list, C2 c22) {
        r.a t10 = r.t();
        C2593o.b y10 = C2593o.t().x(str2).s(j10).y(i10);
        y10.w(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((C2593o) ((N0) y10.q()));
        return (C2619x) ((N0) C2619x.t().s((r) ((N0) t10.w(arrayList).s((C2604s) ((N0) C2604s.t().w(c22.f25003b).s(c22.f25002a).x(c22.f25004c).y(c22.f25005d).q())).q())).q());
    }

    private static String zzb(Context context) {
        try {
            return C2998d.a(context).e(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            c.c(e10, "Unable to find calling package info for %s", context.getPackageName());
            return null;
        }
    }

    public static C2578j zza(Context context) {
        C2578j.a s10 = C2578j.t().s(context.getPackageName());
        String zzb = zzb(context);
        if (zzb != null) {
            s10.w(zzb);
        }
        return (C2578j) ((N0) s10.q());
    }
}
