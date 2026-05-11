package com.webengage.sdk.android;

import com.webengage.sdk.android.f3;
import com.webengage.sdk.android.j3;

/* loaded from: classes2.dex */
public class c1 extends k3 {

    /* renamed from: c, reason: collision with root package name */
    private final j3 f30479c;

    /* renamed from: d, reason: collision with root package name */
    private final j3 f30480d;

    public c1(float f10, float f11) {
        j3.a aVar = j3.a.EM;
        this.f30479c = new j3(f10, aVar);
        this.f30480d = new j3(f11, aVar);
    }

    @Override // com.webengage.sdk.android.k3
    public f3 c() {
        return super.c().b(this.f30479c).a(f3.d.BOLD).a(f3.b.BLOCK).d(this.f30480d).g(this.f30480d);
    }
}
