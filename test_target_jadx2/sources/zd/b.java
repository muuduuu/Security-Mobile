package Zd;

import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import xc.C5146G;

/* loaded from: classes3.dex */
public abstract class b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / HVFrameRecorder.BITRATE) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / HVFrameRecorder.BITRATE) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        C5146G c5146g = C5146G.f44966a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Logger logger, a aVar, c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.h());
        sb2.append(' ');
        C5146G c5146g = C5146G.f44966a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.b());
        logger.fine(sb2.toString());
    }
}
