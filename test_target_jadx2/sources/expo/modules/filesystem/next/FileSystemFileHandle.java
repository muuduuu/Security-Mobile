package expo.modules.filesystem.next;

import Pa.l;
import Pa.m;
import expo.modules.kotlin.sharedobjects.SharedRef;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lexpo/modules/filesystem/next/FileSystemFileHandle;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Ljava/nio/channels/FileChannel;", "Ljava/lang/AutoCloseable;", "Lexpo/modules/filesystem/next/FileSystemFile;", "file", "<init>", "(Lexpo/modules/filesystem/next/FileSystemFile;)V", BuildConfig.FLAVOR, "u", "()V", "r", "close", BuildConfig.FLAVOR, "length", BuildConfig.FLAVOR, "z", "(I)[B", "data", "F", "([B)V", "e", "Ljava/nio/channels/FileChannel;", "fileChannel", BuildConfig.FLAVOR, "value", "x", "()Ljava/lang/Long;", "C", "(Ljava/lang/Long;)V", "offset", "y", "size", "expo-file-system_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileSystemFileHandle extends SharedRef<FileChannel> implements AutoCloseable {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final FileChannel fileChannel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileSystemFileHandle(FileSystemFile file) {
        super(r3, null, 2, null);
        Intrinsics.checkNotNullParameter(file, "file");
        FileChannel channel = new RandomAccessFile(file.getFile(), "rw").getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
        this.fileChannel = (FileChannel) getRef();
    }

    private final void u() {
        if (!this.fileChannel.isOpen()) {
            throw new l("file handle is closed");
        }
    }

    public final void C(Long l10) {
        if (l10 == null) {
            return;
        }
        this.fileChannel.position(l10.longValue());
    }

    public final void F(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        u();
        try {
            this.fileChannel.write(ByteBuffer.wrap(data));
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new m(message);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.fileChannel.close();
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void r() {
        close();
    }

    public final Long x() {
        try {
            return Long.valueOf(this.fileChannel.position());
        } catch (Exception unused) {
            return null;
        }
    }

    public final Long y() {
        try {
            return Long.valueOf(this.fileChannel.size());
        } catch (Exception unused) {
            return null;
        }
    }

    public final byte[] z(int length) {
        u();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(d.h(length, (int) (this.fileChannel.size() - this.fileChannel.position())));
            this.fileChannel.read(allocate);
            byte[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            return array;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new l(message);
        }
    }
}
