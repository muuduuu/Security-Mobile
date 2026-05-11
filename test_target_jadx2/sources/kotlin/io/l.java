package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l extends k {
    public static final void c(File file, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            l(fileOutputStream, text, charset);
            Unit unit = Unit.f36324a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void d(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        c(file, str, charset);
    }

    public static final ByteBuffer e(int i10, CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        return allocate;
    }

    public static final CharsetEncoder f(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static byte[] g(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArr = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int read = fileInputStream.read(bArr, i12, i11);
                if (read < 0) {
                    break;
                }
                i11 -= read;
                i12 += read;
            }
            if (i11 > 0) {
                bArr = Arrays.copyOf(bArr, i12);
                Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    e eVar = new e(8193);
                    eVar.write(read2);
                    b.b(fileInputStream, eVar, 0, 2, null);
                    int size = eVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a10 = eVar.a();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    bArr = AbstractC3574i.e(a10, copyOf, i10, 0, eVar.size());
                }
            }
            c.a(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final String h(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String f10 = s.f(inputStreamReader);
            c.a(inputStreamReader, null);
            return f10;
        } finally {
        }
    }

    public static /* synthetic */ String i(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return h(file, charset);
    }

    public static final void j(File file, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            l(fileOutputStream, text, charset);
            Unit unit = Unit.f36324a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }

    public static /* synthetic */ void k(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        j(file, str, charset);
    }

    public static final void l(OutputStream outputStream, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder f10 = f(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        Intrinsics.d(f10);
        ByteBuffer e10 = e(8192, f10);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int min = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + min;
            char[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            text.getChars(i10, i12, array, i11);
            allocate.limit(min + i11);
            i11 = 1;
            if (!f10.encode(allocate, e10, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(e10.array(), 0, e10.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i11 = 0;
            }
            allocate.clear();
            e10.clear();
            i10 = i12;
        }
    }
}
