package com.google.android.libraries.barhopper;

/* loaded from: classes2.dex */
public class RecognitionOptions {
    private int barcodeFormats = 0;
    private boolean outputUnrecognizedBarcodes = false;
    private boolean useQrMobilenetV3 = false;
    private boolean enableQrAlignmentGrid = false;
    private boolean enableUseKeypointAsFinderPattern = false;
    private int binarizerOptions = 3;
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();

    public void a(int i10) {
        this.barcodeFormats = i10;
    }

    public void b(boolean z10) {
        this.outputUnrecognizedBarcodes = z10;
    }
}
