package a1;

import Z0.a;
import androidx.lifecycle.InterfaceC1590g;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1342g f12546a = new C1342g();

    /* renamed from: a1.g$a */
    public static final class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12547a = new a();

        private a() {
        }
    }

    private C1342g() {
    }

    public final Z0.a a(X owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1590g ? ((InterfaceC1590g) owner).getDefaultViewModelCreationExtras() : a.C0228a.f12277b;
    }

    public final V.c b(X owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1590g ? ((InterfaceC1590g) owner).getDefaultViewModelProviderFactory() : C1338c.f12540b;
    }

    public final String c(kotlin.reflect.d modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String a10 = AbstractC1343h.a(modelClass);
        if (a10 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + a10;
    }

    public final S d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
