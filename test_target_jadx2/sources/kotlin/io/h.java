package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class h extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final File f36386a;

    /* renamed from: b, reason: collision with root package name */
    private final File f36387b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36388c;

    public /* synthetic */ h(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(File file, File file2, String str) {
        super(r0);
        String b10;
        Intrinsics.checkNotNullParameter(file, "file");
        b10 = d.b(file, file2, str);
        this.f36386a = file;
        this.f36387b = file2;
        this.f36388c = str;
    }
}
