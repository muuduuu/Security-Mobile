package co.hyperverge.hypersnapsdk.service.zipper;

import co.hyperverge.hypersnapsdk.utils.HVLogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.io.b;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\u0003J\b\u0010\u0012\u001a\u00020\nH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/zipper/FileZipper;", BuildConfig.FLAVOR, "framesZipFile", "Ljava/io/File;", "(Ljava/io/File;)V", "fileOutputStream", "Ljava/io/FileOutputStream;", "zipOutputStream", "Ljava/util/zip/ZipOutputStream;", "addFileToZip", BuildConfig.FLAVOR, "filePath", BuildConfig.FLAVOR, "fileNameWithExtension", "shouldDeleteOriginal", BuildConfig.FLAVOR, "closeZipStream", "getZipFile", "initializeZipStream", "Companion", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileZipper {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "FileZipper";
    private FileOutputStream fileOutputStream;
    private final File framesZipFile;
    private ZipOutputStream zipOutputStream;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lco/hyperverge/hypersnapsdk/service/zipper/FileZipper$Companion;", BuildConfig.FLAVOR, "()V", "TAG", BuildConfig.FLAVOR, "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FileZipper(File framesZipFile) {
        Intrinsics.checkNotNullParameter(framesZipFile, "framesZipFile");
        this.framesZipFile = framesZipFile;
        initializeZipStream();
    }

    public static /* synthetic */ void addFileToZip$default(FileZipper fileZipper, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fileZipper.addFileToZip(str, str2, z10);
    }

    private final void initializeZipStream() {
        HVLogUtils.d(TAG, "initializeZipStream() called");
        this.fileOutputStream = new FileOutputStream(this.framesZipFile);
        this.zipOutputStream = new ZipOutputStream(this.fileOutputStream);
    }

    public final void addFileToZip(String filePath, String fileNameWithExtension, boolean shouldDeleteOriginal) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileNameWithExtension, "fileNameWithExtension");
        Intrinsics.b(Thread.currentThread().getName(), "main");
        ZipOutputStream zipOutputStream = this.zipOutputStream;
        if (zipOutputStream != null) {
            zipOutputStream.putNextEntry(new ZipEntry(fileNameWithExtension));
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                b.b(fileInputStream, zipOutputStream, 0, 2, null);
                c.a(fileInputStream, null);
                fileInputStream.close();
                if (shouldDeleteOriginal) {
                    file.delete();
                }
                zipOutputStream.closeEntry();
                zipOutputStream.flush();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(fileInputStream, th);
                    throw th2;
                }
            }
        }
    }

    public final void closeZipStream() {
        HVLogUtils.d(TAG, "closeZipStream() called");
        ZipOutputStream zipOutputStream = this.zipOutputStream;
        if (zipOutputStream != null) {
            zipOutputStream.close();
        }
        FileOutputStream fileOutputStream = this.fileOutputStream;
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        this.zipOutputStream = null;
        this.fileOutputStream = null;
    }

    /* renamed from: getZipFile, reason: from getter */
    public final File getFramesZipFile() {
        return this.framesZipFile;
    }
}
