package com.swmansion.rnscreens.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0440a f30054c = new C0440a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final a f30055d = new a(new b(Integer.MIN_VALUE, false), 0.0f);

    /* renamed from: a, reason: collision with root package name */
    private final b f30056a;

    /* renamed from: b, reason: collision with root package name */
    private final float f30057b;

    /* renamed from: com.swmansion.rnscreens.utils.a$a, reason: collision with other inner class name */
    public static final class C0440a {
        public /* synthetic */ C0440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f30055d;
        }

        private C0440a() {
        }
    }

    public a(b cacheKey, float f10) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.f30056a = cacheKey;
        this.f30057b = f10;
    }

    public final float b() {
        return this.f30057b;
    }

    public final boolean c(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f30056a.a() != Integer.MIN_VALUE && Intrinsics.b(this.f30056a, key);
    }
}
