package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes2.dex */
public abstract class m {
    public static h a(S8.a aVar) {
        r o10 = aVar.o();
        if (o10 == r.LEGACY_STRICT) {
            aVar.z0(r.LENIENT);
        }
        try {
            try {
                return P8.n.a(aVar);
            } catch (OutOfMemoryError e10) {
                throw new l("Failed parsing JSON source: " + aVar + " to Json", e10);
            } catch (StackOverflowError e11) {
                throw new l("Failed parsing JSON source: " + aVar + " to Json", e11);
            }
        } finally {
            aVar.z0(o10);
        }
    }

    public static h b(Reader reader) {
        try {
            S8.a aVar = new S8.a(reader);
            h a10 = a(aVar);
            if (!a10.r() && aVar.N() != S8.b.END_DOCUMENT) {
                throw new o("Did not consume the entire document.");
            }
            return a10;
        } catch (S8.d e10) {
            throw new o(e10);
        } catch (IOException e11) {
            throw new i(e11);
        } catch (NumberFormatException e12) {
            throw new o(e12);
        }
    }

    public static h c(String str) {
        return b(new StringReader(str));
    }
}
