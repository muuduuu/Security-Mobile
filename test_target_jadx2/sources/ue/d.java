package ue;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char f43780a = File.separatorChar;

    /* renamed from: b, reason: collision with root package name */
    public static final String f43781b;

    static {
        ve.a aVar = new ve.a(4);
        try {
            PrintWriter printWriter = new PrintWriter(aVar);
            try {
                printWriter.println();
                f43781b = aVar.toString();
                printWriter.close();
                aVar.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long e10 = e(inputStream, outputStream);
        if (e10 > 2147483647L) {
            return -1;
        }
        return (int) e10;
    }

    public static int b(Reader reader, Writer writer) {
        long g10 = g(reader, writer);
        if (g10 > 2147483647L) {
            return -1;
        }
        return (int) g10;
    }

    public static long c(InputStream inputStream, OutputStream outputStream, int i10) {
        return f(inputStream, outputStream, new byte[i10]);
    }

    public static void d(InputStream inputStream, Writer writer, Charset charset) {
        b(new InputStreamReader(inputStream, a.a(charset)), writer);
    }

    public static long e(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, 4096);
    }

    public static long f(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += read;
        }
    }

    public static long g(Reader reader, Writer writer) {
        return h(reader, writer, new char[4096]);
    }

    public static long h(Reader reader, Writer writer, char[] cArr) {
        long j10 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j10;
            }
            writer.write(cArr, 0, read);
            j10 += read;
        }
    }

    public static String i(InputStream inputStream) {
        return j(inputStream, Charset.defaultCharset());
    }

    public static String j(InputStream inputStream, Charset charset) {
        ve.a aVar = new ve.a();
        try {
            d(inputStream, aVar, charset);
            String aVar2 = aVar.toString();
            aVar.close();
            return aVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
