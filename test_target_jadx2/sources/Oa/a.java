package Oa;

import android.content.Context;
import java.io.File;
import java.util.List;
import kb.InterfaceC3557a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class a implements InterfaceC3557a, Ea.d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7160a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7160a = context;
    }

    @Override // kb.InterfaceC3557a
    public File a() {
        File cacheDir = this.f7160a.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return cacheDir;
    }

    @Override // Ea.d
    public List e() {
        return CollectionsKt.e(InterfaceC3557a.class);
    }
}
