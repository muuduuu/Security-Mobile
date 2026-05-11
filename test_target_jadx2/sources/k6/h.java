package k6;

import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h {

    static class a extends IOException {
        a() {
            super("Gif Format error");
        }
    }

    private static void a(GifReader gifReader) {
        byte peek;
        if (gifReader.peek() != 71 || gifReader.peek() != 73 || gifReader.peek() != 70 || gifReader.peek() != 56 || (((peek = gifReader.peek()) != 55 && peek != 57) || gifReader.peek() != 97)) {
            throw new a();
        }
    }

    public static boolean b(Reader reader) {
        try {
            a(reader instanceof GifReader ? (GifReader) reader : new GifReader(reader));
            return true;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List c(GifReader gifReader) {
        a(gifReader);
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.a(gifReader);
        arrayList.add(kVar);
        if (kVar.b()) {
            C3548c c3548c = new C3548c(kVar.c());
            c3548c.a(gifReader);
            arrayList.add(c3548c);
        }
        while (true) {
            try {
                byte peek = gifReader.peek();
                if (peek == 59) {
                    break;
                }
                InterfaceC3547b jVar = peek != 33 ? peek != 44 ? null : new j() : f.b(gifReader);
                if (jVar == null) {
                    throw new a();
                }
                jVar.a(gifReader);
                arrayList.add(jVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }
}
