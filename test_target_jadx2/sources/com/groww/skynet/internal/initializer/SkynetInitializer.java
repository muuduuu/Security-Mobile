package com.groww.skynet.internal.initializer;

import android.content.Context;
import j9.C3519a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o1.InterfaceC3739a;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/groww/skynet/internal/initializer/SkynetInitializer;", "Lo1/a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "Ljava/lang/Class;", C4870a.f43493a, "()Ljava/util/List;", "skynet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkynetInitializer implements InterfaceC3739a {
    @Override // o1.InterfaceC3739a
    public List a() {
        return new ArrayList();
    }

    @Override // o1.InterfaceC3739a
    public /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Unit.f36324a;
    }

    public void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C3519a.f35925m.a(context);
    }
}
