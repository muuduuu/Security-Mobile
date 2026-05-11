package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* renamed from: com.facebook.soloader.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1998a extends E implements w {

    /* renamed from: a, reason: collision with root package name */
    private final int f23039a;

    /* renamed from: b, reason: collision with root package name */
    private C2003f f23040b;

    public C1998a(Context context, int i10) {
        this.f23039a = i10;
        this.f23040b = new C2003f(f(context), i10);
    }

    private static File f(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        this.f23040b = new C2003f(f(context), this.f23039a | 1);
        return this;
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return this.f23040b.d(str, i10, threadPolicy);
    }

    @Override // com.facebook.soloader.E
    protected void e(int i10) {
        this.f23040b.e(i10);
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        return c() + "[" + this.f23040b.toString() + "]";
    }
}
