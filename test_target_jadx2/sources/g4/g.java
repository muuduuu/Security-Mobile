package g4;

import c3.AbstractC1721a;

/* loaded from: classes.dex */
public abstract class g extends AbstractC3186a {
    protected void finalize() {
        if (isClosed()) {
            return;
        }
        AbstractC1721a.L("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
