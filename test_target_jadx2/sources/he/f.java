package he;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final f f34089a = new f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        int b10;
        Intrinsics.checkNotNullParameter(record, "record");
        e eVar = e.f34086a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "getLoggerName(...)");
        b10 = g.b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        eVar.a(loggerName, b10, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
