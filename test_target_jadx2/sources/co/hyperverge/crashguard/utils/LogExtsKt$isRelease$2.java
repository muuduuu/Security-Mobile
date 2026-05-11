package co.hyperverge.crashguard.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import xc.m;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class LogExtsKt$isRelease$2 extends m implements Function0<Boolean> {
    public static final LogExtsKt$isRelease$2 INSTANCE = new LogExtsKt$isRelease$2();

    LogExtsKt$isRelease$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!LogExtsKt.isDebug());
    }
}
