package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1599p;
import androidx.lifecycle.X;
import b1.AbstractC1641b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0294a {
        AbstractC1641b a(int i10, Bundle bundle);

        void b(AbstractC1641b abstractC1641b);

        void c(AbstractC1641b abstractC1641b, Object obj);
    }

    public static a b(InterfaceC1599p interfaceC1599p) {
        return new b(interfaceC1599p, ((X) interfaceC1599p).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract AbstractC1641b c(int i10, Bundle bundle, InterfaceC0294a interfaceC0294a);

    public abstract void d();
}
