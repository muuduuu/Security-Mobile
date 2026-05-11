package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m4.b;

/* renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853u {

    /* renamed from: a, reason: collision with root package name */
    public static final C1853u f21030a = new C1853u();

    /* renamed from: com.facebook.imagepipeline.producers.u$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private C1853u() {
    }

    public static final Z3.j a(m4.b imageRequest, Z3.j jVar, Z3.j jVar2, Map map) {
        String f10;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.c() == b.EnumC0557b.SMALL) {
            return jVar;
        }
        if (imageRequest.c() == b.EnumC0557b.DEFAULT) {
            return jVar2;
        }
        if (imageRequest.c() != b.EnumC0557b.DYNAMIC || map == null || (f10 = imageRequest.f()) == null) {
            return null;
        }
        return (Z3.j) map.get(f10);
    }
}
