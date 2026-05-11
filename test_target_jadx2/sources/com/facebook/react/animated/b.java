package com.facebook.react.animated;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f21263e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public List f21264a;

    /* renamed from: b, reason: collision with root package name */
    public int f21265b;

    /* renamed from: c, reason: collision with root package name */
    public int f21266c;

    /* renamed from: d, reason: collision with root package name */
    public int f21267d = -1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void b(b child) {
        Intrinsics.checkNotNullParameter(child, "child");
        List list = this.f21264a;
        if (list == null) {
            list = new ArrayList(1);
            this.f21264a = list;
        }
        list.add(child);
        child.c(this);
    }

    public void c(b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    public void d(b parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
    }

    public abstract String e();

    public final String f() {
        String str;
        List list = this.f21264a;
        String l02 = list != null ? CollectionsKt.l0(list, " ", null, null, 0, null, null, 62, null) : null;
        String e10 = e();
        if (l02 == null || StringsKt.Z(l02)) {
            str = BuildConfig.FLAVOR;
        } else {
            str = " children: " + l02;
        }
        return e10 + str;
    }

    public final void g(b child) {
        Intrinsics.checkNotNullParameter(child, "child");
        List list = this.f21264a;
        if (list == null) {
            return;
        }
        child.d(this);
        list.remove(child);
    }

    public void h() {
    }
}
