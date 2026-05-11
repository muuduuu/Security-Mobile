package Z8;

import S6.i;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1598o;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public interface a extends Closeable, InterfaceC1598o, i {
    Task D(C3102a c3102a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @A(AbstractC1592i.a.ON_DESTROY)
    void close();
}
