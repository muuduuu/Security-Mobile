package j1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import h1.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l1.g;
import l1.j;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3479b {
    public static final CancellationSignal a() {
        return l1.b.b();
    }

    public static final void b(g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        List c10 = CollectionsKt.c();
        Cursor X02 = db2.X0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = X02;
            while (cursor.moveToNext()) {
                c10.add(cursor.getString(0));
            }
            Unit unit = Unit.f36324a;
            kotlin.io.c.a(X02, null);
            for (String triggerName : CollectionsKt.a(c10)) {
                Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
                if (StringsKt.F(triggerName, "room_fts_content_sync_", false, 2, null)) {
                    db2.Z("DROP TRIGGER IF EXISTS " + triggerName);
                }
            }
        } finally {
        }
    }

    public static final Cursor c(s db2, j sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor z11 = db2.z(sqLiteQuery, cancellationSignal);
        if (!z10 || !(z11 instanceof AbstractWindowedCursor)) {
            return z11;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) z11;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? AbstractC3478a.a(z11) : z11;
    }

    public static final int d(File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i10 = allocate.getInt();
            kotlin.io.c.a(channel, null);
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.io.c.a(channel, th);
                throw th2;
            }
        }
    }
}
