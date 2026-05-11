package Ib;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.k;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f4397a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f4398b;

    public c(View view, Function1 function1) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f4397a = function1;
        this.f4398b = new WeakReference(view);
    }

    public final b a(View thisRef, k property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        View view = (View) this.f4398b.get();
        if (view != null) {
            return new a(property.getName(), view, this.f4397a);
        }
        throw new IllegalStateException("Can't send the '" + property.getName() + "' event from the view that is deallocated");
    }
}
