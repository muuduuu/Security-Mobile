package com.facebook.react.modules.network;

import Td.E;
import Td.z;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import c3.AbstractC1721a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import pe.C3880h;
import pe.InterfaceC3878f;
import pe.M;
import pe.b0;

/* loaded from: classes.dex */
abstract class o {

    class a extends E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f21857a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f21858b;

        a(z zVar, InputStream inputStream) {
            this.f21857a = zVar;
            this.f21858b = inputStream;
        }

        @Override // Td.E
        public long contentLength() {
            try {
                return this.f21858b.available();
            } catch (IOException unused) {
                return 0L;
            }
        }

        @Override // Td.E
        /* renamed from: contentType */
        public z getContentType() {
            return this.f21857a;
        }

        @Override // Td.E
        public void writeTo(InterfaceC3878f interfaceC3878f) {
            b0 b0Var = null;
            try {
                b0Var = M.k(this.f21858b);
                interfaceC3878f.s0(b0Var);
            } finally {
                o.b(b0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(b0 b0Var) {
        try {
            b0Var.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static E c(z zVar, InputStream inputStream) {
        return new a(zVar, inputStream);
    }

    public static E d(z zVar, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return E.create(zVar, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public static k e(E e10, j jVar) {
        return new k(e10, jVar);
    }

    private static InputStream f(Context context, Uri uri) {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            InputStream openStream = url.openStream();
            try {
                ReadableByteChannel newChannel = Channels.newChannel(openStream);
                try {
                    fileOutputStream.getChannel().transferFrom(newChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    if (newChannel != null) {
                        newChannel.close();
                    }
                    if (openStream != null) {
                        openStream.close();
                    }
                    fileOutputStream.close();
                    return fileInputStream;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static E g(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return E.create((z) null, C3880h.f38684e);
        }
        return null;
    }

    public static InputStream h(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme().startsWith("http") ? f(context, parse) : str.startsWith("data:") ? new ByteArrayInputStream(Base64.decode(str.split(",")[1], 0)) : context.getContentResolver().openInputStream(parse);
        } catch (Exception e10) {
            AbstractC1721a.n("ReactNative", "Could not retrieve file for contentUri " + str, e10);
            return null;
        }
    }

    public static boolean i(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
