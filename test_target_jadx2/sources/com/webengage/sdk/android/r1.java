package com.webengage.sdk.android;

import android.content.Intent;
import android.location.Location;
import com.webengage.sdk.android.t1;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class r1 {
    public abstract Location a();

    public abstract List<t1.a> a(Intent intent);

    public abstract void a(double d10, double d11, float f10, String str, WebEngageConfig webEngageConfig);

    protected abstract void a(long j10, long j11, float f10, int i10);

    public abstract void a(List<String> list);

    public abstract Location b(Intent intent);

    protected abstract void b();
}
