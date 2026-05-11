package g6;

import com.github.penfeizhou.animation.io.Reader;
import h6.C3283a;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;

/* loaded from: classes2.dex */
public abstract class c {
    public static boolean a(Reader reader) {
        try {
            return AvifDecoder.isAvifImage((reader instanceof C3283a ? (C3283a) reader : new C3283a(reader)).a());
        } catch (IOException unused) {
            return false;
        }
    }
}
