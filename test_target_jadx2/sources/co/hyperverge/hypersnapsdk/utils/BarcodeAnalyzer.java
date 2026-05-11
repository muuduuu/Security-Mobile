package co.hyperverge.hypersnapsdk.utils;

import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import android.graphics.Matrix;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.f;
import b9.C1662a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e9.C3102a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BarcodeAnalyzer implements f.a {
    private static final String TAG = "co.hyperverge.hypersnapsdk.utils.BarcodeAnalyzer";
    private final BarcodeListener barcodeListener;
    private final Z8.a scanner;

    public interface BarcodeListener {
        void onBarcodeDetected(String str);
    }

    public BarcodeAnalyzer(Z8.b bVar, BarcodeListener barcodeListener) {
        this.scanner = Z8.c.a(bVar);
        this.barcodeListener = barcodeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$analyze$0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1662a c1662a = (C1662a) it.next();
            if (c1662a.e() != null) {
                this.barcodeListener.onBarcodeDetected(c1662a.e());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$analyze$1(Exception exc) {
        HVLogUtils.d(TAG, "Barcode scanning failed: " + exc);
    }

    @Override // androidx.camera.core.f.a
    public void analyze(final androidx.camera.core.n nVar) {
        Image E12 = nVar.E1();
        if (E12 == null) {
            nVar.close();
        } else {
            this.scanner.D(C3102a.d(E12, nVar.G().d())).f(new InterfaceC0783g() { // from class: co.hyperverge.hypersnapsdk.utils.a
                @Override // D7.InterfaceC0783g
                public final void onSuccess(Object obj) {
                    BarcodeAnalyzer.this.lambda$analyze$0((List) obj);
                }
            }).d(new InterfaceC0782f() { // from class: co.hyperverge.hypersnapsdk.utils.b
                @Override // D7.InterfaceC0782f
                public final void b(Exception exc) {
                    BarcodeAnalyzer.lambda$analyze$1(exc);
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: co.hyperverge.hypersnapsdk.utils.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    androidx.camera.core.n.this.close();
                }
            });
        }
    }

    @Override // androidx.camera.core.f.a
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // androidx.camera.core.f.a
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // androidx.camera.core.f.a
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }
}
