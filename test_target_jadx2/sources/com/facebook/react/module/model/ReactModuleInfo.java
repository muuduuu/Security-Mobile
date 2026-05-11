package com.facebook.react.module.model;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ReactModuleInfo {

    /* renamed from: g, reason: collision with root package name */
    public static final a f21713g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f21714a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21715b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21716c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21717d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21718e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21719f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return TurboModule.class.isAssignableFrom(clazz);
        }

        private a() {
        }
    }

    public ReactModuleInfo(String _name, String _className, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(_name, "_name");
        Intrinsics.checkNotNullParameter(_className, "_className");
        this.f21714a = _name;
        this.f21715b = _className;
        this.f21716c = z10;
        this.f21717d = z11;
        this.f21718e = z12;
        this.f21719f = z13;
    }

    public static final boolean b(Class cls) {
        return f21713g.a(cls);
    }

    public final boolean a() {
        return this.f21716c;
    }

    public final String c() {
        return this.f21715b;
    }

    public final boolean d() {
        return this.f21718e;
    }

    public final boolean e() {
        return this.f21719f;
    }

    public final String f() {
        return this.f21714a;
    }

    public final boolean g() {
        return this.f21717d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactModuleInfo(String name, String className, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(name, className, z10, z11, z13, z14);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
    }
}
