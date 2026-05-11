package expo.modules.kotlin.views;

import Db.C0792a;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f32728a;

    /* renamed from: b, reason: collision with root package name */
    private final C0792a f32729b;

    public a(String name, C0792a type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f32728a = name;
        this.f32729b = type;
    }

    public final String a() {
        return this.f32728a;
    }

    public final C0792a b() {
        return this.f32729b;
    }

    public abstract void c(Dynamic dynamic, View view, C3862a c3862a);
}
