package g9;

import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1598o;
import b8.C1659f;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import java.io.Closeable;

/* renamed from: g9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3204d extends Closeable, InterfaceC1598o {
    Task D(C3102a c3102a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @A(AbstractC1592i.a.ON_DESTROY)
    void close();

    Task x0(C1659f c1659f);
}
