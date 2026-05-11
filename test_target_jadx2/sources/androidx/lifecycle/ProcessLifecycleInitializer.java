package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o1.InterfaceC3739a;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lo1/a;", "Landroidx/lifecycle/p;", "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Landroidx/lifecycle/p;", BuildConfig.FLAVOR, "Ljava/lang/Class;", C4870a.f43493a, "()Ljava/util/List;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC3739a {
    @Override // o1.InterfaceC3739a
    public List a() {
        return CollectionsKt.j();
    }

    @Override // o1.InterfaceC3739a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1599p b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.startup.a e10 = androidx.startup.a.e(context);
        Intrinsics.checkNotNullExpressionValue(e10, "getInstance(context)");
        if (!e10.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C1595l.a(context);
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
        companion.b(context);
        return companion.a();
    }
}
