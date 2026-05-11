package S0;

import android.text.Editable;
import androidx.emoji2.text.o;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8664a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f8665b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f8666c;

    private b() {
        try {
            f8666c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f8665b == null) {
            synchronized (f8664a) {
                try {
                    if (f8665b == null) {
                        f8665b = new b();
                    }
                } finally {
                }
            }
        }
        return f8665b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f8666c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
