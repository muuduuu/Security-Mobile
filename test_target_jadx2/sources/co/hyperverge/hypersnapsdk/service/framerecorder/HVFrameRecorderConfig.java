package co.hyperverge.hypersnapsdk.service.framerecorder;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/framerecorder/HVFrameRecorderConfig;", BuildConfig.FLAVOR, "filesDir", "Ljava/io/File;", "numberOfFrames", BuildConfig.FLAVOR, "shouldSaveFrames", BuildConfig.FLAVOR, "(Ljava/io/File;IZ)V", "getFilesDir", "()Ljava/io/File;", "getNumberOfFrames", "()I", "getShouldSaveFrames", "()Z", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HVFrameRecorderConfig {
    private final File filesDir;
    private final int numberOfFrames;
    private final boolean shouldSaveFrames;

    public HVFrameRecorderConfig(File filesDir, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(filesDir, "filesDir");
        this.filesDir = filesDir;
        this.numberOfFrames = i10;
        this.shouldSaveFrames = z10;
    }

    public final File getFilesDir() {
        return this.filesDir;
    }

    public final int getNumberOfFrames() {
        return this.numberOfFrames;
    }

    public final boolean getShouldSaveFrames() {
        return this.shouldSaveFrames;
    }
}
