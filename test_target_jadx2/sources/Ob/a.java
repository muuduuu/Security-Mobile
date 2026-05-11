package Ob;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private float f7277a;

    /* renamed from: b, reason: collision with root package name */
    private float f7278b;

    /* renamed from: c, reason: collision with root package name */
    private int f7279c;

    public a(float f10, float f11, int i10) {
        this.f7277a = f10;
        this.f7278b = f11;
        this.f7279c = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putFloat("trueHeading", this.f7277a);
        bundle.putFloat("magHeading", this.f7278b);
        bundle.putInt("accuracy", this.f7279c);
        return bundle;
    }
}
