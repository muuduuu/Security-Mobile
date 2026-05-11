package l1;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface g extends Closeable {
    boolean D1();

    void I0();

    String J();

    void J0(String str, Object[] objArr);

    void K0();

    boolean K1();

    int L0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    void P();

    Cursor T(j jVar);

    List W();

    Cursor X0(String str);

    void Z(String str);

    void b1();

    boolean isOpen();

    k k0(String str);

    Cursor r0(j jVar, CancellationSignal cancellationSignal);
}
