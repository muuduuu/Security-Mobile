package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.imagepipeline.producers.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1848o extends L {
    public C1848o(e3.i iVar) {
        super(Z2.a.a(), iVar);
    }

    static byte[] g(String str) {
        b3.l.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        b3.l.g(decode);
        return decode.getBytes();
    }

    static boolean h(String str) {
        if (!str.contains(";")) {
            return false;
        }
        return str.split(";")[r2.length - 1].equals("base64");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected g4.i e(m4.b bVar) {
        byte[] g10 = g(bVar.u().toString());
        return c(new ByteArrayInputStream(g10), g10.length);
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "DataFetchProducer";
    }
}
