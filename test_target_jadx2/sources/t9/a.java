package T9;

import L9.d;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9501a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference f9502b;

    private a() {
    }

    public final void a() {
        EditText editText;
        WeakReference weakReference = f9502b;
        if (weakReference == null || (editText = (EditText) weakReference.get()) == null) {
            return;
        }
        d.c(editText);
    }

    public final EditText b() {
        WeakReference weakReference = f9502b;
        if (weakReference != null) {
            return (EditText) weakReference.get();
        }
        return null;
    }

    public final void c(EditText textInput) {
        Intrinsics.checkNotNullParameter(textInput, "textInput");
        f9502b = new WeakReference(textInput);
    }
}
